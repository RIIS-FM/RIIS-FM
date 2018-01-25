package com.crscd.riis.freightmarket.trade.service;

import java.util.List;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;

public interface IFmTradeOrderBoxFreightService {
     
	/* *
	 * 插入集装箱货物运输订单的信息
	 * @param FmTradeOrderInfoBoxFreightEntity record
	 * @return  插入成功返回1， 插入失败返回0
	 * */
	 int saveOrderBoxInfo(FmTradeOrderInfoBaseEntity record);
	 
	 /* *
	  * 获取订单个数
	  * @return 成功订单个数
	  * */
	 long countOrderNumber(FmTradeOrderInfoBoxFreightEntity record);
	 
	 /* *
	  * 修改订单信息订单个数
	  * @return 成功订单个数
	  * */
	 int modifyOrderInfo(FmTradeOrderInfoBoxFreightEntity record);
	 
	 /* *
	  * 查询订单信息
	  * @param 订单基本信息的id
	  * @return 查找成功集装箱运输实体，查找失败返回空
	  * */
	 public List<FmTradeOrderInfoBoxFreightEntity> getFmBoxFreightOrder(int iOrderId);

	 

}
