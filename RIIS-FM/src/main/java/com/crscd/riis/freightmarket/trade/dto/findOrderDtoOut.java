package com.crscd.riis.freightmarket.trade.dto;

import java.util.List;

import com.crscd.riis.freightmarket.trade.util.page.PageModel;

public class findOrderDtoOut {
	
	private List<orderDto> orderList;
	private PageModel pageModel;
	public List<orderDto> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<orderDto> orderList) {
		this.orderList = orderList;
	}
	public PageModel getPageModel() {
		return pageModel;
	}
	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}

}
