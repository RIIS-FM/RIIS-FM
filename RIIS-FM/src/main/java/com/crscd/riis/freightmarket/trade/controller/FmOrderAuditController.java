package com.crscd.riis.freightmarket.trade.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.dto.findOrderDtoIn;
import com.crscd.riis.freightmarket.trade.dto.modifyOrderAuditInfoDtoIn;
import com.crscd.riis.freightmarket.trade.dto.orderDto;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderAudit;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderService;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;
import com.crscd.riis.freightmarket.trade.util.tradeConstants.tradeConstants;

/* *
 * 审核订单订单控制器
 * */
@Controller
@RequestMapping("/fmOrderAudit")

public class FmOrderAuditController {
	
	@Resource
	private IFmTradeOrderService tradeOrderService;
	
	/**
	 *  URL：http://localhost:8080/RIIS-FM/fmOrderAudit/modifyOrderAuditInfo
	 * 功能：修改审核结果
	 * 输入：modifyOrderAuditInfoDtoIn dto
	 **/
	@RequestMapping("/modifyOrderAuditInfo")
	@ResponseBody
	public int modifyOrderAuditInfo(@RequestBody modifyOrderAuditInfoDtoIn dto) {
		
		int ret = 0;	
		
		FmAccountEntity user = dto.getUser();
		FmTradeOrderInfoBaseEntity orderInfo = dto.getOrderInfo();
		FmTradeOrderAuditEntity orderAuditInfo = dto.getOrderAuditInfo();
		List<FmTradeTransportSchemeEntity> transportSchemeList = new ArrayList<FmTradeTransportSchemeEntity>();
		
        /** flag审核结果标志位*/
		int  flag = orderAuditInfo.getiAuditResult();
		
		if ( flag == tradeConstants.AUDIT_PASS_FLAG) {
			
			transportSchemeList.addAll(dto.getTransportSchemeList());
			ret = tradeOrderService.modifyAuditInfo(user, orderInfo, orderAuditInfo, transportSchemeList);
		}
		else {
			ret =tradeOrderService.modifyAuditInfo(user, orderInfo, orderAuditInfo);
		}
		
        return ret;
	}
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmOrderAudit/findAuditResult
	 * 功能：查询审核结果
	 * 输入：List<orderDto> 
	 **/
	@RequestMapping("/findAuditResult")
	@ResponseBody
	public List<orderDto> findAuditResult(@RequestBody findOrderDtoIn dto) {
	
		PageModel pageModel = dto.getPageModel();
		FmAccountEntity user = dto.getUser();

		Map<String, Object>  requirement = dto.getRequirement();
		
		List<orderDto> orderList = tradeOrderService.findAuditResult(requirement, pageModel);
		
        return orderList;
	}
}
