package com.crscd.riis.freightmarket.trade.service;

import java.util.Date;
import java.util.List;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;


public interface IFmTradeOrderInfoFastFreightService {

	public int saveFmTradeOrderInfoFastFreight(FmTradeOrderInfoFastFreightEntity tradeOrderInfoFastFreight) ;
	public int saveBasicOrder(FmTradeOrderInfoBaseEntity record) ;
	public List<FmTradeOrderInfoBaseEntity> getOrderId(String cOrderCode);
	public int commitOrder(FmTradeOrderInfoBaseEntity record);
	public int deleteOrder(FmTradeOrderInfoBaseEntity record);
	public int modifyOrder(FmTradeOrderInfoBaseEntity record);
	public FmTradeOrderInfoBaseEntity getBaseOrder(int id);
	public List<FmTradeOrderInfoFastFreightEntity> getFmFastFreightOrder(int iOrderId);
	public String createOrderCode(Date day);
}
