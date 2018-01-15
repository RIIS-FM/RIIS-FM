package com.crscd.riis.freightmarket.authority.entity;

import java.util.Date;

public class FmTradeOrderInfoBaseEntity {
    private Integer id;

    private String cOrderCode;

    private Integer iOrderTypeId;

    private Date dOrderDateline;

    private Integer iUserType;

    private Integer iSenderId;

    private Integer iRecverId;

    private Integer iSenderOperatorId;

    private Integer iRecverOperatorId;

    private String cSenderName;

    private String cSenderAddress;

    private String cSenderPhone;

    private String cSenderEmail;

    private String cSenderPostcode;

    private String cSenderNote;

    private String cSenderCity;

    private String cLoadStation;

    private String cLoadLocation;

    private Date dPredictSendTime;

    private Date dPredictLoadStartTime;

    private Date dPredictLoadEndTime;

    private String cRecverAddress;

    private String cRecverPhone;

    private String cRecverEmail;

    private String cRecverPostcode;

    private String cRecverCity;

    private String cUnloadStation;

    private String cUnloadLocation;

    private String cOrderType;

    private Integer iOrderState;

    private Integer iOrderSplite;

    private Date dOrderCreateTime;

    private Date dOrderEndTime;

    private Date dOrderTemminateTime;

    private Integer iOrderTemminate;

    private Integer iOrderDelete;

    private Date dOrderDeleteTime;

    private Date dOrderAlterTime;

    private String cAccessCode;

    private Integer iLogisticsType;

    private Float fProtectPrice;

    private Float fInsuranceValue;
    

    private FmTradeOrderInfoBoxFreightEntity fmTradeOrderInfoBoxFreightRecord;
    private FmTradeOrderInfoFastFreightEntity fmTradeOrderInfoFastFreightRecord;
    private FmTradeOrderInfoWholeVegicleFreightEntity fmTradeOrderInfoWholeVegicleFreightRecord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcOrderCode() {
        return cOrderCode;
    }

    public void setcOrderCode(String cOrderCode) {
        this.cOrderCode = cOrderCode == null ? null : cOrderCode.trim();
    }

    public Integer getiOrderTypeId() {
        return iOrderTypeId;
    }

    public void setiOrderTypeId(Integer iOrderTypeId) {
        this.iOrderTypeId = iOrderTypeId;
    }

    public Date getdOrderDateline() {
        return dOrderDateline;
    }

    public void setdOrderDateline(Date dOrderDateline) {
        this.dOrderDateline = dOrderDateline;
    }

    public Integer getiUserType() {
        return iUserType;
    }

    public void setiUserType(Integer iUserType) {
        this.iUserType = iUserType;
    }

    public Integer getiSenderId() {
        return iSenderId;
    }

    public void setiSenderId(Integer iSenderId) {
        this.iSenderId = iSenderId;
    }

    public Integer getiRecverId() {
        return iRecverId;
    }

    public void setiRecverId(Integer iRecverId) {
        this.iRecverId = iRecverId;
    }

    public Integer getiSenderOperatorId() {
        return iSenderOperatorId;
    }

    public void setiSenderOperatorId(Integer iSenderOperatorId) {
        this.iSenderOperatorId = iSenderOperatorId;
    }

    public Integer getiRecverOperatorId() {
        return iRecverOperatorId;
    }

    public void setiRecverOperatorId(Integer iRecverOperatorId) {
        this.iRecverOperatorId = iRecverOperatorId;
    }

    public String getcSenderName() {
        return cSenderName;
    }

    public void setcSenderName(String cSenderName) {
        this.cSenderName = cSenderName == null ? null : cSenderName.trim();
    }

    public String getcSenderAddress() {
        return cSenderAddress;
    }

    public void setcSenderAddress(String cSenderAddress) {
        this.cSenderAddress = cSenderAddress == null ? null : cSenderAddress.trim();
    }

    public String getcSenderPhone() {
        return cSenderPhone;
    }

    public void setcSenderPhone(String cSenderPhone) {
        this.cSenderPhone = cSenderPhone == null ? null : cSenderPhone.trim();
    }

    public String getcSenderEmail() {
        return cSenderEmail;
    }

    public void setcSenderEmail(String cSenderEmail) {
        this.cSenderEmail = cSenderEmail == null ? null : cSenderEmail.trim();
    }

    public String getcSenderPostcode() {
        return cSenderPostcode;
    }

    public void setcSenderPostcode(String cSenderPostcode) {
        this.cSenderPostcode = cSenderPostcode == null ? null : cSenderPostcode.trim();
    }

    public String getcSenderNote() {
        return cSenderNote;
    }

    public void setcSenderNote(String cSenderNote) {
        this.cSenderNote = cSenderNote == null ? null : cSenderNote.trim();
    }

    public String getcSenderCity() {
        return cSenderCity;
    }

    public void setcSenderCity(String cSenderCity) {
        this.cSenderCity = cSenderCity == null ? null : cSenderCity.trim();
    }

    public String getcLoadStation() {
        return cLoadStation;
    }

    public void setcLoadStation(String cLoadStation) {
        this.cLoadStation = cLoadStation == null ? null : cLoadStation.trim();
    }

    public String getcLoadLocation() {
        return cLoadLocation;
    }

