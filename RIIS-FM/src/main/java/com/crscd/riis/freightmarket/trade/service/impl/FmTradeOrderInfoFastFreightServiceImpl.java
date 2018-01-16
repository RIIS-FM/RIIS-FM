package com.crscd.riis.freightmarket.trade.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoFastFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderTypeEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderInfoFastFreightService;

@Service("fastFreightService")
public class FmTradeOrderInfoFastFreightServiceImpl implements IFmTradeOrderInfoFastFreightService {
	@Resource
	private FmTradeOrderInfoFastFreightEntityMapper fmTradeOrderInfoFastFreightEntityMapper;
	
	@Resource
	private FmTradeOrderInfoBaseEntityMapper fmTradeOrderInfoBaseEntityMapper;
	
	@Resource
	private FmTradeOrderTypeEntityMapper fmTradeOrderTypeMapper;
	 
	@Override
	public int saveFmTradeOrderInfoFastFreight(FmTradeOrderInfoFastFreightEntity tradeOrderInfoFastFreight) {
		return fmTradeOrderInfoFastFreightEntityMapper.insert(tradeOrderInfoFastFreight);
	}
	
	@Override
	public int saveBasicOrder(FmTradeOrderInfoBaseEntity record) {
		//插入申请日期
		Date day=new Date(); 
		record.setdOrderCreateTime(day);
		//未删除，标志位为1
		record.setiOrderDelete(1);
		//插入订单编号，快运FF+时间
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
	public List<FmTradeOrderInfoFastFreightEntity> getFmFastFreightOrder(int iOrderId) {
		FmTradeOrderInfoFastFreightEntityExample fastFreightOrderExample=new FmTradeOrderInfoFastFreightEntityExample();
		com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntityExample.Criteria fastFreightCriteria=fastFreightOrderExample.createCriteria();
		fastFreightCriteria.andIOrderIdEqualTo(iOrderId);
		return fmTradeOrderInfoFastFreightEntityMapper.selectByExample(fastFreightOrderExample);
	}
	
	@Override
	public String createOrderCode(Date day) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		String cOrderCode = "FF"+df.format(day);
		return cOrderCode;
	}
}
