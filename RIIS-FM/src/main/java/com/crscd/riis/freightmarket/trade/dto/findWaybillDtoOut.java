package com.crscd.riis.freightmarket.trade.dto;

import java.util.List;

import com.crscd.riis.freightmarket.trade.util.page.PageModel;

public class findWaybillDtoOut {
	private List<waybillInfoDto> waybillInfoList;
	private PageModel pageModel;
	
	
	public PageModel getPageModel() {
		return pageModel;
	}
	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}
	public List<waybillInfoDto> getWaybillInfoList() {
		return waybillInfoList;
	}
	public void setWaybillInfoList(List<waybillInfoDto> waybillInfoList) {
		this.waybillInfoList = waybillInfoList;
	}

}
