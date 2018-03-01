package com.crscd.riis.freightmarket.trade.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.dao.FmTradeFeeEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeGoodsEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderAuditEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBoxFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoFastFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoWholeVegicleFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderTypeEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeTransportSchemeEntityMapper;
import com.crscd.riis.freightmarket.trade.dto.orderDto;
import com.crscd.riis.freightmarket.trade.entity.FmTradeFeeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderTypeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderAudit;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;
import com.crscd.riis.freightmarket.trade.util.tradeConstants.tradeConstants;


@Service("fmTradeOrderAuditService")
public class FmTradeOrderAuditImpl implements IFmTradeOrderAudit {
	
	@Resource
	private FmTradeOrderAuditEntityMapper fmTradeOrderAuditEntityMapper;
	
	@Resource
	private FmTradeTransportSchemeEntityMapper fmTradeTransportSchemeEntityMapper;
	
	@Resource
	private FmTradeOrderInfoBoxFreightEntityMapper fmTradeOrderInfoBoxFreightEntityMapper;
	
	@Resource 
	private FmTradeFeeEntityMapper fmTradeFeeEntityMapper;
	
	@Resource
	private FmTradeOrderInfoFastFreightEntityMapper fmTradeOrderInfoFastFreightEntityMapper;
	
	@Resource
	private FmTradeGoodsEntityMapper fmTradeGoodsEntityMapper;
	
	@Resource
	private FmTradeOrderTypeEntityMapper fmTradeOrderTypeEntityMapper;
	
	@Resource
	private FmTradeOrderInfoWholeVegicleFreightEntityMapper fmTradeOrderInfoWholeVegicleFreightEntityMapper;
	
	@Resource
	private FmTradeOrderInfoBaseEntityMapper fmTradeOrderInfoBaseEntityMapper;
	
	/** IFmTradeOrderAudit接口的modifyAuditInfo方法实现*/
	@Override 
	public int modifyAuditInfo(FmAccountEntity user, FmTradeOrderInfoBaseEntity orderInfo, FmTradeOrderAuditEntity record) {
		
		int ret = -1;
		Date dAuditEndTime = new Date();
		
		/** 订单审核类型 */
		record.setiAuditType(tradeConstants.PEOPLE_AUDIT_TYPE_FLAG);
		
		/** 审核人id */
		record.setiAuditorId(user.getId());
		
		/** 审核订单id */
		record.setiOrderId(orderInfo.getId());
		
		/** 审核订单类型id */
		record.setiOrderTypeId(orderInfo.getiOrderTypeId());
		
		/* 审核结束时间为提交审核结果的时间 */
		record.setdAuditEndTime(dAuditEndTime);
		
		/* 设置审核结果的标志位 */
		record.setiAuditResult(record.getiAuditResult());
		
		ret = fmTradeOrderAuditEntityMapper.updateByPrimaryKey(record);
		
		return ret;
	}
	
