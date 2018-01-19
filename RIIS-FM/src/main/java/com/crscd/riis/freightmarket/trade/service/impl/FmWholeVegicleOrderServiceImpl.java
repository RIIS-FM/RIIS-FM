package com.crscd.riis.freightmarket.trade.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.trade.dao.FmTradeGoodsEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoWholeVegicleFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.service.IFmWholeVegicleOrderService;

@Service("FmWholeVegicleOrderService")
public class FmWholeVegicleOrderServiceImpl implements IFmWholeVegicleOrderService {
	
	@Resource
	private FmTradeOrderInfoWholeVegicleFreightEntityMapper fmTradeOrderInfoWholeVegicleFreightEntityMapper;
	
	@Resource
    private FmTradeGoodsEntityMapper fmTradeGoodsEntityMapper;
	
	@Override
	public int saveFmWholeVegicleOrder(FmTradeOrderInfoWholeVegicleFreightEntity record) {
		//根据货物名称获得货物代码
		FmTradeGoodsEntity cGoodsEntity = fmTradeGoodsEntityMapper.selectByGoodsName(record.getcGoodsName());
		
		record.setcGoodsCode(cGoodsEntity.getcGoodsCategoryCode());
		return fmTradeOrderInfoWholeVegicleFreightEntityMapper.insert(record);
	}
	
	@Override
	public List<FmTradeOrderInfoWholeVegicleFreightEntity> getFmWholeVegicleOrder(int iOrderId) {
		FmTradeOrderInfoWholeVegicleFreightEntityExample wholeOrderExample = new FmTradeOrderInfoWholeVegicleFreightEntityExample();
		Criteria wholeOrderCriteria = wholeOrderExample.createCriteria();
		
		wholeOrderCriteria.andIOrderIdEqualTo(iOrderId);
		return fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByExample(wholeOrderExample);
	}
	
	@Override
	public long countOrderNumber(FmTradeOrderInfoWholeVegicleFreightEntity record) {
		long orderNumber = -1;
    	FmTradeOrderInfoWholeVegicleFreightEntityExample wholeOrderExample = new FmTradeOrderInfoWholeVegicleFreightEntityExample();
    	Criteria wholeOrderCriteria=wholeOrderExample.createCriteria();
    	
    	if( record.getcGoodsName() != null) {
    		wholeOrderCriteria.andCGoodsNameEqualTo(record.getcGoodsName());
		}
    	if( record.getfGoodsWight() != null) {
    		wholeOrderCriteria.andFGoodsWightEqualTo(record.getfGoodsWight());
		}
    	if( record.getfGoodsVolume() != null) {
    		wholeOrderCriteria.andFGoodsVolumeEqualTo(record.getfGoodsVolume());
		}
    	if( record.getcGoodsFeature() != null) {
    		wholeOrderCriteria.andCGoodsFeatureEqualTo(record.getcGoodsFeature());
		}
    	if( record.getfEachGoodsMaxWeight() != null) {
    		wholeOrderCriteria.andFEachGoodsMaxWeightEqualTo(record.getfEachGoodsMaxWeight());
		}
    	if( record.getiCanvasNumber() != null) {
    		wholeOrderCriteria.andICanvasNumberEqualTo(record.getiCanvasNumber());
		}
		orderNumber = fmTradeOrderInfoWholeVegicleFreightEntityMapper.countByExample(wholeOrderExample);
    	return orderNumber;
	}
	
	@Override
	public int modifyOrderInfo(FmTradeOrderInfoWholeVegicleFreightEntity record) {
		int orderId = record.getiOrderId();
		FmTradeOrderInfoWholeVegicleFreightEntity recordInfo = fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByOrderId(orderId);
		
		record.setId(recordInfo.getId());
		int ret = fmTradeOrderInfoWholeVegicleFreightEntityMapper.updateByPrimaryKey(record);
		return ret;
	}

}
