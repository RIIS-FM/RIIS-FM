package com.crscd.riis.freightmarket.trade.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.trade.dao.FmTradeContactEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeFeeEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeGoodsEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderAuditEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeContactEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeFeeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntityExample;
import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBaseEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoBoxFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoFastFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderInfoWholeVegicleFreightEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeOrderTypeEntityMapper;
import com.crscd.riis.freightmarket.trade.dao.FmTradeTransportSchemeEntityMapper;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBoxFreightEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntityExample;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderTypeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;
import com.crscd.riis.freightmarket.trade.dto.orderDto;
import com.crscd.riis.freightmarket.trade.util.tradeConstants.tradeConstants;
import com.crscd.riis.freightmarket.trade.service.IFmTradeOrderService;

@Service("tradeOrderService")
public class FmTradeOrderServiceImpl implements IFmTradeOrderService {
	/**
     * 自动注入FmTradeOrderInfoBaseEntityMapper
     * 
     */
	@Resource
	private FmTradeGoodsEntityMapper fmTradeGoodsEntityMapper;
	
	@Resource
	private FmTradeOrderInfoBaseEntityMapper fmTradeOrderInfoBaseEntityMapper;
	
	@Resource
	private FmTradeOrderInfoBoxFreightEntityMapper fmTradeOrderInfoBoxFreightEntityMapper;
	
	@Resource
	private FmTradeOrderInfoWholeVegicleFreightEntityMapper fmTradeOrderInfoWholeVegicleFreightEntityMapper;
	
	@Resource 
	private FmTradeOrderInfoFastFreightEntityMapper fmTradeOrderInfoFastFreightEntityMapper;
	
	@Resource
	private FmTradeOrderAuditEntityMapper fmTradeOrderAuditEntityMapper;
	
	@Resource
	private FmTradeTransportSchemeEntityMapper fmTradeTransportSchemeEntityMapper;
	
	@Resource 
	private FmTradeFeeEntityMapper fmTradeFeeEntityMapper;
	
	@Resource
	private FmTradeOrderTypeEntityMapper fmTradeOrderTypeEntityMapper;
	
	@Resource
	private FmTradeContactEntityMapper fmTradeContactEntityMapper;
	
