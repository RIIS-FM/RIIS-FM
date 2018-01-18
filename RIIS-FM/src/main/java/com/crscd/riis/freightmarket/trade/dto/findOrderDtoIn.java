package com.crscd.riis.freightmarket.trade.dto;

import java.util.Map;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.page.PageModel;

public class findOrderDtoIn {
	private Map<String, Object> requirement;
	private FmAccountEntity user;
	private PageModel pageModel;
	
	public Map<String, Object> getRequirement() {
		return requirement;
	}
	public void setRequirement(Map<String, Object> requirement) {
		this.requirement = requirement;
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
	
	
	/*public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public PageModel getPageModel() {
		return pageModel;
	}
	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}*/
	

}
