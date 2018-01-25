package com.crscd.riis.freightmarket.trade.service;

import java.util.List;
import java.util.Map;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.dto.orderDto;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;

public interface IFmTradeOrderService {
	
	/**
	 * 插入货物基本运输订单的信息
	 * @param FmTradeOrderInfoBaseEntity record
	 * @return  插入成功返回1， 插入失败返回0
	 */
	int saveOrderInfo(FmTradeOrderInfoBaseEntity record);
	 
	/**
	 * 插入集装箱运输订单的信息
	 * @param FmTradeOrderInfoBoxFreightEntity record
	 * @return  插入成功返回1， 插入失败返回0
	 */
	int saveBoxFreightOrderInfo(FmTradeOrderInfoBoxFreightEntity record,FmTradeOrderInfoBaseEntity recordBase);
	  
	/**
	 * 插入快速运输订单的信息
	 * @param FmTradeOrderInfoFastFreightEntity record
	 * @return  插入成功返回1， 插入失败返回0
	 */
	int saveFastFreightOrderInfo(FmTradeOrderInfoFastFreightEntity record);
	 
	/**
	 * 插入整车运输订单的信息
	 * @param FmTradeOrderInfoWholeVegicleFreightEntity record
	 * @return  插入成功返回1， 插入失败返回0
	 */
	int saveWholeVegicleFreightOrderInfo(FmTradeOrderInfoWholeVegicleFreightEntity record);
	  
	/**
	 * 生成订单编号
	 * @return 成功返回订单编号，否则返回空
	 */
	String editOrderCode(int iOrderType);
	 
	/**
	 * 获取基本订单个数，用于判断客服是否重复插入同一条记录
	 * @param 基础订单实体
	 * @return 成功订单个数
	 */
	long countBaseOrderNumber(FmTradeOrderInfoBaseEntity record);
	 
	/**
	 * 获取基本订单个数，用于统计满足客服筛选条件的记录个数
	 * @param 筛选条件
	 * @return 成功订单个数
	 */
	long countBaseOrderNumber(Map<String, Object> requirement);
	 
	/**
	 * 获取集装箱订单个数，用于判断客服是否重复插入同一条记录
	 * @param 基础订单实体
	 * @return 成功订单个数
	 */
	long countBoxFreightOrderNumber(FmTradeOrderInfoBoxFreightEntity record);
	
	/**
	 * 获取快运订单个数，用于判断客服是否重复插入同一条记录
	 * @param 基础订单实体
	 * @return 成功订单个数
	 */
	long countFastFreightOrderNumber(FmTradeOrderInfoFastFreightEntity record);	
	
	/**
	 * 获取整车订单个数，用于判断客服是否重复插入同一条记录
	 * @param 基础订单实体
	 * @return 成功订单个数
	 */
	long countWholeVegicleFreightOrderNumber(FmTradeOrderInfoWholeVegicleFreightEntity record);	
	
	 /**
	  * 获取订单的ID
	  * @return 成功返回订单ID，否则返回0
	  */
	 int getOrderIdByOrderCode(String orderCode);

	 /**
	  * 根据ID查找订单
	  * @return 成功订单实体，修改失败返回空
	  */
	 List<orderDto> findOrder(FmAccountEntity user, Map<String, Object> requirement,PageModel pageModel);
	 
	 /**
	  * 查询订单信息
	  * @param 订单基本信息的id
	  * @return 查找成功基本订单信息实体，查找失败返回空
	  */
	 public FmTradeOrderInfoBaseEntity getFmBaseOrder(int id);
	 /**
	  * 查询订单信息
	  * @param 订单基本信息的id
	  * @return 查找成功集装箱运输实体，查找失败返回空
	  */
	 public FmTradeOrderInfoBoxFreightEntity getFmBoxFreightOrder(int iOrderId);	
	 
	 /**
	  * 查询订单信息
	  * @param 订单基本信息的id
	  * @return 查找成功快速运输实体，查找失败返回空
	  */
	 public FmTradeOrderInfoFastFreightEntity getFmFastFreightOrder(int iOrderId);	
	 
	 /**
	  * 查询订单信息
	  * @param 订单基本信息的id
	  * @return 查找成功整车运输实体，查找失败返回空
	  */
	 public FmTradeOrderInfoWholeVegicleFreightEntity getFmWholeVegicleFreightOrder(int iOrderId);	
	 
	 /**
	  * 修改订单信息
	  * @param 基础订单实体
	  * @return 修改成功返回1，修改失败返回0
	  */
	 int modifyBaseOrderInfo(FmTradeOrderInfoBaseEntity record);
	 
	 /**
	  * 修改订单信息
	  * @param 集装箱订单实体
	  * @return 修改成功返回1，修改失败返回0
	  */
	 int modifyBoxFreightOrderInfo(FmTradeOrderInfoBoxFreightEntity record);
	 
	 /**
	  * 修改订单信息
	  * @param 快运订单实体
	  * @return 修改成功返回1，修改失败返回0
	  */
	 int modifyFastFreightOrderInfo(FmTradeOrderInfoFastFreightEntity record);
	 
	 /**
	  * 修改订单信息
	  * @param 整车订单实体
	  * @return 修改成功返回1，修改失败返回0
	  */
	 int modifyWholeVegicleFreightOrderInfo(FmTradeOrderInfoWholeVegicleFreightEntity record);
}
