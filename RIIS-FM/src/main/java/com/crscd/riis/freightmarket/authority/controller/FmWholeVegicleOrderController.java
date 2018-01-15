package com.crscd.riis.freightmarket.authority.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.authority.service.IFmWholeVegicleOrderService;

@Controller
@RequestMapping("/fmWholeVegicle")
public class FmWholeVegicleOrderController {
	@Resource
	private IFmWholeVegicleOrderService fmWholeVegicleOrderService;
	
	/* URL：http://localhost:8080/RIIS-FM/fmWholeVegicle/insertWholeVegicleOrder
	 * 功能：新增整车大宗货物运输需求
	 * 输入：FmTradeOrderInfoBaseEntity 基本订单信息
	 * 输出：保存或者提交成功标识符
	 */
	@RequestMapping(value="/insertWholeVegicleOrder")
	@ResponseBody
	public String insertWholeVegicleOrder(@RequestBody FmTradeOrderInfoBaseEntity record) {
		System.out.println(1);
		fmWholeVegicleOrderService.saveBasicOrder(record);
		FmTradeOrderInfoWholeVegicleFreightEntity record1=record.getFmTradeOrderInfoWholeVegicleFreightRecord();
		List<FmTradeOrderInfoBaseEntity> list=fmWholeVegicleOrderService.getOrderId(record.getcOrderCode());
		int orderId=list.get(0).getId();
		record1.setiOrderId(orderId);
		fmWholeVegicleOrderService.saveFmWholeVegicleOrder(record1);
//		if(b==1&&w==1)
//			return "insert two";
//		else if(b==1)
//			return "insert basic";
//		else if(w==1)
//			return "insert whole";
        return "defeat";
		
	}
	
	/* URL：http://localhost:8080/RIIS-FM/fmWholeVegicle/commitWholeVegicleOrder
	 * 功能：提交整车大宗货物运输需求
	 * 输入：id
	 * 输出：提交成功标识符
	 */
	@RequestMapping(value="/commitWholeVegicleOrder")
	@ResponseBody
	public String commitWholeVegicleOrder(@RequestBody int id) {
		FmTradeOrderInfoBaseEntity record=fmWholeVegicleOrderService.getBaseOrder(id);
		int c=fmWholeVegicleOrderService.commitOrder(record);
		if(c==1)
			return "提交成功";
		else return "提交失败";
		
	}
	
	/* URL：http://localhost:8080/RIIS-FM/fmWholeVegicle/deleteWholeVegicleOrder
	 * 功能：删除整车大宗货物运输需求
	 * 输入：id
	 * 输出：删除成功标识符
	 */
	@RequestMapping(value="/deleteWholeVegicleOrder")
	@ResponseBody
	public String deleteWholeVegicleOrder(@RequestBody int id) {
		FmTradeOrderInfoBaseEntity record=fmWholeVegicleOrderService.getBaseOrder(id);
		int c=fmWholeVegicleOrderService.commitOrder(record);
		if(c==1)
			return "删除成功";
		else return "删除失败";
	}
	
	/* URL：http://localhost:8080/RIIS-FM/fmWholeVegicle/getOrderInfo
	 * 功能：查看整车大宗货物运输需求
	 * 输入：FmTradeOrderInfoBaseEntity 基本订单信息
	 * 输出：整车大宗货物运输需求信息
	 */
	@RequestMapping(value="/getOrderInfo")
	@ResponseBody
	public FmTradeOrderInfoBaseEntity getOrderInfo(@RequestBody FmTradeOrderInfoBaseEntity record) {
		int id=record.getId();
		FmTradeOrderInfoBaseEntity orderInfoBase=fmWholeVegicleOrderService.getBaseOrder(id);
		orderInfoBase.setFmTradeOrderInfoWholeVegicleFreightRecord(fmWholeVegicleOrderService.getFmWholeVegicleOrder(id).get(0));	
		return orderInfoBase;
	}
	
	/* URL：http://localhost:8080/RIIS-FM/fmWholeVegicle/modifyWholeVegicleOrder
	 * 功能：修改整车大宗货物运输需求
	 * 输入：FmTradeOrderInfoBaseEntity 基本订单信息
	 * 输出：修改大宗货物运输需求信息
	 */
	@RequestMapping(value="/modifyWholeVegicleOrder")
	@ResponseBody
	public String modifyWholeVegicleOrder(@RequestBody FmTradeOrderInfoBaseEntity record) {
		fmWholeVegicleOrderService.modifyOrder(record);
		return "修改成功";
	}

}
