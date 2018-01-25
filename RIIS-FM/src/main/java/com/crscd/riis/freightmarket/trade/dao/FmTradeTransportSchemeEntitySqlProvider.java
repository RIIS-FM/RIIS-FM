package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntityExample.Criterion;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeTransportSchemeEntitySqlProvider {

    public String countByExample(FmTradeTransportSchemeEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_transport_scheme");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmTradeTransportSchemeEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_transport_scheme");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeTransportSchemeEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_transport_scheme");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderId() != null) {
            sql.VALUES("I_ORDER_ID", "#{iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getfTradeOrderTransportSchemeFee() != null) {
            sql.VALUES("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE", "#{fTradeOrderTransportSchemeFee,jdbcType=REAL}");
        }
        
        if (record.getcTradeOrderTransportSchemeCode() != null) {
            sql.VALUES("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE", "#{cTradeOrderTransportSchemeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getdTradeOrderTransportSchemeStartTime() != null) {
            sql.VALUES("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME", "#{dTradeOrderTransportSchemeStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeEndTime() != null) {
            sql.VALUES("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME", "#{dTradeOrderTransportSchemeEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcTradeOrderTransportSchemeLoadStation() != null) {
            sql.VALUES("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION", "#{cTradeOrderTransportSchemeLoadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeUnloadStation() != null) {
            sql.VALUES("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION", "#{cTradeOrderTransportSchemeUnloadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeLoadLocation() != null) {
            sql.VALUES("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION", "#{cTradeOrderTransportSchemeLoadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeUnloadLocation() != null) {
            sql.VALUES("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION", "#{cTradeOrderTransportSchemeUnloadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeTrainNum() != null) {
            sql.VALUES("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM", "#{cTradeOrderTransportSchemeTrainNum,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeTrainType() != null) {
            sql.VALUES("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE", "#{cTradeOrderTransportSchemeTrainType,jdbcType=VARCHAR}");
        }
        
        if (record.getdTradeOrderTransportSchemeUnloadStartTime() != null) {
            sql.VALUES("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME", "#{dTradeOrderTransportSchemeUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeUnloadEndTime() != null) {
            sql.VALUES("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME", "#{dTradeOrderTransportSchemeUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeLoadStartTime() != null) {
            sql.VALUES("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME", "#{dTradeOrderTransportSchemeLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeLoadEndTime() != null) {
            sql.VALUES("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME", "#{dTradeOrderTransportSchemeLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiIsSelect() != null) {
            sql.VALUES("I_IS_SELECT", "#{iIsSelect,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeTransportSchemeEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("I_ORDER_ID");
        sql.SELECT("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE");
        sql.SELECT("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE");
        sql.SELECT("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME");
        sql.SELECT("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME");
        sql.SELECT("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION");
        sql.SELECT("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION");
        sql.SELECT("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION");
        sql.SELECT("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION");
        sql.SELECT("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM");
        sql.SELECT("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE");
        sql.SELECT("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME");
        sql.SELECT("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME");
        sql.SELECT("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME");
        sql.SELECT("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME");
        sql.SELECT("I_IS_SELECT");
        sql.FROM("fm_trade_transport_scheme");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeTransportSchemeEntity record = (FmTradeTransportSchemeEntity) parameter.get("record");
        FmTradeTransportSchemeEntityExample example = (FmTradeTransportSchemeEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_transport_scheme");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderId() != null) {
            sql.SET("I_ORDER_ID = #{record.iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getfTradeOrderTransportSchemeFee() != null) {
            sql.SET("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE = #{record.fTradeOrderTransportSchemeFee,jdbcType=REAL}");
        }
        
        if (record.getcTradeOrderTransportSchemeCode() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE = #{record.cTradeOrderTransportSchemeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getdTradeOrderTransportSchemeStartTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME = #{record.dTradeOrderTransportSchemeStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeEndTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME = #{record.dTradeOrderTransportSchemeEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcTradeOrderTransportSchemeLoadStation() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION = #{record.cTradeOrderTransportSchemeLoadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeUnloadStation() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION = #{record.cTradeOrderTransportSchemeUnloadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeLoadLocation() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION = #{record.cTradeOrderTransportSchemeLoadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeUnloadLocation() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION = #{record.cTradeOrderTransportSchemeUnloadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeTrainNum() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM = #{record.cTradeOrderTransportSchemeTrainNum,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeTrainType() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE = #{record.cTradeOrderTransportSchemeTrainType,jdbcType=VARCHAR}");
        }
        
        if (record.getdTradeOrderTransportSchemeUnloadStartTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME = #{record.dTradeOrderTransportSchemeUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeUnloadEndTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME = #{record.dTradeOrderTransportSchemeUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeLoadStartTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME = #{record.dTradeOrderTransportSchemeLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeLoadEndTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME = #{record.dTradeOrderTransportSchemeLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiIsSelect() != null) {
            sql.SET("I_IS_SELECT = #{record.iIsSelect,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_transport_scheme");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("I_ORDER_ID = #{record.iOrderId,jdbcType=INTEGER}");
        sql.SET("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE = #{record.fTradeOrderTransportSchemeFee,jdbcType=REAL}");
        sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE = #{record.cTradeOrderTransportSchemeCode,jdbcType=VARCHAR}");
        sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME = #{record.dTradeOrderTransportSchemeStartTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME = #{record.dTradeOrderTransportSchemeEndTime,jdbcType=TIMESTAMP}");
        sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION = #{record.cTradeOrderTransportSchemeLoadStation,jdbcType=VARCHAR}");
        sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION = #{record.cTradeOrderTransportSchemeUnloadStation,jdbcType=VARCHAR}");
        sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION = #{record.cTradeOrderTransportSchemeLoadLocation,jdbcType=VARCHAR}");
        sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION = #{record.cTradeOrderTransportSchemeUnloadLocation,jdbcType=VARCHAR}");
        sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM = #{record.cTradeOrderTransportSchemeTrainNum,jdbcType=VARCHAR}");
        sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE = #{record.cTradeOrderTransportSchemeTrainType,jdbcType=VARCHAR}");
        sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME = #{record.dTradeOrderTransportSchemeUnloadStartTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME = #{record.dTradeOrderTransportSchemeUnloadEndTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME = #{record.dTradeOrderTransportSchemeLoadStartTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME = #{record.dTradeOrderTransportSchemeLoadEndTime,jdbcType=TIMESTAMP}");
        sql.SET("I_IS_SELECT = #{record.iIsSelect,jdbcType=INTEGER}");
        
        FmTradeTransportSchemeEntityExample example = (FmTradeTransportSchemeEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeTransportSchemeEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_transport_scheme");
        
        if (record.getiOrderId() != null) {
            sql.SET("I_ORDER_ID = #{iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getfTradeOrderTransportSchemeFee() != null) {
            sql.SET("F_TRADE_ORDER_TRANSPORT_SCHEME_FEE = #{fTradeOrderTransportSchemeFee,jdbcType=REAL}");
        }
        
        if (record.getcTradeOrderTransportSchemeCode() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_CODE = #{cTradeOrderTransportSchemeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getdTradeOrderTransportSchemeStartTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME = #{dTradeOrderTransportSchemeStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeEndTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME = #{dTradeOrderTransportSchemeEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcTradeOrderTransportSchemeLoadStation() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION = #{cTradeOrderTransportSchemeLoadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeUnloadStation() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION = #{cTradeOrderTransportSchemeUnloadStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeLoadLocation() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION = #{cTradeOrderTransportSchemeLoadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeUnloadLocation() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION = #{cTradeOrderTransportSchemeUnloadLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeTrainNum() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM = #{cTradeOrderTransportSchemeTrainNum,jdbcType=VARCHAR}");
        }
        
        if (record.getcTradeOrderTransportSchemeTrainType() != null) {
            sql.SET("C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE = #{cTradeOrderTransportSchemeTrainType,jdbcType=VARCHAR}");
        }
        
        if (record.getdTradeOrderTransportSchemeUnloadStartTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME = #{dTradeOrderTransportSchemeUnloadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeUnloadEndTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME = #{dTradeOrderTransportSchemeUnloadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeLoadStartTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME = #{dTradeOrderTransportSchemeLoadStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTradeOrderTransportSchemeLoadEndTime() != null) {
            sql.SET("D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME = #{dTradeOrderTransportSchemeLoadEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiIsSelect() != null) {
            sql.SET("I_IS_SELECT = #{iIsSelect,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeTransportSchemeEntityExample example, boolean includeExamplePhrase) {
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