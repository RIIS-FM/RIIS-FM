package com.crscd.riis.freightmarket.trade.dto;

import java.util.List;

import com.crscd.riis.freightmarket.trade.entity.FmTradeContactEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntity;

public class optionalOrderInfoDto {
	
	private List<FmTradeGoodsEntity> goodsList;
	private List<FmTradeContactEntity> contactList;
	private List<FmTradeContactEntity> recContactList;
	private List<FmTradeContactEntity> senContactList;
	private List<FmTradeContactEntity> operContactList;
	public List<FmTradeGoodsEntity> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<FmTradeGoodsEntity> goodsList) {
		this.goodsList = goodsList;
	}
	public List<FmTradeContactEntity> getContactList() {
		return contactList;
	}
	public void setContactList(List<FmTradeContactEntity> contactList) {
		this.contactList = contactList;
	}
	public List<FmTradeContactEntity> getRecContactList() {
		return recContactList;
	}
	public void setRecContactList(List<FmTradeContactEntity> recContactList) {
		this.recContactList = recContactList;
	}
	public List<FmTradeContactEntity> getSenContactList() {
		return senContactList;
	}
	public void setSenContactList(List<FmTradeContactEntity> senContactList) {
		this.senContactList = senContactList;
	}
	public List<FmTradeContactEntity> getOperContactList() {
		return operContactList;
	}
	public void setOperContactList(List<FmTradeContactEntity> operContactList) {
		this.operContactList = operContactList;
	}

}
