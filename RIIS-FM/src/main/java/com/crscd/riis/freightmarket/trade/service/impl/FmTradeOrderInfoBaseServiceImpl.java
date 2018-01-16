package com.crscd.riis.freightmarket.trade.service.impl;



import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderInfoBaseService;




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
    	long orderNumber = -1;
    	FmTradeOrderInfoBaseEntityExample example = new FmTradeOrderInfoBaseEntityExample();
    	Criteria criteria = example.createCriteria();
    	if( record.getiUserType() != null) {
    		criteria.andIUserTypeEqualTo(record.getiUserType());
    	}
    	if ( record.getiSenderId() != null) {
    		criteria.andISenderIdEqualTo(record.getiSenderId());
    	}
    	if ( record.getiSenderId() != null) {
    		criteria.andISenderIdEqualTo(record.getiSenderId());
    	}
    	if( record.getiRecverId() != null) {
    		criteria.andIRecverIdEqualTo(record.getiRecverId());
    	}
    	if( record.getcSenderName() != null) {
    		criteria.andCSenderNameEqualTo(record.getcSenderName());
    	}
    	if ( record.getcSenderAddress() != null) {
    		criteria.andCSenderAddressEqualTo(record.getcSenderAddress());
    	}
    	if ( record.getcSenderPhone() != null) {
    		criteria.andCSenderPhoneEqualTo(record.getcSenderPhone());
    	}
    	if( record.getcSenderEmail() != null) {
    		criteria.andCSenderEmailEqualTo(record.getcSenderEmail());
    	}
    	if( record.getcSenderPostcode() != null ) {
    		criteria.andCSenderPostcodeEqualTo(record.getcSenderPostcode());
    	}
    	if( record.getcSenderNote() != null) {
    		criteria.andCSenderNoteEqualTo(record.getcSenderNote());
    	}
    	if( record.getcSenderCity() != null) {
    		criteria.andCSenderCityEqualTo(record.getcSenderCity());
    	}
    	if( record.getcLoadStation() != null) {
    		criteria.andCLoadStationEqualTo(record.getcLoadStation());
    	}
    	if( record.getcLoadLocation() != null) {
    		criteria.andCLoadLocationEqualTo(record.getcLoadLocation());
    	}
    	if( record.getcRecverAddress() != null) {
    		criteria.andCRecverAddressEqualTo(record.getcRecverAddress());
    	}
    	if( record.getcRecverPhone() != null) {
    		criteria.andCRecverPhoneEqualTo(record.getcRecverPhone());
    	}
    	if( record.getcRecverEmail() != null) {
    		criteria.andCRecverEmailEqualTo(record.getcRecverEmail());
    	}
    	if(record.getcRecverPostcode() != null) {
    		criteria.andCRecverPostcodeEqualTo(record.getcRecverPostcode());
    	}
    	if( record.getcRecverCity() != null) {
    		criteria.andCRecverCityEqualTo(record.getcRecverCity());
    	}
    	if( record.getcUnloadStation() != null) {
    		criteria.andCUnloadStationEqualTo(record.getcUnloadStation());
    	}
    	if( record.getcUnloadLocation() != null) {
    		criteria.andCUnloadLocationEqualTo(record.getcUnloadLocation());
    	}
    	if( record.getcOrderType() != null) {
    		criteria.andCOrderTypeEqualTo(record.getcOrderType());
    	}
    	if( record.getiOrderTypeId() != null) {
    		criteria.andIOrderTypeIdEqualTo(record.getiOrderTypeId());
    	}
    	if( record.getiOrderSplite() != null) {
    		criteria.andIOrderSpliteEqualTo(record.getiOrderSplite());
    	}
    	if( record.getiOrderState() != null) {
    		criteria.andIOrderStateEqualTo(record.getiOrderState());
    	}
    	if(record.getdOrderDateline() != null) {
    		criteria.andDOrderDatelineEqualTo(record.getdOrderDateline());
    	}
    	if( record.getfInsuranceValue() != null) {
    		criteria.andFInsuranceValueEqualTo(record.getfInsuranceValue());
    	}
    	if( record.getfProtectPrice() != null) {
    		criteria.andFProtectPriceEqualTo(record.getfProtectPrice());
    	}
    	
        orderNumber = fmTradeOrderInfoBaseEntityMapper.countByExample(example);
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
		
		/* *
         * 设置订单取消时间
         * */
		int temminateOrder = record.getiOrderTemminate();
		if ( temminateOrder == 0){
			record.setdOrderTemminateTime(time);
		}
		record.setdOrderAlterTime(time);
		int ret = fmTradeOrderInfoBaseEntityMapper.updateByPrimaryKey(record);
		return ret;
	}
	
	@Override
	public FmTradeOrderInfoBaseEntity selectByPrimaryKey(Integer id) {
		
		return fmTradeOrderInfoBaseEntityMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		
		return fmTradeOrderInfoBaseEntityMapper.deleteByPrimaryKey(id);
		
	}


}
