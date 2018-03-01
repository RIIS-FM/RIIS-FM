package com.crscd.riis.freightmarket.trade.controller;

import java.util.ArrayList;
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
import com.crscd.riis.freightmarket.trade.dto.modifyOrderAuditInfoDtoIn;
import com.crscd.riis.freightmarket.trade.dto.optionalOrderInfoDto;
import com.crscd.riis.freightmarket.trade.dto.orderDto;
import com.crscd.riis.freightmarket.trade.entity.FmTradeContactEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderService;
import com.crscd.riis.freightmarket.trade.util.tradeConstants.tradeConstants;

@Controller
@RequestMapping("/fmTradeOrder")
public class FmTradeOrderController {

	@Resource
	private IFmTradeOrderService fmTradeOrderService;
	
	@RequestMapping(value="/tradeOrder")
	@ResponseBody
	public optionalOrderInfoDto getTradeOrderInfo(@RequestBody FmAccountEntity user) {
		
		int accountId = user.getId();
		optionalOrderInfoDto recordDto = new optionalOrderInfoDto();
		List<FmTradeGoodsEntity> goodsList = new ArrayList<FmTradeGoodsEntity>();
		List<FmTradeContactEntity> contactList = new ArrayList<FmTradeContactEntity>();
		List<FmTradeContactEntity> recContactList = new ArrayList<FmTradeContactEntity>();
		List<FmTradeContactEntity> senContactList = new ArrayList<FmTradeContactEntity>();
		List<FmTradeContactEntity> operContactList = new ArrayList<FmTradeContactEntity>();
       
		/** 获取货物信息 */
		goodsList = fmTradeOrderService.getAllGoods();
		
		/** 获取该客户的联系人列表信息 */
		contactList = fmTradeOrderService.getContact(accountId);
		for (int i = 0; i < contactList.size(); i++) {
			
			int flag = contactList.get(i).getiContactFlag();
			if ( flag == tradeConstants.SENDER_FLAG) {
				
				senContactList.add(contactList.get(i));
			}
			if ( flag == tradeConstants.RECEIVER_FLAG ) {
				
				recContactList.add(contactList.get(i));
			}
			if ( flag == tradeConstants.OPERATOR_FLAG ) {
				
				operContactList.add(contactList.get(i));
			}
		}
		
		recordDto.setOperContactList(operContactList);
		recordDto.setRecContactList(recContactList);
		recordDto.setSenContactList(senContactList);
		recordDto.setGoodsList(goodsList);
		return recordDto;
	}
	
	
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
		int ret = -1;
		int flag = record.getFlag();
		
		/**
		 * 判定运输类型
		 * 3集装箱运输
		 * 4-6快运
		 * 7-10整车
		 **/
		if ( flag == tradeConstants.TRANSFER_INFO) {
			
			if (orderType == tradeConstants.BOX_FREIGHT_FLAG){
				FmTradeOrderInfoBoxFreightEntity recordBox = record.getFmTradeOrderInfoBoxFreightRecord();
				ret = fmTradeOrderService.saveBoxFreightOrderInfo(recordBox,recordBase);
			}
			else if (orderType >= tradeConstants.FAST_FREIGHT_FLAG_START && orderType <= tradeConstants.FAST_FREIGHT_FLAG_END) {
				FmTradeOrderInfoFastFreightEntity recordFast=record.getFmTradeOrderInfoFastFreightRecord();
				ret = fmTradeOrderService.saveFastFreightOrderInfo(recordFast,recordBase);
			}
			else if (orderType >= tradeConstants.WHOLE_VEGICLE_FLAG_START && orderType <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
				FmTradeOrderInfoWholeVegicleFreightEntity recordWhole=record.getFmTradeOrderInfoWholeVegicleFreightRecord();
				ret = fmTradeOrderService.saveWholeVegicleFreightOrderInfo(recordWhole,recordBase);
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
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/modifyOrderAuditInfo
	 * 功能：修改审核结果
	 * 输入：modifyOrderAuditInfoDtoIn dto
	 **/
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
			ret = fmTradeOrderService.modifyAuditInfo(user, orderInfo, orderAuditInfo, transportSchemeList);
		}
		else {
			ret =fmTradeOrderService.modifyAuditInfo(user, orderInfo, orderAuditInfo);
		}
		
        return ret;
	}
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeOrder/findAuditResult
	 * 功能：查询审核结果
	 * 输入：List<orderDto> 
	 **/
	@RequestMapping("/findAuditResult")
	@ResponseBody
	public List<orderDto> findAuditResult(@RequestBody findOrderDtoIn dto) {
	
		PageModel pageModel = dto.getPageModel();
		FmAccountEntity user = dto.getUser();

		Map<String, Object>  requirement = dto.getRequirement();
		
		List<orderDto> orderList = fmTradeOrderService.findAuditResult(requirement, pageModel);
		
        return orderList;
	}
	
}