	/**
	 * IFmTradeOrderInfoBaseService接口的countBaseOrderNumber方法实现 
	 */
	public long countBaseOrderNumber(FmTradeOrderInfoBaseEntity record) {
		long orderNumber = -1;
	    FmTradeOrderInfoBaseEntityExample example = new FmTradeOrderInfoBaseEntityExample();
	    FmTradeOrderInfoBaseEntityExample.Criteria criteria = example.createCriteria();
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
	 
	 /**
	  * IFmTradeOrderInfoBaseService接口的countOrderNumber方法实现 
	  */
	  @Override
	  public long countBaseOrderNumber(Map<String, Object> requirement) {
		  long orderNumber = -1;
	      FmTradeOrderInfoBaseEntityExample example = new FmTradeOrderInfoBaseEntityExample();
	      FmTradeOrderInfoBaseEntityExample.Criteria criteria = example.createCriteria();
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
	  
	  /**
	   * IFmTradeOrderInfoBaseService接口的countBoxFreightOrderNumber方法实现 
	   */
	  public long countBoxFreightOrderNumber(FmTradeOrderInfoBoxFreightEntity record) {
		  long orderNumber = -1;
			FmTradeOrderInfoBoxFreightEntityExample example = new FmTradeOrderInfoBoxFreightEntityExample();
			FmTradeOrderInfoBoxFreightEntityExample.Criteria criteria = example.createCriteria();
			
			if( record.getcGoodsName() != null) {
				criteria.andCGoodsNameEqualTo(record.getcGoodsName());
			}
			if( record.getcGoodsFeature() != null ) {
				criteria.andCGoodsFeatureEqualTo(record.getcGoodsFeature());
			}
			if( record.getiBoxGetType() != null ) {
				criteria.andIBoxGetTypeEqualTo(record.getiBoxGetType());
			}
			if( record.getiBoxNumber() != null) {
				criteria.andIBoxNumberEqualTo(record.getiBoxNumber());
			}
			if( record.getiBoxType() != null) {
				criteria.andIBoxTypeEqualTo(record.getiBoxType());
			}
			if( record.getiBoxNum() != null) {
				criteria.andIBoxNumEqualTo(record.getiBoxNum());
			}
			if( record.getiBoxSealNum() != null) {
				criteria.andIBoxNumNotEqualTo(record.getiBoxSealNum());
			}
			if( record.getdBoxRecverTime() != null) {
				criteria.andDBoxRecverTimeEqualTo(record.getdBoxRecverTime());
			}
			if( record.getfGoodsWeight() != null) {
				criteria.andFGoodsWeightEqualTo(record.getfGoodsWeight());
			}
			if( record.getiFullboxInStation() != null ) {
				criteria.andIFullboxInStationEqualTo(record.getiFullboxInStation());
			}
			if( record.getcSenderBoxStation() != null) {
				criteria.andCSenderBoxStationEqualTo(record.getcSenderBoxStation());
			}

	       orderNumber = fmTradeOrderInfoBoxFreightEntityMapper.countByExample(example);
			
		   return orderNumber;
	  }
	  
	  /**
	   * IFmTradeOrderInfoBaseService接口的countFastFreightOrderNumber方法实现
	   */
	  public long countFastFreightOrderNumber(FmTradeOrderInfoFastFreightEntity record) {
		  long orderNumber = -1;
			FmTradeOrderInfoFastFreightEntityExample example = new FmTradeOrderInfoFastFreightEntityExample();
			FmTradeOrderInfoFastFreightEntityExample.Criteria criteria = example.createCriteria();
			if( record.getcGoodsName() != null) {
				criteria.andCGoodsNameEqualTo(record.getcGoodsName());
			}
			if( record.getcGoodsFeature() != null ) {
				criteria.andCGoodsFeatureEqualTo(record.getcGoodsFeature());
			}
			if( record.getcGoodsCode() != null ) {
				criteria.andCGoodsCodeEqualTo(record.getcGoodsCode());
			}
			if( record.getfGoodsWeight() != null) {
				criteria.andFGoodsWeightEqualTo(record.getfGoodsWeight());
			}
			if( record.getfGoodsVolume() != null) {
				criteria.andFGoodsVolumeEqualTo(record.getfGoodsVolume());
			}
			if( record.getfEachGoodsMaxWeight() != null) {
				criteria.andFEachGoodsMaxWeightEqualTo(record.getfEachGoodsMaxWeight());
			}
			if( record.getcGoodsWrapper() != null) {
				criteria.andCGoodsWrapperEqualTo(record.getcGoodsWrapper());
			}
			if( record.getcGoodsFeature() != null) {
				criteria.andCGoodsFeatureEqualTo(record.getcGoodsFeature());
			}
			if( record.getcTrainNum() != null) {
				criteria.andCTrainNumEqualTo(record.getcTrainNum());
			}
			if( record.getiGoodsNumber() != null ) {
				criteria.andIGoodsNumberEqualTo(record.getiGoodsNumber());
			}
	       orderNumber = fmTradeOrderInfoFastFreightEntityMapper.countByExample(example);
			
			return orderNumber;
	  }
	  
	  /**
	   * IFmTradeOrderInfoBaseService接口的countWholeVegicleFreightOrderNumber方法实现 
	   */
	  public long countWholeVegicleFreightOrderNumber(FmTradeOrderInfoWholeVegicleFreightEntity record) {
		  long orderNumber = -1;
	      FmTradeOrderInfoWholeVegicleFreightEntityExample wholeOrderExample = new FmTradeOrderInfoWholeVegicleFreightEntityExample();
	      FmTradeOrderInfoWholeVegicleFreightEntityExample.Criteria wholeOrderCriteria=wholeOrderExample.createCriteria();
	    	
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
	  
	  /**
	   * 插入货物基本运输订单的信息
	   * @param FmTradeOrderInfoBaseEntity record
	   * @return  插入成功返回1， 插入失败返回0
	   */
	  public int saveOrderInfo(FmTradeOrderInfoBaseEntity record) {
		 /**
		  * 对订单进行编码
		  */
		  record.setcOrderCode(editOrderCode(record.getiOrderTypeId()));
			
		 /**
		  * 设置创建日期
		  */
		  Date date = new Date();
		  record.setdOrderCreateTime(date);
					
		  return fmTradeOrderInfoBaseEntityMapper.insertSelective(record);
	  }
	 
	  /**
	   * 插入集装箱运输订单的信息
	   * @param FmTradeOrderInfoBoxFreightEntity record
	   * @return  插入成功返回1， 插入失败返回0
	   */
	  public int saveBoxFreightOrderInfo(FmTradeOrderInfoBoxFreightEntity record,FmTradeOrderInfoBaseEntity recordBase) {
			int retStr = -1;
			int retiOrderId = 0;
			int orderState = -1;
			
	        /**
	         * 判断是否插入重复的订单信息 	
	         */
			long countRecord = countBaseOrderNumber(recordBase);
			long countRecordBox = countBoxFreightOrderNumber(record);
			System.out.println("countRecord: "+countRecord);
			System.out.println("countRecordBox: "+countRecordBox);
			
			if ( countRecord != 0 && countRecordBox != 0) {
				orderState = recordBase.getiOrderState();
				if (orderState == 0) {
					retStr = 1;//1已保存
				}
				else if (orderState == 1) {
					retStr = 2;//2已提交
				}
			}
			else {
				int retSaveRecord =saveOrderInfo(recordBase);
				if ( retSaveRecord == 1 ) {
					String orderCode = recordBase.getcOrderCode();
					retiOrderId = getOrderIdByOrderCode(orderCode);
					record.setiOrderId(retiOrderId);
					/**
				     * 设置订单中的货物代码
				     */
					FmTradeGoodsEntity cGoodsInfo = fmTradeGoodsEntityMapper.selectByGoodsName(record.getcGoodsName());
			    	record.setcGoodsCode(cGoodsInfo.getcGoodsCategoryCode());
					int retSaveRecordBox =fmTradeOrderInfoBoxFreightEntityMapper.insertSelective(record);
					if ( retSaveRecordBox == 1) {
						orderState = recordBase.getiOrderState();
						if( retSaveRecord == 1 && retSaveRecordBox == 1) {
							if (orderState == 0) {
								retStr = 3;//3保存成功
							}
							else if (orderState == 1) {
								retStr = 4;//4提交成功
							}
						}
					}
					else {
						/* *
						 * 删除已插入的订单基本信息
						 */
						while (true) {
							int retDel = fmTradeOrderInfoBaseEntityMapper.deleteByPrimaryKey(retiOrderId);
							if ( retDel == 1) {
								break;
							}
						}
					}
				}
			}
	        return retStr;
	  }
	  
	  /**
	   * 插入集装箱运输订单的信息
	   * @param FmTradeOrderInfoFastFreightEntity record
	   * @return  插入成功返回1， 插入失败返回0
	   */
	  public int saveFastFreightOrderInfo(FmTradeOrderInfoFastFreightEntity record,FmTradeOrderInfoBaseEntity recordBase) {
			int retStr = -1;
			int retiOrderId = 0;
			int orderState = -1;
			
	        /**
	         * 判断是否插入重复的订单信息 	
	         */
			long countRecord = countBaseOrderNumber(recordBase);
			long countRecordFast = countFastFreightOrderNumber(record);
			System.out.println("countRecord: "+countRecord);
			System.out.println("countRecordBox: "+countRecordFast);
			
			if ( countRecord != 0 && countRecordFast != 0) {
				orderState = recordBase.getiOrderState();
				if (orderState == 0) {
					retStr = 1;//1已保存
				}
				else if (orderState == 1) {
					retStr = 2;//2已提交
				}
			}
			else {
				int retSaveRecord =saveOrderInfo(recordBase);
				if ( retSaveRecord == 1 ) {
					String orderCode = recordBase.getcOrderCode();
					retiOrderId = getOrderIdByOrderCode(orderCode);
					record.setiOrderId(retiOrderId);
					/**
				     * 设置订单中的货物代码
				     */
					FmTradeGoodsEntity cGoodsInfo = fmTradeGoodsEntityMapper.selectByGoodsName(record.getcGoodsName());
			    	record.setcGoodsCode(cGoodsInfo.getcGoodsCategoryCode());
					int retSaveRecordFast =fmTradeOrderInfoFastFreightEntityMapper.insertSelective(record);
					if ( retSaveRecordFast == 1) {
						orderState = recordBase.getiOrderState();
						if( retSaveRecord == 1 && retSaveRecordFast == 1) {
							if (orderState == 0) {
								retStr = 3;//3保存成功
							}
							else if (orderState == 1) {
								retStr = 4;//4提交成功
							}
						}
					}
					else {
						/* *
						 * 删除已插入的订单基本信息
						 */
						while (true) {
							int retDel = fmTradeOrderInfoBaseEntityMapper.deleteByPrimaryKey(retiOrderId);
							if ( retDel == 1) {
								break;
							}
						}
					}
				}
			}
	        return retStr;
	  }
		 
	  /**
	   * 插入货物基本运输订单的信息
	   * @param FmTradeOrderInfoWholeVegicleFreightEntity record
	   * @return  插入成功返回1， 插入失败返回0
	   */
	  public int saveWholeVegicleFreightOrderInfo(FmTradeOrderInfoWholeVegicleFreightEntity record,FmTradeOrderInfoBaseEntity recordBase) {
			int retStr = -1;
			int retiOrderId = 0;
			int orderState = -1;
			
	        /**
	         * 判断是否插入重复的订单信息 	
	         */
			long countRecord = countBaseOrderNumber(recordBase);
			long countRecordWhole = countWholeVegicleFreightOrderNumber(record);
			System.out.println("countRecord: "+countRecord);
			System.out.println("countRecordBox: "+countRecordWhole);
			
			if ( countRecord != 0 && countRecordWhole != 0) {
				orderState = recordBase.getiOrderState();
				if (orderState == 0) {
					retStr = 1;//1已保存
				}
				else if (orderState == 1) {
					retStr = 2;//2已提交
				}
			}
			else {
				int retSaveRecord =saveOrderInfo(recordBase);
				if ( retSaveRecord == 1 ) {
					String orderCode = recordBase.getcOrderCode();
					retiOrderId = getOrderIdByOrderCode(orderCode);
					record.setiOrderId(retiOrderId);
					/**
				     * 设置订单中的货物代码
				     */
					FmTradeGoodsEntity cGoodsInfo = fmTradeGoodsEntityMapper.selectByGoodsName(record.getcGoodsName());
			    	record.setcGoodsCode(cGoodsInfo.getcGoodsCategoryCode());
					int retSaveRecordWhole =fmTradeOrderInfoWholeVegicleFreightEntityMapper.insertSelective(record);
					if ( retSaveRecordWhole == 1) {
						orderState = recordBase.getiOrderState();
						if( retSaveRecord == 1 && retSaveRecordWhole == 1) {
							if (orderState == 0) {
								retStr = 3;//3保存成功
							}
							else if (orderState == 1) {
								retStr = 4;//4提交成功
							}
						}
					}
					else {
						/* *
						 * 删除已插入的订单基本信息
						 */
						while (true) {
							int retDel = fmTradeOrderInfoBaseEntityMapper.deleteByPrimaryKey(retiOrderId);
							if ( retDel == 1) {
								break;
							}
						}
					}
				}
			}
	        return retStr;
	  }	 
	  
	  /**
	   * 获取订单的ID
	   * @return 成功返回订单ID，否则返回0
	   */	  
	  @Override
	  public int getOrderIdByOrderCode(String orderCode) {
		  FmTradeOrderInfoBaseEntity record = fmTradeOrderInfoBaseEntityMapper.selectByOrderCode(orderCode);
		  int orderId = record.getId();
		  return orderId;
	  } 
	  
	  /**
	   *  编辑订单编号	 
	   *  @param 订单类型
	   *  @return 订单编号
	   **/
	  public String editOrderCode(int iOrderType) {
		  String orderCode = new String();
	      Date day=new Date();
		  SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		  
		  if (iOrderType == tradeConstants.BOX_FREIGHT_FLAG) {
			  orderCode = "BF"+df.format(day);
		  }else if (iOrderType >= tradeConstants.FAST_FREIGHT_FLAG_START && iOrderType <= tradeConstants.FAST_FREIGHT_FLAG_END) {
			  orderCode = "FF"+df.format(day);
		  }else if (iOrderType >= tradeConstants.WHOLE_VEGICLE_FLAG_START && iOrderType <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
			  orderCode = "WV"+df.format(day);
		  }
		  return orderCode;
		
	  }
	  
	  @Override
	  public List<orderDto> findOrder(FmAccountEntity user, Map<String, Object> requirement, PageModel pageModel){
		    
		  	/** 定义基础变量
		     * recordCount 满足条件的所有订单
		     * len 订单列表大小
		     * orderId 订单id
		     * orderType 订单类型
		     */
			int recordCount = -1;
			int len = -1;
			int orderId = -1;
			int orderType = -1;
			
			List<orderDto> orderList = new ArrayList<orderDto>();
			
	        /**
	         * 查询该用户的所有订单  并设置recordCount
	         */
			requirement.put("iSenderId", user.getId());
			recordCount = (int)countBaseOrderNumber(requirement);
			pageModel.setRecordCount(recordCount);
			
	        /**
	         *  定义Map	
	         */
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
			List<FmTradeOrderInfoBaseEntity> orderBaseList = fmTradeOrderInfoBaseEntityMapper.selectByPage(params);
			
			/** 获取订单的详情信息 */
			len = orderBaseList.size();
			for ( int i = 0; i < len; i++) {
				orderId = orderBaseList.get(i).getId();
				orderType = orderBaseList.get(i).getiOrderTypeId();
				orderDto orderTemp = new orderDto();
				orderTemp.setFmTradeOrderInfoBaseEntity(orderBaseList.get(i));
				
				/**
				 * 3集装箱运输
				 * 4-6快运
				 * 7-10整车
				 * */
				if( orderType == tradeConstants.BOX_FREIGHT_FLAG ) {
					FmTradeOrderInfoBoxFreightEntity recordBox = new FmTradeOrderInfoBoxFreightEntity();
					recordBox = fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId);
					orderTemp.setFmTradeOrderInfoBoxFreightRecord(recordBox);
					orderList.add(orderTemp);
				}
				else if( orderType >= tradeConstants.FAST_FREIGHT_FLAG_START && orderType <= tradeConstants.FAST_FREIGHT_FLAG_END) {
					FmTradeOrderInfoFastFreightEntity recordFast = new FmTradeOrderInfoFastFreightEntity();
					recordFast = fmTradeOrderInfoFastFreightEntityMapper.selectByOrderId(orderId);
					orderTemp.setFmTradeOrderInfoFastFreightRecord(recordFast);
					orderList.add(orderTemp);
					
				}
				else if( orderType >= tradeConstants.WHOLE_VEGICLE_FLAG_START && orderType <= tradeConstants.WHOLE_VEGICLE_FLAG_END ) {
					FmTradeOrderInfoWholeVegicleFreightEntity recordWholeVegicle = new FmTradeOrderInfoWholeVegicleFreightEntity();
					recordWholeVegicle = fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByOrderId(orderId);
					orderTemp.setFmTradeOrderInfoWholeVegicleFreightRecord(recordWholeVegicle);
					orderList.add(orderTemp);
				}
			}
			return orderList;
		}
	  
	  	@Override
	    public FmTradeOrderInfoBaseEntity getFmBaseOrder(int id) {
			return fmTradeOrderInfoBaseEntityMapper.selectByPrimaryKey(id);
		}
	  
	    @Override
	    public FmTradeOrderInfoBoxFreightEntity getFmBoxFreightOrder(int iOrderId) {
			return fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(iOrderId);
		}	  
	    
	    @Override
	    public FmTradeOrderInfoFastFreightEntity getFmFastFreightOrder(int iOrderId) {
			return fmTradeOrderInfoFastFreightEntityMapper.selectByOrderId(iOrderId);
		}
	    
	    @Override
	    public FmTradeOrderInfoWholeVegicleFreightEntity getFmWholeVegicleFreightOrder(int iOrderId) {
			return fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByOrderId(iOrderId);
		}	
	    
		/**
		 * 修改订单信息
		 * @param 基础订单实体
		 * @return 修改成功返回1，修改失败返回0
		 */
	    @Override
		public int modifyBaseOrderInfo(FmTradeOrderInfoBaseEntity record) {
			Date time=new Date();
			record.setdOrderAlterTime(time);
	       
			/** 设置订单删除时间*/
			if ( record.getiOrderDelete() != null) {
				
				int deleteOrder = record.getiOrderDelete();
				if ( deleteOrder == 0) {
					record.setdOrderDeleteTime(time);
				}
			}
			
			/** 设置订单取消时间 */
			if ( record.getiOrderTemminate() != null) {
				int temminateOrder = record.getiOrderTemminate();
				if ( temminateOrder == 0){
					record.setdOrderTemminateTime(time);
				}
			}
			
			int ret = fmTradeOrderInfoBaseEntityMapper.updateByPrimaryKey(record);
			return ret;
		}
	    
		/**
		 * 修改订单信息
		 * @param 集装箱订单实体
		 * @return 修改成功返回1，修改失败返回0
		 */	    
		@Override
		public int modifyBoxFreightOrderInfo(FmTradeOrderInfoBoxFreightEntity record) {
			
			int ret = fmTradeOrderInfoBoxFreightEntityMapper.updateByPrimaryKey(record);
			return ret;
			
		}
		
		/**
		 * 修改订单信息
		 * @param 快运订单实体
		 * @return 修改成功返回1，修改失败返回0
		 */	
		@Override
		public int modifyFastFreightOrderInfo(FmTradeOrderInfoFastFreightEntity record) {
			
			int ret = fmTradeOrderInfoFastFreightEntityMapper.updateByPrimaryKey(record);
			return ret;
			
		}
		
		/**
		 * 修改订单信息
		 * @param 整车订单实体
		 * @return 修改成功返回1，修改失败返回0
		 */		
		@Override
		public int modifyWholeVegicleFreightOrderInfo(FmTradeOrderInfoWholeVegicleFreightEntity record) {
			
			int ret = fmTradeOrderInfoWholeVegicleFreightEntityMapper.updateByPrimaryKey(record);
			return ret;
			
		}
		
		@Override 
		public int modifyAuditInfo(FmAccountEntity user, FmTradeOrderInfoBaseEntity orderInfo, FmTradeOrderAuditEntity record) {
			
			int ret = -1;
			Date dAuditEndTime = new Date();
			
			/** 订单审核类型 */
			record.setiAuditType(tradeConstants.PEOPLE_AUDIT_TYPE_FLAG);
			
			/** 审核人id */
			record.setiAuditorId(user.getId());
			
			/** 审核订单id */
			record.setiOrderId(orderInfo.getId());
			
			/** 审核订单类型id */
			record.setiOrderTypeId(orderInfo.getiOrderTypeId());
			
			/* 审核结束时间为提交审核结果的时间 */
			record.setdAuditEndTime(dAuditEndTime);
			
			/* 设置审核结果的标志位 */
			record.setiAuditResult(record.getiAuditResult());
			
			ret = fmTradeOrderAuditEntityMapper.updateByPrimaryKey(record);
			
			return ret;
		}
		
		/** IFmTradeOrderAudit接口的modifyAuditInfo方法实现*/
		@Override
		public int modifyAuditInfo(FmAccountEntity user, FmTradeOrderInfoBaseEntity orderInfo, FmTradeOrderAuditEntity record,
				List<FmTradeTransportSchemeEntity> transportSchemeList) {
			
			int ret = -1;
			int retSaveAuditInfo = -1;
			int retSaveTransportScheme = -1;
			int auditId = 0;
			int orderId = 0;
			int transportType = -1;
			float fee = 0.0f;
			String goodsName = null;
			FmTradeFeeEntity feeRecord = new FmTradeFeeEntity();
			FmTradeOrderTypeEntity orderTypeRecord = new FmTradeOrderTypeEntity();
			
			
			
			/** 插入审核结果*/
			retSaveAuditInfo = modifyAuditInfo(user, orderInfo, record);
			
			if (retSaveAuditInfo == 1) {
				
				/** 设置承运方案中订单id及运费*/
				for (int i = 0; i < transportSchemeList.size(); i++) {
					
					/** 设置订单id */
					orderId = orderInfo.getId();
					transportSchemeList.get(i).setiOrderId(orderId);
					
					/** 获取运输类型的一级类别*/
					orderTypeRecord = fmTradeOrderTypeEntityMapper.selectByPrimaryKey(orderInfo.getiOrderTypeId());
					
					
	                /** 查询货物的运价号
	                 * 输入参数 订单id 和订单类型 查询货物名称*/
					if (orderInfo.getiOrderTypeId() == tradeConstants.BOX_FREIGHT_FLAG) {
						
						transportType = orderInfo.getiOrderTypeId();
	                    /** 获取集装箱个数*/
						FmTradeOrderInfoBoxFreightEntity boxRecord = new FmTradeOrderInfoBoxFreightEntity();
						boxRecord = fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId);
						int boxNumber = boxRecord.getiBoxNumber();
						String boxType = boxRecord.getiBoxType().toString();	
						System.out.println("transportType "+transportType);
						/** 获取货物的基价率*/
						feeRecord = fmTradeFeeEntityMapper.selectByFeeAndOrderType(tradeConstants.FEE_FLAG, transportType, boxType);
						
						System.out.println("feeRecord "+feeRecord.getfBasePriceOne());
						/** 计算运费*/
						fee = boxNumber * (feeRecord.getfBasePriceOne() + feeRecord.getfBasePriceTwo() * 1);
						System.out.println("fee "+fee);
						transportSchemeList.get(i).setfTradeOrderTransportSchemeFee(fee);
					}
					else if (orderInfo.getiOrderTypeId() >= tradeConstants.FAST_FREIGHT_FLAG_START && 
							orderInfo.getiOrderTypeId() <= tradeConstants.FAST_FREIGHT_FLAG_END) {
						
						transportType = orderTypeRecord.getiTypeLabel();
						/** 获取货物名称 */
						FmTradeOrderInfoFastFreightEntity fastFreightRecord = new FmTradeOrderInfoFastFreightEntity();
						fastFreightRecord = fmTradeOrderInfoFastFreightEntityMapper.selectByOrderId(orderId);
						goodsName = fastFreightRecord.getcGoodsName();
						
						/** 获取该货物快运的运价号 */
						FmTradeGoodsEntity goodsRecord = fmTradeGoodsEntityMapper.selectByGoodsName(goodsName);
						String cPriceNo = goodsRecord.getcGoodsFastFreightRate();
						
						/** 获取货物的基价率*/
						feeRecord = fmTradeFeeEntityMapper.selectByFeeAndOrderType(tradeConstants.FEE_FLAG, transportType, cPriceNo);
						
						/** 计算运费*/
						fee = fastFreightRecord.getfGoodsWeight() * (feeRecord.getfBasePriceOne() + feeRecord.getfBasePriceTwo() * 1);
						transportSchemeList.get(i).setfTradeOrderTransportSchemeFee(fee);
					}
					else if (orderInfo.getiOrderTypeId() >= tradeConstants.WHOLE_VEGICLE_FLAG_START && 
							orderInfo.getiOrderTypeId() <= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
						
						transportType = orderTypeRecord.getiTypeLabel();
						/** 获取货物名称 */
						FmTradeOrderInfoWholeVegicleFreightEntity wholeVegicleFreightRecord = new FmTradeOrderInfoWholeVegicleFreightEntity();
						wholeVegicleFreightRecord = fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByOrderId(orderId);
						goodsName = wholeVegicleFreightRecord.getcGoodsName();
						
						/** 获取该货物快运的运价号 */
						FmTradeGoodsEntity goodsRecord = fmTradeGoodsEntityMapper.selectByGoodsName(goodsName);
						String cPriceNo = goodsRecord.getcGoodsWholeVegicleRate();
						
						/** 获取货物的基价率*/
						feeRecord = fmTradeFeeEntityMapper.selectByFeeAndOrderType(tradeConstants.FEE_FLAG, transportType, cPriceNo);
						
						/** 计算运费*/
						fee = wholeVegicleFreightRecord.getfGoodsWight() * (feeRecord.getfBasePriceOne() + feeRecord.getfBasePriceTwo() * 1);
						
						/** 将运费插入到承运方案中*/
						transportSchemeList.get(i).setfTradeOrderTransportSchemeFee(fee);
					}
					else {
						ret = 0;
						return ret;
					}
					
				}
				
				/** 插入该订单的承运方案*/
				retSaveTransportScheme =saveTransportScheme(transportSchemeList);
				
				if (retSaveTransportScheme == 1) {
					
					ret = 1;
				}
				else {
					/** 审核结果插入成功， 但承运方案插入失败；则删除已插入的审核结果*/
					FmTradeOrderAuditEntity auditRecord = fmTradeOrderAuditEntityMapper.selectByOrderId(orderInfo.getId());
					auditId = auditRecord.getId();
					
					fmTradeOrderAuditEntityMapper.deleteByPrimaryKey(auditId);
					ret = 0;
				}
			}
			return ret;
		}
		
		/** IFmTradeOrderAudit接口的findAuditResult方法实现*/
		@Override
		public List<orderDto> findAuditResult(Map<String, Object> requirement, PageModel pageModel) {
			
			Map<String, Object> params = new HashMap<String, Object>();
			List<orderDto> orderList = new ArrayList<orderDto>();
			orderDto orderTemp = new orderDto();
			int orderId = 0;
			

			/** 设置查找条件 */
			int recordCount = (int)countAuditInfoNumber(requirement);
			pageModel.setRecordCount(recordCount);
			params.put("pageModel", pageModel);
			
			if ( requirement.get("iOrderTypeId") != null) {
				
				params.put("iOrderTypeId",requirement.get("iOrderTypeId"));
			}
			
			params.put("iAuditResult", tradeConstants.AUDIT_NOT_PASS_FLAG);
			params.put("iAuditType", tradeConstants.SYS_AUDIT_TYPE_FLAG);
			
			/** 获取满足条件的审核列表 */
			List<FmTradeOrderAuditEntity> notPassOrders = fmTradeOrderAuditEntityMapper.selectByPage(params);
			
			for ( int i = 0; i < notPassOrders.size(); i++) {
				
				/** 获取订单id */
				orderId = notPassOrders.get(i).getiOrderId();
				
				/** 设置基本订单信息 */
				orderTemp.setFmTradeOrderInfoBaseEntity(
						fmTradeOrderInfoBaseEntityMapper.selectByPrimaryKey(orderId));
				
				/** 设置订单详情信息 */
				if (notPassOrders.get(i).getiOrderTypeId() == tradeConstants.BOX_FREIGHT_FLAG ) {
					
					orderTemp.setFmTradeOrderInfoBoxFreightRecord(
							fmTradeOrderInfoBoxFreightEntityMapper.selectByOrderId(orderId));
					orderList.add(orderTemp);	
				}
				else if (notPassOrders.get(i).getiOrderTypeId() >= tradeConstants.FAST_FREIGHT_FLAG_START &&
						notPassOrders.get(i).getiOrderTypeId() >= tradeConstants.FAST_FREIGHT_FLAG_END) {
					
					orderTemp.setFmTradeOrderInfoFastFreightRecord(
							fmTradeOrderInfoFastFreightEntityMapper.selectByOrderId(orderId));
					orderList.add(orderTemp);
				}
				else if (notPassOrders.get(i).getiOrderTypeId() >= tradeConstants.WHOLE_VEGICLE_FLAG_START &&
						notPassOrders.get(i).getiOrderTypeId() >= tradeConstants.WHOLE_VEGICLE_FLAG_END) {
					
					orderTemp.setFmTradeOrderInfoWholeVegicleFreightRecord(
							fmTradeOrderInfoWholeVegicleFreightEntityMapper.selectByOrderId(orderId));
					orderList.add(orderTemp);
				}
				else {
					orderList = null;
					return orderList;
				}
			}
			
			return orderList;
		}

		/** IFmTradeOrderAudit接口的deleteAuditInfo方法实现*/
		@Override
		public int deleteAuditInfo(Integer id) {
			int ret = -1;
			
			ret = fmTradeOrderAuditEntityMapper.deleteByPrimaryKey(id);
			return ret;
		}
		
		/** IFmTradeOrderAudit接口的saveTransportScheme方法实现*/
		@Override
		public int saveTransportScheme(List<FmTradeTransportSchemeEntity> record) {
			
			int ret = -1;
			int count = 0;
			
			for (int i = 0; i < record.size(); i++) {

				int retTemp = fmTradeTransportSchemeEntityMapper.insertSelective(record.get(i));
				if ( retTemp == 1) {
					count++;
				}
			}
			
	      /** 判断所有的承运方案是否均插入成功*/
			if ( count == record.size()) {
				
				ret = 1;
			}
			else {
				
				ret = 0;
			}
			
			return ret;
		}

		@Override
		public long countAuditInfoNumber(Map<String, Object> requirement) {
			// TODO Auto-generated method stub
			long orderNumber = -1;
			FmTradeOrderAuditEntityExample example = new FmTradeOrderAuditEntityExample();
		    FmTradeOrderAuditEntityExample.Criteria criteria = example.createCriteria();
		    
		    criteria.andIAuditTypeEqualTo(tradeConstants.SYS_AUDIT_TYPE_FLAG);
		    criteria.andIAuditResultEqualTo(tradeConstants.AUDIT_NOT_PASS_FLAG);
		    
		    if(requirement.get("iOrderTypeId") != null) {
				criteria.andIOrderTypeIdEqualTo((Integer) requirement.get("iOrderTypeId"));
		    }
		    orderNumber = fmTradeOrderAuditEntityMapper.countByExample(example);
		    
			return orderNumber;
		}

		@Override
		public List<FmTradeGoodsEntity> getAllGoods() {
			// TODO Auto-generated method stub
			List<FmTradeGoodsEntity> goodsList = new ArrayList<FmTradeGoodsEntity>();
			
			goodsList = fmTradeGoodsEntityMapper.selectAllGoods();
			return goodsList;
		}

		@Override
		public List<FmTradeContactEntity> getContact(Integer accountId) {
			// TODO Auto-generated method stub
			List<FmTradeContactEntity> contactList = new ArrayList<FmTradeContactEntity>();
			contactList = fmTradeContactEntityMapper.selectByAccountId(accountId);
			return contactList;
		}
}
