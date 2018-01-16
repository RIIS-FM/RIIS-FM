package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportEstimateEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportEstimateEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportEstimateEntityExample.Criterion;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportEstimateEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeTransportEstimateEntitySqlProvider {

    public String countByExample(FmTradeTransportEstimateEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_transport_estimate");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmTradeTransportEstimateEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_transport_estimate");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeTransportEstimateEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_transport_estimate");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderId() != null) {
            sql.VALUES("I_ORDER_ID", "#{iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.VALUES("I_ORDER_TYPE_ID", "#{iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getcOrderCode() != null) {
            sql.VALUES("C_ORDER_CODE", "#{cOrderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getiEstimateServiceEfficiency() != null) {
            sql.VALUES("I_ESTIMATE_SERVICE_EFFICIENCY", "#{iEstimateServiceEfficiency,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateTransport() != null) {
            sql.VALUES("I_ESTIMATE_TRANSPORT", "#{iEstimateTransport,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimatePartity() != null) {
            sql.VALUES("I_ESTIMATE_PARTITY", "#{iEstimatePartity,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateConvininet() != null) {
            sql.VALUES("I_ESTIMATE_CONVININET", "#{iEstimateConvininet,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateOutline() != null) {
            sql.VALUES("I_ESTIMATE_OUTLINE", "#{iEstimateOutline,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateContent() != null) {
            sql.VALUES("I_ESTIMATE_CONTENT", "#{iEstimateContent,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeTransportEstimateEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("I_ORDER_ID");
        sql.SELECT("I_ORDER_TYPE_ID");
        sql.SELECT("C_ORDER_CODE");
        sql.SELECT("I_ESTIMATE_SERVICE_EFFICIENCY");
        sql.SELECT("I_ESTIMATE_TRANSPORT");
        sql.SELECT("I_ESTIMATE_PARTITY");
        sql.SELECT("I_ESTIMATE_CONVININET");
        sql.SELECT("I_ESTIMATE_OUTLINE");
        sql.SELECT("I_ESTIMATE_CONTENT");
        sql.FROM("fm_trade_transport_estimate");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeTransportEstimateEntity record = (FmTradeTransportEstimateEntity) parameter.get("record");
        FmTradeTransportEstimateEntityExample example = (FmTradeTransportEstimateEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_transport_estimate");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderId() != null) {
            sql.SET("I_ORDER_ID = #{record.iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.SET("I_ORDER_TYPE_ID = #{record.iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getcOrderCode() != null) {
            sql.SET("C_ORDER_CODE = #{record.cOrderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getiEstimateServiceEfficiency() != null) {
            sql.SET("I_ESTIMATE_SERVICE_EFFICIENCY = #{record.iEstimateServiceEfficiency,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateTransport() != null) {
            sql.SET("I_ESTIMATE_TRANSPORT = #{record.iEstimateTransport,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimatePartity() != null) {
            sql.SET("I_ESTIMATE_PARTITY = #{record.iEstimatePartity,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateConvininet() != null) {
            sql.SET("I_ESTIMATE_CONVININET = #{record.iEstimateConvininet,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateOutline() != null) {
            sql.SET("I_ESTIMATE_OUTLINE = #{record.iEstimateOutline,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateContent() != null) {
            sql.SET("I_ESTIMATE_CONTENT = #{record.iEstimateContent,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_transport_estimate");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("I_ORDER_ID = #{record.iOrderId,jdbcType=INTEGER}");
        sql.SET("I_ORDER_TYPE_ID = #{record.iOrderTypeId,jdbcType=INTEGER}");
        sql.SET("C_ORDER_CODE = #{record.cOrderCode,jdbcType=VARCHAR}");
        sql.SET("I_ESTIMATE_SERVICE_EFFICIENCY = #{record.iEstimateServiceEfficiency,jdbcType=INTEGER}");
        sql.SET("I_ESTIMATE_TRANSPORT = #{record.iEstimateTransport,jdbcType=INTEGER}");
        sql.SET("I_ESTIMATE_PARTITY = #{record.iEstimatePartity,jdbcType=INTEGER}");
        sql.SET("I_ESTIMATE_CONVININET = #{record.iEstimateConvininet,jdbcType=INTEGER}");
        sql.SET("I_ESTIMATE_OUTLINE = #{record.iEstimateOutline,jdbcType=INTEGER}");
        sql.SET("I_ESTIMATE_CONTENT = #{record.iEstimateContent,jdbcType=INTEGER}");
        
        FmTradeTransportEstimateEntityExample example = (FmTradeTransportEstimateEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeTransportEstimateEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_transport_estimate");
        
        if (record.getiOrderId() != null) {
            sql.SET("I_ORDER_ID = #{iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.SET("I_ORDER_TYPE_ID = #{iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getcOrderCode() != null) {
            sql.SET("C_ORDER_CODE = #{cOrderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getiEstimateServiceEfficiency() != null) {
            sql.SET("I_ESTIMATE_SERVICE_EFFICIENCY = #{iEstimateServiceEfficiency,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateTransport() != null) {
            sql.SET("I_ESTIMATE_TRANSPORT = #{iEstimateTransport,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimatePartity() != null) {
            sql.SET("I_ESTIMATE_PARTITY = #{iEstimatePartity,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateConvininet() != null) {
            sql.SET("I_ESTIMATE_CONVININET = #{iEstimateConvininet,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateOutline() != null) {
            sql.SET("I_ESTIMATE_OUTLINE = #{iEstimateOutline,jdbcType=INTEGER}");
        }
        
        if (record.getiEstimateContent() != null) {
            sql.SET("I_ESTIMATE_CONTENT = #{iEstimateContent,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeTransportEstimateEntityExample example, boolean includeExamplePhrase) {
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