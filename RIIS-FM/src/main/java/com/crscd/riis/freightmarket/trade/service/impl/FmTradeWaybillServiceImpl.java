package com.crscd.riis.freightmarket.trade.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBoxFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoFastFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoWholeVegicleFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeWaybillEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeWaybillService;
import com.crscd.riis.freightmarket.trade.util.tradeConstants.tradeConstants;


/* *
 * 运单服务层接口实现类
 * */
@Service("fmTradeWaybillService")
public class FmTradeWaybillServiceImpl implements IFmTradeWaybillService{
	
	@Resource
	private FmTradeWaybillEntityMapper fmTradeWaybillEntityMapper;
	
	@Resource
	private FmTradeOrderInfoWholeVegicleFreightEntityMapper fmTradeOrderInfoWholeVegicleFreightEntityMapper;
	
	@Resource
	private FmTradeOrderInfoBoxFreightEntityMapper fmTradeOrderInfoBoxFreightEntityMapper;
	
	@Resource 
	private FmTradeOrderInfoFastFreightEntityMapper fmTradeOrderInfoFastFreightEntityMapper;
	
	@Resource
	private FmTradeOrderInfoBaseEntityMapper fmTradeOrderInfoBaseEntityMapper;
	
	/*@Override
	public FmTradeWaybillEntity get(Integer id) {
		System.out.println(fmTradeWaybillEntityMapper.selectByPrimaryKey(id));
		return fmTradeWaybillEntityMapper.selectByPrimaryKey(id);
	}*/
	
