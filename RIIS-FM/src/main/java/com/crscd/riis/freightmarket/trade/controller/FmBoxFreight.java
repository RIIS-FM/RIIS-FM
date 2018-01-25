package com.crscd.riis.freightmarket.trade.controller;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.dto.findOrderDtoIn;
import com.crscd.riis.freightmarket.trade.dto.findOrderDtoOut;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.page.PageModel;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderBoxFreightService;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderInfoBaseService;


/* *
 * 提交和保存集装箱运输订单控制器
 * */
@Controller
@RequestMapping("/fmBoxFreight")
public class FmBoxFreight {
	@Resource
	 private IFmTradeOrderBoxFreightService  tradeOrderBoxFreightService;
	@Resource
	 private IFmTradeOrderInfoBaseService  tradeOrderInfoBaseService;
	
	@RequestMapping("/saveBoxFreightOrder")
	@ResponseBody
	public int saveboxfreightorder(@RequestBody FmTradeOrderInfoBaseEntity record) {
			
		int retSaveRecordBox =tradeOrderBoxFreightService.saveOrderBoxInfo(record);
        return retSaveRecordBox;
	}
	
	@RequestMapping("/modifyBoxFreightOrder")
	@ResponseBody
	public int modifyBoxfreightorder(@RequestBody FmTradeOrderInfoBaseEntity record) {
		int ret = -1;
		int retBaseInfo = tradeOrderInfoBaseService.modifyOrderInfo(record);
		FmTradeOrderInfoBoxFreightEntity recordBox = record.getFmTradeOrderInfoBoxFreightRecord();
		int retBoxInfo = tradeOrderBoxFreightService.modifyOrderInfo(recordBox);

		if(retBaseInfo == 1 && retBoxInfo == 1) {
			ret = 1;
		}
		return ret;
	}
	
	@RequestMapping("/selectBoxFreightOrder")
	@ResponseBody
	public findOrderDtoOut selectBoxfreightorder(@RequestBody findOrderDtoIn dto) {
		
		/*System.out.println(params.get("id"));
		System.out.println(params.get("pageModel"));*/
		
		PageModel pageModel = dto.getPageModel();
		FmAccountEntity user = dto.getUser();

		Map<String, Object>  requirement = dto.getRequirement();
		
		List<FmTradeOrderInfoBaseEntity> order = tradeOrderInfoBaseService.findOrder(user, requirement, pageModel);
		System.out.println("pageModel.getTotalSize(): "+pageModel.getTotalSize());
		System.out.println("pageModel.getRecordCount(): "+pageModel.getRecordCount());
		
		findOrderDtoOut retOrderListAndPageModelInfo = new findOrderDtoOut();
		retOrderListAndPageModelInfo.setOrderList(order);
		retOrderListAndPageModelInfo.setPageModel(pageModel);
		return retOrderListAndPageModelInfo;
	}
	

		

	
	

}
