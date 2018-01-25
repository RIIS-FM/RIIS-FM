package com.crscd.riis.freightmarket.trade.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderAuditEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBoxFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeTransportSchemeEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderAudit;
import com.crscd.riis.freightmarket.trade.util.tradeConstants.tradeConstants;


@Service("fmTradeOrderAuditService")
public class FmTradeOrderAuditImpl implements IFmTradeOrderAudit {
	
	@Resource
	private FmTradeOrderAuditEntityMapper fmTradeOrderAuditEntityMapper;
	
	@Resource
	private FmTradeTransportSchemeEntityMapper fmTradeTransportSchemeEntityMapper;
	
	@Resource
	private FmTradeOrderInfoBoxFreightEntityMapper fmTradeOrderInfoBoxFreightEntityMapper;
	
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
		String goodsName = null;
		
		
		/** 插入审核结果*/
		retSaveAuditInfo = modifyAuditInfo(user, orderInfo, record);
		
		if (retSaveAuditInfo == 1) {
			
			/** 设置承运方案中订单id及运费*/
			for (int i = 0; i < transportSchemeList.size(); i++) {
				orderId = orderInfo.getId();
				transportSchemeList.get(i).setiOrderId(orderId);
				
                /** 查询货物的运价号
                 * 输入参数 订单id 和订单类型 查询货物名称*/
				if (orderInfo.getiOrderTypeId() == tradeConstants.BOX_FREIGHT_FLAG) {
					
                    /** 获取集装箱个数*/
					FmTradeOrderInfoBoxFreightEntity boxRecord = new FmTradeOrderInfoBoxFreightEntity();
					boxRecord = fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId);
					int boxNumber = boxRecord.getiBoxNumber();
					int boxType = boxRecord.getiBoxType();
					
					/** 获取货物的运价号*/
					
				}
				else if (orderInfo.getiOrderTypeId() >= tradeConstants.FAST_FREIGHT_FLAG_START && 
						orderInfo.getiOrderTypeId() <= tradeConstants.FAST_FREIGHT_FLAG_END) {
					
				}
				else if (orderInfo.getiOrderTypeId() >= tradeConstants.WHOLE_VEGICLE_FLAG_START && 
						orderInfo.getiOrderTypeId() <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
					
				}
				else {
					
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
	public List<FmTradeOrderAuditEntity> findAuditResult() {
		
		List<FmTradeOrderAuditEntity> notPassOrders = 
				fmTradeOrderAuditEntityMapper.selectByAuditResultAndAuditType(tradeConstants.AUDIT_NOT_PASS_FLAG, 
						tradeConstants.SYS_AUDIT_TYPE_FLAG);
		return notPassOrders;
	}

	@Override
	public int deleteAuditInfo(Integer id) {
		int ret = -1;
		
		ret = fmTradeOrderAuditEntityMapper.deleteByPrimaryKey(id);
		return ret;
	}
	
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





	
	

	
	

}
