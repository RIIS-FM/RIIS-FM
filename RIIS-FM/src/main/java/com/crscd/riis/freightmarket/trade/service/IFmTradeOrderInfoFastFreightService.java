package com.crscd.riis.freightmarket.trade.service;

import java.util.List;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;


public interface IFmTradeOrderInfoFastFreightService {
	
	/**
	  * 获取订单个数
	  * @return 成功订单个数
	  * */
	public long countOrderNumber(FmTradeOrderInfoFastFreightEntity record);
	
	/**
	 * 插入快速运输订单的信息
	 * @param FmTradeOrderInfoFastFreightEntity record
	 * @return  插入成功返回1， 插入失败返回0
	 * */
	public int saveFmTradeOrderInfoFastFreight(FmTradeOrderInfoFastFreightEntity tradeOrderInfoFastFreight);
	
	/**
	  * 修改订单信息
	  * @return 成功订单个数
	  * */
	public int modifyOrderInfo(FmTradeOrderInfoFastFreightEntity record);
	
	/**
	  * 查询订单信息
	  * @param 订单基本信息的id
	  * @return 查找成功快速运输实体，查找失败返回空
	  * */
	public List<FmTradeOrderInfoFastFreightEntity> getFmFastFreightOrder(int iOrderId);
}
