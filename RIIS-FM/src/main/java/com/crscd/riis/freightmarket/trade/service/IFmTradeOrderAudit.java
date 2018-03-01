package com.crscd.riis.freightmarket.trade.service;

import java.util.List;
import java.util.Map;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.dto.orderDto;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;

public interface IFmTradeOrderAudit {
   
	/**
     * 修改审核结果,审核结果不通过
     * @param FmAccountEntity user 审核人信息  
     *        FmTradeOrderInfoBaseEntity OrderInfo 订单信息
     *        FmTradeOrderAuditEntity record 审核结果信息
     * @return 插入成功返回1， 插入失败返回0
     **/
	int modifyAuditInfo(FmAccountEntity user, FmTradeOrderInfoBaseEntity orderInfo, FmTradeOrderAuditEntity record);
	
	/**
     * 修改审核结果，审核结果通过
     * @param FmAccountEntity user 审核人信息  
     *        FmTradeOrderInfoBaseEntity OrderInfo 订单信息
     *        FmTradeOrderAuditEntity record 审核结果信息
     *        List<FmTradeTransportSchemeEntity> transportSchemeList 承运方案列表
     * @return 插入成功返回1， 插入失败返回0
     **/
	int modifyAuditInfo(FmAccountEntity user, FmTradeOrderInfoBaseEntity orderInfo, FmTradeOrderAuditEntity record,
			List<FmTradeTransportSchemeEntity> transportSchemeList);
	
	/**
     * 删除人工审核结果
     * @param Integer id 主键id
     * @return 删除成功返回1， 插入失败返回0
     **/
	int deleteAuditInfo(Integer id);
	
	/**
     * 查找系统审核未通过的订单详情和系统审核结果
     * @param Integer id 主键id
     * @return 删除成功返回1， 插入失败返回0
     **/
	List<orderDto> findAuditResult(Map<String, Object> requirement, PageModel pageModel);
	
	/**
     * 插入提交的承运方案
     * @param FmTradeTransportSchemeEntity record 承运方案实体列表
     * @return 插入成功返回1， 插入失败返回0
     * 	*/
	int saveTransportScheme(List<FmTradeTransportSchemeEntity> record);
	
	
	/**
	 * 获取满足条件的审核信息记录总个数
	 * @param 搜索要求
	 * @return 成功返回总审核实体个数
	 */
	long countAuditInfoNumber(Map<String, Object> requirement);

}
