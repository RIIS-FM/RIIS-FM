package com.crscd.riis.freightmarket.trade.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoFastFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderTypeEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeGoodsEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderInfoFastFreightService;

@Service("fastFreightService")
public class FmTradeOrderInfoFastFreightServiceImpl implements IFmTradeOrderInfoFastFreightService {
	@Resource
	private FmTradeOrderInfoFastFreightEntityMapper fmTradeOrderInfoFastFreightEntityMapper;
	
	@Resource
	private FmTradeOrderInfoBaseEntityMapper fmTradeOrderInfoBaseEntityMapper;
	
	@Resource
	private FmTradeOrderTypeEntityMapper fmTradeOrderTypeMapper;
	
	@Resource
    private FmTradeGoodsEntityMapper fmTradeGoodsEntityMapper;
	 
	@Override
	public int saveFmTradeOrderInfoFastFreight(FmTradeOrderInfoFastFreightEntity record) {
		//根据货物名称获得货物代码
		FmTradeGoodsEntity cGoodsEntity = fmTradeGoodsEntityMapper.selectByGoodsName(record.getcGoodsName());
		
		record.setcGoodsCode(cGoodsEntity.getcGoodsCategoryCode());
		return fmTradeOrderInfoFastFreightEntityMapper.insert(record);
	}
	
	 /* *
     * 	IFmTradeOrderFastFreightService接口的long countOrderNumber方法实现
     * @param FmTradeOrderInfoBoxFreightEntity record
     * @return 返回该条记录的个数
     * */
	@Override
	public long countOrderNumber(FmTradeOrderInfoFastFreightEntity record) {
		long orderNumber = -1;
		FmTradeOrderInfoFastFreightEntityExample example = new FmTradeOrderInfoFastFreightEntityExample();
		Criteria criteria = example.createCriteria();
		if( record.getcGoodsName() != null) {
			criteria.andCGoodsNameEqualTo(record.getcGoodsName());
		}
		if( record.getcGoodsFeature() != null ) {
			criteria.andCGoodsFeatureEqualTo(record.getcGoodsFeature());
		}
		if( record.getcGoodsCode() != null ) {
			criteria.andCGoodsCodeEqualTo(record.getcGoodsCode());
		}
		if( record.getfGoodsWeight() != null) {
			criteria.andFGoodsWeightEqualTo(record.getfGoodsWeight());
		}
		if( record.getfGoodsVolume() != null) {
			criteria.andFGoodsVolumeEqualTo(record.getfGoodsVolume());
		}
		if( record.getfEachGoodsMaxWeight() != null) {
			criteria.andFEachGoodsMaxWeightEqualTo(record.getfEachGoodsMaxWeight());
		}
		if( record.getcGoodsWrapper() != null) {
			criteria.andCGoodsWrapperEqualTo(record.getcGoodsWrapper());
		}
		if( record.getcGoodsFeature() != null) {
			criteria.andCGoodsFeatureEqualTo(record.getcGoodsFeature());
		}
		if( record.getcTrainNum() != null) {
			criteria.andCTrainNumEqualTo(record.getcTrainNum());
		}
		if( record.getiGoodsNumber() != null ) {
			criteria.andIGoodsNumberEqualTo(record.getiGoodsNumber());
		}
       orderNumber = fmTradeOrderInfoFastFreightEntityMapper.countByExample(example);
		
		return orderNumber;
	}
	@Override
	public int modifyOrderInfo(FmTradeOrderInfoFastFreightEntity record) {
		int orderId = record.getiOrderId();
		FmTradeOrderInfoFastFreightEntity recordInfo = fmTradeOrderInfoFastFreightEntityMapper.selectByOrderId(orderId);
		
		record.setId(recordInfo.getId());
		int ret = fmTradeOrderInfoFastFreightEntityMapper.updateByPrimaryKey(record);
		return ret;
	}
	
	@Override
	public List<FmTradeOrderInfoFastFreightEntity> getFmFastFreightOrder(int iOrderId) {
		FmTradeOrderInfoFastFreightEntityExample fastFreightOrderExample = new FmTradeOrderInfoFastFreightEntityExample();
		com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntityExample.Criteria fastFreightCriteria = fastFreightOrderExample.createCriteria();
		
		fastFreightCriteria.andIOrderIdEqualTo(iOrderId);
		return fmTradeOrderInfoFastFreightEntityMapper.selectByExample(fastFreightOrderExample);
	}
	
}
