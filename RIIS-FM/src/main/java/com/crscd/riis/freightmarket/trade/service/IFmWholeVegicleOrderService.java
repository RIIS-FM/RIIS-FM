package com.crscd.riis.freightmarket.trade.service;

import java.util.Date;
import java.util.List;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;


public interface IFmWholeVegicleOrderService {
	public int saveFmWholeVegicleOrder(FmTradeOrderInfoWholeVegicleFreightEntity record); //保存整车运输需求
	public int saveBasicOrder(FmTradeOrderInfoBaseEntity record);//保存基本订单需求
	public FmTradeOrderInfoBaseEntity getOrderId(String cOrderCode);//获得订单id
//	public FmTradeOrderTypeEntity selectOrderType(String cTypeValue);//选择订单类型
	public int commitOrder(FmTradeOrderInfoBaseEntity record);//提交订单
	public int deleteOrder(FmTradeOrderInfoBaseEntity record);//删除订单
	public int modifyOrder(FmTradeOrderInfoBaseEntity record);//修改订单
	public FmTradeOrderInfoBaseEntity getBaseOrder(int id);//通过id获得基本订单需求
	public List<FmTradeOrderInfoWholeVegicleFreightEntity> getFmWholeVegicleOrder(int iOrderId);//通过订单id获得整车运输需求
	public String createOrderCode(Date day);//编码生成订单编号
	public long countOrderNumber(FmTradeOrderInfoWholeVegicleFreightEntity record);//获取订单个数
	public void showOrdersByPage(Integer iSenderId);//通过托运人id获得该托运人全部订单信息分页显示

}
