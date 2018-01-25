package com.crscd.riis.freightmarket.trade.dto;

import java.util.List;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;

public class modifyOrderAuditInfoDtoIn {
	
	private FmAccountEntity user;
	
	private FmTradeOrderInfoBaseEntity orderInfo;
	
	private FmTradeOrderAuditEntity orderAuditInfo;
	
	private List<FmTradeTransportSchemeEntity> transportSchemeList;
	
	public FmAccountEntity getUser() {
		return user;
	}

	public void setUser(FmAccountEntity user) {
		this.user = user;
	}

	public FmTradeOrderInfoBaseEntity getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(FmTradeOrderInfoBaseEntity orderInfo) {
		this.orderInfo = orderInfo;
	}

	public FmTradeOrderAuditEntity getOrderAuditInfo() {
		return orderAuditInfo;
	}

	public void setOrderAuditInfo(FmTradeOrderAuditEntity orderAuditInfo) {
		this.orderAuditInfo = orderAuditInfo;
	}

	public List<FmTradeTransportSchemeEntity> getTransportSchemeList() {
		return transportSchemeList;
	}

	public void setTransportSchemeList(List<FmTradeTransportSchemeEntity> transportSchemeList) {
		this.transportSchemeList = transportSchemeList;
	}

	
}
