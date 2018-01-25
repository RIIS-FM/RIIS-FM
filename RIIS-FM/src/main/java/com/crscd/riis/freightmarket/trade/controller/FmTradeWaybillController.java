package com.crscd.riis.freightmarket.trade.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeWaybillService;



/* *
 * 运单控制器
 * */
@Controller
@RequestMapping("/fmTradeWaybillController")
public class FmTradeWaybillController {
	@Resource
	private IFmTradeWaybillService fmTradeWaybillService;
	
	/*@RequestMapping("/get")
	@ResponseBody
	public FmTradeWaybillEntity get(@RequestBody FmTradeWaybillEntity record) {
		return fmTradeWaybillService.get(record.getId());
	}*/
	
	/**
	 * URL：
	 * 保存运单
	 * @param 
	 * @return
	 * */
	@RequestMapping("/saveWaybill")
	@ResponseBody
	public int saveWaybill(@RequestBody FmTradeOrderInfoBaseEntity record) {
		
		int ret = 0;
		
		List<FmTradeWaybillEntity> waybillList = new ArrayList<FmTradeWaybillEntity>();
		waybillList =fmTradeWaybillService.getWaybillByOrder(record.getId());
		
		for (int i = 0; i < waybillList.size(); i++) {
			ret = ret + fmTradeWaybillService.saveWaybill(waybillList.get(i));
		}
		
		return ret;
	}
	



}
