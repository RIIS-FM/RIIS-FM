package com.crscd.riis.freightmarket.authority.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.authority.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.authority.dao.FmTradeOrderInfoWholeVegicleFreightEntityMapper;
import com.crscd.riis.freightmarket.authority.dao.FmTradeOrderTypeEntityMapper;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntityExample;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoWholeVegicleFreightEntityExample;
import com.crscd.riis.freightmarket.authority.service.IFmWholeVegicleOrderService;

@Service("FmWholeVegicleOrderService")
public class FmWholeVegicleOrderServiceImpl implements IFmWholeVegicleOrderService {
	@Resource
	private FmTradeOrderInfoBaseEntityMapper fmTradeOrderInfoBaseEntityMapper;
	@Resource
	private FmTradeOrderInfoWholeVegicleFreightEntityMapper fmTradeOrderInfoWholeVegicleFreightEntityMapper;
	@Resource
	private FmTradeOrderTypeEntityMapper fmTradeOrderTypeMapper;
	@Override
	public int saveFmWholeVegicleOrder(FmTradeOrderInfoWholeVegicleFreightEntity record) {
		return fmTradeOrderInfoWholeVegicleFreightEntityMapper.insert(record);
	}
	@Override
	public int saveBasicOrder(FmTradeOrderInfoBaseEntity record) {
		//插入申请日期
		Date day=new Date(); 
		record.setdOrderCreateTime(day);
		//未删除，标志位为1
		record.setiOrderDelete(1);
		//插入订单编号，整车WV+时间
		String cOrderCode=createOrderCode(day);
		record.setcOrderCode(cOrderCode);
		return fmTradeOrderInfoBaseEntityMapper.insert(record);
	}
	@Override
	public List<FmTradeOrderInfoBaseEntity> getOrderId(String cOrderCode) {
		FmTradeOrderInfoBaseEntityExample orderExample=new FmTradeOrderInfoBaseEntityExample();
		Criteria orderCriteria=orderExample.createCriteria();
		orderCriteria.andCOrderCodeEqualTo(cOrderCode);
		return fmTradeOrderInfoBaseEntityMapper.selectByExample(orderExample);
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
		com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoWholeVegicleFreightEntityExample.Criteria wholeOrderCriteria=wholeOrderExample.createCriteria();
		wholeOrderCriteria.andIOrderIdEqualTo(iOrderId);
		return fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByExample(wholeOrderExample);
	}
	@Override
	public String createOrderCode(Date day) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		String cOrderCode = "WV"+df.format(day);
		return cOrderCode;
	}

}
