package com.crscd.riis.freightmarket.trade.dto;

import java.util.List;


import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.page.PageModel;

public class findOrderDtoOut {
	
	private List<FmTradeOrderInfoBaseEntity> orderList;
	private PageModel pageModel;
	public List<FmTradeOrderInfoBaseEntity> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<FmTradeOrderInfoBaseEntity> orderList) {
		this.orderList = orderList;
	}
	public PageModel getPageModel() {
		return pageModel;
	}
	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}

}
