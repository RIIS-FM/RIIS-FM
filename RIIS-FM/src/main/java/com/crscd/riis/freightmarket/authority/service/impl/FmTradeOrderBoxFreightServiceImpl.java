package com.crscd.riis.freightmarket.authority.service.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.authority.dao.FmTradeGoodsEntityMapper;
import com.crscd.riis.freightmarket.authority.dao.FmTradeOrderInfoBoxFreightEntityMapper;
import com.crscd.riis.freightmarket.authority.entity.FmTradeGoodsEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBoxFreightEntityExample;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBoxFreightEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.service.IFmTradeOrderBoxFreightService;

/* *
 * 集装箱运输服务层接口实现类
 *  */
@Service("tradeOrderBoxFreightService")
public class FmTradeOrderBoxFreightServiceImpl implements IFmTradeOrderBoxFreightService{
    /* *
     * 自动注入FmTradeOrderInfoBoxFreightEntityMapper
     * */
	@Resource
	private FmTradeOrderInfoBoxFreightEntityMapper fmTradeOrderInfoBoxFreightEntityMapper;
	
	@Resource
	private FmTradeGoodsEntityMapper fmTradeGoodsEntityMapper;
	
    /* *
     * 	IFmTradeOrderBoxFreightService接口的long countOrderNumber方法实现
     * @param FmTradeOrderInfoBoxFreightEntity record
     * @return 返回该条记录的个数
     * */
	@Override
	public long countOrderNumber(FmTradeOrderInfoBoxFreightEntity record) {
		long orderNumber = 0;
		FmTradeOrderInfoBoxFreightEntityExample example = new FmTradeOrderInfoBoxFreightEntityExample();
		Criteria criteria = example.createCriteria();
		boolean retCriteria = criteria.equals(record);
		if (retCriteria == true) {
    		orderNumber = fmTradeOrderInfoBoxFreightEntityMapper.countByExample(example);
    	}
		
		return orderNumber;
	}

    /* *
     * 	IFmTradeOrderBoxFreightService接口的saveOrderBoxInfo方法实现
     * */
	@Override
	public int saveOrderBoxInfo(FmTradeOrderInfoBoxFreightEntity record) {
	    /* *
	     * 设置订单中的货物代码
	     * */
    	FmTradeGoodsEntity cGoodsInfo = fmTradeGoodsEntityMapper.selectByGoodsName(record.getcGoodsName());
		record.setcGoodsCode(cGoodsInfo.getcGoodsCategoryCode());
		return fmTradeOrderInfoBoxFreightEntityMapper.insertSelective(record);
	}
	
	@Override
	public int modifyOrderInfo(FmTradeOrderInfoBoxFreightEntity record) {
		int orderId = record.getiOrderId();
		FmTradeOrderInfoBoxFreightEntity recordInfo = fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId);
		record.setId(recordInfo.getId());
		int ret = fmTradeOrderInfoBoxFreightEntityMapper.updateByPrimaryKey(record);
		return ret;
	}
	
/*	@Override
	public FmTradeOrderInfoBoxFreightEntity getOrderInfoByOrderId(Integer orderId) {
		
		return fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId);
	}*/
	

	

}
