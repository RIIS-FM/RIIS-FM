<<<<<<< HEAD
package com.crscd.riis.freightmarket.trade.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;
import com.crscd.riis.freightmarket.trade.dto.findOrderDtoIn;
import com.crscd.riis.freightmarket.trade.dto.findOrderDtoOut;
import com.crscd.riis.freightmarket.trade.dto.orderDto;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderService;
import com.crscd.riis.freightmarket.trade.util.tradeConstants.tradeConstants;

@Controller
@RequestMapping("/fmTradeOrder")
public class FmTradeOrderController {

	@Resource
	private IFmTradeOrderService fmTradeOrderService;
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/insertTradeOrder
	 * 功能：新增运输需求
	 * @param：orderDto
	 * @return：保存或者提交成功标识符
	 */
	@RequestMapping(value="/insertTradeOrder")
	@ResponseBody
	
	public int insertTradeOrder(@RequestBody orderDto record) {
		
		FmTradeOrderInfoBaseEntity recordBase = record.getFmTradeOrderInfoBaseEntity();	
		int orderType = recordBase.getiOrderTypeId();
		int ret = 1;
		
		/**
		 * 判定运输类型
		 * 3集装箱运输
		 * 4-6快运
		 * 7-10整车
		 * */
		if (orderType == tradeConstants.BOX_FREIGHT_FLAG){
			FmTradeOrderInfoBoxFreightEntity recordBox = record.getFmTradeOrderInfoBoxFreightRecord();
			fmTradeOrderService.saveBoxFreightOrderInfo(recordBox,recordBase);
		}
		else if (orderType >= tradeConstants.FAST_FREIGHT_FLAG_START && orderType <= tradeConstants.FAST_FREIGHT_FLAG_END) {
			FmTradeOrderInfoFastFreightEntity recordFast=record.getFmTradeOrderInfoFastFreightRecord();
			long countRecord = fmTradeOrderService.countBaseOrderNumber(recordBase);
			long countRecordFast = fmTradeOrderService.countFastFreightOrderNumber(recordFast);
			
			if(countRecord != 0 && countRecordFast!= 0) {
				if(recordBase.getiOrderState() == 0)
					ret = 0;
				else if(recordBase.getiOrderState() == 1)
					ret = 0;
			}
			else{
				fmTradeOrderService.saveOrderInfo(recordBase);
				fmTradeOrderService.saveFastFreightOrderInfo(recordFast);
			}
		}
		else if (orderType >= tradeConstants.WHOLE_VEGICLE_FLAG_START && orderType <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
			FmTradeOrderInfoWholeVegicleFreightEntity recordWhole=record.getFmTradeOrderInfoWholeVegicleFreightRecord();
			long countRecord=fmTradeOrderService.countBaseOrderNumber(recordBase);
			long countRecordWhole=fmTradeOrderService.countWholeVegicleFreightOrderNumber(recordWhole);
			
			if(countRecord != 0 && countRecordWhole!= 0) {
				if(recordBase.getiOrderState() == 0)
					ret = 0;
				else if(recordBase.getiOrderState() == 1)
					ret = 0;
			}
			else{
				fmTradeOrderService.saveOrderInfo(recordBase);
				fmTradeOrderService.saveWholeVegicleFreightOrderInfo(recordWhole);
			}
		}
		return ret;
	}
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/getOrderInfo
	 * 功能：查看运输需求
	 * @param：orderDto
	 * @return：运输需求信息
	 */
	@RequestMapping(value="/getOrderInfo")
	@ResponseBody
	public orderDto getOrderInfo(@RequestBody orderDto record) {
		
		/**
		 * id 订单ID
		 * orderType 订单类型ID
		 */
		int id = 0;
		int orderType = 0;
		orderDto recordOrder = new orderDto();
		
		id = record.getFmTradeOrderInfoBaseEntity().getId();
		FmTradeOrderInfoBaseEntity orderInfoBase = fmTradeOrderService.getFmBaseOrder(id);
		orderType = orderInfoBase.getiOrderTypeId();
		
		recordOrder.setFmTradeOrderInfoBaseEntity(orderInfoBase);
		
		/**
		 * 判定运输类型分别查询
		 * 3集装箱运输
		 * 4-6快运
		 * 7-10整车
		 * */
		if (orderType == tradeConstants.BOX_FREIGHT_FLAG) {
			recordOrder.setFmTradeOrderInfoBoxFreightRecord(fmTradeOrderService.getFmBoxFreightOrder(id));
		}
		else if (orderType >= tradeConstants.FAST_FREIGHT_FLAG_START && orderType <= tradeConstants.FAST_FREIGHT_FLAG_END) {
			recordOrder.setFmTradeOrderInfoFastFreightRecord(fmTradeOrderService.getFmFastFreightOrder(id));
		}
		else if (orderType >= tradeConstants.WHOLE_VEGICLE_FLAG_START && orderType <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
			recordOrder.setFmTradeOrderInfoWholeVegicleFreightRecord(fmTradeOrderService.getFmWholeVegicleFreightOrder(id));
		}
		return recordOrder;
	}
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/modifyTradeOrder 
	 * 功能：修改运输需求
	 * @param：orderDto
	 * @return：修改运输需求信息
	 */
	@RequestMapping(value="/modifyTradeOrder")
	@ResponseBody
	public int modifyTradeOrder(@RequestBody orderDto record) {
		int ret = -1;
		int orderType = record.getFmTradeOrderInfoBaseEntity().getiOrderTypeId();
		int retBaseInfo = fmTradeOrderService.modifyBaseOrderInfo(record.getFmTradeOrderInfoBaseEntity());
		/**
		 * 判定运输类型分别查询
		 * 3集装箱运输
		 * 4-6快运
		 * 7-10整车
		 * */
		if (orderType == tradeConstants.BOX_FREIGHT_FLAG) {
			FmTradeOrderInfoBoxFreightEntity recordBox = record.getFmTradeOrderInfoBoxFreightRecord();
			int retBoxInfo = fmTradeOrderService.modifyBoxFreightOrderInfo(recordBox);

			if(retBaseInfo == 1 && retBoxInfo == 1) {
				ret = 1;
			}
		}
		else if (orderType >= tradeConstants.FAST_FREIGHT_FLAG_START && orderType <= tradeConstants.FAST_FREIGHT_FLAG_END){
			FmTradeOrderInfoFastFreightEntity recordFast = record.getFmTradeOrderInfoFastFreightRecord();
			int retFastInfo = fmTradeOrderService.modifyFastFreightOrderInfo(recordFast);

			if(retBaseInfo == 1 && retFastInfo == 1) {
				ret = 1;
			}
		}
		else if (orderType >= tradeConstants.WHOLE_VEGICLE_FLAG_START && orderType <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
			FmTradeOrderInfoWholeVegicleFreightEntity recordWhole = record.getFmTradeOrderInfoWholeVegicleFreightRecord();
			int retWholeVegicleInfo = fmTradeOrderService.modifyWholeVegicleFreightOrderInfo(recordWhole);

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
		
		List<orderDto> order = fmTradeOrderService.findOrder(user, requirement, pageModel);
		System.out.println("pageModel.getTotalSize(): "+pageModel.getTotalSize());
		System.out.println("pageModel.getRecordCount(): "+pageModel.getRecordCount());
		
		findOrderDtoOut retOrderListAndPageModelInfo = new findOrderDtoOut();
		retOrderListAndPageModelInfo.setOrderList(order);
		retOrderListAndPageModelInfo.setPageModel(pageModel);
		return retOrderListAndPageModelInfo;
	}
}
=======
package com.crscd.riis.freightmarket.trade.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;
import com.crscd.riis.freightmarket.trade.dto.findOrderDtoIn;
import com.crscd.riis.freightmarket.trade.dto.findOrderDtoOut;
import com.crscd.riis.freightmarket.trade.dto.orderDto;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderService;
import com.crscd.riis.freightmarket.trade.util.tradeConstants.tradeConstants;

@Controller
@RequestMapping("/fmTradeOrder")
public class FmTradeOrderController {

