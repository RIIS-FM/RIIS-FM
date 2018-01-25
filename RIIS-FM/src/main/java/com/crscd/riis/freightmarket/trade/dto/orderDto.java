package com.crscd.riis.freightmarket.trade.dto;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;

public class orderDto {
	
	private FmTradeOrderInfoBaseEntity fmTradeOrderInfoBaseEntity;
	
    private FmTradeOrderInfoBoxFreightEntity fmTradeOrderInfoBoxFreightRecord;
    
    private FmTradeOrderInfoFastFreightEntity fmTradeOrderInfoFastFreightRecord;
    
    private FmTradeOrderInfoWholeVegicleFreightEntity fmTradeOrderInfoWholeVegicleFreightRecord;
    
    private int flag;

	public FmTradeOrderInfoBaseEntity getFmTradeOrderInfoBaseEntity() {
		return fmTradeOrderInfoBaseEntity;
	}

	public void setFmTradeOrderInfoBaseEntity(FmTradeOrderInfoBaseEntity fmTradeOrderInfoBaseEntity) {
		this.fmTradeOrderInfoBaseEntity = fmTradeOrderInfoBaseEntity;
	}

	public FmTradeOrderInfoBoxFreightEntity getFmTradeOrderInfoBoxFreightRecord() {
		return fmTradeOrderInfoBoxFreightRecord;
	}

	public void setFmTradeOrderInfoBoxFreightRecord(FmTradeOrderInfoBoxFreightEntity fmTradeOrderInfoBoxFreightRecord) {
		this.fmTradeOrderInfoBoxFreightRecord = fmTradeOrderInfoBoxFreightRecord;
	}

	public FmTradeOrderInfoFastFreightEntity getFmTradeOrderInfoFastFreightRecord() {
		return fmTradeOrderInfoFastFreightRecord;
	}

	public void setFmTradeOrderInfoFastFreightRecord(FmTradeOrderInfoFastFreightEntity fmTradeOrderInfoFastFreightRecord) {
		this.fmTradeOrderInfoFastFreightRecord = fmTradeOrderInfoFastFreightRecord;
	}

	public FmTradeOrderInfoWholeVegicleFreightEntity getFmTradeOrderInfoWholeVegicleFreightRecord() {
		return fmTradeOrderInfoWholeVegicleFreightRecord;
	}

	public void setFmTradeOrderInfoWholeVegicleFreightRecord(
			FmTradeOrderInfoWholeVegicleFreightEntity fmTradeOrderInfoWholeVegicleFreightRecord) {
		this.fmTradeOrderInfoWholeVegicleFreightRecord = fmTradeOrderInfoWholeVegicleFreightRecord;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
}