package com.crscd.riis.freightmarket.authority.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.authority.service.IFmTradeOrderBoxFreightService;
import com.crscd.riis.freightmarket.authority.service.IFmTradeOrderInfoBaseService;


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
			
		FmTradeOrderInfoBoxFreightEntity recordBox = record.getFmTradeOrderInfoBoxFreightRecord();
		int retStr = -1;
		int retiOrderId = 0;
		int orderState = -1;
        /* *
         * 判断是否插入重复的订单信息
         * 	*/
		long countRecord = tradeOrderInfoBaseService.countOrderNumber(record);
		long countRecordBox = tradeOrderBoxFreightService.countOrderNumber(recordBox);
		
		if ( countRecord == 0 && countRecordBox == 0) {
			orderState = record.getiOrderState();
			if (orderState == 0) {
				retStr = 1;//1成功 0失败
			}
			else if (orderState == 1) {
				retStr = 1;
			}

		}
		else {
			int retSaveRecord =tradeOrderInfoBaseService.saveOrderInfo(record);
			String orderCode = record.getcOrderCode();
			retiOrderId = tradeOrderInfoBaseService.getOrderIdByOrderCode(orderCode);
			recordBox.setiOrderId(retiOrderId);
			int retSaveRecordBox =tradeOrderBoxFreightService.saveOrderBoxInfo(recordBox);
			
			orderState = record.getiOrderState();
			if( retSaveRecord == 1 && retSaveRecordBox == 1) {
				if (orderState == 0) {
					retStr = 1;
				}
				else if (orderState == 1) {
					retStr = 1;
				}
			}
		}
		
        return retStr;
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
	public int selectBoxfreightorder(@RequestBody FmTradeOrderInfoBaseEntity record) {
		return 0;
		
	}
	

		

	
	

}
