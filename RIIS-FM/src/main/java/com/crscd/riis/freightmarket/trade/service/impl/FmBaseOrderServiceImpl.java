package com.crscd.riis.freightmarket.trade.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntityExample;
import com.crscd.riis.freightmarket.trade.page.PageModel;
import com.crscd.riis.freightmarket.trade.service.IFmBaseOrderService;

@Service("fmBaseOrderService")
public class FmBaseOrderServiceImpl implements IFmBaseOrderService{
	@Resource
	private FmTradeOrderInfoBaseEntityMapper fmTradeOrderInfoBaseEntityMapper;
	@Override
	public int saveBasicOrder(FmTradeOrderInfoBaseEntity record) {
		//插入申请日期
		Date day=new Date(); 
		record.setdOrderCreateTime(day);
		//插入订单编号，整车WV+时间
		String cOrderCode=createOrderCode(day);
		record.setcOrderCode(cOrderCode);
		return fmTradeOrderInfoBaseEntityMapper.insert(record);
	}
	@Override
	public int modifyBasicOrder(FmTradeOrderInfoBaseEntity record) {
		Date time=new Date();
		record.setdOrderAlterTime(time);
        //设置订单删除时间
		int deleteOrder = record.getiOrderDelete();
		if ( deleteOrder == 0) {
			record.setdOrderDeleteTime(time);
		}
		//设置订单取消时间
		int temminateOrder = record.getiOrderTemminate();
		if ( temminateOrder == 0){
			record.setdOrderTemminateTime(time);
		}
		record.setdOrderAlterTime(time);
		return fmTradeOrderInfoBaseEntityMapper.updateByPrimaryKey(record);
	}
	@Override
	public FmTradeOrderInfoBaseEntity getOrderId(String cOrderCode) {
		return fmTradeOrderInfoBaseEntityMapper.selectByOrderCode(cOrderCode);
	}
	@Override
	public FmTradeOrderInfoBaseEntity getBaseOrder(int id) {
		return fmTradeOrderInfoBaseEntityMapper.selectByPrimaryKey(id);
	}
	@Override
	public String createOrderCode(Date day) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		String cOrderCode = "WV"+df.format(day);
		return cOrderCode;
	}
	@Override
	public List<FmTradeOrderInfoBaseEntity> findOrder(Integer iAccountId,PageModel pageModel) {
		Map<String, Object> params=new HashMap<>();
		FmTradeOrderInfoBaseEntityExample baseEntityExample = new FmTradeOrderInfoBaseEntityExample();
		com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntityExample.Criteria baseCriteria=baseEntityExample.createCriteria();
		baseCriteria.andISenderIdEqualTo(iAccountId);
		int recordCount=(int) fmTradeOrderInfoBaseEntityMapper.countByExample(baseEntityExample);
		System.out.println(recordCount);
		pageModel.setRecordCount(recordCount);
		if(recordCount>0) {
			params.put("pageModel", pageModel);
			params.put("id", iAccountId);
		}
		List<FmTradeOrderInfoBaseEntity> orders=fmTradeOrderInfoBaseEntityMapper.selectWithParam(params);
		for(int i=0;i<orders.size();i++) {
			FmTradeOrderInfoBaseEntity order=orders.get(i);
			if(order.getiOrderTypeId()==2) {
				order.setFmTradeOrderInfoWholeVegicleFreightRecord(order.getId());
			}
		}
		return orders;
	}
}