    public void setcLoadLocation(String cLoadLocation) {
        this.cLoadLocation = cLoadLocation == null ? null : cLoadLocation.trim();
    }

    public Date getdPredictSendTime() {
        return dPredictSendTime;
    }

    public void setdPredictSendTime(Date dPredictSendTime) {
        this.dPredictSendTime = dPredictSendTime;
    }

    public Date getdPredictLoadStartTime() {
        return dPredictLoadStartTime;
    }

    public void setdPredictLoadStartTime(Date dPredictLoadStartTime) {
        this.dPredictLoadStartTime = dPredictLoadStartTime;
    }

    public Date getdPredictLoadEndTime() {
        return dPredictLoadEndTime;
    }

    public void setdPredictLoadEndTime(Date dPredictLoadEndTime) {
        this.dPredictLoadEndTime = dPredictLoadEndTime;
    }

    public String getcRecverAddress() {
        return cRecverAddress;
    }

    public void setcRecverAddress(String cRecverAddress) {
        this.cRecverAddress = cRecverAddress == null ? null : cRecverAddress.trim();
    }

    public String getcRecverPhone() {
        return cRecverPhone;
    }

    public void setcRecverPhone(String cRecverPhone) {
        this.cRecverPhone = cRecverPhone == null ? null : cRecverPhone.trim();
    }

    public String getcRecverEmail() {
        return cRecverEmail;
    }

    public void setcRecverEmail(String cRecverEmail) {
        this.cRecverEmail = cRecverEmail == null ? null : cRecverEmail.trim();
    }

    public String getcRecverPostcode() {
        return cRecverPostcode;
    }

    public void setcRecverPostcode(String cRecverPostcode) {
        this.cRecverPostcode = cRecverPostcode == null ? null : cRecverPostcode.trim();
    }

    public String getcRecverCity() {
        return cRecverCity;
    }

    public void setcRecverCity(String cRecverCity) {
        this.cRecverCity = cRecverCity == null ? null : cRecverCity.trim();
    }

    public String getcUnloadStation() {
        return cUnloadStation;
    }

    public void setcUnloadStation(String cUnloadStation) {
        this.cUnloadStation = cUnloadStation == null ? null : cUnloadStation.trim();
    }

    public String getcUnloadLocation() {
        return cUnloadLocation;
    }

    public void setcUnloadLocation(String cUnloadLocation) {
        this.cUnloadLocation = cUnloadLocation == null ? null : cUnloadLocation.trim();
    }

    public String getcOrderType() {
        return cOrderType;
    }

    public void setcOrderType(String cOrderType) {
        this.cOrderType = cOrderType == null ? null : cOrderType.trim();
    }

    public Integer getiOrderState() {
        return iOrderState;
    }

    public void setiOrderState(Integer iOrderState) {
        this.iOrderState = iOrderState;
    }

    public Integer getiOrderSplite() {
        return iOrderSplite;
    }

    public void setiOrderSplite(Integer iOrderSplite) {
        this.iOrderSplite = iOrderSplite;
    }

    public Date getdOrderCreateTime() {
        return dOrderCreateTime;
    }

    public void setdOrderCreateTime(Date dOrderCreateTime) {
        this.dOrderCreateTime = dOrderCreateTime;
    }

    public Date getdOrderEndTime() {
        return dOrderEndTime;
    }

    public void setdOrderEndTime(Date dOrderEndTime) {
        this.dOrderEndTime = dOrderEndTime;
    }

    public Date getdOrderTemminateTime() {
        return dOrderTemminateTime;
    }

    public void setdOrderTemminateTime(Date dOrderTemminateTime) {
        this.dOrderTemminateTime = dOrderTemminateTime;
    }

    public Integer getiOrderTemminate() {
        return iOrderTemminate;
    }

    public void setiOrderTemminate(Integer iOrderTemminate) {
        this.iOrderTemminate = iOrderTemminate;
    }

    public Integer getiOrderDelete() {
        return iOrderDelete;
    }

    public void setiOrderDelete(Integer iOrderDelete) {
        this.iOrderDelete = iOrderDelete;
    }

    public Date getdOrderDeleteTime() {
        return dOrderDeleteTime;
    }

    public void setdOrderDeleteTime(Date dOrderDeleteTime) {
        this.dOrderDeleteTime = dOrderDeleteTime;
    }

    public Date getdOrderAlterTime() {
        return dOrderAlterTime;
    }

    public void setdOrderAlterTime(Date dOrderAlterTime) {
        this.dOrderAlterTime = dOrderAlterTime;
    }

    public String getcAccessCode() {
        return cAccessCode;
    }

    public void setcAccessCode(String cAccessCode) {
        this.cAccessCode = cAccessCode == null ? null : cAccessCode.trim();
    }

    public Integer getiLogisticsType() {
        return iLogisticsType;
    }

    public void setiLogisticsType(Integer iLogisticsType) {
        this.iLogisticsType = iLogisticsType;
    }

    public Float getfProtectPrice() {
        return fProtectPrice;
    }

    public void setfProtectPrice(Float fProtectPrice) {
        this.fProtectPrice = fProtectPrice;
    }

    public Float getfInsuranceValue() {
        return fInsuranceValue;
    }

    public void setfInsuranceValue(Float fInsuranceValue) {
        this.fInsuranceValue = fInsuranceValue;
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
    
    
}