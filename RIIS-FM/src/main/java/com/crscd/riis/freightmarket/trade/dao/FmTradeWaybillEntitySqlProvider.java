package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntityExample.Criterion;
import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntityExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeWaybillEntitySqlProvider {

    public String countByExample(FmTradeWaybillEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_waybill");
        applyWhere(sql, example, false);
        return sql.toString();
    }
    
    /*运单分页动态查询*/
    public String selectWithParam(Map<String, Object> params) {
    	String sql = new SQL() {
    		{
    			SELECT("id");
    			SELECT("I_ORDER_ID");
    			SELECT("I_ORDER_TYPE_ID");
    			SELECT("I_ORDER_TYPE_NUM");
    			SELECT("C_WAYBILL_CODE");
    			SELECT("D_WAYBILL_CREATE_TIME");
    			SELECT("I_WAYBILL_STATE");
    			SELECT("D_WAYBILL_TIME");
    			SELECT("D_WAYBILL_DATELINE");
    			SELECT("D_WAYBILL_PREDICT_ARRIVE_TIME");
    			SELECT("D_WAYBILL_PREDICT_UNLOAD_START_TIME");
    			SELECT("D_WAYBILL_PREDICT_UNLOAD_END_TIME");
    			SELECT("D_WAYBILL_PREDICT_SENDER_TIME");
    			SELECT("D_WAYBILL_PREDICT_LOAD_START_TIME");
    			SELECT("D_WAYBILL_PREDICT_LOAD_END_TIME");
    			SELECT("I_WAYBILL_BOX_SEAL_NUM");
    			SELECT("I_WAYBILL_BOX_TYPE");
    			SELECT("I_WAYBILL_BOX_NUM");
    			SELECT("I_WAYBILL_GOODS_REINFORCE");
    			SELECT("I_WAYBILL_GOODS_WRAPPER");
    			SELECT("F_WAYBILL_CANVAS_NUMBER");
    			SELECT("F_WAYBILL_TRAIN_TYPE");
    			SELECT("C_WAYBILL_TRAIN_NUM");
    			SELECT("I_WAYBILL_TRAIN_NUMBER_CHARGE");
    			SELECT("I_WAYBILL_BOX_NUMBER_CHARGE");
    			SELECT("I_WAYBILL_GOODS_NUMBER_CHARGE");
    			SELECT("I_PRICE_NO");
    			SELECT("F_PRICE_RATE");
    			SELECT("F_WAYBILL_INCIDENTALS_PAID");
    			SELECT("F_WAYBILL_ELECTRICT_FEE");
    			SELECT("F_WAYBILL_CONSTRUCT_FEE");
    			SELECT("I_WAYBILL_PAYMENT_METHOD");
    			SELECT("I_WAYBILL_PAYMENT_STATE");
    			SELECT("F_WAYBILL_SENDER_REPORT_WEIGHT");
    			SELECT("F_WAYBILL_RECVER_REPORT_WEIGHT");
    			SELECT("F_WAYBILL_WEIGHT_CHARGE");
    			SELECT("I_WAYBILL_SENDER_REPORT_TRAIN_NUMBER");
    			SELECT("I_WAYBILL_RECVER_REPORT_TRAIN_NUMBER");
    			SELECT("I_WAYBILL_SENDER_REPORT_BOX_NUMBER");
    			SELECT("I_WAYBILL_RECVER_REPORT_BOX_NUMBER");
    			SELECT("I_WAYBILL_SENDER_REPORT_GOODS_NUMBER");
    			SELECT("I_WAYBILL_RECVER_REPORT_GOODS_NUMBER");
    			FROM("fm_trade_waybill");
    			
    			/*循环查询所有iOrderId的记录*/
    			if(params.get("iOrderIdList") != null) {
    				
    				List<Object> waybillList = new ArrayList<Object>();
    				waybillList = (List<Object>) params.get("iOrderIdList");
    				
    				for (int i = 0; i<waybillList.size(); i++) {
    					String code = String.valueOf(i);
    					String orderId = "iOrderId"+code;
    					params.put(orderId, waybillList.get(i));
    					OR();
    					WHERE("I_ORDER_ID = #{"+"iOrderId"+code+"}");
    				}
    			}
    			if(params.get("iOrderTypeId") != null) {
    				WHERE("I_ORDER_TYPE_ID = #{iOrderTypeId}");
    			}
    			if(params.get("iOrderTypeNum") != null) {
    				WHERE("I_ORDER_TYPE_NUM = #{iOrderTypeNum}");
    			}
    			if(params.get("cWaybillCode") != null) {
    				WHERE("C_WAYBILL_CODE = #{cWaybillCode}");
    			}
    			if(params.get("dWaybillCreateTimeStart") != null && params.get("dWaybillCreateTimeEnd") != null) {
    				WHERE("D_WAYBILL_CREATE_TIME >= #{dWaybillCreateTimeStart} AND D_WAYBILL_CREATE_TIME <= #{dWaybillCreateTimeEnd}");
    			}
    			if(params.get("iWaybillState") != null) {
    				WHERE("I_WAYBILL_STATE = #{iWaybillState}");
    			}
    			if(params.get("iWaybillBoxSealNum") != null) {
    				WHERE("I_WAYBILL_BOX_SEAL_NUM = #{iWaybillBoxSealNum}");
    			}
    			if(params.get("iWaybillBoxType") != null) {
    				WHERE("I_WAYBILL_BOX_TYPE = #{iWaybillBoxType}");
    			}
    			if(params.get("iWaybillBoxNum") != null) {
    				WHERE("I_WAYBILL_BOX_NUM = #{iWaybillBoxNum}");
    			}
    			if(params.get("iWaybillGoodsReinforce") != null) {
    				WHERE("I_WAYBILL_GOODS_REINFORCE = #{iWaybillGoodsReinforce}");
    			}
    			if(params.get("iWaybillGoodsWrapper") != null) {
    				WHERE("I_WAYBILL_GOODS_WRAPPER = #{iWaybillGoodsWrapper}");
    			}
    			if(params.get("fWaybillCanvasNumber") != null) {
    				WHERE("F_WAYBILL_CANVAS_NUMBER = #{fWaybillCanvasNumber}");
    			}
    			if(params.get("fWaybillTrainType") != null) {
    				WHERE("F_WAYBILL_TRAIN_TYPE = #{fWaybillTrainType}");
    			}
    			if(params.get("cWaybillTrainNum") != null) {
    				WHERE("C_WAYBILL_TRAIN_NUM = #{cWaybillTrainNum}");
    			}
    			if(params.get("iWaybillTrainNumberCharge") != null) {
    				WHERE("I_WAYBILL_TRAIN_NUMBER_CHARGE = #{iWaybillTrainNumberCharge}");
    			}
    			if(params.get("iWaybillBoxNumberCharge") != null) {
    				WHERE("I_WAYBILL_BOX_NUMBER_CHARGE = #{iWaybillBoxNumberCharge}");
    			}
    			if(params.get("iWaybillGoodsNumberCharge") != null) {
    				WHERE("I_WAYBILL_GOODS_NUMBER_CHARGE = #{iWaybillGoodsNumberCharge}");
    			}
    			if(params.get("iPriceNo") != null) {
    				WHERE("I_PRICE_NO = #{iPriceNo}");
    			}
    			if(params.get("fPriceRate") != null) {
    				WHERE("F_PRICE_RATE = #{fPriceRate}");
    			}
    			if(params.get("fWaybillIncidentalsPaid") != null) {
    				WHERE("F_WAYBILL_INCIDENTALS_PAID = #{fWaybillIncidentalsPaid}");
    			}
    			if(params.get("fWaybillElectrictFee") != null) {
    				WHERE("F_WAYBILL_ELECTRICT_FEE = #{fWaybillElectrictFee}");
    			}
    			if(params.get("fWaybillConstructFee") != null) {
    				WHERE("F_WAYBILL_CONSTRUCT_FEE = #{fWaybillConstructFee}");
    			}
    			if(params.get("iWaybillPaymentMethod") != null) {
    				WHERE("I_WAYBILL_PAYMENT_METHOD = #{iWaybillPaymentMethod}");
    			}
    			if(params.get("iWaybillPaymentState") != null) {
    				WHERE("I_WAYBILL_PAYMENT_STATE = #{iWaybillPaymentState}");
    			}
    			if(params.get("fWaybillSenderReportWeight") != null) {
    				WHERE("F_WAYBILL_SENDER_REPORT_WEIGHT = #{fWaybillSenderReportWeight}");
    			}
    			if(params.get("fWaybillRecverReportWeight") != null) {
    				WHERE("F_WAYBILL_RECVER_REPORT_WEIGHT = #{fWaybillRecverReportWeight}");
    			}
    			if(params.get("fWaybillWeightCharge") != null) {
    				WHERE("F_WAYBILL_WEIGHT_CHARGE = #{fWaybillWeightCharge}");
    			}
    			if(params.get("iWaybillSenderReportTrainNumber") != null) {
    				WHERE("I_WAYBILL_SENDER_REPORT_TRAIN_NUMBER = #{iWaybillSenderReportTrainNumber}");
    			}
    			if(params.get("iWaybillRecverReportTrainNumber") != null) {
    				WHERE("I_WAYBILL_RECVER_REPORT_TRAIN_NUMBER = #{iWaybillRecverReportTrainNumber}");
    			}
    			if(params.get("iWaybillSenderReportBoxNumber") != null) {
    				WHERE("I_WAYBILL_SENDER_REPORT_BOX_NUMBER = #{iWaybillSenderReportBoxNumber}");
    			}
    			if(params.get("iWaybillRecverReportBoxNumber") != null) {
    				WHERE("I_WAYBILL_RECVER_REPORT_BOX_NUMBER = #{iWaybillRecverReportBoxNumber}");
    			}
    			if(params.get("iWaybillSenderReportGoodsNumber") != null) {
    				WHERE("I_WAYBILL_SENDER_REPORT_GOODS_NUMBER = #{iWaybillSenderReportGoodsNumber}");
    			}
    			if(params.get("iWaybillRecverReportGoodsNumber") != null) {
    				WHERE("I_WAYBILL_RECVER_REPORT_GOODS_NUMBER = #{iWaybillRecverReportGoodsNumber}");
    			}
    			if(params.get("dWaybillTimeStart") != null && params.get("dWaybillTimeEnd") != null) {
    				WHERE("D_WAYBILL_TIME >= #{dWaybillTimeStart} AND D_WAYBILL_TIME <= #{dWaybillTimeEnd}");
    			}
    			if(params.get("dWaybillDatelineStart") != null && params.get("dWaybillDatelineEnd") != null) {
    				WHERE("D_WAYBILL_DATELINE >= #{dWaybillDatelineStart} AND D_WAYBILL_DATELINE <= #{dWaybillDatelineEnd}");
    			}
    			if(params.get("dWaybillPredictArriveTimeStart") != null && params.get("dWaybillPredictArriveTimeEnd") != null) {
    				WHERE("D_WAYBILL_PREDICT_ARRIVE_TIME >= #{dWaybillPredictArriveTimeStart} AND D_WAYBILL_PREDICT_ARRIVE_TIME <= #{dWaybillPredictArriveTimeEnd}");
    			}
    			if(params.get("dWaybillPredictUnloadStartTimeStart") != null && params.get("dWaybillPredictUnloadStartTimeEnd") != null) {
    				WHERE("D_WAYBILL_PREDICT_UNLOAD_START_TIME >= #{dWaybillPredictUnloadStartTimeStart} AND D_WAYBILL_PREDICT_UNLOAD_START_TIME <= #{dWaybillPredictUnloadStartTimeEnd}");
    			}
    			if(params.get("dWaybillPredictUnloadEndTimeStart") != null && params.get("dWaybillPredictUnloadEndTimeEnd") != null) {
    				WHERE("D_WAYBILL_PREDICT_UNLOAD_END_TIME >= #{dWaybillPredictUnloadEndTimeStart} AND D_WAYBILL_PREDICT_UNLOAD_END_TIME <= #{dWaybillPredictUnloadEndTimeEnd}");
    			}
    			if(params.get("dWaybillPredictSenderTimeStart") != null && params.get("dWaybillPredictSenderTimeEnd") != null) {
    				WHERE("D_WAYBILL_PREDICT_SENDER_TIME >= #{dWaybillPredictSenderTimeStart} AND D_WAYBILL_PREDICT_SENDER_TIME <= #{dWaybillPredictSenderTimeEnd}");
    			}
    			if(params.get("dWaybillPredictLoadStartTimeStart") != null && params.get("dWaybillPredictLoadStartTimeEnd") != null) {
    				WHERE("D_WAYBILL_PREDICT_LOAD_START_TIME >= #{dWaybillPredictLoadStartTimeStart} AND D_WAYBILL_PREDICT_LOAD_START_TIME <= #{dWaybillPredictLoadStartTimeEnd}");
    			}
    			if(params.get("dWaybillPredictLoadEndTimeStart") != null && params.get("dWaybillPredictLoadEndTimeEnd") != null) {
    				WHERE("D_WAYBILL_PREDICT_LOAD_END_TIME >= #{dWaybillPredictLoadEndTimeStart} AND D_WAYBILL_PREDICT_LOAD_END_TIME <= #{dWaybillPredictLoadEndTimeEnd}");
    			}
    		}
    	}.toString();
    	if(params.get("pageModel") != null){
			sql += " limit #{pageModel.firstLimitParam} , #{pageModel.pageSize}  ";
		}
		System.out.println(sql);
		return sql;
    }


    public String deleteByExample(FmTradeWaybillEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_waybill");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeWaybillEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_waybill");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderId() != null) {
            sql.VALUES("I_ORDER_ID", "#{iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.VALUES("I_ORDER_TYPE_ID", "#{iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeNum() != null) {
            sql.VALUES("I_ORDER_TYPE_NUM", "#{iOrderTypeNum,jdbcType=INTEGER}");
        }
        
        if (record.getcWaybillCode() != null) {
            sql.VALUES("C_WAYBILL_CODE", "#{cWaybillCode,jdbcType=VARCHAR}");
        }
        
        if (record.getdWaybillCreateTime() != null) {
            sql.VALUES("D_WAYBILL_CREATE_TIME", "#{dWaybillCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiWaybillState() != null) {
            sql.VALUES("I_WAYBILL_STATE", "#{iWaybillState,jdbcType=INTEGER}");
        }
        
        if (record.getdWaybillTime() != null) {
            sql.VALUES("D_WAYBILL_TIME", "#{dWaybillTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillDateline() != null) {
            sql.VALUES("D_WAYBILL_DATELINE", "#{dWaybillDateline,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictArriveTime() != null) {
            sql.VALUES("D_WAYBILL_PREDICT_ARRIVE_TIME", "#{dWaybillPredictArriveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictUnloadStartTime() != null) {
            sql.VALUES("D_WAYBILL_PREDICT_UNLOAD_START_TIME", "#{dWaybillPredictUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictUnloadEndTime() != null) {
            sql.VALUES("D_WAYBILL_PREDICT_UNLOAD_END_TIME", "#{dWaybillPredictUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictSenderTime() != null) {
            sql.VALUES("D_WAYBILL_PREDICT_SENDER_TIME", "#{dWaybillPredictSenderTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictLoadStartTime() != null) {
            sql.VALUES("D_WAYBILL_PREDICT_LOAD_START_TIME", "#{dWaybillPredictLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictLoadEndTime() != null) {
            sql.VALUES("D_WAYBILL_PREDICT_LOAD_END_TIME", "#{dWaybillPredictLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiWaybillBoxSealNum() != null) {
            sql.VALUES("I_WAYBILL_BOX_SEAL_NUM", "#{iWaybillBoxSealNum,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillBoxType() != null) {
            sql.VALUES("I_WAYBILL_BOX_TYPE", "#{iWaybillBoxType,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillBoxNum() != null) {
            sql.VALUES("I_WAYBILL_BOX_NUM", "#{iWaybillBoxNum,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillGoodsReinforce() != null) {
            sql.VALUES("I_WAYBILL_GOODS_REINFORCE", "#{iWaybillGoodsReinforce,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillGoodsWrapper() != null) {
            sql.VALUES("I_WAYBILL_GOODS_WRAPPER", "#{iWaybillGoodsWrapper,jdbcType=INTEGER}");
        }
        
        if (record.getfWaybillCanvasNumber() != null) {
            sql.VALUES("F_WAYBILL_CANVAS_NUMBER", "#{fWaybillCanvasNumber,jdbcType=REAL}");
        }
        
        if (record.getfWaybillTrainType() != null) {
            sql.VALUES("F_WAYBILL_TRAIN_TYPE", "#{fWaybillTrainType,jdbcType=REAL}");
        }
        
        if (record.getcWaybillTrainNum() != null) {
            sql.VALUES("C_WAYBILL_TRAIN_NUM", "#{cWaybillTrainNum,jdbcType=VARCHAR}");
        }
        
        if (record.getiWaybillTrainNumberCharge() != null) {
            sql.VALUES("I_WAYBILL_TRAIN_NUMBER_CHARGE", "#{iWaybillTrainNumberCharge,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillBoxNumberCharge() != null) {
            sql.VALUES("I_WAYBILL_BOX_NUMBER_CHARGE", "#{iWaybillBoxNumberCharge,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillGoodsNumberCharge() != null) {
            sql.VALUES("I_WAYBILL_GOODS_NUMBER_CHARGE", "#{iWaybillGoodsNumberCharge,jdbcType=INTEGER}");
        }
        
        if (record.getiPriceNo() != null) {
            sql.VALUES("I_PRICE_NO", "#{iPriceNo,jdbcType=INTEGER}");
        }
        
        if (record.getfPriceRate() != null) {
            sql.VALUES("F_PRICE_RATE", "#{fPriceRate,jdbcType=REAL}");
        }
        
        if (record.getfWaybillIncidentalsPaid() != null) {
            sql.VALUES("F_WAYBILL_INCIDENTALS_PAID", "#{fWaybillIncidentalsPaid,jdbcType=REAL}");
        }
        
        if (record.getfWaybillElectrictFee() != null) {
            sql.VALUES("F_WAYBILL_ELECTRICT_FEE", "#{fWaybillElectrictFee,jdbcType=REAL}");
        }
        
        if (record.getfWaybillConstructFee() != null) {
            sql.VALUES("F_WAYBILL_CONSTRUCT_FEE", "#{fWaybillConstructFee,jdbcType=REAL}");
        }
        
        if (record.getiWaybillPaymentMethod() != null) {
            sql.VALUES("I_WAYBILL_PAYMENT_METHOD", "#{iWaybillPaymentMethod,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillPaymentState() != null) {
            sql.VALUES("I_WAYBILL_PAYMENT_STATE", "#{iWaybillPaymentState,jdbcType=INTEGER}");
        }
        
        if (record.getfWaybillSenderReportWeight() != null) {
            sql.VALUES("F_WAYBILL_SENDER_REPORT_WEIGHT", "#{fWaybillSenderReportWeight,jdbcType=REAL}");
        }
        
        if (record.getfWaybillRecverReportWeight() != null) {
            sql.VALUES("F_WAYBILL_RECVER_REPORT_WEIGHT", "#{fWaybillRecverReportWeight,jdbcType=REAL}");
        }
        
        if (record.getfWaybillWeightCharge() != null) {
            sql.VALUES("F_WAYBILL_WEIGHT_CHARGE", "#{fWaybillWeightCharge,jdbcType=REAL}");
        }
        
        if (record.getiWaybillSenderReportTrainNumber() != null) {
            sql.VALUES("I_WAYBILL_SENDER_REPORT_TRAIN_NUMBER", "#{iWaybillSenderReportTrainNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillRecverReportTrainNumber() != null) {
            sql.VALUES("I_WAYBILL_RECVER_REPORT_TRAIN_NUMBER", "#{iWaybillRecverReportTrainNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillSenderReportBoxNumber() != null) {
            sql.VALUES("I_WAYBILL_SENDER_REPORT_BOX_NUMBER", "#{iWaybillSenderReportBoxNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillRecverReportBoxNumber() != null) {
            sql.VALUES("I_WAYBILL_RECVER_REPORT_BOX_NUMBER", "#{iWaybillRecverReportBoxNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillSenderReportGoodsNumber() != null) {
            sql.VALUES("I_WAYBILL_SENDER_REPORT_GOODS_NUMBER", "#{iWaybillSenderReportGoodsNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillRecverReportGoodsNumber() != null) {
            sql.VALUES("I_WAYBILL_RECVER_REPORT_GOODS_NUMBER", "#{iWaybillRecverReportGoodsNumber,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeWaybillEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("I_ORDER_ID");
        sql.SELECT("I_ORDER_TYPE_ID");
        sql.SELECT("I_ORDER_TYPE_NUM");
        sql.SELECT("C_WAYBILL_CODE");
        sql.SELECT("D_WAYBILL_CREATE_TIME");
        sql.SELECT("I_WAYBILL_STATE");
        sql.SELECT("D_WAYBILL_TIME");
        sql.SELECT("D_WAYBILL_DATELINE");
        sql.SELECT("D_WAYBILL_PREDICT_ARRIVE_TIME");
        sql.SELECT("D_WAYBILL_PREDICT_UNLOAD_START_TIME");
        sql.SELECT("D_WAYBILL_PREDICT_UNLOAD_END_TIME");
        sql.SELECT("D_WAYBILL_PREDICT_SENDER_TIME");
        sql.SELECT("D_WAYBILL_PREDICT_LOAD_START_TIME");
        sql.SELECT("D_WAYBILL_PREDICT_LOAD_END_TIME");
        sql.SELECT("I_WAYBILL_BOX_SEAL_NUM");
        sql.SELECT("I_WAYBILL_BOX_TYPE");
        sql.SELECT("I_WAYBILL_BOX_NUM");
        sql.SELECT("I_WAYBILL_GOODS_REINFORCE");
        sql.SELECT("I_WAYBILL_GOODS_WRAPPER");
        sql.SELECT("F_WAYBILL_CANVAS_NUMBER");
        sql.SELECT("F_WAYBILL_TRAIN_TYPE");
        sql.SELECT("C_WAYBILL_TRAIN_NUM");
        sql.SELECT("I_WAYBILL_TRAIN_NUMBER_CHARGE");
        sql.SELECT("I_WAYBILL_BOX_NUMBER_CHARGE");
        sql.SELECT("I_WAYBILL_GOODS_NUMBER_CHARGE");
        sql.SELECT("I_PRICE_NO");
        sql.SELECT("F_PRICE_RATE");
        sql.SELECT("F_WAYBILL_INCIDENTALS_PAID");
        sql.SELECT("F_WAYBILL_ELECTRICT_FEE");
        sql.SELECT("F_WAYBILL_CONSTRUCT_FEE");
        sql.SELECT("I_WAYBILL_PAYMENT_METHOD");
        sql.SELECT("I_WAYBILL_PAYMENT_STATE");
        sql.SELECT("F_WAYBILL_SENDER_REPORT_WEIGHT");
        sql.SELECT("F_WAYBILL_RECVER_REPORT_WEIGHT");
        sql.SELECT("F_WAYBILL_WEIGHT_CHARGE");
        sql.SELECT("I_WAYBILL_SENDER_REPORT_TRAIN_NUMBER");
        sql.SELECT("I_WAYBILL_RECVER_REPORT_TRAIN_NUMBER");
        sql.SELECT("I_WAYBILL_SENDER_REPORT_BOX_NUMBER");
        sql.SELECT("I_WAYBILL_RECVER_REPORT_BOX_NUMBER");
        sql.SELECT("I_WAYBILL_SENDER_REPORT_GOODS_NUMBER");
        sql.SELECT("I_WAYBILL_RECVER_REPORT_GOODS_NUMBER");
        sql.FROM("fm_trade_waybill");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeWaybillEntity record = (FmTradeWaybillEntity) parameter.get("record");
        FmTradeWaybillEntityExample example = (FmTradeWaybillEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_waybill");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderId() != null) {
            sql.SET("I_ORDER_ID = #{record.iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.SET("I_ORDER_TYPE_ID = #{record.iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeNum() != null) {
            sql.SET("I_ORDER_TYPE_NUM = #{record.iOrderTypeNum,jdbcType=INTEGER}");
        }
        
        if (record.getcWaybillCode() != null) {
            sql.SET("C_WAYBILL_CODE = #{record.cWaybillCode,jdbcType=VARCHAR}");
        }
        
        if (record.getdWaybillCreateTime() != null) {
            sql.SET("D_WAYBILL_CREATE_TIME = #{record.dWaybillCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiWaybillState() != null) {
            sql.SET("I_WAYBILL_STATE = #{record.iWaybillState,jdbcType=INTEGER}");
        }
        
        if (record.getdWaybillTime() != null) {
            sql.SET("D_WAYBILL_TIME = #{record.dWaybillTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillDateline() != null) {
            sql.SET("D_WAYBILL_DATELINE = #{record.dWaybillDateline,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictArriveTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_ARRIVE_TIME = #{record.dWaybillPredictArriveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictUnloadStartTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_UNLOAD_START_TIME = #{record.dWaybillPredictUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictUnloadEndTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_UNLOAD_END_TIME = #{record.dWaybillPredictUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictSenderTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_SENDER_TIME = #{record.dWaybillPredictSenderTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictLoadStartTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_LOAD_START_TIME = #{record.dWaybillPredictLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictLoadEndTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_LOAD_END_TIME = #{record.dWaybillPredictLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiWaybillBoxSealNum() != null) {
            sql.SET("I_WAYBILL_BOX_SEAL_NUM = #{record.iWaybillBoxSealNum,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillBoxType() != null) {
            sql.SET("I_WAYBILL_BOX_TYPE = #{record.iWaybillBoxType,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillBoxNum() != null) {
            sql.SET("I_WAYBILL_BOX_NUM = #{record.iWaybillBoxNum,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillGoodsReinforce() != null) {
            sql.SET("I_WAYBILL_GOODS_REINFORCE = #{record.iWaybillGoodsReinforce,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillGoodsWrapper() != null) {
            sql.SET("I_WAYBILL_GOODS_WRAPPER = #{record.iWaybillGoodsWrapper,jdbcType=INTEGER}");
        }
        
        if (record.getfWaybillCanvasNumber() != null) {
            sql.SET("F_WAYBILL_CANVAS_NUMBER = #{record.fWaybillCanvasNumber,jdbcType=REAL}");
        }
        
        if (record.getfWaybillTrainType() != null) {
            sql.SET("F_WAYBILL_TRAIN_TYPE = #{record.fWaybillTrainType,jdbcType=REAL}");
        }
        
        if (record.getcWaybillTrainNum() != null) {
            sql.SET("C_WAYBILL_TRAIN_NUM = #{record.cWaybillTrainNum,jdbcType=VARCHAR}");
        }
        
        if (record.getiWaybillTrainNumberCharge() != null) {
            sql.SET("I_WAYBILL_TRAIN_NUMBER_CHARGE = #{record.iWaybillTrainNumberCharge,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillBoxNumberCharge() != null) {
            sql.SET("I_WAYBILL_BOX_NUMBER_CHARGE = #{record.iWaybillBoxNumberCharge,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillGoodsNumberCharge() != null) {
            sql.SET("I_WAYBILL_GOODS_NUMBER_CHARGE = #{record.iWaybillGoodsNumberCharge,jdbcType=INTEGER}");
        }
        
        if (record.getiPriceNo() != null) {
            sql.SET("I_PRICE_NO = #{record.iPriceNo,jdbcType=INTEGER}");
        }
        
        if (record.getfPriceRate() != null) {
            sql.SET("F_PRICE_RATE = #{record.fPriceRate,jdbcType=REAL}");
        }
        
        if (record.getfWaybillIncidentalsPaid() != null) {
            sql.SET("F_WAYBILL_INCIDENTALS_PAID = #{record.fWaybillIncidentalsPaid,jdbcType=REAL}");
        }
        
        if (record.getfWaybillElectrictFee() != null) {
            sql.SET("F_WAYBILL_ELECTRICT_FEE = #{record.fWaybillElectrictFee,jdbcType=REAL}");
        }
        
        if (record.getfWaybillConstructFee() != null) {
            sql.SET("F_WAYBILL_CONSTRUCT_FEE = #{record.fWaybillConstructFee,jdbcType=REAL}");
        }
        
        if (record.getiWaybillPaymentMethod() != null) {
            sql.SET("I_WAYBILL_PAYMENT_METHOD = #{record.iWaybillPaymentMethod,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillPaymentState() != null) {
            sql.SET("I_WAYBILL_PAYMENT_STATE = #{record.iWaybillPaymentState,jdbcType=INTEGER}");
        }
        
        if (record.getfWaybillSenderReportWeight() != null) {
            sql.SET("F_WAYBILL_SENDER_REPORT_WEIGHT = #{record.fWaybillSenderReportWeight,jdbcType=REAL}");
        }
        
        if (record.getfWaybillRecverReportWeight() != null) {
            sql.SET("F_WAYBILL_RECVER_REPORT_WEIGHT = #{record.fWaybillRecverReportWeight,jdbcType=REAL}");
        }
        
        if (record.getfWaybillWeightCharge() != null) {
            sql.SET("F_WAYBILL_WEIGHT_CHARGE = #{record.fWaybillWeightCharge,jdbcType=REAL}");
        }
        
        if (record.getiWaybillSenderReportTrainNumber() != null) {
            sql.SET("I_WAYBILL_SENDER_REPORT_TRAIN_NUMBER = #{record.iWaybillSenderReportTrainNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillRecverReportTrainNumber() != null) {
            sql.SET("I_WAYBILL_RECVER_REPORT_TRAIN_NUMBER = #{record.iWaybillRecverReportTrainNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillSenderReportBoxNumber() != null) {
            sql.SET("I_WAYBILL_SENDER_REPORT_BOX_NUMBER = #{record.iWaybillSenderReportBoxNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillRecverReportBoxNumber() != null) {
            sql.SET("I_WAYBILL_RECVER_REPORT_BOX_NUMBER = #{record.iWaybillRecverReportBoxNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillSenderReportGoodsNumber() != null) {
            sql.SET("I_WAYBILL_SENDER_REPORT_GOODS_NUMBER = #{record.iWaybillSenderReportGoodsNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillRecverReportGoodsNumber() != null) {
            sql.SET("I_WAYBILL_RECVER_REPORT_GOODS_NUMBER = #{record.iWaybillRecverReportGoodsNumber,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_waybill");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("I_ORDER_ID = #{record.iOrderId,jdbcType=INTEGER}");
        sql.SET("I_ORDER_TYPE_ID = #{record.iOrderTypeId,jdbcType=INTEGER}");
        sql.SET("I_ORDER_TYPE_NUM = #{record.iOrderTypeNum,jdbcType=INTEGER}");
        sql.SET("C_WAYBILL_CODE = #{record.cWaybillCode,jdbcType=VARCHAR}");
        sql.SET("D_WAYBILL_CREATE_TIME = #{record.dWaybillCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("I_WAYBILL_STATE = #{record.iWaybillState,jdbcType=INTEGER}");
        sql.SET("D_WAYBILL_TIME = #{record.dWaybillTime,jdbcType=TIMESTAMP}");
        sql.SET("D_WAYBILL_DATELINE = #{record.dWaybillDateline,jdbcType=TIMESTAMP}");
        sql.SET("D_WAYBILL_PREDICT_ARRIVE_TIME = #{record.dWaybillPredictArriveTime,jdbcType=TIMESTAMP}");
        sql.SET("D_WAYBILL_PREDICT_UNLOAD_START_TIME = #{record.dWaybillPredictUnloadStartTime,jdbcType=TIMESTAMP}");
        sql.SET("D_WAYBILL_PREDICT_UNLOAD_END_TIME = #{record.dWaybillPredictUnloadEndTime,jdbcType=TIMESTAMP}");
        sql.SET("D_WAYBILL_PREDICT_SENDER_TIME = #{record.dWaybillPredictSenderTime,jdbcType=TIMESTAMP}");
        sql.SET("D_WAYBILL_PREDICT_LOAD_START_TIME = #{record.dWaybillPredictLoadStartTime,jdbcType=TIMESTAMP}");
        sql.SET("D_WAYBILL_PREDICT_LOAD_END_TIME = #{record.dWaybillPredictLoadEndTime,jdbcType=TIMESTAMP}");
        sql.SET("I_WAYBILL_BOX_SEAL_NUM = #{record.iWaybillBoxSealNum,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_BOX_TYPE = #{record.iWaybillBoxType,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_BOX_NUM = #{record.iWaybillBoxNum,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_GOODS_REINFORCE = #{record.iWaybillGoodsReinforce,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_GOODS_WRAPPER = #{record.iWaybillGoodsWrapper,jdbcType=INTEGER}");
        sql.SET("F_WAYBILL_CANVAS_NUMBER = #{record.fWaybillCanvasNumber,jdbcType=REAL}");
        sql.SET("F_WAYBILL_TRAIN_TYPE = #{record.fWaybillTrainType,jdbcType=REAL}");
        sql.SET("C_WAYBILL_TRAIN_NUM = #{record.cWaybillTrainNum,jdbcType=VARCHAR}");
        sql.SET("I_WAYBILL_TRAIN_NUMBER_CHARGE = #{record.iWaybillTrainNumberCharge,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_BOX_NUMBER_CHARGE = #{record.iWaybillBoxNumberCharge,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_GOODS_NUMBER_CHARGE = #{record.iWaybillGoodsNumberCharge,jdbcType=INTEGER}");
        sql.SET("I_PRICE_NO = #{record.iPriceNo,jdbcType=INTEGER}");
        sql.SET("F_PRICE_RATE = #{record.fPriceRate,jdbcType=REAL}");
        sql.SET("F_WAYBILL_INCIDENTALS_PAID = #{record.fWaybillIncidentalsPaid,jdbcType=REAL}");
        sql.SET("F_WAYBILL_ELECTRICT_FEE = #{record.fWaybillElectrictFee,jdbcType=REAL}");
        sql.SET("F_WAYBILL_CONSTRUCT_FEE = #{record.fWaybillConstructFee,jdbcType=REAL}");
        sql.SET("I_WAYBILL_PAYMENT_METHOD = #{record.iWaybillPaymentMethod,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_PAYMENT_STATE = #{record.iWaybillPaymentState,jdbcType=INTEGER}");
        sql.SET("F_WAYBILL_SENDER_REPORT_WEIGHT = #{record.fWaybillSenderReportWeight,jdbcType=REAL}");
        sql.SET("F_WAYBILL_RECVER_REPORT_WEIGHT = #{record.fWaybillRecverReportWeight,jdbcType=REAL}");
        sql.SET("F_WAYBILL_WEIGHT_CHARGE = #{record.fWaybillWeightCharge,jdbcType=REAL}");
        sql.SET("I_WAYBILL_SENDER_REPORT_TRAIN_NUMBER = #{record.iWaybillSenderReportTrainNumber,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_RECVER_REPORT_TRAIN_NUMBER = #{record.iWaybillRecverReportTrainNumber,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_SENDER_REPORT_BOX_NUMBER = #{record.iWaybillSenderReportBoxNumber,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_RECVER_REPORT_BOX_NUMBER = #{record.iWaybillRecverReportBoxNumber,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_SENDER_REPORT_GOODS_NUMBER = #{record.iWaybillSenderReportGoodsNumber,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_RECVER_REPORT_GOODS_NUMBER = #{record.iWaybillRecverReportGoodsNumber,jdbcType=INTEGER}");
        
        FmTradeWaybillEntityExample example = (FmTradeWaybillEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeWaybillEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_waybill");
        
        if (record.getiOrderId() != null) {
            sql.SET("I_ORDER_ID = #{iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.SET("I_ORDER_TYPE_ID = #{iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeNum() != null) {
            sql.SET("I_ORDER_TYPE_NUM = #{iOrderTypeNum,jdbcType=INTEGER}");
        }
        
        if (record.getcWaybillCode() != null) {
            sql.SET("C_WAYBILL_CODE = #{cWaybillCode,jdbcType=VARCHAR}");
        }
        
        if (record.getdWaybillCreateTime() != null) {
            sql.SET("D_WAYBILL_CREATE_TIME = #{dWaybillCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiWaybillState() != null) {
            sql.SET("I_WAYBILL_STATE = #{iWaybillState,jdbcType=INTEGER}");
        }
        
        if (record.getdWaybillTime() != null) {
            sql.SET("D_WAYBILL_TIME = #{dWaybillTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillDateline() != null) {
            sql.SET("D_WAYBILL_DATELINE = #{dWaybillDateline,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictArriveTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_ARRIVE_TIME = #{dWaybillPredictArriveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictUnloadStartTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_UNLOAD_START_TIME = #{dWaybillPredictUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictUnloadEndTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_UNLOAD_END_TIME = #{dWaybillPredictUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictSenderTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_SENDER_TIME = #{dWaybillPredictSenderTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictLoadStartTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_LOAD_START_TIME = #{dWaybillPredictLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdWaybillPredictLoadEndTime() != null) {
            sql.SET("D_WAYBILL_PREDICT_LOAD_END_TIME = #{dWaybillPredictLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiWaybillBoxSealNum() != null) {
            sql.SET("I_WAYBILL_BOX_SEAL_NUM = #{iWaybillBoxSealNum,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillBoxType() != null) {
            sql.SET("I_WAYBILL_BOX_TYPE = #{iWaybillBoxType,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillBoxNum() != null) {
            sql.SET("I_WAYBILL_BOX_NUM = #{iWaybillBoxNum,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillGoodsReinforce() != null) {
            sql.SET("I_WAYBILL_GOODS_REINFORCE = #{iWaybillGoodsReinforce,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillGoodsWrapper() != null) {
            sql.SET("I_WAYBILL_GOODS_WRAPPER = #{iWaybillGoodsWrapper,jdbcType=INTEGER}");
        }
        
        if (record.getfWaybillCanvasNumber() != null) {
            sql.SET("F_WAYBILL_CANVAS_NUMBER = #{fWaybillCanvasNumber,jdbcType=REAL}");
        }
        
        if (record.getfWaybillTrainType() != null) {
            sql.SET("F_WAYBILL_TRAIN_TYPE = #{fWaybillTrainType,jdbcType=REAL}");
        }
        
        if (record.getcWaybillTrainNum() != null) {
            sql.SET("C_WAYBILL_TRAIN_NUM = #{cWaybillTrainNum,jdbcType=VARCHAR}");
        }
        
        if (record.getiWaybillTrainNumberCharge() != null) {
            sql.SET("I_WAYBILL_TRAIN_NUMBER_CHARGE = #{iWaybillTrainNumberCharge,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillBoxNumberCharge() != null) {
            sql.SET("I_WAYBILL_BOX_NUMBER_CHARGE = #{iWaybillBoxNumberCharge,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillGoodsNumberCharge() != null) {
            sql.SET("I_WAYBILL_GOODS_NUMBER_CHARGE = #{iWaybillGoodsNumberCharge,jdbcType=INTEGER}");
        }
        
        if (record.getiPriceNo() != null) {
            sql.SET("I_PRICE_NO = #{iPriceNo,jdbcType=INTEGER}");
        }
        
        if (record.getfPriceRate() != null) {
            sql.SET("F_PRICE_RATE = #{fPriceRate,jdbcType=REAL}");
        }
        
        if (record.getfWaybillIncidentalsPaid() != null) {
            sql.SET("F_WAYBILL_INCIDENTALS_PAID = #{fWaybillIncidentalsPaid,jdbcType=REAL}");
        }
        
        if (record.getfWaybillElectrictFee() != null) {
            sql.SET("F_WAYBILL_ELECTRICT_FEE = #{fWaybillElectrictFee,jdbcType=REAL}");
        }
        
        if (record.getfWaybillConstructFee() != null) {
            sql.SET("F_WAYBILL_CONSTRUCT_FEE = #{fWaybillConstructFee,jdbcType=REAL}");
        }
        
        if (record.getiWaybillPaymentMethod() != null) {
            sql.SET("I_WAYBILL_PAYMENT_METHOD = #{iWaybillPaymentMethod,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillPaymentState() != null) {
            sql.SET("I_WAYBILL_PAYMENT_STATE = #{iWaybillPaymentState,jdbcType=INTEGER}");
        }
        
        if (record.getfWaybillSenderReportWeight() != null) {
            sql.SET("F_WAYBILL_SENDER_REPORT_WEIGHT = #{fWaybillSenderReportWeight,jdbcType=REAL}");
        }
        
        if (record.getfWaybillRecverReportWeight() != null) {
            sql.SET("F_WAYBILL_RECVER_REPORT_WEIGHT = #{fWaybillRecverReportWeight,jdbcType=REAL}");
        }
        
        if (record.getfWaybillWeightCharge() != null) {
            sql.SET("F_WAYBILL_WEIGHT_CHARGE = #{fWaybillWeightCharge,jdbcType=REAL}");
        }
        
        if (record.getiWaybillSenderReportTrainNumber() != null) {
            sql.SET("I_WAYBILL_SENDER_REPORT_TRAIN_NUMBER = #{iWaybillSenderReportTrainNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillRecverReportTrainNumber() != null) {
            sql.SET("I_WAYBILL_RECVER_REPORT_TRAIN_NUMBER = #{iWaybillRecverReportTrainNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillSenderReportBoxNumber() != null) {
            sql.SET("I_WAYBILL_SENDER_REPORT_BOX_NUMBER = #{iWaybillSenderReportBoxNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillRecverReportBoxNumber() != null) {
            sql.SET("I_WAYBILL_RECVER_REPORT_BOX_NUMBER = #{iWaybillRecverReportBoxNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillSenderReportGoodsNumber() != null) {
            sql.SET("I_WAYBILL_SENDER_REPORT_GOODS_NUMBER = #{iWaybillSenderReportGoodsNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillRecverReportGoodsNumber() != null) {
            sql.SET("I_WAYBILL_RECVER_REPORT_GOODS_NUMBER = #{iWaybillRecverReportGoodsNumber,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeWaybillEntityExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}