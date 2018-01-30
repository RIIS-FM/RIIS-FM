package com.crscd.riis.freightmarket.trade.dto;

import java.util.Map;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;

public class findWaybillDtoIn {
	private Map<String, Object> orderRequirement;
	private Map<String, Object> waybillRequirement;
	private FmAccountEntity user;
	private PageModel pageModel;
	
	public Map<String, Object> getOrderRequirement() {
		return orderRequirement;
	}
	public void setOrderRequirement(Map<String, Object> orderRequirement) {
		this.orderRequirement = orderRequirement;
	}
	public Map<String, Object> getWaybillRequirement() {
		return waybillRequirement;
	}
	public void setWaybillRequirement(Map<String, Object> waybillRequirement) {
		this.waybillRequirement = waybillRequirement;
	}
	public FmAccountEntity getUser() {
		return user;
	}
	public void setUser(FmAccountEntity user) {
		this.user = user;
	}
	public PageModel getPageModel() {
		return pageModel;
	}
	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}

}
