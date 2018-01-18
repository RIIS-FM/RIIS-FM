package com.crscd.riis.freightmarket.trade.service;

import java.util.Date;
import java.util.List;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.page.PageModel;

public interface IFmBaseOrderService {
	public int saveBasicOrder(FmTradeOrderInfoBaseEntity record);//保存基本订单需求
	public int modifyBasicOrder(FmTradeOrderInfoBaseEntity record);//修改基本订单需求
	public FmTradeOrderInfoBaseEntity getOrderId(String cOrderCode);//获得订单id
	public FmTradeOrderInfoBaseEntity getBaseOrder(int id);//通过id获得基本订单需求
	public String createOrderCode(Date day);//编码生成订单编号
	public List<FmTradeOrderInfoBaseEntity> findOrder(Integer iAccountId,PageModel pageModel);//通过托运人id获得该托运人全部订单信息分页显示

}
