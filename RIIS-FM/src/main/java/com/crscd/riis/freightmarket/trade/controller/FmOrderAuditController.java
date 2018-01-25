package com.crscd.riis.freightmarket.trade.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.dto.modifyOrderAuditInfoDtoIn;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderAudit;
import com.crscd.riis.freightmarket.trade.util.tradeConstants.tradeConstants;

/* *
 * 审核订单订单控制器
 * */
@Controller
@RequestMapping("/fmOrderAudit")

public class FmOrderAuditController {
	
	@Resource
	private IFmTradeOrderAudit fmTradeOrderAuditService;
	
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
			ret = fmTradeOrderAuditService.modifyAuditInfo(user, orderInfo, orderAuditInfo, transportSchemeList);
		}
		else {
			ret = fmTradeOrderAuditService.modifyAuditInfo(user, orderInfo, orderAuditInfo);
		}
		
        return ret;
	}
	
	/* URL：http://localhost:8080/RIIS-FM/fmOrderAudit/findAuditResult
	 * 功能：查询审核结果
	 * 输入：FmTradeOrderInfoBaseEntity 
	 */
	@RequestMapping("/findAuditResult")
	@ResponseBody
	public List<FmTradeOrderAuditEntity> findAuditResult() {
		
		
		
        return fmTradeOrderAuditService.findAuditResult();
	}
}
