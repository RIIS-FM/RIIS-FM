package com.crscd.riis.freightmarket.trade.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.page.PageModel;
import com.crscd.riis.freightmarket.trade.dto.findOrderDtoIn;
import com.crscd.riis.freightmarket.trade.dto.findOrderDtoOut;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderInfoBaseService;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderInfoFastFreightService;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.service.IFmBaseOrderService;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderBoxFreightService;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.service.IFmWholeVegicleOrderService;

@Controller
@RequestMapping("/fmTradeOrder")
public class FmTradeOrderController {

	@Resource
	private IFmBaseOrderService fmBaseOrderService;

	@Resource
	private IFmTradeOrderInfoBaseService tradeOrderInfoBaseService;
	
	@Resource
	private IFmWholeVegicleOrderService fmWholeVegicleOrderService;
	
	@Resource
	private IFmTradeOrderBoxFreightService  tradeOrderBoxFreightService;
	
	@Resource
	private IFmTradeOrderInfoFastFreightService fmTradeOrderInfoFastFreightService;
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/insertTradeOrder
	 * 功能：新增运输需求
	 * @param：FmTradeOrderInfoBaseEntity 基本订单信息
	 * @return：保存或者提交成功标识符
	 */
	@RequestMapping(value="/insertTradeOrder")
	@ResponseBody
	
	public String insertTradeOrder(@RequestBody FmTradeOrderInfoBaseEntity record) {

		int orderType = record.getiOrderTypeId();
		/**
		 * 判定运输类型
		 * 3集装箱运输
		 * 4-6快运
		 * 7-10整车
		 * */
		if (orderType == 3){
			tradeOrderBoxFreightService.saveOrderBoxInfo(record);
		}
		else if (orderType >= 4 && orderType <= 6) {
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
		}
		else if (orderType >= 7 && orderType <= 10) {
			FmTradeOrderInfoWholeVegicleFreightEntity recordWhole=record.getFmTradeOrderInfoWholeVegicleFreightRecord();
			long countRecord=tradeOrderInfoBaseService.countOrderNumber(record);
			long countRecordWhole=fmWholeVegicleOrderService.countOrderNumber(recordWhole);
			
			if(countRecord != 0 && countRecordWhole!= 0) {
				if(record.getiOrderState() == 0)
					return "defeat";
				else if(record.getiOrderState() == 1)
					return "defeat";
			}
			else{
				fmBaseOrderService.saveBasicOrder(record);
				FmTradeOrderInfoBaseEntity wholeOrder = fmBaseOrderService.getOrderId(record.getcOrderCode());
				int orderId = wholeOrder.getId();
				
				recordWhole.setiOrderId(orderId);
				fmWholeVegicleOrderService.saveFmWholeVegicleOrder(recordWhole);
			}
		}
		return "success";
	}
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/getOrderInfo
	 * 功能：查看运输需求
	 * @param：FmTradeOrderInfoBaseEntity 基本订单信息
	 * @return：运输需求信息
	 */
	@RequestMapping(value="/getOrderInfo")
	@ResponseBody
	public FmTradeOrderInfoBaseEntity getOrderInfo(@RequestBody FmTradeOrderInfoBaseEntity record) {
		
		/**
		 * id 订单ID
		 * orderType 订单类型ID
		 */
		int id = 0;
		int orderType = 0;
		
		id = record.getId();
		FmTradeOrderInfoBaseEntity orderInfoBase = fmBaseOrderService.getBaseOrder(id);
		orderType = orderInfoBase.getiOrderTypeId();
		
		/**
		 * 判定运输类型分别查询
		 * 3集装箱运输
		 * 4-6快运
		 * 7-10整车
		 * */
		if (orderType == 3) {
			orderInfoBase.setFmTradeOrderInfoBoxFreightRecord(tradeOrderBoxFreightService.getFmBoxFreightOrder(id).get(0));
		}
		else if (orderType >= 4 && orderType <= 6) {
			orderInfoBase.setFmTradeOrderInfoFastFreightRecord(fmTradeOrderInfoFastFreightService.getFmFastFreightOrder(id).get(0));
		}
		else if (orderType >= 7 && orderType <= 10) {
			orderInfoBase.setFmTradeOrderInfoWholeVegicleFreightRecord(fmWholeVegicleOrderService.getFmWholeVegicleOrder(id).get(0));
		}
		return orderInfoBase;
	}
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/modifyTradeOrder 
	 * 功能：修改运输需求
	 * @param：FmTradeOrderInfoBaseEntity 基本订单信息
	 * @return：修改运输需求信息
	 */
	@RequestMapping(value="/modifyTradeOrder")
	@ResponseBody
	public int modifyTradeOrder(@RequestBody FmTradeOrderInfoBaseEntity record) {
		int ret = -1;
		int orderType = record.getiOrderTypeId();
		int retBaseInfo = tradeOrderInfoBaseService.modifyOrderInfo(record);
		/**
		 * 判定运输类型分别查询
		 * 3集装箱运输
		 * 4-6快运
		 * 7-10整车
		 * */
		if (orderType == 3) {
			FmTradeOrderInfoBoxFreightEntity recordBox = record.getFmTradeOrderInfoBoxFreightRecord();
			int retBoxInfo = tradeOrderBoxFreightService.modifyOrderInfo(recordBox);

			if(retBaseInfo == 1 && retBoxInfo == 1) {
				ret = 1;
			}
		}
		else if (orderType >= 4 && orderType <= 6){
			FmTradeOrderInfoFastFreightEntity recordBox = record.getFmTradeOrderInfoFastFreightRecord();
			int retFastInfo = fmTradeOrderInfoFastFreightService.modifyOrderInfo(recordBox);

			if(retBaseInfo == 1 && retFastInfo == 1) {
				ret = 1;
			}
		}
		else if (orderType >= 7 && orderType <= 10) {
			FmTradeOrderInfoWholeVegicleFreightEntity recordBox = record.getFmTradeOrderInfoWholeVegicleFreightRecord();
			int retWholeVegicleInfo = fmWholeVegicleOrderService.modifyOrderInfo(recordBox);

			if(retBaseInfo == 1 && retWholeVegicleInfo == 1) {
				ret = 1;
			}	
		}
		return ret;
		
	}
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/selectTradeOrder
     * 功能：通过iSenderId查询全部订单信息，并分页显示
     * @param：dto包括用户id，pageIndex
     * @return：当前页面的订单信息
     * */
	@RequestMapping("/selectTradeOrder")
	@ResponseBody
	public findOrderDtoOut selectTradeOrder(@RequestBody findOrderDtoIn dto) {
		
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
