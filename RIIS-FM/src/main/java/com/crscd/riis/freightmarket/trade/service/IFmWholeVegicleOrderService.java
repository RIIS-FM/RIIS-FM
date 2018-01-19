package com.crscd.riis.freightmarket.trade.service;

import java.util.List;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;

public interface IFmWholeVegicleOrderService {
	
	/* *
	 * 插入整车货物运输订单的信息
	 * @param FmTradeOrderInfoWholeVegicleFreightEntity record
	 * @return  插入成功返回1， 插入失败返回0
	 * */
	public int saveFmWholeVegicleOrder(FmTradeOrderInfoWholeVegicleFreightEntity record); 
	
	/* *
	  * 查询订单信息
	  * @param 订单基本信息的id
	  * @return 查找成功整车运输实体，查找失败返回空
	  * */
	public List<FmTradeOrderInfoWholeVegicleFreightEntity> getFmWholeVegicleOrder(int iOrderId);
	
	/* *
	  * 获取订单个数
	  * @return 成功订单个数
	  * */
	public long countOrderNumber(FmTradeOrderInfoWholeVegicleFreightEntity record);
	
	/* *
	  * 修改订单信息
	  * @return 成功订单个数
	  * */
	public int modifyOrderInfo(FmTradeOrderInfoWholeVegicleFreightEntity record);
}
