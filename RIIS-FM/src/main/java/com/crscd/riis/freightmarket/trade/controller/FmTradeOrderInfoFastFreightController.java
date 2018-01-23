package com.crscd.riis.freightmarket.trade.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderInfoFastFreightService;
import com.crscd.riis.freightmarket.trade.service.IFmBaseOrderService;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderInfoBaseService;


@Controller
@RequestMapping("/fastFreightService")

public class FmTradeOrderInfoFastFreightController {
	@Resource
	private IFmTradeOrderInfoFastFreightService fmTradeOrderInfoFastFreightService;
	 
	@Resource
	private IFmTradeOrderInfoBaseService tradeOrderInfoBaseService;

	@Resource
	private IFmBaseOrderService fmBaseOrderService;
	/* URL：http://localhost:8080/RIIS-FM/fastFreightService/insertFastFreightOrder
	 * 功能：新增快运货物需求
	 * 输入：FmTradeOrderInfoBaseEntity 基本订单信息   测试JSON:{"iOrderTypeId":5,"dOrderDateline":"2018-01-19","iUserType":3,"iSenderId":7,"iRecverId":5,"cSenderName":"王石","cSenderAddress":"四川省成都市青羊区","cSenderPhone":"13896321568","cSenderEmail":"941103169@qq.com","cSenderPostcode":"135300","cSenderNote":"轻拿轻放","cSenderCity":"成都","cLoadStation":"成都北站","cLoadLocation":"成都北站货仓","cRecverAddress":"北京市海定区","cRecverPhone":"14789651236","cRecverEmail":"47894562@qq.com","cRecverPostcode":"10000","cRecverCity":"北京","cUnloadStation":"北京站","cUnloadLocation":"北京","cOrderType":"集装箱运输","iOrderSplite":"0","iOrderState":1,"fProtectPrice":100,"fInsuranceValue":100,"fmTradeOrderInfoFastFreightRecord":{"cGoodsName":"铁合金"}}
	 * 输出：保存或者提交成功标识符
	 */
	@RequestMapping(value="/insertFastFreightOrder")
	@ResponseBody
	public String insertFastFreightOrder(@RequestBody FmTradeOrderInfoBaseEntity record) {
		FmTradeOrderInfoFastFreightEntity recordFast=record.getFmTradeOrderInfoFastFreightRecord();
		long countRecord = tradeOrderInfoBaseService.countOrderNumber(record);
		long countRecordFast = fmTradeOrderInfoFastFreightService.countOrderNumber(recordFast);
		
		if(countRecord != 0 && countRecordFast!= 0) {
			if(record.getiOrderState() == 0)
				return "defeat";
			else if(record.getiOrderState() == 1)
				return "defeat";
		}
		else{
			fmBaseOrderService.saveBasicOrder(record);
			FmTradeOrderInfoBaseEntity fastOrder = fmBaseOrderService.getOrderId(record.getcOrderCode());
			int orderId = fastOrder.getId();
			
			recordFast.setiOrderId(orderId);
			fmTradeOrderInfoFastFreightService.saveFmTradeOrderInfoFastFreight(recordFast);
		}
		return "success";
	}
	

	/* URL：http://localhost:8080/RIIS-FM/fastFreightService/getOrderInfo
	 * 功能：查看快运货物运输需求
	 * 输入：FmTradeOrderInfoBaseEntity 基本订单信息
	 * 输出：快运货物运输需求信息
	 */
	@RequestMapping(value="/getOrderInfo")
	@ResponseBody
	public FmTradeOrderInfoBaseEntity getOrderInfo(@RequestBody FmTradeOrderInfoBaseEntity record) {
		int id = record.getId();
		int orderType = record.getiOrderTypeId();
		
		FmTradeOrderInfoBaseEntity orderInfoBase = fmBaseOrderService.getBaseOrder(id);
		orderInfoBase.setFmTradeOrderInfoFastFreightRecord(fmTradeOrderInfoFastFreightService.getFmFastFreightOrder(id).get(0));
		return orderInfoBase;
	}
	
	/* URL：http://localhost:8080/RIIS-FM/fastFreightService/modifyFastFreightOrder
	 * 功能：修改快运货物运输需求
	 * 输入：FmTradeOrderInfoBaseEntity 基本订单信息
	 * 输出：修改快运货物运输需求信息
	 */
	@RequestMapping(value="/modifyFastFreightOrder")
	@ResponseBody
	public String modifyWholeVegicleOrder(@RequestBody FmTradeOrderInfoBaseEntity record) {
		return "修改成功";
	}
}
