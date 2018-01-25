package com.crscd.riis.freightmarket.trade.service;

import java.util.List;

import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntity;

public interface IFmTradeWaybillService {
	/*public FmTradeWaybillEntity get(Integer id);*/
	
	/**
	 * 通过订单拆分成运单
	 * @param Integer id 订单id
	 * @return List<FmTradeWaybillEntity>
	 * */
	public List<FmTradeWaybillEntity> getWaybillByOrder(Integer id);
	
	/*设置运单基本信息*/
	
	/** 
	 * 编辑运单编号	
	 * */
	public String editWaybillCode();
	
	/**
	 * 插入运单
	 * @param FmTradeWaybillEntity record
	 * @return 返回影响的行数
	 * */
	public int saveWaybill(FmTradeWaybillEntity record);
	
	

}
