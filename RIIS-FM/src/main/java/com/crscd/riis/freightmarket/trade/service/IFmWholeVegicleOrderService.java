package com.crscd.riis.freightmarket.trade.service;

import java.util.List;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;

public interface IFmWholeVegicleOrderService {
	public int saveFmWholeVegicleOrder(FmTradeOrderInfoWholeVegicleFreightEntity record); //保存整车运输需求
	public List<FmTradeOrderInfoWholeVegicleFreightEntity> getFmWholeVegicleOrder(int iOrderId);//通过订单id获得整车运输需求
	public long countOrderNumber(FmTradeOrderInfoWholeVegicleFreightEntity record);//获取整车订单个数

}
