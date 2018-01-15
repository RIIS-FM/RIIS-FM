package com.crscd.riis.freightmarket.authority.service.impl;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.authority.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntityExample;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.service.IFmTradeOrderInfoBaseService;

@Service("tradeOrderInfoBaseService")
public class FmTradeOrderInfoBaseServiceImpl implements IFmTradeOrderInfoBaseService{
	/* *
     * 自动注入FmTradeOrderInfoBaseEntityMapper
     * */
	@Resource
	private FmTradeOrderInfoBaseEntityMapper fmTradeOrderInfoBaseEntityMapper;
	
    /* *
     * 	IFmTradeOrderInfoBaseService接口的saveOrderInfo方法实现
     * */
	
    @Override
	public long countOrderNumber(FmTradeOrderInfoBaseEntity record) {
    	long orderNumber = 0;
    	FmTradeOrderInfoBaseEntityExample example = new FmTradeOrderInfoBaseEntityExample();
    	Criteria criteria = example.createCriteria();
    	boolean retCriteria = criteria.equals(record);
		if (retCriteria == true) {
    		orderNumber = fmTradeOrderInfoBaseEntityMapper.countByExample(example);
    	}
		 return orderNumber;
	 }
	
	
	@Override
	public int saveOrderInfo(FmTradeOrderInfoBaseEntity record) {
    	
	    /* *
	     * 对订单进行编码
	     * 	*/
		record.setcOrderCode(editOrderCode());
		
	   /* *
	    * 设置创建日期
	    * */
		Date date = new Date();
		record.setdOrderCreateTime(date);
				
		return fmTradeOrderInfoBaseEntityMapper.insertSelective(record);
	}
	
	@Override
	public String editOrderCode() {
		String orderCode = new String();
		Date day=new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		orderCode = "BF"+df.format(day);
		
		return orderCode;
	
	}
	
	@Override
	public int getOrderIdByOrderCode(String orderCode) {
		FmTradeOrderInfoBaseEntity record = fmTradeOrderInfoBaseEntityMapper.selectByOrderCode(orderCode);
		int orderId = record.getId();
		return orderId;
	}
	
	@Override
	 public int modifyOrderInfo(FmTradeOrderInfoBaseEntity record) {
		Date time=new Date();
		record.setdOrderAlterTime(time);
        /* *
         * 设置订单删除时间
         * */
		int deleteOrder = record.getiOrderDelete();
		if ( deleteOrder == 0) {
			record.setdOrderDeleteTime(time);
		}
		int ret = fmTradeOrderInfoBaseEntityMapper.updateByPrimaryKey(record);
		return ret;
	}
	
	@Override
	public FmTradeOrderInfoBaseEntity selectByPrimaryKey(Integer id) {
		
		return fmTradeOrderInfoBaseEntityMapper.selectByPrimaryKey(id);
	}


}
