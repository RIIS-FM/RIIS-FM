package com.crscd.riis.freightmarket.trade.service.impl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.trade.dao.FmTradeGoodsEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBoxFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderBoxFreightService;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderInfoBaseService;




/* *
 * 集装箱运输服务层接口实现类
 *  */
@Service("tradeOrderBoxFreightService")
public class FmTradeOrderBoxFreightServiceImpl implements IFmTradeOrderBoxFreightService{
    /* *
     * 自动注入FmTradeOrderInfoBoxFreightEntityMapper
     * */
	@Resource
	private FmTradeOrderInfoBoxFreightEntityMapper fmTradeOrderInfoBoxFreightEntityMapper;
	
	@Resource
	private FmTradeGoodsEntityMapper fmTradeGoodsEntityMapper;
	
	@Resource
	 private IFmTradeOrderInfoBaseService  tradeOrderInfoBaseService;
    /* *
     * 	IFmTradeOrderBoxFreightService接口的long countOrderNumber方法实现
     * @param FmTradeOrderInfoBoxFreightEntity record
     * @return 返回该条记录的个数
     * */
	@Override
	public long countOrderNumber(FmTradeOrderInfoBoxFreightEntity record) {
		long orderNumber = -1;
		FmTradeOrderInfoBoxFreightEntityExample example = new FmTradeOrderInfoBoxFreightEntityExample();
		Criteria criteria = example.createCriteria();
		if( record.getcGoodsName() != null) {
			criteria.andCGoodsNameEqualTo(record.getcGoodsName());
		}
		if( record.getcGoodsFeature() != null ) {
			criteria.andCGoodsFeatureEqualTo(record.getcGoodsFeature());
		}
		if( record.getiBoxGetType() != null ) {
			criteria.andIBoxGetTypeEqualTo(record.getiBoxGetType());
		}
		if( record.getiBoxNumber() != null) {
			criteria.andIBoxNumberEqualTo(record.getiBoxNumber());
		}
		if( record.getiBoxType() != null) {
			criteria.andIBoxTypeEqualTo(record.getiBoxType());
		}
		if( record.getiBoxNum() != null) {
			criteria.andIBoxNumEqualTo(record.getiBoxNum());
		}
		if( record.getiBoxSealNum() != null) {
			criteria.andIBoxNumNotEqualTo(record.getiBoxSealNum());
		}
		if( record.getdBoxRecverTime() != null) {
			criteria.andDBoxRecverTimeEqualTo(record.getdBoxRecverTime());
		}
		if( record.getfGoodsWeight() != null) {
			criteria.andFGoodsWeightEqualTo(record.getfGoodsWeight());
		}
		if( record.getiFullboxInStation() != null ) {
			criteria.andIFullboxInStationEqualTo(record.getiFullboxInStation());
		}
		if( record.getcSenderBoxStation() != null) {
			criteria.andCSenderBoxStationEqualTo(record.getcSenderBoxStation());
		}

       orderNumber = fmTradeOrderInfoBoxFreightEntityMapper.countByExample(example);
		
		return orderNumber;
	}

    /* *
     * 	IFmTradeOrderBoxFreightService接口的saveOrderBoxInfo方法实现
     * */
	@Override
	public int saveOrderBoxInfo(FmTradeOrderInfoBaseEntity record) {
		
		FmTradeOrderInfoBoxFreightEntity recordBox = record.getFmTradeOrderInfoBoxFreightRecord();
		int retStr = -1;
		int retiOrderId = 0;
		int orderState = -1;
        /* *
         * 判断是否插入重复的订单信息
         * 	*/
		long countRecord = tradeOrderInfoBaseService.countOrderNumber(record);
		long countRecordBox = countOrderNumber(recordBox);
		System.out.println("countRecord: "+countRecord);
		System.out.println("countRecordBox: "+countRecordBox);
		
		if ( countRecord != 0 && countRecordBox != 0) {
			orderState = record.getiOrderState();
			if (orderState == 0) {
				retStr = 1;//1已保存
			}
			else if (orderState == 1) {
				retStr = 2;//2已提交
			}
		}
		else {
			int retSaveRecord =tradeOrderInfoBaseService.saveOrderInfo(record);
			if ( retSaveRecord == 1 ) {
				String orderCode = record.getcOrderCode();
				retiOrderId = tradeOrderInfoBaseService.getOrderIdByOrderCode(orderCode);
				recordBox.setiOrderId(retiOrderId);
				/* *
			     * 设置订单中的货物代码
			     * */
				FmTradeGoodsEntity cGoodsInfo = fmTradeGoodsEntityMapper.selectByGoodsName(recordBox.getcGoodsName());
		    	recordBox.setcGoodsCode(cGoodsInfo.getcGoodsCategoryCode());
				int retSaveRecordBox =fmTradeOrderInfoBoxFreightEntityMapper.insertSelective(recordBox);
				if ( retSaveRecordBox == 1) {
					orderState = record.getiOrderState();
					if( retSaveRecord == 1 && retSaveRecordBox == 1) {
						if (orderState == 0) {
							retStr = 3;//3保存成功
						}
						else if (orderState == 1) {
							retStr = 4;//4提交成功
						}
					}
				}
				else {
					/* *
					 * 删除已插入的订单基本信息
					 */
					while (true) {
						int retDel = tradeOrderInfoBaseService.deleteByPrimaryKey(retiOrderId);
						if ( retDel == 1) {
							break;
						}
					}
				}
			}
		}
        return retStr;
	}
	
	@Override
	public int modifyOrderInfo(FmTradeOrderInfoBoxFreightEntity record) {
		int orderId = record.getiOrderId();
		FmTradeOrderInfoBoxFreightEntity recordInfo = fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId);
		record.setId(recordInfo.getId());
		int ret = fmTradeOrderInfoBoxFreightEntityMapper.updateByPrimaryKey(record);
		return ret;
	}
	
	@Override
	public List<FmTradeOrderInfoBoxFreightEntity> getFmBoxFreightOrder(int iOrderId) {
		FmTradeOrderInfoBoxFreightEntityExample boxOrderExample=new FmTradeOrderInfoBoxFreightEntityExample();
		Criteria boxOrderCriteria=boxOrderExample.createCriteria();
		boxOrderCriteria.andIOrderIdEqualTo(iOrderId);
		return fmTradeOrderInfoBoxFreightEntityMapper.selectByExample(boxOrderExample);
	}
	

	

}
