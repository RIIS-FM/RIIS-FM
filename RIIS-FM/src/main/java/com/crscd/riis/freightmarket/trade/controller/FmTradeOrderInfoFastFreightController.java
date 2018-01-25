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

@Controller

@RequestMapping("/fastFreightService")

public class FmTradeOrderInfoFastFreightController {
	@Resource
	private IFmTradeOrderInfoFastFreightService fmTradeOrderInfoFastFreightService;
	
	/* URL：http://localhost:8080/RIIS-FM/fastFreightService/insertFastFreightOrder
	 * 功能：新增快运货物需求
	 * 输入：FmTradeOrderInfoBaseEntity 基本订单信息
	 * 输出：保存或者提交成功标识符
	 */
	@RequestMapping(value="/insertFastFreightOrder")
	@ResponseBody
	public String insertFastFreightOrder(@RequestBody FmTradeOrderInfoBaseEntity record) {
		System.out.println(1);
		fmTradeOrderInfoFastFreightService.saveBasicOrder(record);
		FmTradeOrderInfoFastFreightEntity record1=record.getFmTradeOrderInfoFastFreightRecord();
		List<FmTradeOrderInfoBaseEntity> list=fmTradeOrderInfoFastFreightService.getOrderId(record.getcOrderCode());
		int orderId=list.get(0).getId();
		record1.setiOrderId(orderId);
		fmTradeOrderInfoFastFreightService.saveFmTradeOrderInfoFastFreight(record1);
        return "defeat";	
	}
	
	/* URL：http://localhost:8080/RIIS-FM/fastFreightService/commitFastFreightOrder
	 * 功能：提交快运货物运输需求
	 * 输入：id
	 * 输出：提交成功标识符
	 */
	@RequestMapping(value="/commitFastFreightOrder")
	@ResponseBody
	public String commitFastFreightOrder(@RequestBody int id) {
		FmTradeOrderInfoBaseEntity record=fmTradeOrderInfoFastFreightService.getBaseOrder(id);
		int c=fmTradeOrderInfoFastFreightService.commitOrder(record);
		if(c==1)
			return "提交成功";
		else return "提交失败";
		
	}
	
	/* URL：http://localhost:8080/RIIS-FM/fastFreightService/deleteFastFreightOrder
	 * 功能：提交快运货物运输需求
	 * 输入：id
	 * 输出：提交成功标识符
	 */
	@RequestMapping(value="/deleteFastFreightOrder")
	@ResponseBody
	public String deleteFastFreightOrder(@RequestBody int id) {
		FmTradeOrderInfoBaseEntity record=fmTradeOrderInfoFastFreightService.getBaseOrder(id);
		int c=fmTradeOrderInfoFastFreightService.commitOrder(record);
		if(c==1)
			return "删除成功";
		else return "删除失败";
	}
	
	/* URL：http://localhost:8080/RIIS-FM/fastFreightService/getOrderInfo
	 * 功能：查看快运货物运输需求
	 * 输入：FmTradeOrderInfoBaseEntity 基本订单信息
	 * 输出：快运货物运输需求信息
	 */
	@RequestMapping(value="/getOrderInfo")
	@ResponseBody
	public FmTradeOrderInfoBaseEntity getOrderInfo(@RequestBody FmTradeOrderInfoBaseEntity record) {
		int id=record.getId();
		FmTradeOrderInfoBaseEntity orderInfoBase=fmTradeOrderInfoFastFreightService.getBaseOrder(id);
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
		fmTradeOrderInfoFastFreightService.modifyOrder(record);
		return "修改成功";
	}
}
