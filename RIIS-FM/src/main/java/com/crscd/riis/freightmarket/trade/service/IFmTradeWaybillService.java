package com.crscd.riis.freightmarket.trade.service;

import java.util.List;
import java.util.Map;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntity;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;

public interface IFmTradeWaybillService {

	/**
	 * 通过订单拆分成运单
	 * @param Integer id 订单id
	 * @return List<FmTradeWaybillEntity>
	 * */
	public List<FmTradeWaybillEntity> getWaybillByOrder(Integer id);
	
	/**
	 * 设置运单基本信息
	 * @param Integer id 订单id
	 * @return FmTradeWaybillEntity
	 * */
	public FmTradeWaybillEntity setWaybillBaseInfo(Integer id);
	
	/** 
	 * 编辑运单编号	
	 * */
	public String editWaybillCode(Integer i);
	
	/**
	 * 插入运单
	 * @param FmTradeWaybillEntity record
	 * @return 返回影响的行数
	 * */
	public int saveWaybill(FmTradeWaybillEntity record);
	
	/**
	 * 修改运单
	 * @param FmTradeWaybillEntity 运单实体
	 * @return 返回影响行数
	 * */
	public int modifyWaybill(FmTradeWaybillEntity record);
	
	/**
	 * 获取运单个数，用于统计满足客户筛选条件的记录个数
	 * @param Map<String, Object> requirement 筛选条件
	 * @return long 满足条件的记录数
	 * */
	public long countWaybillNumber(Map<String, Object> requirement);
	
	/**
	 * 分页查询运单
	 * @param FmAccountEntity user 用户id
	 *        Map<String, Object> orderRequirement 设置订单查询条件
	 *        Map<String, Object> waybillRequirement 设置运单查询条件
	 *        PageModel pageModel 分页
	 * @return List<FmTradeWaybillEntity> 运单实体列表
	 * */
	public List<FmTradeWaybillEntity> findWaybill(FmAccountEntity user, Map<String, Object> orderRequirement, 
            Map<String, Object> waybillRequirement,PageModel pageModel);

}