	@Resource
	private IFmTradeOrderService fmTradeOrderService;
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/insertTradeOrder
	 * 功能：新增运输需求
	 * @param：orderDto
	 * @return：保存或者提交成功标识符
	 */
	@RequestMapping(value="/insertTradeOrder")
	@ResponseBody
	
	public int insertTradeOrder(@RequestBody orderDto record) {
		
		FmTradeOrderInfoBaseEntity recordBase = record.getFmTradeOrderInfoBaseEntity();	
		int orderType = recordBase.getiOrderTypeId();
		int ret = 1;
		
		/**
		 * 判定运输类型
		 * 3集装箱运输
		 * 4-6快运
		 * 7-10整车
		 * */
		if (orderType == tradeConstants.BOX_FREIGHT_FLAG){
			FmTradeOrderInfoBoxFreightEntity recordBox = record.getFmTradeOrderInfoBoxFreightRecord();
			fmTradeOrderService.saveBoxFreightOrderInfo(recordBox,recordBase);
		}
		else if (orderType >= tradeConstants.FAST_FREIGHT_FLAG_START && orderType <= tradeConstants.FAST_FREIGHT_FLAG_END) {
			FmTradeOrderInfoFastFreightEntity recordFast=record.getFmTradeOrderInfoFastFreightRecord();
			long countRecord = fmTradeOrderService.countBaseOrderNumber(recordBase);
			long countRecordFast = fmTradeOrderService.countFastFreightOrderNumber(recordFast);
			
			if(countRecord != 0 && countRecordFast!= 0) {
				if(recordBase.getiOrderState() == 0)
					ret = 0;
				else if(recordBase.getiOrderState() == 1)
					ret = 0;
			}
			else{
				fmTradeOrderService.saveOrderInfo(recordBase);
				fmTradeOrderService.saveFastFreightOrderInfo(recordFast);
			}
		}
		else if (orderType >= tradeConstants.WHOLE_VEGICLE_FLAG_START && orderType <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
			FmTradeOrderInfoWholeVegicleFreightEntity recordWhole=record.getFmTradeOrderInfoWholeVegicleFreightRecord();
			long countRecord=fmTradeOrderService.countBaseOrderNumber(recordBase);
			long countRecordWhole=fmTradeOrderService.countWholeVegicleFreightOrderNumber(recordWhole);
			
			if(countRecord != 0 && countRecordWhole!= 0) {
				if(recordBase.getiOrderState() == 0)
					ret = 0;
				else if(recordBase.getiOrderState() == 1)
					ret = 0;
			}
			else{
				fmTradeOrderService.saveOrderInfo(recordBase);
				fmTradeOrderService.saveWholeVegicleFreightOrderInfo(recordWhole);
			}
		}
		return ret;
	}
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/getOrderInfo
	 * 功能：查看运输需求
	 * @param：orderDto
	 * @return：运输需求信息
	 */
	@RequestMapping(value="/getOrderInfo")
	@ResponseBody
	public orderDto getOrderInfo(@RequestBody orderDto record) {
		
		/**
		 * id 订单ID
		 * orderType 订单类型ID
		 */
		int id = 0;
		int orderType = 0;
		orderDto recordOrder = new orderDto();
		
		id = record.getFmTradeOrderInfoBaseEntity().getId();
		FmTradeOrderInfoBaseEntity orderInfoBase = fmTradeOrderService.getFmBaseOrder(id);
		orderType = orderInfoBase.getiOrderTypeId();
		
		recordOrder.setFmTradeOrderInfoBaseEntity(orderInfoBase);
		
		/**
		 * 判定运输类型分别查询
		 * 3集装箱运输
		 * 4-6快运
		 * 7-10整车
		 * */
		if (orderType == tradeConstants.BOX_FREIGHT_FLAG) {
			recordOrder.setFmTradeOrderInfoBoxFreightRecord(fmTradeOrderService.getFmBoxFreightOrder(id));
		}
		else if (orderType >= tradeConstants.FAST_FREIGHT_FLAG_START && orderType <= tradeConstants.FAST_FREIGHT_FLAG_END) {
			recordOrder.setFmTradeOrderInfoFastFreightRecord(fmTradeOrderService.getFmFastFreightOrder(id));
		}
		else if (orderType >= tradeConstants.WHOLE_VEGICLE_FLAG_START && orderType <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
			recordOrder.setFmTradeOrderInfoWholeVegicleFreightRecord(fmTradeOrderService.getFmWholeVegicleFreightOrder(id));
		}
		return recordOrder;
	}
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/modifyTradeOrder 
	 * 功能：修改运输需求
	 * @param：orderDto
	 * @return：修改运输需求信息
	 */
	@RequestMapping(value="/modifyTradeOrder")
	@ResponseBody
	public int modifyTradeOrder(@RequestBody orderDto record) {
		int ret = -1;
		int orderType = record.getFmTradeOrderInfoBaseEntity().getiOrderTypeId();
		int retBaseInfo = fmTradeOrderService.modifyBaseOrderInfo(record.getFmTradeOrderInfoBaseEntity());
		/**
		 * 判定运输类型分别查询
		 * 3集装箱运输
		 * 4-6快运
		 * 7-10整车
		 * */
		if (orderType == tradeConstants.BOX_FREIGHT_FLAG) {
			FmTradeOrderInfoBoxFreightEntity recordBox = record.getFmTradeOrderInfoBoxFreightRecord();
			int retBoxInfo = fmTradeOrderService.modifyBoxFreightOrderInfo(recordBox);

			if(retBaseInfo == 1 && retBoxInfo == 1) {
				ret = 1;
			}
		}
		else if (orderType >= tradeConstants.FAST_FREIGHT_FLAG_START && orderType <= tradeConstants.FAST_FREIGHT_FLAG_END){
			FmTradeOrderInfoFastFreightEntity recordFast = record.getFmTradeOrderInfoFastFreightRecord();
			int retFastInfo = fmTradeOrderService.modifyFastFreightOrderInfo(recordFast);

			if(retBaseInfo == 1 && retFastInfo == 1) {
				ret = 1;
			}
		}
		else if (orderType >= tradeConstants.WHOLE_VEGICLE_FLAG_START && orderType <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
			FmTradeOrderInfoWholeVegicleFreightEntity recordWhole = record.getFmTradeOrderInfoWholeVegicleFreightRecord();
			int retWholeVegicleInfo = fmTradeOrderService.modifyWholeVegicleFreightOrderInfo(recordWhole);

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
		
		List<orderDto> order = fmTradeOrderService.findOrder(user, requirement, pageModel);
		System.out.println("pageModel.getTotalSize(): "+pageModel.getTotalSize());
		System.out.println("pageModel.getRecordCount(): "+pageModel.getRecordCount());
		
		findOrderDtoOut retOrderListAndPageModelInfo = new findOrderDtoOut();
		retOrderListAndPageModelInfo.setOrderList(order);
		retOrderListAndPageModelInfo.setPageModel(pageModel);
		return retOrderListAndPageModelInfo;
	}
}
>>>>>>> 4beca1a88c27f2eaadfe4360e22b0cfdc5fe97a8
