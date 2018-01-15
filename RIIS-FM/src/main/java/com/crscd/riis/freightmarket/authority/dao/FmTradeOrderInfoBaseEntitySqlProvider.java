package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntityExample.Criterion;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeOrderInfoBaseEntitySqlProvider {

    public String countByExample(FmTradeOrderInfoBaseEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_order_info_base");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmTradeOrderInfoBaseEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_order_info_base");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeOrderInfoBaseEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_order_info_base");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getcOrderCode() != null) {
            sql.VALUES("C_ORDER_CODE", "#{cOrderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.VALUES("I_ORDER_TYPE_ID", "#{iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getdOrderDateline() != null) {
            sql.VALUES("D_ORDER_DATELINE", "#{dOrderDateline,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiUserType() != null) {
            sql.VALUES("I_USER_TYPE", "#{iUserType,jdbcType=INTEGER}");
        }
        
        if (record.getiSenderId() != null) {
            sql.VALUES("I_SENDER_ID", "#{iSenderId,jdbcType=INTEGER}");
        }
        
        if (record.getiRecverId() != null) {
            sql.VALUES("I_RECVER_ID", "#{iRecverId,jdbcType=INTEGER}");
        }
        
        if (record.getiSenderOperatorId() != null) {
            sql.VALUES("I_SENDER_OPERATOR_ID", "#{iSenderOperatorId,jdbcType=INTEGER}");
        }
        
        if (record.getiRecverOperatorId() != null) {
            sql.VALUES("I_RECVER_OPERATOR_ID", "#{iRecverOperatorId,jdbcType=INTEGER}");
        }
        
        if (record.getcSenderName() != null) {
            sql.VALUES("C_SENDER_NAME", "#{cSenderName,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderAddress() != null) {
            sql.VALUES("C_SENDER_ADDRESS", "#{cSenderAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderPhone() != null) {
            sql.VALUES("C_SENDER_PHONE", "#{cSenderPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderEmail() != null) {
            sql.VALUES("C_SENDER_EMAIL", "#{cSenderEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderPostcode() != null) {
            sql.VALUES("C_SENDER_POSTCODE", "#{cSenderPostcode,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderNote() != null) {
            sql.VALUES("C_SENDER_NOTE", "#{cSenderNote,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderCity() != null) {
            sql.VALUES("C_SENDER_CITY", "#{cSenderCity,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadStation() != null) {
            sql.VALUES("C_LOAD_STATION", "#{cLoadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadLocation() != null) {
            sql.VALUES("C_LOAD_LOCATION", "#{cLoadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getdPredictSendTime() != null) {
            sql.VALUES("D_PREDICT_SEND_TIME", "#{dPredictSendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdPredictLoadStartTime() != null) {
            sql.VALUES("D_PREDICT_LOAD_START_TIME", "#{dPredictLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdPredictLoadEndTime() != null) {
            sql.VALUES("D_PREDICT_LOAD_END_TIME", "#{dPredictLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcRecverAddress() != null) {
            sql.VALUES("C_RECVER_ADDRESS", "#{cRecverAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverPhone() != null) {
            sql.VALUES("C_RECVER_PHONE", "#{cRecverPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverEmail() != null) {
            sql.VALUES("C_RECVER_EMAIL", "#{cRecverEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverPostcode() != null) {
            sql.VALUES("C_RECVER_POSTCODE", "#{cRecverPostcode,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverCity() != null) {
            sql.VALUES("C_RECVER_CITY", "#{cRecverCity,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadStation() != null) {
            sql.VALUES("C_UNLOAD_STATION", "#{cUnloadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadLocation() != null) {
            sql.VALUES("C_UNLOAD_LOCATION", "#{cUnloadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcOrderType() != null) {
            sql.VALUES("C_ORDER_TYPE", "#{cOrderType,jdbcType=VARCHAR}");
        }
        
        if (record.getiOrderState() != null) {
            sql.VALUES("I_ORDER_STATE", "#{iOrderState,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderSplite() != null) {
            sql.VALUES("I_ORDER_SPLITE", "#{iOrderSplite,jdbcType=INTEGER}");
        }
        
        if (record.getdOrderCreateTime() != null) {
            sql.VALUES("D_ORDER_CREATE_TIME", "#{dOrderCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdOrderEndTime() != null) {
            sql.VALUES("D_ORDER_END_TIME", "#{dOrderEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdOrderTemminateTime() != null) {
            sql.VALUES("D_ORDER_TEMMINATE_TIME", "#{dOrderTemminateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiOrderTemminate() != null) {
            sql.VALUES("I_ORDER_TEMMINATE", "#{iOrderTemminate,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderDelete() != null) {
            sql.VALUES("I_ORDER_DELETE", "#{iOrderDelete,jdbcType=INTEGER}");
        }
        
        if (record.getdOrderDeleteTime() != null) {
            sql.VALUES("D_ORDER_DELETE_TIME", "#{dOrderDeleteTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdOrderAlterTime() != null) {
            sql.VALUES("D_ORDER_ALTER_TIME", "#{dOrderAlterTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcAccessCode() != null) {
            sql.VALUES("C_ACCESS_CODE", "#{cAccessCode,jdbcType=VARCHAR}");
        }
        
        if (record.getiLogisticsType() != null) {
            sql.VALUES("I_LOGISTICS_TYPE", "#{iLogisticsType,jdbcType=INTEGER}");
        }
        
        if (record.getfProtectPrice() != null) {
            sql.VALUES("F_PROTECT_PRICE", "#{fProtectPrice,jdbcType=REAL}");
        }
        
        if (record.getfInsuranceValue() != null) {
            sql.VALUES("F_INSURANCE_VALUE", "#{fInsuranceValue,jdbcType=REAL}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeOrderInfoBaseEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("C_ORDER_CODE");
        sql.SELECT("I_ORDER_TYPE_ID");
        sql.SELECT("D_ORDER_DATELINE");
        sql.SELECT("I_USER_TYPE");
        sql.SELECT("I_SENDER_ID");
        sql.SELECT("I_RECVER_ID");
        sql.SELECT("I_SENDER_OPERATOR_ID");
        sql.SELECT("I_RECVER_OPERATOR_ID");
        sql.SELECT("C_SENDER_NAME");
        sql.SELECT("C_SENDER_ADDRESS");
        sql.SELECT("C_SENDER_PHONE");
        sql.SELECT("C_SENDER_EMAIL");
        sql.SELECT("C_SENDER_POSTCODE");
        sql.SELECT("C_SENDER_NOTE");
        sql.SELECT("C_SENDER_CITY");
        sql.SELECT("C_LOAD_STATION");
        sql.SELECT("C_LOAD_LOCATION");
        sql.SELECT("D_PREDICT_SEND_TIME");
        sql.SELECT("D_PREDICT_LOAD_START_TIME");
        sql.SELECT("D_PREDICT_LOAD_END_TIME");
        sql.SELECT("C_RECVER_ADDRESS");
        sql.SELECT("C_RECVER_PHONE");
        sql.SELECT("C_RECVER_EMAIL");
        sql.SELECT("C_RECVER_POSTCODE");
        sql.SELECT("C_RECVER_CITY");
        sql.SELECT("C_UNLOAD_STATION");
        sql.SELECT("C_UNLOAD_LOCATION");
        sql.SELECT("C_ORDER_TYPE");
        sql.SELECT("I_ORDER_STATE");
        sql.SELECT("I_ORDER_SPLITE");
        sql.SELECT("D_ORDER_CREATE_TIME");
        sql.SELECT("D_ORDER_END_TIME");
        sql.SELECT("D_ORDER_TEMMINATE_TIME");
        sql.SELECT("I_ORDER_TEMMINATE");
        sql.SELECT("I_ORDER_DELETE");
        sql.SELECT("D_ORDER_DELETE_TIME");
        sql.SELECT("D_ORDER_ALTER_TIME");
        sql.SELECT("C_ACCESS_CODE");
        sql.SELECT("I_LOGISTICS_TYPE");
        sql.SELECT("F_PROTECT_PRICE");
        sql.SELECT("F_INSURANCE_VALUE");
        sql.FROM("fm_trade_order_info_base");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeOrderInfoBaseEntity record = (FmTradeOrderInfoBaseEntity) parameter.get("record");
        FmTradeOrderInfoBaseEntityExample example = (FmTradeOrderInfoBaseEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_info_base");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getcOrderCode() != null) {
            sql.SET("C_ORDER_CODE = #{record.cOrderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.SET("I_ORDER_TYPE_ID = #{record.iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getdOrderDateline() != null) {
            sql.SET("D_ORDER_DATELINE = #{record.dOrderDateline,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiUserType() != null) {
            sql.SET("I_USER_TYPE = #{record.iUserType,jdbcType=INTEGER}");
        }
        
        if (record.getiSenderId() != null) {
            sql.SET("I_SENDER_ID = #{record.iSenderId,jdbcType=INTEGER}");
        }
        
        if (record.getiRecverId() != null) {
            sql.SET("I_RECVER_ID = #{record.iRecverId,jdbcType=INTEGER}");
        }
        
        if (record.getiSenderOperatorId() != null) {
            sql.SET("I_SENDER_OPERATOR_ID = #{record.iSenderOperatorId,jdbcType=INTEGER}");
        }
        
        if (record.getiRecverOperatorId() != null) {
            sql.SET("I_RECVER_OPERATOR_ID = #{record.iRecverOperatorId,jdbcType=INTEGER}");
        }
        
        if (record.getcSenderName() != null) {
            sql.SET("C_SENDER_NAME = #{record.cSenderName,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderAddress() != null) {
            sql.SET("C_SENDER_ADDRESS = #{record.cSenderAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderPhone() != null) {
            sql.SET("C_SENDER_PHONE = #{record.cSenderPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderEmail() != null) {
            sql.SET("C_SENDER_EMAIL = #{record.cSenderEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderPostcode() != null) {
            sql.SET("C_SENDER_POSTCODE = #{record.cSenderPostcode,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderNote() != null) {
            sql.SET("C_SENDER_NOTE = #{record.cSenderNote,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderCity() != null) {
            sql.SET("C_SENDER_CITY = #{record.cSenderCity,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadStation() != null) {
            sql.SET("C_LOAD_STATION = #{record.cLoadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadLocation() != null) {
            sql.SET("C_LOAD_LOCATION = #{record.cLoadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getdPredictSendTime() != null) {
            sql.SET("D_PREDICT_SEND_TIME = #{record.dPredictSendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdPredictLoadStartTime() != null) {
            sql.SET("D_PREDICT_LOAD_START_TIME = #{record.dPredictLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdPredictLoadEndTime() != null) {
            sql.SET("D_PREDICT_LOAD_END_TIME = #{record.dPredictLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcRecverAddress() != null) {
            sql.SET("C_RECVER_ADDRESS = #{record.cRecverAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverPhone() != null) {
            sql.SET("C_RECVER_PHONE = #{record.cRecverPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverEmail() != null) {
            sql.SET("C_RECVER_EMAIL = #{record.cRecverEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverPostcode() != null) {
            sql.SET("C_RECVER_POSTCODE = #{record.cRecverPostcode,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverCity() != null) {
            sql.SET("C_RECVER_CITY = #{record.cRecverCity,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadStation() != null) {
            sql.SET("C_UNLOAD_STATION = #{record.cUnloadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadLocation() != null) {
            sql.SET("C_UNLOAD_LOCATION = #{record.cUnloadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcOrderType() != null) {
            sql.SET("C_ORDER_TYPE = #{record.cOrderType,jdbcType=VARCHAR}");
        }
        
        if (record.getiOrderState() != null) {
            sql.SET("I_ORDER_STATE = #{record.iOrderState,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderSplite() != null) {
            sql.SET("I_ORDER_SPLITE = #{record.iOrderSplite,jdbcType=INTEGER}");
        }
        
        if (record.getdOrderCreateTime() != null) {
            sql.SET("D_ORDER_CREATE_TIME = #{record.dOrderCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdOrderEndTime() != null) {
            sql.SET("D_ORDER_END_TIME = #{record.dOrderEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdOrderTemminateTime() != null) {
            sql.SET("D_ORDER_TEMMINATE_TIME = #{record.dOrderTemminateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiOrderTemminate() != null) {
            sql.SET("I_ORDER_TEMMINATE = #{record.iOrderTemminate,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderDelete() != null) {
            sql.SET("I_ORDER_DELETE = #{record.iOrderDelete,jdbcType=INTEGER}");
        }
        
        if (record.getdOrderDeleteTime() != null) {
            sql.SET("D_ORDER_DELETE_TIME = #{record.dOrderDeleteTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdOrderAlterTime() != null) {
            sql.SET("D_ORDER_ALTER_TIME = #{record.dOrderAlterTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcAccessCode() != null) {
            sql.SET("C_ACCESS_CODE = #{record.cAccessCode,jdbcType=VARCHAR}");
        }
        
        if (record.getiLogisticsType() != null) {
            sql.SET("I_LOGISTICS_TYPE = #{record.iLogisticsType,jdbcType=INTEGER}");
        }
        
        if (record.getfProtectPrice() != null) {
            sql.SET("F_PROTECT_PRICE = #{record.fProtectPrice,jdbcType=REAL}");
        }
        
        if (record.getfInsuranceValue() != null) {
            sql.SET("F_INSURANCE_VALUE = #{record.fInsuranceValue,jdbcType=REAL}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_info_base");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("C_ORDER_CODE = #{record.cOrderCode,jdbcType=VARCHAR}");
        sql.SET("I_ORDER_TYPE_ID = #{record.iOrderTypeId,jdbcType=INTEGER}");
        sql.SET("D_ORDER_DATELINE = #{record.dOrderDateline,jdbcType=TIMESTAMP}");
        sql.SET("I_USER_TYPE = #{record.iUserType,jdbcType=INTEGER}");
        sql.SET("I_SENDER_ID = #{record.iSenderId,jdbcType=INTEGER}");
        sql.SET("I_RECVER_ID = #{record.iRecverId,jdbcType=INTEGER}");
        sql.SET("I_SENDER_OPERATOR_ID = #{record.iSenderOperatorId,jdbcType=INTEGER}");
        sql.SET("I_RECVER_OPERATOR_ID = #{record.iRecverOperatorId,jdbcType=INTEGER}");
        sql.SET("C_SENDER_NAME = #{record.cSenderName,jdbcType=VARCHAR}");
        sql.SET("C_SENDER_ADDRESS = #{record.cSenderAddress,jdbcType=VARCHAR}");
        sql.SET("C_SENDER_PHONE = #{record.cSenderPhone,jdbcType=VARCHAR}");
        sql.SET("C_SENDER_EMAIL = #{record.cSenderEmail,jdbcType=VARCHAR}");
        sql.SET("C_SENDER_POSTCODE = #{record.cSenderPostcode,jdbcType=VARCHAR}");
        sql.SET("C_SENDER_NOTE = #{record.cSenderNote,jdbcType=VARCHAR}");
        sql.SET("C_SENDER_CITY = #{record.cSenderCity,jdbcType=VARCHAR}");
        sql.SET("C_LOAD_STATION = #{record.cLoadStation,jdbcType=VARCHAR}");
        sql.SET("C_LOAD_LOCATION = #{record.cLoadLocation,jdbcType=VARCHAR}");
        sql.SET("D_PREDICT_SEND_TIME = #{record.dPredictSendTime,jdbcType=TIMESTAMP}");
        sql.SET("D_PREDICT_LOAD_START_TIME = #{record.dPredictLoadStartTime,jdbcType=TIMESTAMP}");
        sql.SET("D_PREDICT_LOAD_END_TIME = #{record.dPredictLoadEndTime,jdbcType=TIMESTAMP}");
        sql.SET("C_RECVER_ADDRESS = #{record.cRecverAddress,jdbcType=VARCHAR}");
        sql.SET("C_RECVER_PHONE = #{record.cRecverPhone,jdbcType=VARCHAR}");
        sql.SET("C_RECVER_EMAIL = #{record.cRecverEmail,jdbcType=VARCHAR}");
        sql.SET("C_RECVER_POSTCODE = #{record.cRecverPostcode,jdbcType=VARCHAR}");
        sql.SET("C_RECVER_CITY = #{record.cRecverCity,jdbcType=VARCHAR}");
        sql.SET("C_UNLOAD_STATION = #{record.cUnloadStation,jdbcType=VARCHAR}");
        sql.SET("C_UNLOAD_LOCATION = #{record.cUnloadLocation,jdbcType=VARCHAR}");
        sql.SET("C_ORDER_TYPE = #{record.cOrderType,jdbcType=VARCHAR}");
        sql.SET("I_ORDER_STATE = #{record.iOrderState,jdbcType=INTEGER}");
        sql.SET("I_ORDER_SPLITE = #{record.iOrderSplite,jdbcType=INTEGER}");
        sql.SET("D_ORDER_CREATE_TIME = #{record.dOrderCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("D_ORDER_END_TIME = #{record.dOrderEndTime,jdbcType=TIMESTAMP}");
        sql.SET("D_ORDER_TEMMINATE_TIME = #{record.dOrderTemminateTime,jdbcType=TIMESTAMP}");
        sql.SET("I_ORDER_TEMMINATE = #{record.iOrderTemminate,jdbcType=INTEGER}");
        sql.SET("I_ORDER_DELETE = #{record.iOrderDelete,jdbcType=INTEGER}");
        sql.SET("D_ORDER_DELETE_TIME = #{record.dOrderDeleteTime,jdbcType=TIMESTAMP}");
        sql.SET("D_ORDER_ALTER_TIME = #{record.dOrderAlterTime,jdbcType=TIMESTAMP}");
        sql.SET("C_ACCESS_CODE = #{record.cAccessCode,jdbcType=VARCHAR}");
        sql.SET("I_LOGISTICS_TYPE = #{record.iLogisticsType,jdbcType=INTEGER}");
        sql.SET("F_PROTECT_PRICE = #{record.fProtectPrice,jdbcType=REAL}");
        sql.SET("F_INSURANCE_VALUE = #{record.fInsuranceValue,jdbcType=REAL}");
        
        FmTradeOrderInfoBaseEntityExample example = (FmTradeOrderInfoBaseEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeOrderInfoBaseEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_info_base");
        
        if (record.getcOrderCode() != null) {
            sql.SET("C_ORDER_CODE = #{cOrderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.SET("I_ORDER_TYPE_ID = #{iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getdOrderDateline() != null) {
            sql.SET("D_ORDER_DATELINE = #{dOrderDateline,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiUserType() != null) {
            sql.SET("I_USER_TYPE = #{iUserType,jdbcType=INTEGER}");
        }
        
        if (record.getiSenderId() != null) {
            sql.SET("I_SENDER_ID = #{iSenderId,jdbcType=INTEGER}");
        }
        
        if (record.getiRecverId() != null) {
            sql.SET("I_RECVER_ID = #{iRecverId,jdbcType=INTEGER}");
        }
        
        if (record.getiSenderOperatorId() != null) {
            sql.SET("I_SENDER_OPERATOR_ID = #{iSenderOperatorId,jdbcType=INTEGER}");
        }
        
        if (record.getiRecverOperatorId() != null) {
            sql.SET("I_RECVER_OPERATOR_ID = #{iRecverOperatorId,jdbcType=INTEGER}");
        }
        
        if (record.getcSenderName() != null) {
            sql.SET("C_SENDER_NAME = #{cSenderName,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderAddress() != null) {
            sql.SET("C_SENDER_ADDRESS = #{cSenderAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderPhone() != null) {
            sql.SET("C_SENDER_PHONE = #{cSenderPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderEmail() != null) {
            sql.SET("C_SENDER_EMAIL = #{cSenderEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderPostcode() != null) {
            sql.SET("C_SENDER_POSTCODE = #{cSenderPostcode,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderNote() != null) {
            sql.SET("C_SENDER_NOTE = #{cSenderNote,jdbcType=VARCHAR}");
        }
        
        if (record.getcSenderCity() != null) {
            sql.SET("C_SENDER_CITY = #{cSenderCity,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadStation() != null) {
            sql.SET("C_LOAD_STATION = #{cLoadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadLocation() != null) {
            sql.SET("C_LOAD_LOCATION = #{cLoadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getdPredictSendTime() != null) {
            sql.SET("D_PREDICT_SEND_TIME = #{dPredictSendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdPredictLoadStartTime() != null) {
            sql.SET("D_PREDICT_LOAD_START_TIME = #{dPredictLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdPredictLoadEndTime() != null) {
            sql.SET("D_PREDICT_LOAD_END_TIME = #{dPredictLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcRecverAddress() != null) {
            sql.SET("C_RECVER_ADDRESS = #{cRecverAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverPhone() != null) {
            sql.SET("C_RECVER_PHONE = #{cRecverPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverEmail() != null) {
            sql.SET("C_RECVER_EMAIL = #{cRecverEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverPostcode() != null) {
            sql.SET("C_RECVER_POSTCODE = #{cRecverPostcode,jdbcType=VARCHAR}");
        }
        
        if (record.getcRecverCity() != null) {
            sql.SET("C_RECVER_CITY = #{cRecverCity,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadStation() != null) {
            sql.SET("C_UNLOAD_STATION = #{cUnloadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadLocation() != null) {
            sql.SET("C_UNLOAD_LOCATION = #{cUnloadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcOrderType() != null) {
            sql.SET("C_ORDER_TYPE = #{cOrderType,jdbcType=VARCHAR}");
        }
        
        if (record.getiOrderState() != null) {
            sql.SET("I_ORDER_STATE = #{iOrderState,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderSplite() != null) {
            sql.SET("I_ORDER_SPLITE = #{iOrderSplite,jdbcType=INTEGER}");
        }
        
        if (record.getdOrderCreateTime() != null) {
            sql.SET("D_ORDER_CREATE_TIME = #{dOrderCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdOrderEndTime() != null) {
            sql.SET("D_ORDER_END_TIME = #{dOrderEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdOrderTemminateTime() != null) {
            sql.SET("D_ORDER_TEMMINATE_TIME = #{dOrderTemminateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiOrderTemminate() != null) {
            sql.SET("I_ORDER_TEMMINATE = #{iOrderTemminate,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderDelete() != null) {
            sql.SET("I_ORDER_DELETE = #{iOrderDelete,jdbcType=INTEGER}");
        }
        
        if (record.getdOrderDeleteTime() != null) {
            sql.SET("D_ORDER_DELETE_TIME = #{dOrderDeleteTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdOrderAlterTime() != null) {
            sql.SET("D_ORDER_ALTER_TIME = #{dOrderAlterTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcAccessCode() != null) {
            sql.SET("C_ACCESS_CODE = #{cAccessCode,jdbcType=VARCHAR}");
        }
        
        if (record.getiLogisticsType() != null) {
            sql.SET("I_LOGISTICS_TYPE = #{iLogisticsType,jdbcType=INTEGER}");
        }
        
        if (record.getfProtectPrice() != null) {
            sql.SET("F_PROTECT_PRICE = #{fProtectPrice,jdbcType=REAL}");
        }
        
        if (record.getfInsuranceValue() != null) {
            sql.SET("F_INSURANCE_VALUE = #{fInsuranceValue,jdbcType=REAL}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeOrderInfoBaseEntityExample example, boolean includeExamplePhrase) {
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