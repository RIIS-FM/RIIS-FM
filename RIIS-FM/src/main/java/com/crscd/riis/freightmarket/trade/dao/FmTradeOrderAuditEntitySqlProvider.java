package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntityExample.Criterion;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeOrderAuditEntitySqlProvider {

    public String countByExample(FmTradeOrderAuditEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_order_audit");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmTradeOrderAuditEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_order_audit");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeOrderAuditEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_order_audit");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderId() != null) {
            sql.VALUES("I_ORDER_ID", "#{iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.VALUES("I_ORDER_TYPE_ID", "#{iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getiAuditType() != null) {
            sql.VALUES("I_AUDIT_TYPE", "#{iAuditType,jdbcType=INTEGER}");
        }
        
        if (record.getiAuditAuditorId() != null) {
            sql.VALUES("I_AUDIT_AUDITOR_ID", "#{iAuditAuditorId,jdbcType=INTEGER}");
        }
        
        if (record.getdAuditStartTime() != null) {
            sql.VALUES("D_AUDIT_START_TIME", "#{dAuditStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdAuditEndTime() != null) {
            sql.VALUES("D_AUDIT_END_TIME", "#{dAuditEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcAuditSuggestion() != null) {
            sql.VALUES("C_AUDIT_SUGGESTION", "#{cAuditSuggestion,jdbcType=VARCHAR}");
        }
        
        if (record.getiAuditResult() != null) {
            sql.VALUES("I_AUDIT_RESULT", "#{iAuditResult,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeOrderAuditEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("I_ORDER_ID");
        sql.SELECT("I_ORDER_TYPE_ID");
        sql.SELECT("I_AUDIT_TYPE");
        sql.SELECT("I_AUDIT_AUDITOR_ID");
        sql.SELECT("D_AUDIT_START_TIME");
        sql.SELECT("D_AUDIT_END_TIME");
        sql.SELECT("C_AUDIT_SUGGESTION");
        sql.SELECT("I_AUDIT_RESULT");
        sql.FROM("fm_trade_order_audit");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeOrderAuditEntity record = (FmTradeOrderAuditEntity) parameter.get("record");
        FmTradeOrderAuditEntityExample example = (FmTradeOrderAuditEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_audit");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderId() != null) {
            sql.SET("I_ORDER_ID = #{record.iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.SET("I_ORDER_TYPE_ID = #{record.iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getiAuditType() != null) {
            sql.SET("I_AUDIT_TYPE = #{record.iAuditType,jdbcType=INTEGER}");
        }
        
        if (record.getiAuditAuditorId() != null) {
            sql.SET("I_AUDIT_AUDITOR_ID = #{record.iAuditAuditorId,jdbcType=INTEGER}");
        }
        
        if (record.getdAuditStartTime() != null) {
            sql.SET("D_AUDIT_START_TIME = #{record.dAuditStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdAuditEndTime() != null) {
            sql.SET("D_AUDIT_END_TIME = #{record.dAuditEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcAuditSuggestion() != null) {
            sql.SET("C_AUDIT_SUGGESTION = #{record.cAuditSuggestion,jdbcType=VARCHAR}");
        }
        
        if (record.getiAuditResult() != null) {
            sql.SET("I_AUDIT_RESULT = #{record.iAuditResult,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_audit");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("I_ORDER_ID = #{record.iOrderId,jdbcType=INTEGER}");
        sql.SET("I_ORDER_TYPE_ID = #{record.iOrderTypeId,jdbcType=INTEGER}");
        sql.SET("I_AUDIT_TYPE = #{record.iAuditType,jdbcType=INTEGER}");
        sql.SET("I_AUDIT_AUDITOR_ID = #{record.iAuditAuditorId,jdbcType=INTEGER}");
        sql.SET("D_AUDIT_START_TIME = #{record.dAuditStartTime,jdbcType=TIMESTAMP}");
        sql.SET("D_AUDIT_END_TIME = #{record.dAuditEndTime,jdbcType=TIMESTAMP}");
        sql.SET("C_AUDIT_SUGGESTION = #{record.cAuditSuggestion,jdbcType=VARCHAR}");
        sql.SET("I_AUDIT_RESULT = #{record.iAuditResult,jdbcType=INTEGER}");
        
        FmTradeOrderAuditEntityExample example = (FmTradeOrderAuditEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeOrderAuditEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_audit");
        
        if (record.getiOrderId() != null) {
            sql.SET("I_ORDER_ID = #{iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderTypeId() != null) {
            sql.SET("I_ORDER_TYPE_ID = #{iOrderTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getiAuditType() != null) {
            sql.SET("I_AUDIT_TYPE = #{iAuditType,jdbcType=INTEGER}");
        }
        
        if (record.getiAuditAuditorId() != null) {
            sql.SET("I_AUDIT_AUDITOR_ID = #{iAuditAuditorId,jdbcType=INTEGER}");
        }
        
        if (record.getdAuditStartTime() != null) {
            sql.SET("D_AUDIT_START_TIME = #{dAuditStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdAuditEndTime() != null) {
            sql.SET("D_AUDIT_END_TIME = #{dAuditEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcAuditSuggestion() != null) {
            sql.SET("C_AUDIT_SUGGESTION = #{cAuditSuggestion,jdbcType=VARCHAR}");
        }
        
        if (record.getiAuditResult() != null) {
            sql.SET("I_AUDIT_RESULT = #{iAuditResult,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeOrderAuditEntityExample example, boolean includeExamplePhrase) {
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