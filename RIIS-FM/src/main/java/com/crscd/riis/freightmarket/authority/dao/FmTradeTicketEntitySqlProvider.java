package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmTradeTicketEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeTicketEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.entity.FmTradeTicketEntityExample.Criterion;
import com.crscd.riis.freightmarket.authority.entity.FmTradeTicketEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeTicketEntitySqlProvider {

    public String countByExample(FmTradeTicketEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_ticket");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmTradeTicketEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_ticket");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeTicketEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_ticket");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillId() != null) {
            sql.VALUES("I_WAYBILL_ID", "#{iWaybillId,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillCode() != null) {
            sql.VALUES("I_WAYBILL_CODE", "#{iWaybillCode,jdbcType=INTEGER}");
        }
        
        if (record.getiTicketCode() != null) {
            sql.VALUES("I_TICKET_CODE", "#{iTicketCode,jdbcType=INTEGER}");
        }
        
        if (record.getdTicketCreateTime() != null) {
            sql.VALUES("D_TICKET_CREATE_TIME", "#{dTicketCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcTicketContent() != null) {
            sql.VALUES("C_TICKET_CONTENT", "#{cTicketContent,jdbcType=VARCHAR}");
        }
        
        if (record.getdTicketRecverTime() != null) {
            sql.VALUES("D_TICKET_RECVER_TIME", "#{dTicketRecverTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiIncidentalsType() != null) {
            sql.VALUES("I_INCIDENTALS_TYPE", "#{iIncidentalsType,jdbcType=INTEGER}");
        }
        
        if (record.getfIncidentalsValue() != null) {
            sql.VALUES("F_INCIDENTALS_VALUE", "#{fIncidentalsValue,jdbcType=REAL}");
        }
        
        if (record.getfDistance() != null) {
            sql.VALUES("F_DISTANCE", "#{fDistance,jdbcType=REAL}");
        }
        
        if (record.getiIncidentalsAymentState() != null) {
            sql.VALUES("I_INCIDENTALS_AYMENT_STATE", "#{iIncidentalsAymentState,jdbcType=INTEGER}");
        }
        
        if (record.getiIncidentalsAymentType() != null) {
            sql.VALUES("I_INCIDENTALS_AYMENT_TYPE", "#{iIncidentalsAymentType,jdbcType=INTEGER}");
        }
        
        if (record.getdTicketRealityArriveTime() != null) {
            sql.VALUES("D_TICKET_REALITY_ARRIVE_TIME", "#{dTicketRealityArriveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityUnloadStartTime() != null) {
            sql.VALUES("D_TICKET_REALITY_UNLOAD_START_TIME", "#{dTicketRealityUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityUnloadEndTime() != null) {
            sql.VALUES("D_TICKET_REALITY_UNLOAD_END_TIME", "#{dTicketRealityUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealitySenderTime() != null) {
            sql.VALUES("D_TICKET_REALITY_SENDER_TIME", "#{dTicketRealitySenderTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityLoadStartTime() != null) {
            sql.VALUES("D_TICKET_REALITY_LOAD_START_TIME", "#{dTicketRealityLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityLoadEndTime() != null) {
            sql.VALUES("D_TICKET_REALITY_LOAD_END_TIME", "#{dTicketRealityLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictArriveTime() != null) {
            sql.VALUES("D_TICKET_PREDICT_ARRIVE_TIME", "#{dTicketPredictArriveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictUnloadStartTime() != null) {
            sql.VALUES("D_TICKET_PREDICT_UNLOAD_START_TIME", "#{dTicketPredictUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictUnloadEndTime() != null) {
            sql.VALUES("D_TICKET_PREDICT_UNLOAD_END_TIME", "#{dTicketPredictUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictSenderTime() != null) {
            sql.VALUES("D_TICKET_PREDICT_SENDER_TIME", "#{dTicketPredictSenderTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictLoadStartTime() != null) {
            sql.VALUES("D_TICKET_PREDICT_LOAD_START_TIME", "#{dTicketPredictLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictLoadEndTime() != null) {
            sql.VALUES("D_TICKET_PREDICT_LOAD_END_TIME", "#{dTicketPredictLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeTicketEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("I_WAYBILL_ID");
        sql.SELECT("I_WAYBILL_CODE");
        sql.SELECT("I_TICKET_CODE");
        sql.SELECT("D_TICKET_CREATE_TIME");
        sql.SELECT("C_TICKET_CONTENT");
        sql.SELECT("D_TICKET_RECVER_TIME");
        sql.SELECT("I_INCIDENTALS_TYPE");
        sql.SELECT("F_INCIDENTALS_VALUE");
        sql.SELECT("F_DISTANCE");
        sql.SELECT("I_INCIDENTALS_AYMENT_STATE");
        sql.SELECT("I_INCIDENTALS_AYMENT_TYPE");
        sql.SELECT("D_TICKET_REALITY_ARRIVE_TIME");
        sql.SELECT("D_TICKET_REALITY_UNLOAD_START_TIME");
        sql.SELECT("D_TICKET_REALITY_UNLOAD_END_TIME");
        sql.SELECT("D_TICKET_REALITY_SENDER_TIME");
        sql.SELECT("D_TICKET_REALITY_LOAD_START_TIME");
        sql.SELECT("D_TICKET_REALITY_LOAD_END_TIME");
        sql.SELECT("D_TICKET_PREDICT_ARRIVE_TIME");
        sql.SELECT("D_TICKET_PREDICT_UNLOAD_START_TIME");
        sql.SELECT("D_TICKET_PREDICT_UNLOAD_END_TIME");
        sql.SELECT("D_TICKET_PREDICT_SENDER_TIME");
        sql.SELECT("D_TICKET_PREDICT_LOAD_START_TIME");
        sql.SELECT("D_TICKET_PREDICT_LOAD_END_TIME");
        sql.FROM("fm_trade_ticket");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeTicketEntity record = (FmTradeTicketEntity) parameter.get("record");
        FmTradeTicketEntityExample example = (FmTradeTicketEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_ticket");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillId() != null) {
            sql.SET("I_WAYBILL_ID = #{record.iWaybillId,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillCode() != null) {
            sql.SET("I_WAYBILL_CODE = #{record.iWaybillCode,jdbcType=INTEGER}");
        }
        
        if (record.getiTicketCode() != null) {
            sql.SET("I_TICKET_CODE = #{record.iTicketCode,jdbcType=INTEGER}");
        }
        
        if (record.getdTicketCreateTime() != null) {
            sql.SET("D_TICKET_CREATE_TIME = #{record.dTicketCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcTicketContent() != null) {
            sql.SET("C_TICKET_CONTENT = #{record.cTicketContent,jdbcType=VARCHAR}");
        }
        
        if (record.getdTicketRecverTime() != null) {
            sql.SET("D_TICKET_RECVER_TIME = #{record.dTicketRecverTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiIncidentalsType() != null) {
            sql.SET("I_INCIDENTALS_TYPE = #{record.iIncidentalsType,jdbcType=INTEGER}");
        }
        
        if (record.getfIncidentalsValue() != null) {
            sql.SET("F_INCIDENTALS_VALUE = #{record.fIncidentalsValue,jdbcType=REAL}");
        }
        
        if (record.getfDistance() != null) {
            sql.SET("F_DISTANCE = #{record.fDistance,jdbcType=REAL}");
        }
        
        if (record.getiIncidentalsAymentState() != null) {
            sql.SET("I_INCIDENTALS_AYMENT_STATE = #{record.iIncidentalsAymentState,jdbcType=INTEGER}");
        }
        
        if (record.getiIncidentalsAymentType() != null) {
            sql.SET("I_INCIDENTALS_AYMENT_TYPE = #{record.iIncidentalsAymentType,jdbcType=INTEGER}");
        }
        
        if (record.getdTicketRealityArriveTime() != null) {
            sql.SET("D_TICKET_REALITY_ARRIVE_TIME = #{record.dTicketRealityArriveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityUnloadStartTime() != null) {
            sql.SET("D_TICKET_REALITY_UNLOAD_START_TIME = #{record.dTicketRealityUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityUnloadEndTime() != null) {
            sql.SET("D_TICKET_REALITY_UNLOAD_END_TIME = #{record.dTicketRealityUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealitySenderTime() != null) {
            sql.SET("D_TICKET_REALITY_SENDER_TIME = #{record.dTicketRealitySenderTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityLoadStartTime() != null) {
            sql.SET("D_TICKET_REALITY_LOAD_START_TIME = #{record.dTicketRealityLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityLoadEndTime() != null) {
            sql.SET("D_TICKET_REALITY_LOAD_END_TIME = #{record.dTicketRealityLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictArriveTime() != null) {
            sql.SET("D_TICKET_PREDICT_ARRIVE_TIME = #{record.dTicketPredictArriveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictUnloadStartTime() != null) {
            sql.SET("D_TICKET_PREDICT_UNLOAD_START_TIME = #{record.dTicketPredictUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictUnloadEndTime() != null) {
            sql.SET("D_TICKET_PREDICT_UNLOAD_END_TIME = #{record.dTicketPredictUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictSenderTime() != null) {
            sql.SET("D_TICKET_PREDICT_SENDER_TIME = #{record.dTicketPredictSenderTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictLoadStartTime() != null) {
            sql.SET("D_TICKET_PREDICT_LOAD_START_TIME = #{record.dTicketPredictLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictLoadEndTime() != null) {
            sql.SET("D_TICKET_PREDICT_LOAD_END_TIME = #{record.dTicketPredictLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_ticket");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_ID = #{record.iWaybillId,jdbcType=INTEGER}");
        sql.SET("I_WAYBILL_CODE = #{record.iWaybillCode,jdbcType=INTEGER}");
        sql.SET("I_TICKET_CODE = #{record.iTicketCode,jdbcType=INTEGER}");
        sql.SET("D_TICKET_CREATE_TIME = #{record.dTicketCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("C_TICKET_CONTENT = #{record.cTicketContent,jdbcType=VARCHAR}");
        sql.SET("D_TICKET_RECVER_TIME = #{record.dTicketRecverTime,jdbcType=TIMESTAMP}");
        sql.SET("I_INCIDENTALS_TYPE = #{record.iIncidentalsType,jdbcType=INTEGER}");
        sql.SET("F_INCIDENTALS_VALUE = #{record.fIncidentalsValue,jdbcType=REAL}");
        sql.SET("F_DISTANCE = #{record.fDistance,jdbcType=REAL}");
        sql.SET("I_INCIDENTALS_AYMENT_STATE = #{record.iIncidentalsAymentState,jdbcType=INTEGER}");
        sql.SET("I_INCIDENTALS_AYMENT_TYPE = #{record.iIncidentalsAymentType,jdbcType=INTEGER}");
        sql.SET("D_TICKET_REALITY_ARRIVE_TIME = #{record.dTicketRealityArriveTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TICKET_REALITY_UNLOAD_START_TIME = #{record.dTicketRealityUnloadStartTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TICKET_REALITY_UNLOAD_END_TIME = #{record.dTicketRealityUnloadEndTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TICKET_REALITY_SENDER_TIME = #{record.dTicketRealitySenderTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TICKET_REALITY_LOAD_START_TIME = #{record.dTicketRealityLoadStartTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TICKET_REALITY_LOAD_END_TIME = #{record.dTicketRealityLoadEndTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TICKET_PREDICT_ARRIVE_TIME = #{record.dTicketPredictArriveTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TICKET_PREDICT_UNLOAD_START_TIME = #{record.dTicketPredictUnloadStartTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TICKET_PREDICT_UNLOAD_END_TIME = #{record.dTicketPredictUnloadEndTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TICKET_PREDICT_SENDER_TIME = #{record.dTicketPredictSenderTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TICKET_PREDICT_LOAD_START_TIME = #{record.dTicketPredictLoadStartTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TICKET_PREDICT_LOAD_END_TIME = #{record.dTicketPredictLoadEndTime,jdbcType=TIMESTAMP}");
        
        FmTradeTicketEntityExample example = (FmTradeTicketEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeTicketEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_ticket");
        
        if (record.getiWaybillId() != null) {
            sql.SET("I_WAYBILL_ID = #{iWaybillId,jdbcType=INTEGER}");
        }
        
        if (record.getiWaybillCode() != null) {
            sql.SET("I_WAYBILL_CODE = #{iWaybillCode,jdbcType=INTEGER}");
        }
        
        if (record.getiTicketCode() != null) {
            sql.SET("I_TICKET_CODE = #{iTicketCode,jdbcType=INTEGER}");
        }
        
        if (record.getdTicketCreateTime() != null) {
            sql.SET("D_TICKET_CREATE_TIME = #{dTicketCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcTicketContent() != null) {
            sql.SET("C_TICKET_CONTENT = #{cTicketContent,jdbcType=VARCHAR}");
        }
        
        if (record.getdTicketRecverTime() != null) {
            sql.SET("D_TICKET_RECVER_TIME = #{dTicketRecverTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiIncidentalsType() != null) {
            sql.SET("I_INCIDENTALS_TYPE = #{iIncidentalsType,jdbcType=INTEGER}");
        }
        
        if (record.getfIncidentalsValue() != null) {
            sql.SET("F_INCIDENTALS_VALUE = #{fIncidentalsValue,jdbcType=REAL}");
        }
        
        if (record.getfDistance() != null) {
            sql.SET("F_DISTANCE = #{fDistance,jdbcType=REAL}");
        }
        
        if (record.getiIncidentalsAymentState() != null) {
            sql.SET("I_INCIDENTALS_AYMENT_STATE = #{iIncidentalsAymentState,jdbcType=INTEGER}");
        }
        
        if (record.getiIncidentalsAymentType() != null) {
            sql.SET("I_INCIDENTALS_AYMENT_TYPE = #{iIncidentalsAymentType,jdbcType=INTEGER}");
        }
        
        if (record.getdTicketRealityArriveTime() != null) {
            sql.SET("D_TICKET_REALITY_ARRIVE_TIME = #{dTicketRealityArriveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityUnloadStartTime() != null) {
            sql.SET("D_TICKET_REALITY_UNLOAD_START_TIME = #{dTicketRealityUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityUnloadEndTime() != null) {
            sql.SET("D_TICKET_REALITY_UNLOAD_END_TIME = #{dTicketRealityUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealitySenderTime() != null) {
            sql.SET("D_TICKET_REALITY_SENDER_TIME = #{dTicketRealitySenderTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityLoadStartTime() != null) {
            sql.SET("D_TICKET_REALITY_LOAD_START_TIME = #{dTicketRealityLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketRealityLoadEndTime() != null) {
            sql.SET("D_TICKET_REALITY_LOAD_END_TIME = #{dTicketRealityLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictArriveTime() != null) {
            sql.SET("D_TICKET_PREDICT_ARRIVE_TIME = #{dTicketPredictArriveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictUnloadStartTime() != null) {
            sql.SET("D_TICKET_PREDICT_UNLOAD_START_TIME = #{dTicketPredictUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictUnloadEndTime() != null) {
            sql.SET("D_TICKET_PREDICT_UNLOAD_END_TIME = #{dTicketPredictUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictSenderTime() != null) {
            sql.SET("D_TICKET_PREDICT_SENDER_TIME = #{dTicketPredictSenderTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictLoadStartTime() != null) {
            sql.SET("D_TICKET_PREDICT_LOAD_START_TIME = #{dTicketPredictLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTicketPredictLoadEndTime() != null) {
            sql.SET("D_TICKET_PREDICT_LOAD_END_TIME = #{dTicketPredictLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeTicketEntityExample example, boolean includeExamplePhrase) {
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