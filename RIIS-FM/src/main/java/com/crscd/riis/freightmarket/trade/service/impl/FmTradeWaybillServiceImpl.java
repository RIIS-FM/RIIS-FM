package com.crscd.riis.freightmarket.trade.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBoxFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoFastFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoWholeVegicleFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeTransportSchemeEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeWaybillEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntityExample;
import com.crscd.riis.freightmarket.trade.service.IFmTradeWaybillService;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;
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
	
	@Resource 
	private FmTradeTransportSchemeEntityMapper fmTradeTransportSchemeEntityMapper;
	
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
		FmTradeTransportSchemeEntity transportScheme = new FmTradeTransportSchemeEntity();
		
		
		orderBase = fmTradeOrderInfoBaseEntityMapper.selectByPrimaryKey(id);
		transportScheme = fmTradeTransportSchemeEntityMapper.selectByOrderId(id);
		orderId = orderBase.getId();
		orderType = orderBase.getiOrderTypeId();
		
		/*选择承运方案后*/
		if (transportScheme != null && transportScheme.getiIsSelect() == tradeConstants.TRANSPORT_SCHEME_SELECT_FLAG) {
			/**
			 * 3集装箱运输
			 * 4-6快运
			 * 7-10整车
			 * */
			if (orderType == tradeConstants.BOX_FREIGHT_FLAG) {
				orderBox = fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId);
				
				/*20英寸集装箱 运单数为集装箱除以2*/
				if (orderBox.getiBoxType() != null && orderBox.getiBoxType() == tradeConstants.BOX_TYPE_20INCH) {
					for (int i = 0; i < orderBox.getiBoxNumber()/2; i++) {
						retWaybill.setcWaybillCode(this.editWaybillCode(i));
						retWaybill = this.setWaybillBaseInfo(id);
						retWaybill.setiWaybillBoxType(orderBox.getiBoxType());
						if (orderBox.getiBoxSealNum() != null) {
							retWaybill.setiWaybillBoxSealNum(orderBox.getiBoxSealNum());
						}
						if (orderBox.getiBoxNum() != null) {
							retWaybill.setiWaybillBoxNum(orderBox.getiBoxNum());
						}
						list.add(retWaybill);
					}
				}
				
				/*40英寸集装箱 运单数为集装箱数*/
				else if (orderBox.getiBoxType() != null && orderBox.getiBoxType() == tradeConstants.BOX_TYPE_40INCH) {
					for (int i = 0; i < orderBox.getiBoxNumber(); i++) {
						retWaybill.setcWaybillCode(this.editWaybillCode(i));
						retWaybill = this.setWaybillBaseInfo(id);
						retWaybill.setiWaybillBoxType(orderBox.getiBoxType());
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
			
			/*快运订单数为运单数*/
			else if (orderType >= tradeConstants.FAST_FREIGHT_FLAG_START && 
					 orderType <= tradeConstants.FAST_FREIGHT_FLAG_END) {
				orderfast = fmTradeOrderInfoFastFreightEntityMapper.selectByOrderId(orderId);
				retWaybill = this.setWaybillBaseInfo(id);
				if (orderfast.getcTrainNum() != null) {
					retWaybill.setcWaybillTrainNum(orderfast.getcTrainNum());
				}
				list.add(retWaybill);
				
			}
			
			/*整车的需求车数为运单数*/
			else if (orderType >= tradeConstants.WHOLE_VEGICLE_FLAG_START && 
					 orderType <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
				orderWhole = fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByOrderId(orderId);
				for (int i = 0; i < orderWhole.getiGoodsRequestTrainNumber(); i++) {
					retWaybill.setcWaybillCode(this.editWaybillCode(i));
					retWaybill = this.setWaybillBaseInfo(id);
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
		else 
			return null; 
		
	}
	
	/* *
	 * IFmTradeWaybillService接口的setWaybillBaseInfo方法实现
	 * */
	@Override
	public FmTradeWaybillEntity setWaybillBaseInfo(Integer id) {
		
		FmTradeOrderInfoBaseEntity orderBase = new FmTradeOrderInfoBaseEntity();
		FmTradeWaybillEntity retWaybill = new FmTradeWaybillEntity();
		FmTradeTransportSchemeEntity transportScheme = new FmTradeTransportSchemeEntity();
		Date orderCreateTime = new Date();
		
		orderBase = fmTradeOrderInfoBaseEntityMapper.selectByPrimaryKey(id);
		transportScheme = fmTradeTransportSchemeEntityMapper.selectByOrderId(id);
		
		/*设置订单基本信息*/
		retWaybill.setiOrderId(id);
		retWaybill.setiOrderTypeId(orderBase.getiOrderTypeId());
		retWaybill.setdWaybillCreateTime(orderCreateTime);
		retWaybill.setiWaybillState(tradeConstants.WAYBILL_STATE_WAIT_SEND);
		retWaybill.setiWaybillPaymentState(tradeConstants.WAYBILL_STATE_NON_PAYMENT);
		//retWaybill.setiWaybillDateline(orderBase.getdOrderDateline());
		
		/*设置承运方案中的预计时间*/
		if (transportScheme.getdTradeOrderTransportSchemeStartTime() != null) {
			retWaybill.setdWaybillPredictSenderTime(transportScheme.getdTradeOrderTransportSchemeStartTime());
		}
		else 
			retWaybill.setdWaybillPredictSenderTime(null);
		if (transportScheme.getdTradeOrderTransportSchemeEndTime() != null) {
			retWaybill.setdWaybillPredictArriveTime(transportScheme.getdTradeOrderTransportSchemeEndTime());
		}
		else
			retWaybill.setdWaybillPredictArriveTime(null);
		if (transportScheme.getdTradeOrderTransportSchemeLoadStartTime() != null) {
			retWaybill.setdWaybillPredictLoadStartTime(transportScheme.getdTradeOrderTransportSchemeLoadStartTime());
		}
		else 
			retWaybill.setdWaybillPredictLoadStartTime(null);
		if (transportScheme.getdTradeOrderTransportSchemeLoadEndTime() != null) {
			retWaybill.setdWaybillPredictLoadEndTime(transportScheme.getdTradeOrderTransportSchemeLoadEndTime());
		}
		else 
			retWaybill.setdWaybillPredictLoadEndTime(null);
		if (transportScheme.getdTradeOrderTransportSchemeUnloadStartTime() != null) {
			retWaybill.setdWaybillPredictUnloadStartTime(transportScheme.getdTradeOrderTransportSchemeUnloadStartTime());
		}
		else
			retWaybill.setdWaybillPredictUnloadStartTime(null);
		if (transportScheme.getdTradeOrderTransportSchemeUnloadEndTime() != null) {
			retWaybill.setdWaybillPredictUnloadEndTime(transportScheme.getdTradeOrderTransportSchemeUnloadEndTime());
		}
		else 
			retWaybill.setdWaybillPredictUnloadEndTime(null);
		
		return retWaybill;
		
	}
	
	/** 
	 * 编辑运单编号	
	 * */
	@Override
	public String editWaybillCode(Integer i) {
		String orderCode = new String();
		Date day=new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		orderCode = "YD"+df.format(day)+i.toString();
		
		return orderCode;
	}
	
	/* *
	 * IFmTradeWaybillService接口的saveWaybill方法实现
	 * */
	@Override
	public int saveWaybill(FmTradeWaybillEntity record) {
		
		return fmTradeWaybillEntityMapper.insertSelective(record);
	}
	
	/* *
	 * IFmTradeWaybillService接口的modifyWaybill方法实现
	 * */
	@Override
	public int modifyWaybill(FmTradeWaybillEntity record) {
		
		return fmTradeWaybillEntityMapper.updateByPrimaryKey(record);
	}
	
	/* *
	 * IFmTradeWaybillService接口的countWaybillNumber方法实现
	 * */
	@Override
	public long countWaybillNumber(Map<String, Object> requirement) {
		long waybillNumber = -1;
		FmTradeWaybillEntityExample example = new FmTradeWaybillEntityExample();
		FmTradeWaybillEntityExample.Criteria criteria = example.createCriteria();
		
		if (requirement.get("iOrderId") != null) {
			criteria.andIOrderIdEqualTo((Integer) requirement.get("iOrderId"));
		}
		if (requirement.get("iOrderTypeId") != null) {
			criteria.andIOrderTypeIdEqualTo((Integer) requirement.get("iOrderTypeId"));
		}
		if (requirement.get("iOrderTypeNum") != null) {
			criteria.andIOrderTypeNumEqualTo((Integer) requirement.get("iOrderTypeNum"));
		}
		if (requirement.get("cWaybillCode") != null) {
			criteria.andCWaybillCodeEqualTo((String) requirement.get("cWaybillCode"));
		}
		if (requirement.get("dWaybillCreateTimeStart") != null && requirement.get("dWaybillCreateTimeEnd") != null) {
			String dWaybillCreateTimeStartStr = requirement.get("dWaybillCreateTimeStart").toString();
			String dWaybillCreateTimeEndStr = requirement.get("dWaybillCreateTimeEnd").toString();
			Date dWaybillCreateTimeStart = null;
			try {
				dWaybillCreateTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillCreateTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dWaybillCreateTimeEnd = null;
			try {
				dWaybillCreateTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillCreateTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDWaybillCreateTimeBetween(dWaybillCreateTimeStart,dWaybillCreateTimeEnd);
		}
		if (requirement.get("iWaybillState") != null) {
			criteria.andIWaybillStateEqualTo((Integer) requirement.get("iWaybillState"));
		}
		if (requirement.get("iWaybillBoxSealNum") != null) {
			criteria.andIWaybillBoxSealNumEqualTo((Integer) requirement.get("iWaybillBoxSealNum"));
		}
		if (requirement.get("iWaybillBoxType") != null) {
			criteria.andIWaybillBoxTypeEqualTo((Integer) requirement.get("iWaybillBoxType"));
		}
		if (requirement.get("iWaybillBoxNum") != null) {
			criteria.andIWaybillBoxNumEqualTo((Integer) requirement.get("iWaybillBoxNum"));
		}
		if (requirement.get("iWaybillGoodsReinforce") != null) {
			criteria.andIWaybillGoodsReinforceEqualTo((Integer) requirement.get("iWaybillGoodsReinforce"));
		}
		if (requirement.get("iWaybillGoodsWrapper") != null) {
			criteria.andIWaybillGoodsWrapperEqualTo((Integer) requirement.get("iWaybillGoodsWrapper"));
		}
		if (requirement.get("fWaybillCanvasNumber") != null) {
			criteria.andFWaybillCanvasNumberEqualTo((Float) requirement.get("fWaybillCanvasNumber"));
		}
		if (requirement.get("fWaybillTrainType") != null) {
			criteria.andFWaybillTrainTypeEqualTo((Float) requirement.get("fWaybillTrainType"));
		}
		if (requirement.get("cWaybillTrainNum") != null) {
			criteria.andCWaybillTrainNumEqualTo((String) requirement.get("cWaybillTrainNum"));
		}
		if (requirement.get("iWaybillTrainNumberCharge") != null) {
			criteria.andIWaybillTrainNumberChargeEqualTo((Integer) requirement.get("iWaybillTrainNumberCharge"));
		}
		if (requirement.get("iWaybillBoxNumberCharge") != null) {
			criteria.andIWaybillBoxNumberChargeEqualTo((Integer) requirement.get("iWaybillBoxNumberCharge"));
		}
		if (requirement.get("iWaybillGoodsNumberCharge") != null) {
			criteria.andIWaybillGoodsNumberChargeEqualTo((Integer) requirement.get("iWaybillGoodsNumberCharge"));
		}
		if (requirement.get("iPriceNo") != null) {
			criteria.andIPriceNoEqualTo((Integer) requirement.get("iPriceNo"));
		}
		if (requirement.get("fPriceRate") != null) {
			criteria.andFPriceRateEqualTo((Float) requirement.get("fPriceRate"));
		}
		if (requirement.get("fWaybillIncidentalsPaid") != null) {
			criteria.andFWaybillIncidentalsPaidEqualTo((Float) requirement.get("fWaybillIncidentalsPaid"));
		}
		if (requirement.get("fWaybillElectrictFee") != null) {
			criteria.andFWaybillElectrictFeeEqualTo((Float) requirement.get("fWaybillElectrictFee"));
		}
		if (requirement.get("fWaybillConstructFee") != null) {
			criteria.andFWaybillConstructFeeEqualTo((Float) requirement.get("fWaybillConstructFee"));
		}
		if (requirement.get("iWaybillPaymentMethod") != null) {
			criteria.andIWaybillPaymentMethodEqualTo((Integer) requirement.get("iWaybillPaymentMethod"));
		}
		if (requirement.get("iWaybillPaymentState") != null) {
			criteria.andIWaybillPaymentStateEqualTo((Integer) requirement.get("iWaybillPaymentState"));
		}
		if (requirement.get("fWaybillSenderReportWeight") != null) {
			criteria.andFWaybillSenderReportWeightEqualTo((Float) requirement.get("fWaybillSenderReportWeight"));
		}
		if (requirement.get("fWaybillRecverReportWeight") != null) {
			criteria.andFWaybillRecverReportWeightEqualTo((Float) requirement.get("fWaybillRecverReportWeight"));
		}
		if (requirement.get("fWaybillWeightCharge") != null) {
			criteria.andFWaybillWeightChargeEqualTo((Float) requirement.get("fWaybillWeightCharge"));
		}
		if (requirement.get("iWaybillSenderReportTrainNumber") != null) {
			criteria.andIWaybillSenderReportTrainNumberEqualTo((Integer) requirement.get("iWaybillSenderReportTrainNumber"));
		}
		if (requirement.get("iWaybillRecverReportTrainNumber") != null) {
			criteria.andIWaybillRecverReportTrainNumberEqualTo((Integer) requirement.get("iWaybillRecverReportTrainNumber"));
		}
		if (requirement.get("iWaybillSenderReportBoxNumber") != null) {
			criteria.andIWaybillSenderReportBoxNumberEqualTo((Integer) requirement.get("iWaybillSenderReportBoxNumber"));
		}
		if (requirement.get("iWaybillRecverReportBoxNumber") != null) {
			criteria.andIWaybillRecverReportBoxNumberEqualTo((Integer) requirement.get("iWaybillRecverReportBoxNumber"));
		}
		if (requirement.get("iWaybillSenderReportGoodsNumber") != null) {
			criteria.andIWaybillSenderReportGoodsNumberEqualTo((Integer) requirement.get("iWaybillSenderReportGoodsNumber"));
		}
		if (requirement.get("iWaybillRecverReportGoodsNumber") != null) {
			criteria.andIWaybillRecverReportGoodsNumberEqualTo((Integer) requirement.get("iWaybillRecverReportGoodsNumber"));
		}
		if (requirement.get("dWaybillTimeStart") != null && requirement.get("dWaybillTimeEnd") != null) {
			String dWaybillTimeStartStr = requirement.get("dWaybillTimeStart").toString();
			String dWaybillTimeEndStr = requirement.get("dWaybillTimeEnd").toString();
			Date dWaybillTimeStart = null;
			try {
				dWaybillTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dWaybillTimeEnd = null;
			try {
				dWaybillTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDWaybillTimeBetween(dWaybillTimeStart,dWaybillTimeEnd);
		}
		if (requirement.get("dWaybillDatelineStart") != null && requirement.get("dWaybillDatelineEnd") != null) {
			String dWaybillDatelineStartStr = requirement.get("dWaybillDatelineStart").toString();
			String dWaybillDatelineEndStr = requirement.get("dWaybillDatelineEnd").toString();
			Date dWaybillDatelineStart = null;
			try {
				dWaybillDatelineStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillDatelineStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dWaybillDatelineEnd = null;
			try {
				dWaybillDatelineEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillDatelineEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDWaybillDatelineBetween(dWaybillDatelineStart,dWaybillDatelineEnd);
		}
		if (requirement.get("dWaybillPredictArriveTimeStart") != null && requirement.get("dWaybillPredictArriveTimeEnd") != null) {
			String dWaybillPredictArriveTimeStartStr = requirement.get("dWaybillPredictArriveTimeStart").toString();
			String dWaybillPredictArriveTimeEndStr = requirement.get("dWaybillPredictArriveTimeEnd").toString();
			Date dWaybillPredictArriveTimeStart = null;
			try {
				dWaybillPredictArriveTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictArriveTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dWaybillPredictArriveTimeEnd = null;
			try {
				dWaybillPredictArriveTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictArriveTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDWaybillPredictArriveTimeBetween(dWaybillPredictArriveTimeStart,dWaybillPredictArriveTimeEnd);
		}
		if (requirement.get("dWaybillPredictUnloadStartTimeStart") != null && requirement.get("dWaybillPredictUnloadStartTimeEnd") != null) {
			String dWaybillPredictUnloadStartTimeStartStr = requirement.get("dWaybillPredictUnloadStartTimeStart").toString();
			String dWaybillPredictUnloadStartTimeEndStr = requirement.get("dWaybillPredictUnloadStartTimeEnd").toString();
			Date dWaybillPredictUnloadStartTimeStart = null;
			try {
				dWaybillPredictUnloadStartTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictUnloadStartTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dWaybillPredictUnloadStartTimeEnd = null;
			try {
				dWaybillPredictUnloadStartTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictUnloadStartTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDWaybillPredictUnloadStartTimeBetween(dWaybillPredictUnloadStartTimeStart,dWaybillPredictUnloadStartTimeEnd);
		}
		if (requirement.get("dWaybillPredictUnloadEndTimeStart") != null && requirement.get("dWaybillPredictUnloadEndTimeEnd") != null) {
			String dWaybillPredictUnloadEndTimeStartStr = requirement.get("dWaybillPredictUnloadEndTimeStart").toString();
			String dWaybillPredictUnloadEndTimeEndStr = requirement.get("dWaybillPredictUnloadEndTimeEnd").toString();
			Date dWaybillPredictUnloadEndTimeStart = null;
			try {
				dWaybillPredictUnloadEndTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictUnloadEndTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dWaybillPredictUnloadEndTimeEnd = null;
			try {
				dWaybillPredictUnloadEndTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictUnloadEndTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDWaybillPredictUnloadEndTimeBetween(dWaybillPredictUnloadEndTimeStart,dWaybillPredictUnloadEndTimeEnd);
		}
		if (requirement.get("dWaybillPredictSenderTimeStart") != null && requirement.get("dWaybillPredictSenderTimeEnd") != null) {
			String dWaybillPredictSenderTimeStartStr = requirement.get("dWaybillPredictSenderTimeStart").toString();
			String dWaybillPredictSenderTimeEndStr = requirement.get("dWaybillPredictSenderTimeEnd").toString();
			Date dWaybillPredictSenderTimeStart = null;
			try {
				dWaybillPredictSenderTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictSenderTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dWaybillPredictSenderTimeEnd = null;
			try {
				dWaybillPredictSenderTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictSenderTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDWaybillPredictSenderTimeBetween(dWaybillPredictSenderTimeStart,dWaybillPredictSenderTimeEnd);
		}
		if (requirement.get("dWaybillPredictLoadStartTimeStart") != null && requirement.get("dWaybillPredictLoadStartTimeEnd") != null) {
			String dWaybillPredictLoadStartTimeStartStr = requirement.get("dWaybillPredictLoadStartTimeStart").toString();
			String dWaybillPredictLoadStartTimeEndStr = requirement.get("dWaybillPredictLoadStartTimeEnd").toString();
			Date dWaybillPredictLoadStartTimeStart = null;
			try {
				dWaybillPredictLoadStartTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictLoadStartTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dWaybillPredictLoadStartTimeEnd = null;
			try {
				dWaybillPredictLoadStartTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictLoadStartTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDWaybillPredictLoadStartTimeBetween(dWaybillPredictLoadStartTimeStart,dWaybillPredictLoadStartTimeEnd);
		}
		if (requirement.get("dWaybillPredictLoadEndTimeStart") != null && requirement.get("dWaybillPredictLoadEndTimeEnd") != null) {
			String dWaybillPredictLoadEndTimeStartStr = requirement.get("dWaybillPredictLoadEndTimeStart").toString();
			String dWaybillPredictLoadEndTimeEndStr = requirement.get("dWaybillPredictLoadEndTimeEnd").toString();
			Date dWaybillPredictLoadEndTimeStart = null;
			try {
				dWaybillPredictLoadEndTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictLoadEndTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dWaybillPredictLoadEndTimeEnd = null;
			try {
				dWaybillPredictLoadEndTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dWaybillPredictLoadEndTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDWaybillPredictLoadEndTimeBetween(dWaybillPredictLoadEndTimeStart,dWaybillPredictLoadEndTimeEnd);
		}
		
		waybillNumber = fmTradeWaybillEntityMapper.countByExample(example);
		return waybillNumber;
	}
	
	/* *
	 * IFmTradeWaybillService接口的findWaybill方法实现
	 * */
	@Override
	public List<FmTradeWaybillEntity> findWaybill(FmAccountEntity user, Map<String, Object> orderRequirement,
			Map<String, Object> waybillRequirement, PageModel pageModel){
		/**
		 * 定义基础变量
		 * recordCount 满足条件的所有订单
		 * */
		int recordCount = 0;
		
		Map<String, Object> orderParams = new HashMap<String, Object>();
		Map<String, Object> waybillParams = new HashMap<String, Object>();
		List<FmTradeOrderInfoBaseEntity> orderList = new ArrayList<FmTradeOrderInfoBaseEntity>();
		List<Object> orderIdList = new ArrayList<Object>();
		List<FmTradeWaybillEntity> waybillList = new ArrayList<FmTradeWaybillEntity>();
		
		/**
		 * 通过iSenderId和订单确认承运方案的标志位
		 * 获得该用户的全部订单信息
		 * */
		if (user.getId() != null) {
			orderParams.put("iSenderId", user.getId());
		}
		if (orderRequirement.get("iOrderState") != null) {
			orderParams.put("iOrderState", tradeConstants.ORDER_COMMIT_TRANSPORT_SCHEME);
		}
		orderList = fmTradeOrderInfoBaseEntityMapper.selectByPage(orderParams);
		System.out.println(orderList);
		
		System.out.println("waybillRequirement.get(\"iOrderId\")"+waybillRequirement.get("iOrderId"));
		/*定义每个订单的Map*/
		if (waybillRequirement.get("iOrderId") != null) {
			waybillParams.put("iOrderId", waybillRequirement.get("iOrderId"));
			
			recordCount = (int)countWaybillNumber(waybillRequirement);
		}
		else {
			
			 /*通过订单id获得全部运单数量*/
			for (int i = 0; i < orderList.size(); i++) {
				
				int orderId = -1;
				
				orderId = orderList.get(i).getId();
				System.out.println(orderId);
				/*获得每个订单下的运单数量*/
				waybillParams.put("iOrderId", orderId);
				recordCount = recordCount + (int) this.countWaybillNumber(waybillParams);
				
				/*获得每个订单的订单编号*/
				orderIdList.add(orderId);
			}
			
			/*将订单id转换成字符串*/
			StringBuffer orderStr =  new StringBuffer();
			for ( int i = 0; i < orderIdList.size()-1; i++) {
				String str = orderIdList.get(i).toString()+",";
				orderStr.append(str);
			}
			orderStr.append(orderIdList.get(orderIdList.size()-1).toString());
			waybillParams.put("iOrderId", orderStr);
			
		}
		if (waybillRequirement.get("iOrderTypeId") != null) {
			waybillParams.put("iOrderTypeId", waybillRequirement.get("iOrderTypeId"));
		}
		if (waybillRequirement.get("iOrderTypeNum") != null) {
			waybillParams.put("iOrderTypeNum", waybillRequirement.get("iOrderTypeNum"));
		}
		if (waybillRequirement.get("cWaybillCode") != null) {
			waybillParams.put("cWaybillCode", waybillRequirement.get("cWaybillCode"));
		}
		if (waybillRequirement.get("dWaybillCreateTimeStart") != null ) {
			waybillParams.put("dWaybillCreateTimeStart", waybillRequirement.get("dWaybillCreateTimeStart"));
		}
        if (waybillRequirement.get("dWaybillCreateTimeEnd") != null) {
			waybillParams.put("dWaybillCreateTimeEnd", waybillRequirement.get("dWaybillCreateTimeEnd"));
		}
		if(waybillRequirement.get("iWaybillState") != null) {
			waybillParams.put("iWaybillState", waybillRequirement.get("iWaybillState"));
		}
		if(waybillRequirement.get("iWaybillBoxSealNum") != null) {
			waybillParams.put("iWaybillBoxSealNum", waybillRequirement.get("iWaybillBoxSealNum"));
		}
		if(waybillRequirement.get("iWaybillBoxType") != null) {
			waybillParams.put("iWaybillBoxType", waybillRequirement.get("iWaybillBoxType"));
		}
		if(waybillRequirement.get("iWaybillBoxNum") != null) {
			waybillParams.put("iWaybillBoxNum", waybillRequirement.get("iWaybillBoxNum"));
		}
		if(waybillRequirement.get("iWaybillGoodsReinforce") != null) {
			waybillParams.put("iWaybillGoodsReinforce", waybillRequirement.get("iWaybillGoodsReinforce"));
		}
		if(waybillRequirement.get("iWaybillGoodsWrapper") != null) {
			waybillParams.put("iWaybillGoodsWrapper", waybillRequirement.get("iWaybillGoodsWrapper"));
		}
		if(waybillRequirement.get("fWaybillCanvasNumber") != null) {
			waybillParams.put("fWaybillCanvasNumber", waybillRequirement.get("fWaybillCanvasNumber"));
		}
		if(waybillRequirement.get("fWaybillTrainType") != null) {
			waybillParams.put("fWaybillTrainType", waybillRequirement.get("fWaybillTrainType"));
		}
		if(waybillRequirement.get("cWaybillTrainNum") != null) {
			waybillParams.put("cWaybillTrainNum", waybillRequirement.get("cWaybillTrainNum"));
		}
		if(waybillRequirement.get("iWaybillTrainNumberCharge") != null) {
			waybillParams.put("iWaybillTrainNumberCharge", waybillRequirement.get("iWaybillTrainNumberCharge"));
		}
		if(waybillRequirement.get("iWaybillBoxNumberCharge") != null) {
			waybillParams.put("iWaybillBoxNumberCharge", waybillRequirement.get("iWaybillBoxNumberCharge"));
		}
		if(waybillRequirement.get("iWaybillGoodsNumberCharge") != null) {
			waybillParams.put("iWaybillGoodsNumberCharge", waybillRequirement.get("iWaybillGoodsNumberCharge"));
		}
		if(waybillRequirement.get("iPriceNo") != null) {
			waybillParams.put("iPriceNo", waybillRequirement.get("iPriceNo"));
		}
		if(waybillRequirement.get("fPriceRate") != null) {
			waybillParams.put("fPriceRate", waybillRequirement.get("fPriceRate"));
		}
		if(waybillRequirement.get("fWaybillIncidentalsPaid") != null) {
			waybillParams.put("fWaybillIncidentalsPaid", waybillRequirement.get("fWaybillIncidentalsPaid"));
		}
		if(waybillRequirement.get("fWaybillElectrictFee") != null) {
			waybillParams.put("fWaybillElectrictFee", waybillRequirement.get("fWaybillElectrictFee"));
		}
		if(waybillRequirement.get("fWaybillConstructFee") != null) {
			waybillParams.put("fWaybillConstructFee", waybillRequirement.get("fWaybillConstructFee"));
		}
		if(waybillRequirement.get("iWaybillPaymentMethod") != null) {
			waybillParams.put("iWaybillPaymentMethod", waybillRequirement.get("iWaybillPaymentMethod"));
		}
		if(waybillRequirement.get("iWaybillPaymentState") != null) {
			waybillParams.put("iWaybillPaymentState", waybillRequirement.get("iWaybillPaymentState"));
		}
		if(waybillRequirement.get("fWaybillSenderReportWeight") != null) {
			waybillParams.put("fWaybillSenderReportWeight", waybillRequirement.get("fWaybillSenderReportWeight"));
		}
		if(waybillRequirement.get("fWaybillRecverReportWeight") != null) {
			waybillParams.put("fWaybillRecverReportWeight", waybillRequirement.get("fWaybillRecverReportWeight"));
		}
		if(waybillRequirement.get("fWaybillWeightCharge") != null) {
			waybillParams.put("fWaybillWeightCharge", waybillRequirement.get("fWaybillWeightCharge"));
		}
		if(waybillRequirement.get("iWaybillSenderReportTrainNumber") != null) {
			waybillParams.put("iWaybillSenderReportTrainNumber", waybillRequirement.get("iWaybillSenderReportTrainNumber"));
		}
		if(waybillRequirement.get("iWaybillRecverReportTrainNumber") != null) {
			waybillParams.put("iWaybillRecverReportTrainNumber", waybillRequirement.get("iWaybillRecverReportTrainNumber"));
		}
		if(waybillRequirement.get("iWaybillSenderReportBoxNumber") != null) {
			waybillParams.put("iWaybillSenderReportBoxNumber", waybillRequirement.get("iWaybillSenderReportBoxNumber"));
		}
		if(waybillRequirement.get("iWaybillRecverReportBoxNumber") != null) {
			waybillParams.put("iWaybillRecverReportBoxNumber", waybillRequirement.get("iWaybillRecverReportBoxNumber"));
		}
		if(waybillRequirement.get("iWaybillSenderReportGoodsNumber") != null) {
			waybillParams.put("iWaybillSenderReportGoodsNumber", waybillRequirement.get("iWaybillSenderReportGoodsNumber"));
		}
		if(waybillRequirement.get("iWaybillRecverReportGoodsNumber") != null) {
			waybillParams.put("iWaybillRecverReportGoodsNumber", waybillRequirement.get("iWaybillRecverReportGoodsNumber"));
		}
		if(waybillRequirement.get("dWaybillTimeStart") != null) {
			waybillParams.put("dWaybillTimeStart", waybillRequirement.get("dWaybillTimeStart"));
		}
        if(waybillRequirement.get("dWaybillTimeEnd") != null) {
			waybillParams.put("dWaybillTimeEnd", waybillRequirement.get("dWaybillTimeEnd"));
		}
		if(waybillRequirement.get("dWaybillDatelineStart") != null) {
			waybillParams.put("dWaybillDatelineStart", waybillRequirement.get("dWaybillDatelineStart"));
		}
        if(waybillRequirement.get("dWaybillDatelineEnd") != null) {
			waybillParams.put("dWaybillDatelineEnd", waybillRequirement.get("dWaybillDatelineEnd"));
		}
		if(waybillRequirement.get("dWaybillPredictArriveTimeStart") != null) {
			waybillParams.put("dWaybillPredictArriveTimeStart", waybillRequirement.get("dWaybillPredictArriveTimeStart"));
		}
        if(waybillRequirement.get("dWaybillPredictArriveTimeEnd") != null) {
			waybillParams.put("dWaybillPredictArriveTimeEnd", waybillRequirement.get("dWaybillPredictArriveTimeEnd"));
		}
		if(waybillRequirement.get("dWaybillPredictUnloadStartTimeStart") != null) {
			waybillParams.put("dWaybillPredictUnloadStartTimeStart", waybillRequirement.get("dWaybillPredictUnloadStartTimeStart"));
		}
        if(waybillRequirement.get("dWaybillPredictUnloadStartTimeEnd") != null) {
			waybillParams.put("dWaybillPredictUnloadStartTimeEnd", waybillRequirement.get("dWaybillPredictUnloadStartTimeEnd"));
		}
		if(waybillRequirement.get("dWaybillPredictUnloadEndTimeStart") != null) {
			waybillParams.put("dWaybillPredictUnloadEndTimeStart", waybillRequirement.get("dWaybillPredictUnloadEndTimeStart"));
		}
        if(waybillRequirement.get("dWaybillPredictUnloadEndTimeEnd") != null) {
			waybillParams.put("dWaybillPredictUnloadEndTimeEnd", waybillRequirement.get("dWaybillPredictUnloadEndTimeEnd"));
		}
		if(waybillRequirement.get("dWaybillPredictSenderTimeStart") != null) {
			waybillParams.put("dWaybillPredictSenderTimeStart", waybillRequirement.get("dWaybillPredictSenderTimeStart"));
		}
        if(waybillRequirement.get("dWaybillPredictSenderTimeEnd") != null) {
			waybillParams.put("dWaybillPredictSenderTimeEnd", waybillRequirement.get("dWaybillPredictSenderTimeEnd"));
		}
		if(waybillRequirement.get("dWaybillPredictLoadStartTimeStart") != null) {
			waybillParams.put("dWaybillPredictLoadStartTimeStart", waybillRequirement.get("dWaybillPredictLoadStartTimeStart"));
		}
        if(waybillRequirement.get("dWaybillPredictLoadStartTimeEnd") != null) {
			waybillParams.put("dWaybillPredictLoadStartTimeEnd", waybillRequirement.get("dWaybillPredictLoadStartTimeEnd"));
		}
		if(waybillRequirement.get("dWaybillPredictLoadEndTimeStart") != null) {
			waybillParams.put("dWaybillPredictLoadEndTimeStart", waybillRequirement.get("dWaybillPredictLoadEndTimeStart"));
		}
        if(waybillRequirement.get("dWaybillPredictLoadEndTimeEnd") != null) {
			waybillParams.put("dWaybillPredictLoadEndTimeEnd", waybillRequirement.get("dWaybillPredictLoadEndTimeEnd"));
		}
        if( pageModel != null) {
			waybillParams.put("pageModel", pageModel);
		}
        
		pageModel.setRecordCount(recordCount);
		waybillList = fmTradeWaybillEntityMapper.selectByPage(waybillParams);
		
        return waybillList;
	}

}
