package com.crscd.riis.freightmarket.trade.dto;

import java.util.List;

import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntity;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;

public class findWaybillDtoOut {
	private List<FmTradeWaybillEntity> waybillList;
	private PageModel pageModel;
	
	public List<FmTradeWaybillEntity> getWaybillList() {
		return waybillList;
	}
	public void setWaybillList(List<FmTradeWaybillEntity> waybillList) {
		this.waybillList = waybillList;
	}
	public PageModel getPageModel() {
		return pageModel;
	}
	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}

}