	/* *
	 * IFmTradeWaybillService接口的getWaybillByOrder方法实现
	 * */
	@Override
	public List<FmTradeWaybillEntity> getWaybillByOrder(Integer id) {
		
		/**
		 * orderId:订单id
		 * list：存放订单拆分后的运单
		 * orderType：订单类型号
		 **/
		int orderId = -1;
		int orderType = -1;
		List<FmTradeWaybillEntity> list = new ArrayList<>();
		
		FmTradeWaybillEntity retWaybill = new FmTradeWaybillEntity();
		FmTradeOrderInfoWholeVegicleFreightEntity orderWhole = new FmTradeOrderInfoWholeVegicleFreightEntity();
		FmTradeOrderInfoBoxFreightEntity orderBox = new FmTradeOrderInfoBoxFreightEntity();
		FmTradeOrderInfoFastFreightEntity orderfast = new FmTradeOrderInfoFastFreightEntity();
		FmTradeOrderInfoBaseEntity orderBase = new FmTradeOrderInfoBaseEntity();
		
		Date orderCreateTime = new Date();
		
		orderBase = fmTradeOrderInfoBaseEntityMapper.selectByPrimaryKey(id);
		orderId = orderBase.getId();
		orderType = orderBase.getiOrderTypeId();
		
		/**
		 * 3集装箱运输
		 * 4-6快运
		 * 7-10整车
		 * */
		if (orderType == tradeConstants.BOX_FREIGHT_FLAG) {
			orderBox = fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId);
			if (orderBox.getiBoxType() != null && orderBox.getiBoxType() == tradeConstants.BOX_TYPE_20INCH) {
				for (int i = 0; i < orderBox.getiBoxNumber()/2; i++) {
					retWaybill.setiOrderId(orderId);
					retWaybill.setiOrderTypeId(orderType);
					retWaybill.setcWaybillCode(editWaybillCode());
					retWaybill.setdWaybillCreateTime(orderCreateTime);
					retWaybill.setiWaybillState(tradeConstants.WAYBILL_STATE_WAIT_SEND);
					retWaybill.setiWaybillBoxType(orderBox.getiBoxType());
					retWaybill.setiWaybillPaymentState(tradeConstants.WAYBILL_STATE_NON_PAYMENT);
					if (orderBox.getiBoxSealNum() != null) {
						retWaybill.setiWaybillBoxSealNum(orderBox.getiBoxSealNum());
					}
					if (orderBox.getiBoxNum() != null) {
						retWaybill.setiWaybillBoxNum(orderBox.getiBoxNum());
					}
					list.add(retWaybill);
				}
			}
			else if (orderBox.getiBoxType() != null && orderBox.getiBoxType() == tradeConstants.BOX_TYPE_40INCH) {
				for (int i = 0; i < orderBox.getiBoxNumber(); i++) {
					retWaybill.setiOrderId(orderId);
					retWaybill.setiOrderTypeId(orderType);
					retWaybill.setcWaybillCode(editWaybillCode());
					retWaybill.setdWaybillCreateTime(orderCreateTime);
					retWaybill.setiWaybillState(tradeConstants.WAYBILL_STATE_WAIT_SEND);
					retWaybill.setiWaybillBoxType(orderBox.getiBoxType());
					retWaybill.setiWaybillPaymentState(tradeConstants.WAYBILL_STATE_NON_PAYMENT);
					if (orderBox.getiBoxSealNum() != null) {
						retWaybill.setiWaybillBoxSealNum(orderBox.getiBoxSealNum());
					}
					if (orderBox.getiBoxNum() != null) {
						retWaybill.setiWaybillBoxNum(orderBox.getiBoxNum());
					}
					list.add(retWaybill);
				}
			}
		}
		else if (orderType >= tradeConstants.FAST_FREIGHT_FLAG_START && 
				 orderType <= tradeConstants.FAST_FREIGHT_FLAG_END) {
			orderfast = fmTradeOrderInfoFastFreightEntityMapper.selectByOrderId(orderId);
			retWaybill.setiOrderId(orderId);
			retWaybill.setiOrderTypeId(orderType);
			retWaybill.setcWaybillCode(editWaybillCode());
			retWaybill.setdWaybillCreateTime(orderCreateTime);
			retWaybill.setiWaybillState(tradeConstants.WAYBILL_STATE_WAIT_SEND);
			retWaybill.setiWaybillPaymentState(tradeConstants.WAYBILL_STATE_NON_PAYMENT);
			if (orderfast.getcTrainNum() != null) {
				retWaybill.setcWaybillTrainNum(orderfast.getcTrainNum());
			}
			list.add(retWaybill);
			
		}
		else if (orderType >= tradeConstants.WHOLE_VEGICLE_FLAG_START && 
				 orderType <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
			orderWhole = fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByOrderId(orderId);
			for (int i = 0; i < orderWhole.getiGoodsRequestTrainNumber(); i++) {
				retWaybill.setiOrderId(orderId);
				retWaybill.setiOrderTypeId(orderType);
				retWaybill.setcWaybillCode(editWaybillCode());
				retWaybill.setdWaybillCreateTime(orderCreateTime);
				retWaybill.setiWaybillState(tradeConstants.WAYBILL_STATE_WAIT_SEND);
				retWaybill.setiWaybillPaymentState(tradeConstants.WAYBILL_STATE_NON_PAYMENT);
				if (orderWhole.getiGoodsReinforce() != null) {
					retWaybill.setiWaybillGoodsReinforce(orderWhole.getiGoodsReinforce());
				}
				if (orderWhole.getiGoodsWrapper() != null) {
					retWaybill.setiWaybillGoodsWrapper(orderWhole.getiGoodsWrapper());
				}
				if (orderWhole.getiCanvasNumber() != null) {
					retWaybill.setfWaybillCanvasNumber((float)orderWhole.getiCanvasNumber());
				}
				if (orderWhole.getiTrainType() != null) {
					retWaybill.setfWaybillTrainType((float)orderWhole.getiTrainType());
				}
				list.add(retWaybill);
			}
		}
		return list;
	}
	
	/** 
	 * 编辑运单编号	
	 * */
	@Override
	public String editWaybillCode() {
		String orderCode = new String();
		Date day=new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		orderCode = "YD"+df.format(day);
		
		return orderCode;
	}
	
	/* *
	 * IFmTradeWaybillService接口的saveWaybill方法实现
	 * */
	public int saveWaybill(FmTradeWaybillEntity record) {
		return fmTradeWaybillEntityMapper.insertSelective(record);
	}
	

}
