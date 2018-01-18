package com.crscd.riis.freightmarket.trade.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.trade.dao.FmTradeGoodsEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoWholeVegicleFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderTypeEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.service.IFmWholeVegicleOrderService;

@Service("FmWholeVegicleOrderService")
public class FmWholeVegicleOrderServiceImpl implements IFmWholeVegicleOrderService {
	@Resource
	private FmTradeOrderInfoBaseEntityMapper fmTradeOrderInfoBaseEntityMapper;
	@Resource
	private FmTradeOrderInfoWholeVegicleFreightEntityMapper fmTradeOrderInfoWholeVegicleFreightEntityMapper;
	@Resource
    private FmTradeGoodsEntityMapper fmTradeGoodsEntityMapper;
	@Resource
	private FmTradeOrderTypeEntityMapper fmTradeOrderTypeEntityMapper;
	@Override
	public int saveFmWholeVegicleOrder(FmTradeOrderInfoWholeVegicleFreightEntity record) {
		//根据货物名称获得货物代码
		FmTradeGoodsEntity cGoodsEntity=fmTradeGoodsEntityMapper.selectByGoodsName(record.getcGoodsName());
		record.setcGoodsCode(cGoodsEntity.getcGoodsCategoryCode());
		return fmTradeOrderInfoWholeVegicleFreightEntityMapper.insert(record);
	}
	@Override
	public int saveBasicOrder(FmTradeOrderInfoBaseEntity record) {
		//插入申请日期
		Date day=new Date(); 
		record.setdOrderCreateTime(day);
		//插入订单编号，整车WV+时间
		String cOrderCode=createOrderCode(day);
		record.setcOrderCode(cOrderCode);
		return fmTradeOrderInfoBaseEntityMapper.insert(record);
	}
	@Override
	public FmTradeOrderInfoBaseEntity getOrderId(String cOrderCode) {
//		FmTradeOrderInfoBaseEntityExample orderExample=new FmTradeOrderInfoBaseEntityExample();
//		Criteria orderCriteria=orderExample.createCriteria();
//		orderCriteria.andCOrderCodeEqualTo(cOrderCode);
//		return fmTradeOrderInfoBaseEntityMapper.selectByExample(orderExample);
		return fmTradeOrderInfoBaseEntityMapper.selectByOrderCode(cOrderCode);
	}
	/*@Override
	public FmTradeOrderTypeEntity selectOrderType(String cTypeValue) {
		return fmTradeOrderTypeMapper.selectByTypeValue(cTypeValue);
	}*/
	@Override
	public int commitOrder(FmTradeOrderInfoBaseEntity record) {
		//提交订单，标志位变为1待审核
		record.setiOrderState(1);
		//更新申请日期
		Date day=new Date(); 
		record.setdOrderCreateTime(day);
		return fmTradeOrderInfoBaseEntityMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int deleteOrder(FmTradeOrderInfoBaseEntity record) {
		//删除订单，标志位为0
		record.setiOrderDelete(0);
		//更新删除时间
		Date day=new Date(); 
		record.setdOrderDeleteTime(day);
		return fmTradeOrderInfoBaseEntityMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int modifyOrder(FmTradeOrderInfoBaseEntity record) {
		return fmTradeOrderInfoBaseEntityMapper.updateByPrimaryKey(record);
	}
	@Override
	public FmTradeOrderInfoBaseEntity getBaseOrder(int id) {
		return fmTradeOrderInfoBaseEntityMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<FmTradeOrderInfoWholeVegicleFreightEntity> getFmWholeVegicleOrder(int iOrderId) {
		FmTradeOrderInfoWholeVegicleFreightEntityExample wholeOrderExample=new FmTradeOrderInfoWholeVegicleFreightEntityExample();
		Criteria wholeOrderCriteria=wholeOrderExample.createCriteria();
		wholeOrderCriteria.andIOrderIdEqualTo(iOrderId);
		return fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByExample(wholeOrderExample);
	}
	@Override
	public String createOrderCode(Date day) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		String cOrderCode = "WV"+df.format(day);
		return cOrderCode;
	}
	@Override
	public long countOrderNumber(FmTradeOrderInfoWholeVegicleFreightEntity record) {
		long orderNumber = 0;
    	FmTradeOrderInfoWholeVegicleFreightEntityExample wholeOrderExample = new FmTradeOrderInfoWholeVegicleFreightEntityExample();
    	Criteria wholeOrderCriteria=wholeOrderExample.createCriteria();
    	wholeOrderCriteria.andCGoodsNameEqualTo(record.getcGoodsName());
    	wholeOrderCriteria.andFGoodsWightEqualTo(record.getfGoodsWight());
    	wholeOrderCriteria.andFGoodsVolumeEqualTo(record.getfGoodsVolume());
    	wholeOrderCriteria.andCGoodsFeatureEqualTo(record.getcGoodsFeature());
    	wholeOrderCriteria.andFEachGoodsMaxWeightEqualTo(record.getfEachGoodsMaxWeight());
//    	wholeOrderCriteria.andIGoodsRequestTrainNumberEqualTo(record.getiGoodsRequestTrainNumber());
    	wholeOrderCriteria.andICanvasNumberEqualTo(record.getiCanvasNumber());
		orderNumber = fmTradeOrderInfoWholeVegicleFreightEntityMapper.countByExample(wholeOrderExample);
    	return orderNumber;
	}
	@Override
	public void showOrdersByPage(Integer iSenderId) {
		
	}

}
