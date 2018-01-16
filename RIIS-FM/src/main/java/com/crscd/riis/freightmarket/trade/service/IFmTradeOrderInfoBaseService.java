package com.crscd.riis.freightmarket.trade.service;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;

public interface IFmTradeOrderInfoBaseService {
     
	/* *
	 * 插入集装箱货物运输订单的信息
	 * @param FmTradeOrderInfoBoxFreightEntity record
	 * @return  插入成功返回1， 插入失败返回0
	 * */
	 int saveOrderInfo(FmTradeOrderInfoBaseEntity record);
	 
	/* *
     * 生成订单编号
     * @return 成功返回订单编号，否则返回空
     * */
	 String editOrderCode();
	 
	 /* *
	  * 获取订单的ID
	  * @return 成功返回订单ID，否则返回0
	  * */
	 int getOrderIdByOrderCode(String orderCode);
	 
	 /* *
	  * 获取订单个数
	  * @return 成功订单个数
	  * */
	 long countOrderNumber(FmTradeOrderInfoBaseEntity record);
	 
	 
	 /* *
	  * 修改订单信息
	  * @return 修改成功返回1，修改失败返回0
	  * */
	 int modifyOrderInfo(FmTradeOrderInfoBaseEntity record);
	 

	 /* *
	  * 根据ID查找订单
	  * @return 成功订单实体，修改失败返回空
	  * */
	 FmTradeOrderInfoBaseEntity selectByPrimaryKey(Integer id);
	 
	 /* *
	  * 根据ID删除订单
	  * @return 成功返回1，删除失败返回0
	  * */
	 int deleteByPrimaryKey(Integer id);

}
