package com.crscd.riis.freightmarket.trade.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.trade.dto.findOrderDTO;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.page.PageModel;
import com.crscd.riis.freightmarket.trade.service.IFmBaseOrderService;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderInfoBaseService;
import com.crscd.riis.freightmarket.trade.service.IFmWholeVegicleOrderService;

@Controller
@RequestMapping("/fmWholeVegicle")
public class FmWholeVegicleOrderController {
	@Resource
	private IFmWholeVegicleOrderService fmWholeVegicleOrderService;
	@Resource
	private IFmTradeOrderInfoBaseService tradeOrderInfoBaseService;
	@Resource
	private IFmBaseOrderService fmBaseOrderService;
	
	/* URL：http://localhost:8080/RIIS-FM/fmWholeVegicle/insertWholeVegicleOrder
	 * 功能：新增整车大宗货物运输需求
	 * @param：FmTradeOrderInfoBaseEntity 基本订单信息
	 * @return：保存或者提交成功标识符
	 */
	@RequestMapping(value="/insertWholeVegicleOrder")
	@ResponseBody
	public String insertWholeVegicleOrder(@RequestBody FmTradeOrderInfoBaseEntity record) {
		FmTradeOrderInfoWholeVegicleFreightEntity recordWhole=record.getFmTradeOrderInfoWholeVegicleFreightRecord();
		long countRecord=tradeOrderInfoBaseService.countOrderNumber(record);
		long countRecordWhole=fmWholeVegicleOrderService.countOrderNumber(recordWhole);
		System.out.println(countRecord);
		System.out.println(countRecordWhole);
		if(countRecord!=0&&countRecordWhole!=0) {
			if(record.getiOrderState()==0)
				return "defeat";
			else if(record.getiOrderState()==1)
				return "defeat";
		}
		else{
			fmBaseOrderService.saveBasicOrder(record);
			FmTradeOrderInfoBaseEntity wholeOrder=fmBaseOrderService.getOrderId(record.getcOrderCode());
			int orderId=wholeOrder.getId();
			recordWhole.setiOrderId(orderId);
			fmWholeVegicleOrderService.saveFmWholeVegicleOrder(recordWhole);
		}
		return "success";
		
	}
	
	/* URL：http://localhost:8080/RIIS-FM/fmWholeVegicle/getOrderInfo
	 * 功能：查看整车大宗货物运输需求
	 * @param：FmTradeOrderInfoBaseEntity 基本订单信息
	 * @return：整车大宗货物运输需求信息
	 */
	@RequestMapping(value="/getOrderInfo")
	@ResponseBody
	public FmTradeOrderInfoBaseEntity getOrderInfo(@RequestBody FmTradeOrderInfoBaseEntity record) {
		int id=record.getId();
		FmTradeOrderInfoBaseEntity orderInfoBase=fmBaseOrderService.getBaseOrder(id);
		orderInfoBase.setFmTradeOrderInfoWholeVegicleFreightRecord(fmWholeVegicleOrderService.getFmWholeVegicleOrder(id).get(0));	
		return orderInfoBase;
	}
	
	/* URL：http://localhost:8080/RIIS-FM/fmWholeVegicle/modifyWholeVegicleOrder
	 * 功能：修改整车大宗货物运输需求
	 * @param：FmTradeOrderInfoBaseEntity 基本订单信息
	 * @return：修改大宗货物运输需求信息
	 */
	@RequestMapping(value="/modifyWholeVegicleOrder")
	@ResponseBody
	public String modifyWholeVegicleOrder(@RequestBody FmTradeOrderInfoBaseEntity record) {
		fmBaseOrderService.modifyBasicOrder(record);
		return "修改成功";
	}
	
    /* URL：http://localhost:8080/RIIS-FM/fmWholeVegicle/findorder
     * 功能：通过iSenderId查询全部订单信息，并分页显示
     * @param：dto包括用户id，pageIndex
     * @return：当前页面的订单信息
     * */
	@RequestMapping(value="/findorder")
	@ResponseBody
	public List<FmTradeOrderInfoBaseEntity> findorder(@RequestBody findOrderDTO dto){
		/*PageModel pageModel=new PageModel();
		return fmWholeVegicleOrderService.findOrder(iAccountId, pageModel);*/
		/*System.out.println(dto.getId());
		System.out.println(dto.getPageModel().getPageIndex());*/
		PageModel pageModel=dto.getPageModel();
		int iSenderId=dto.getId();
		return fmBaseOrderService.findOrder(iSenderId, pageModel);
	}

}
