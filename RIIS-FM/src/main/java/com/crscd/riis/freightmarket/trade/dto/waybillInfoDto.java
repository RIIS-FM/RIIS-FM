package com.crscd.riis.freightmarket.trade.dto;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntity;

public class waybillInfoDto {
	private FmTradeOrderInfoBaseEntity fmTradeOrderInfoBaseEntity;
	private FmTradeTransportSchemeEntity fmTradeTransportSchemeEntity;
	private FmTradeWaybillEntity fmTradeWaybillEntity;
	
	public FmTradeOrderInfoBaseEntity getFmTradeOrderInfoBaseEntity() {
		return fmTradeOrderInfoBaseEntity;
	}
	public void setFmTradeOrderInfoBaseEntity(FmTradeOrderInfoBaseEntity fmTradeOrderInfoBaseEntity) {
		this.fmTradeOrderInfoBaseEntity = fmTradeOrderInfoBaseEntity;
	}
	public FmTradeTransportSchemeEntity getFmTradeTransportSchemeEntity() {
		return fmTradeTransportSchemeEntity;
	}
	public void setFmTradeTransportSchemeEntity(FmTradeTransportSchemeEntity fmTradeTransportSchemeEntity) {
		this.fmTradeTransportSchemeEntity = fmTradeTransportSchemeEntity;
	}
	public FmTradeWaybillEntity getFmTradeWaybillEntity() {
		return fmTradeWaybillEntity;
	}
	public void setFmTradeWaybillEntity(FmTradeWaybillEntity fmTradeWaybillEntity) {
		this.fmTradeWaybillEntity = fmTradeWaybillEntity;
	}
	
	
	

}