	/** IFmTradeOrderAudit接口的modifyAuditInfo方法实现*/
	@Override
	public int modifyAuditInfo(FmAccountEntity user, FmTradeOrderInfoBaseEntity orderInfo, FmTradeOrderAuditEntity record,
			List<FmTradeTransportSchemeEntity> transportSchemeList) {
		
		int ret = -1;
		int retSaveAuditInfo = -1;
		int retSaveTransportScheme = -1;
		int auditId = 0;
		int orderId = 0;
		int transportType = -1;
		float fee = 0.0f;
		String goodsName = null;
		FmTradeFeeEntity feeRecord = new FmTradeFeeEntity();
		FmTradeOrderTypeEntity orderTypeRecord = new FmTradeOrderTypeEntity();
		
		
		
		/** 插入审核结果*/
		retSaveAuditInfo = modifyAuditInfo(user, orderInfo, record);
		
		if (retSaveAuditInfo == 1) {
			
			/** 设置承运方案中订单id及运费*/
			for (int i = 0; i < transportSchemeList.size(); i++) {
				
				/** 设置订单id */
				orderId = orderInfo.getId();
				transportSchemeList.get(i).setiOrderId(orderId);
				
				/** 获取运输类型的一级类别*/
				orderTypeRecord = fmTradeOrderTypeEntityMapper.selectByPrimaryKey(orderInfo.getiOrderTypeId());
				
				
                /** 查询货物的运价号
                 * 输入参数 订单id 和订单类型 查询货物名称*/
				if (orderInfo.getiOrderTypeId() == tradeConstants.BOX_FREIGHT_FLAG) {
					
					transportType = orderInfo.getiOrderTypeId();
                    /** 获取集装箱个数*/
					FmTradeOrderInfoBoxFreightEntity boxRecord = new FmTradeOrderInfoBoxFreightEntity();
					boxRecord = fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId);
					int boxNumber = boxRecord.getiBoxNumber();
					String boxType = boxRecord.getiBoxType().toString();	
					System.out.println("transportType "+transportType);
					/** 获取货物的基价率*/
					feeRecord = fmTradeFeeEntityMapper.selectByFeeAndOrderType(tradeConstants.FEE_FLAG, transportType, boxType);
					
					System.out.println("feeRecord "+feeRecord.getfBasePriceOne());
					/** 计算运费*/
					fee = boxNumber * (feeRecord.getfBasePriceOne() + feeRecord.getfBasePriceTwo() * 1);
					System.out.println("fee "+fee);
					transportSchemeList.get(i).setfTradeOrderTransportSchemeFee(fee);
				}
				else if (orderInfo.getiOrderTypeId() >= tradeConstants.FAST_FREIGHT_FLAG_START && 
						orderInfo.getiOrderTypeId() <= tradeConstants.FAST_FREIGHT_FLAG_END) {
					
					transportType = orderTypeRecord.getiTypeLabel();
					/** 获取货物名称 */
					FmTradeOrderInfoFastFreightEntity fastFreightRecord = new FmTradeOrderInfoFastFreightEntity();
					fastFreightRecord = fmTradeOrderInfoFastFreightEntityMapper.selectByOrderId(orderId);
					goodsName = fastFreightRecord.getcGoodsName();
					
					/** 获取该货物快运的运价号 */
					FmTradeGoodsEntity goodsRecord = fmTradeGoodsEntityMapper.selectByGoodsName(goodsName);
					String cPriceNo = goodsRecord.getcGoodsFastFreightRate();
					
					/** 获取货物的基价率*/
					feeRecord = fmTradeFeeEntityMapper.selectByFeeAndOrderType(tradeConstants.FEE_FLAG, transportType, cPriceNo);
					
					/** 计算运费*/
					fee = fastFreightRecord.getfGoodsWeight() * (feeRecord.getfBasePriceOne() + feeRecord.getfBasePriceTwo() * 1);
					transportSchemeList.get(i).setfTradeOrderTransportSchemeFee(fee);
				}
				else if (orderInfo.getiOrderTypeId() >= tradeConstants.WHOLE_VEGICLE_FLAG_START && 
						orderInfo.getiOrderTypeId() <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
					
					transportType = orderTypeRecord.getiTypeLabel();
					/** 获取货物名称 */
					FmTradeOrderInfoWholeVegicleFreightEntity wholeVegicleFreightRecord = new FmTradeOrderInfoWholeVegicleFreightEntity();
					wholeVegicleFreightRecord = fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByOrderId(orderId);
					goodsName = wholeVegicleFreightRecord.getcGoodsName();
					
					/** 获取该货物快运的运价号 */
					FmTradeGoodsEntity goodsRecord = fmTradeGoodsEntityMapper.selectByGoodsName(goodsName);
					String cPriceNo = goodsRecord.getcGoodsWholeVegicleRate();
					
					/** 获取货物的基价率*/
					feeRecord = fmTradeFeeEntityMapper.selectByFeeAndOrderType(tradeConstants.FEE_FLAG, transportType, cPriceNo);
					
					/** 计算运费*/
					fee = wholeVegicleFreightRecord.getfGoodsWight() * (feeRecord.getfBasePriceOne() + feeRecord.getfBasePriceTwo() * 1);
					
					/** 将运费插入到承运方案中*/
					transportSchemeList.get(i).setfTradeOrderTransportSchemeFee(fee);
				}
				else {
					ret = 0;
					return ret;
				}
				
			}
			
			/** 插入该订单的承运方案*/
			retSaveTransportScheme =saveTransportScheme(transportSchemeList);
			
			if (retSaveTransportScheme == 1) {
				
				ret = 1;
			}
			else {
				/** 审核结果插入成功， 但承运方案插入失败；则删除已插入的审核结果*/
				FmTradeOrderAuditEntity auditRecord = fmTradeOrderAuditEntityMapper.selectByOrderId(orderInfo.getId());
				auditId = auditRecord.getId();
				
				fmTradeOrderAuditEntityMapper.deleteByPrimaryKey(auditId);
				ret = 0;
			}
		}
		return ret;
	}
	
	/** IFmTradeOrderAudit接口的findAuditResult方法实现*/
	@Override
	public List<orderDto> findAuditResult(Map<String, Object> requirement, PageModel pageModel) {
		
		Map<String, Object> params = new HashMap<String, Object>();
		List<orderDto> orderList = new ArrayList<orderDto>();
		orderDto orderTemp = new orderDto();
		int orderId = 0;
		

		/** 设置查找条件 */
		int recordCount = (int)countAuditInfoNumber(requirement);
		pageModel.setRecordCount(recordCount);
		params.put("pageModel", pageModel);
		
		if ( requirement.get("iOrderTypeId") != null) {
			
			params.put("iOrderTypeId",requirement.get("iOrderTypeId"));
		}
		
		params.put("iAuditResult", tradeConstants.AUDIT_NOT_PASS_FLAG);
		params.put("iAuditType", tradeConstants.SYS_AUDIT_TYPE_FLAG);
		
		/** 获取满足条件的审核列表 */
		List<FmTradeOrderAuditEntity> notPassOrders = fmTradeOrderAuditEntityMapper.selectByPage(params);
		
		for ( int i = 0; i < notPassOrders.size(); i++) {
			
			/** 获取订单id */
			orderId = notPassOrders.get(i).getiOrderId();
			
			/** 设置基本订单信息 */
			orderTemp.setFmTradeOrderInfoBaseEntity(
					fmTradeOrderInfoBaseEntityMapper.selectByPrimaryKey(orderId));
			
			/** 设置订单详情信息 */
			if (notPassOrders.get(i).getiOrderTypeId() == tradeConstants.BOX_FREIGHT_FLAG ) {
				
				orderTemp.setFmTradeOrderInfoBoxFreightRecord(
						fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId));
				orderList.add(orderTemp);	
			}
			else if (notPassOrders.get(i).getiOrderTypeId() >= tradeConstants.FAST_FREIGHT_FLAG_START &&
					notPassOrders.get(i).getiOrderTypeId() >= tradeConstants.FAST_FREIGHT_FLAG_END) {
				
				orderTemp.setFmTradeOrderInfoFastFreightRecord(
						fmTradeOrderInfoFastFreightEntityMapper.selectByOrderId(orderId));
				orderList.add(orderTemp);
			}
			else if (notPassOrders.get(i).getiOrderTypeId() >= tradeConstants.WHOLE_VEGICLE_FLAG_START &&
					notPassOrders.get(i).getiOrderTypeId() >= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
				
				orderTemp.setFmTradeOrderInfoWholeVegicleFreightRecord(
						fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByOrderId(orderId));
				orderList.add(orderTemp);
			}
			else {
				orderList = null;
				return orderList;
			}
		}
		
		return orderList;
	}

	/** IFmTradeOrderAudit接口的deleteAuditInfo方法实现*/
	@Override
	public int deleteAuditInfo(Integer id) {
		int ret = -1;
		
		ret = fmTradeOrderAuditEntityMapper.deleteByPrimaryKey(id);
		return ret;
	}
	
	/** IFmTradeOrderAudit接口的saveTransportScheme方法实现*/
	@Override
	public int saveTransportScheme(List<FmTradeTransportSchemeEntity> record) {
		
		int ret = -1;
		int count = 0;
		
		for (int i = 0; i < record.size(); i++) {

			int retTemp = fmTradeTransportSchemeEntityMapper.insertSelective(record.get(i));
			if ( retTemp == 1) {
				count++;
			}
		}
		
      /** 判断所有的承运方案是否均插入成功*/
		if ( count == record.size()) {
			
			ret = 1;
		}
		else {
			
			ret = 0;
		}
		
		return ret;
	}

	@Override
	public long countAuditInfoNumber(Map<String, Object> requirement) {
		// TODO Auto-generated method stub
		long orderNumber = -1;
		FmTradeOrderAuditEntityExample example = new FmTradeOrderAuditEntityExample();
	    FmTradeOrderAuditEntityExample.Criteria criteria = example.createCriteria();
	    
	    criteria.andIAuditTypeEqualTo(tradeConstants.SYS_AUDIT_TYPE_FLAG);
	    criteria.andIAuditResultEqualTo(tradeConstants.AUDIT_NOT_PASS_FLAG);
	    
	    if(requirement.get("iOrderTypeId") != null) {
			criteria.andIOrderTypeIdEqualTo((Integer) requirement.get("iOrderTypeId"));
	    }
	    orderNumber = fmTradeOrderAuditEntityMapper.countByExample(example);
	    
		return orderNumber;
	}
}
