package com.crscd.riis.freightmarket.trade.service.impl;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBoxFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.page.PageModel;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderInfoBaseService;




@Service("tradeOrderInfoBaseService")
public class FmTradeOrderInfoBaseServiceImpl implements IFmTradeOrderInfoBaseService{
	/* *
     * 自动注入FmTradeOrderInfoBaseEntityMapper
     * */
	@Resource
	private FmTradeOrderInfoBaseEntityMapper fmTradeOrderInfoBaseEntityMapper;
	
	@Resource
	private FmTradeOrderInfoBoxFreightEntityMapper fmTradeOrderInfoBoxFreightEntityMapper;
	
    /**IFmTradeOrderInfoBaseService接口的countOrderNumber方法实现 */
	
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
	
    /**IFmTradeOrderInfoBaseService接口的countOrderNumber方法实现 */
    @Override
	public long countOrderNumber(Map<String, Object> requirement) {
    	long orderNumber = -1;
    	FmTradeOrderInfoBaseEntityExample example = new FmTradeOrderInfoBaseEntityExample();
    	Criteria criteria = example.createCriteria();
		if(requirement.get("iOrderTypeId") != null) {
			criteria.andIOrderTypeIdEqualTo((Integer) requirement.get("iOrderTypeId"));
		}
		if(requirement.get("cOrderCode") != null) {
			criteria.andCOrderCodeEqualTo((String) requirement.get("cOrderCode"));
		}
		if(requirement.get("dOrderDatelineStart") != null && requirement.get("dOrderDatelineEnd") != null) {
			criteria.andDOrderDatelineBetween((Date)requirement.get("dOrderDatelineStart"), 
					(Date)requirement.get("dOrderDatelineEnd"));
		}
		if(requirement.get("iRecverId") != null) {
			criteria.andIRecverIdEqualTo((Integer) requirement.get("iRecverId"));
		}
		if(requirement.get("iSenderId") != null) {
			criteria.andISenderIdEqualTo((Integer) requirement.get("iSenderId"));
		}
		if(requirement.get("iSenderOperatorId") != null) {
			criteria.andISenderOperatorIdEqualTo((Integer) requirement.get("iSenderOperatorId"));
		}
		if(requirement.get("iRecverOperatorId") != null) {
			criteria.andIRecverOperatorIdEqualTo((Integer) requirement.get("iRecverOperatorId"));
		}
		if(requirement.get("iOrderState") != null) {
			criteria.andIOrderStateEqualTo((Integer) requirement.get("iOrderState"));
		}
		if(requirement.get("iOrderSplite") != null) {
			
			criteria.andIOrderSpliteEqualTo((Integer) requirement.get("iOrderSplite"));
		}
		if(requirement.get("dOrderCreateTimeStart") != null && requirement.get("dOrderCreateTimeEnd") != null) {
			String dOrderCreateTimeStartStr = requirement.get("dOrderCreateTimeStart").toString();
			String dOrderCreateTimeEndStr = requirement.get("dOrderCreateTimeEnd").toString();
			Date dOrderCreateTimeStart = null;
			try {
				dOrderCreateTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dOrderCreateTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dOrderCreateTimeEnd = null;
			try {
				dOrderCreateTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dOrderCreateTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDOrderCreateTimeBetween(dOrderCreateTimeStart,dOrderCreateTimeEnd);
		}
		if(requirement.get("dOrderEndTimeEnd") != null && requirement.get("dOrderEndTimeStart") != null) {
			String dOrderEndTimeStartStr = requirement.get("dOrderEndTimeStart").toString();
			String dOrderEndTimeEndStr = requirement.get("dOrderEndTimeEnd").toString();
			Date dOrderEndTimeStart = null;
			try {
				dOrderEndTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dOrderEndTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dOrderEndTimeEnd = null;
			try {
				dOrderEndTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dOrderEndTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		criteria.andDOrderEndTimeBetween(dOrderEndTimeStart, dOrderEndTimeEnd);
		}
		if(requirement.get("dOrderTemminateTimeEnd") != null && requirement.get("dOrderTemminateTimeStart") != null) {
			String dOrderTemminateTimeStartStr = requirement.get("dOrderTemminateTimeStart").toString();
			String dOrderTemminateTimeEndStr = requirement.get("dOrderTemminateTimeEnd").toString();
			Date dOrderTemminateTimeStart = null;
			try {
				dOrderTemminateTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dOrderTemminateTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dOrderTemminateTimeEnd = null;
			try {
				dOrderTemminateTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dOrderTemminateTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDOrderTemminateTimeBetween(dOrderTemminateTimeStart, dOrderTemminateTimeEnd);
		}
		if(requirement.get("iOrderTemminate") != null) {
			criteria.andIOrderTemminateEqualTo((Integer) requirement.get("iOrderTemminate"));
		}
		if(requirement.get("iOrderDelete") != null) {
			criteria.andIOrderDeleteEqualTo((Integer) requirement.get("iOrderDelete"));
		}
		if(requirement.get("dOrderDeleteTimeStart") != null && requirement.get("dOrderDeleteTimeEnd") != null) {
			String dOrderDeleteTimeStartStr = requirement.get("dOrderDeleteTimeStart").toString();
			String dOrderDeleteTimeEndStr = requirement.get("dOrderDeleteTimeEnd").toString();
			Date dOrderDeleteTimeStart = null;
			try {
				dOrderDeleteTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dOrderDeleteTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dOrderDeleteTimeEnd = null;
			try {
				dOrderDeleteTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dOrderDeleteTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDOrderDeleteTimeBetween(dOrderDeleteTimeStart, dOrderDeleteTimeEnd);
		}
		if( requirement.get("dOrderAlterTimeStart") != null && requirement.get("dOrderAlterTimeEnd") != null) {
			String dOrderAlterTimeStartStr = requirement.get("dOrderAlterTimeStart").toString();
			String dOrderAlterTimeEndStr = requirement.get("dOrderAlterTimeEnd").toString();
			Date dOrderAlterTimeStart = null;
			try {
				dOrderAlterTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dOrderAlterTimeStartStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date dOrderAlterTimeEnd = null;
			try {
				dOrderAlterTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dOrderAlterTimeEndStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			criteria.andDOrderAlterTimeBetween(dOrderAlterTimeStart, dOrderAlterTimeEnd);
		}
		if(requirement.get("fProtectPriceStart") != null && requirement.get("fProtectPriceEnd") != null) {
			criteria.andFProtectPriceBetween((float)requirement.get("fProtectPriceStart"),
					(float)requirement.get("fProtectPriceEnd"));
		}
		if(requirement.get("fInsuranceValueStart") != null && requirement.get("fInsuranceValueEnd") != null) {
			criteria.andFInsuranceValueBetween((float)requirement.get("fInsuranceValueStart"),
					(float)requirement.get("fInsuranceValueEnd"));
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
	
	@Override
	public List<FmTradeOrderInfoBaseEntity> findOrder(FmAccountEntity user, Map<String, Object> requirement, PageModel pageModel){
	    
		/** 定义基础变量
	     * recordCount 满足条件的所有订单
	     * len 订单列表大小
	     * orderId 订单id
	     * orderType 订单类型
	     * */
		int recordCount = -1;
		int len = -1;
		int orderId = -1;
		int orderType = -1;
		
        /**查询该用户的所有订单  并设置recordCount*/
		requirement.put("iSenderId", user.getId());
		recordCount = (int)countOrderNumber(requirement);
		pageModel.setRecordCount(recordCount);
		
        /* * 定义Map	*/
		Map<String, Object> params = new HashMap<String, Object>();
		if ( user.getId() != null) {
			params.put("iSenderId", user.getId());
		}
		if(requirement.get("iOrderTypeId") != null) {
			params.put("iOrderTypeId", requirement.get("iOrderTypeId"));
		}
		if(requirement.get("cOrderCode") != null) {
			params.put("cOrderCode", requirement.get("cOrderCode"));
		}
		if(requirement.get("dOrderDatelineStart") != null) {
			params.put("dOrderDatelineStart", requirement.get("dOrderDatelineStart"));
		}
		if(requirement.get("dOrderDatelineEnd") != null) {
			params.put("dOrderDatelineEnd", requirement.get("dOrderDatelineEnd"));
		}
		if(requirement.get("iRecverId") != null) {
			params.put("iRecverId", requirement.get("iRecverId"));
		}
		if(requirement.get("iSenderId") != null) {
			params.put("iSenderId", requirement.get("iSenderId"));
		}
		if(requirement.get("iSenderOperatorId") != null) {
			params.put("iSenderOperatorId", requirement.get("iSenderOperatorId"));
		}
		if(requirement.get("iRecverOperatorId") != null) {
			params.put("iRecverOperatorId", requirement.get("iRecverOperatorId"));
		}
		if(requirement.get("iOrderState") != null) {
			params.put("iOrderState", requirement.get("iOrderState"));
		}
		if(requirement.get("iOrderSplite") != null) {
			params.put("iOrderSplite", requirement.get("iOrderSplite"));
		}
		if(requirement.get("dOrderCreateTimeStart") != null) {
			params.put("dOrderCreateTimeStart", requirement.get("dOrderCreateTimeStart"));
		}
		if(requirement.get("dOrderCreateTimeEnd") != null) {
			System.out.println(requirement.get("dOrderCreateTimeEnd"));
			params.put("dOrderCreateTimeEnd", requirement.get("dOrderCreateTimeEnd"));
		}
		if(requirement.get("dOrderEndTimeEnd") != null) {
			params.put("dOrderEndTimeEnd", requirement.get("dOrderEndTimeEnd"));
		}
		if(requirement.get("dOrderEndTimeStart") != null) {
			params.put("dOrderEndTimeStart", requirement.get("dOrderEndTimeStart"));
		}
		if(requirement.get("dOrderTemminateTimeEnd") != null) {
			params.put("dOrderTemminateTimeEnd", requirement.get("dOrderTemminateTimeEnd"));
		}
		if(requirement.get("dOrderTemminateTimeStart") != null) {
			params.put("dOrderTemminateTimeStart", requirement.get("dOrderTemminateTimeStart"));
		}
		if(requirement.get("iOrderTemminate") != null) {
			params.put("iOrderTemminate", requirement.get("iOrderTemminate"));
		}
		if(requirement.get("iOrderDelete") != null) {
			params.put("iOrderDelete", requirement.get("iOrderDelete"));
		}
		if(requirement.get("dOrderDeleteTimeStart") != null) {
			params.put("dOrderDeleteTimeStart", requirement.get("dOrderDeleteTimeStart"));
		}
		if(requirement.get("dOrderDeleteTimeEnd") != null) {
			params.put("dOrderDeleteTimeEnd", requirement.get("dOrderDeleteTimeEnd"));
		}
		if(requirement.get("dOrderAlterTimeEnd") != null) {
			params.put("dOrderAlterTimeEnd", requirement.get("dOrderAlterTimeEnd"));
		}
		if(requirement.get("dOrderAlterTimeStart") != null) {
			params.put("dOrderAlterTimeStart", requirement.get("dOrderAlterTimeStart"));
		}
		if(requirement.get("fProtectPriceStart") != null) {
			params.put("fProtectPriceStart", requirement.get("fProtectPriceStart"));
		}
		if(requirement.get("fProtectPriceEnd") != null) {
			params.put("fProtectPriceEnd", requirement.get("fProtectPriceEnd"));
		}
		if(requirement.get("fInsuranceValueStart") != null) {
			params.put("fInsuranceValueStart", requirement.get("fInsuranceValueStart"));
		}
		if(requirement.get("fInsuranceValueEnd") != null) {
			params.put("fInsuranceValueEnd", requirement.get("fInsuranceValueEnd"));
		}
		if( pageModel != null) {
			params.put("pageModel", pageModel);
		}
		List<FmTradeOrderInfoBaseEntity> orderList = fmTradeOrderInfoBaseEntityMapper.selectByPage(params);
		
		/** 插入订单的详情信息  */
		len = orderList.size();
		for ( int i = 0; i < len; i++) {
			orderId = orderList.get(i).getId();
			orderType = orderList.get(i).getiOrderTypeId();
			FmTradeOrderInfoBoxFreightEntity recordBox = new FmTradeOrderInfoBoxFreightEntity();
			
			/**
			 * 3集装箱运输
			 * 4-6快运
			 * 7-10整车
			 * */
			if( orderType == 3 ) {
				recordBox = fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId);
				orderList.get(i).setFmTradeOrderInfoBoxFreightRecord(recordBox);
			}
			/*else if( orderType >= 4 && orderType <= 6) {
				
			}
			else if( orderType >= 7 && orderType <= 10 ) {
				
			}*/
			
			
		}
		return orderList;
	}


}
