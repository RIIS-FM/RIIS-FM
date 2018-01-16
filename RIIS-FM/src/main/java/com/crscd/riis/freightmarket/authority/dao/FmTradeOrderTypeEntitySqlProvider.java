package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderTypeEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderTypeEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderTypeEntityExample.Criterion;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderTypeEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeOrderTypeEntitySqlProvider {

    public String countByExample(FmTradeOrderTypeEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_order_type");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmTradeOrderTypeEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_order_type");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeOrderTypeEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_order_type");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getiTypeLabel() != null) {
            sql.VALUES("I_TYPE_LABEL", "#{iTypeLabel,jdbcType=VARCHAR}");
        }
        
        if (record.getcTypeValue() != null) {
            sql.VALUES("C_TYPE_VALUE", "#{cTypeValue,jdbcType=VARCHAR}");
        }
        
        if (record.getdTypeCreateTime() != null) {
            sql.VALUES("D_TYPE_CREATE_TIME", "#{dTypeCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTypeModifyTime() != null) {
            sql.VALUES("D_TYPE_MODIFY_TIME", "#{dTypeModifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTypeDeleteTime() != null) {
            sql.VALUES("D_TYPE_DELETE_TIME", "#{dTypeDeleteTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiTypeCreater() != null) {
            sql.VALUES("I_TYPE_CREATER", "#{iTypeCreater,jdbcType=INTEGER}");
        }
        
        if (record.getiTypeModifier() != null) {
            sql.VALUES("I_TYPE_MODIFIER", "#{iTypeModifier,jdbcType=INTEGER}");
        }
        
        if (record.getiTypeDelete() != null) {
            sql.VALUES("I_TYPE_DELETE", "#{iTypeDelete,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeOrderTypeEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("I_TYPE_LABEL");
        sql.SELECT("C_TYPE_VALUE");
        sql.SELECT("D_TYPE_CREATE_TIME");
        sql.SELECT("D_TYPE_MODIFY_TIME");
        sql.SELECT("D_TYPE_DELETE_TIME");
        sql.SELECT("I_TYPE_CREATER");
        sql.SELECT("I_TYPE_MODIFIER");
        sql.SELECT("I_TYPE_DELETE");
        sql.FROM("fm_trade_order_type");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeOrderTypeEntity record = (FmTradeOrderTypeEntity) parameter.get("record");
        FmTradeOrderTypeEntityExample example = (FmTradeOrderTypeEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_type");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getiTypeLabel() != null) {
            sql.SET("I_TYPE_LABEL = #{record.iTypeLabel,jdbcType=VARCHAR}");
        }
        
        if (record.getcTypeValue() != null) {
            sql.SET("C_TYPE_VALUE = #{record.cTypeValue,jdbcType=VARCHAR}");
        }
        
        if (record.getdTypeCreateTime() != null) {
            sql.SET("D_TYPE_CREATE_TIME = #{record.dTypeCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTypeModifyTime() != null) {
            sql.SET("D_TYPE_MODIFY_TIME = #{record.dTypeModifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTypeDeleteTime() != null) {
            sql.SET("D_TYPE_DELETE_TIME = #{record.dTypeDeleteTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiTypeCreater() != null) {
            sql.SET("I_TYPE_CREATER = #{record.iTypeCreater,jdbcType=INTEGER}");
        }
        
        if (record.getiTypeModifier() != null) {
            sql.SET("I_TYPE_MODIFIER = #{record.iTypeModifier,jdbcType=INTEGER}");
        }
        
        if (record.getiTypeDelete() != null) {
            sql.SET("I_TYPE_DELETE = #{record.iTypeDelete,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_type");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("I_TYPE_LABEL = #{record.iTypeLabel,jdbcType=VARCHAR}");
        sql.SET("C_TYPE_VALUE = #{record.cTypeValue,jdbcType=VARCHAR}");
        sql.SET("D_TYPE_CREATE_TIME = #{record.dTypeCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TYPE_MODIFY_TIME = #{record.dTypeModifyTime,jdbcType=TIMESTAMP}");
        sql.SET("D_TYPE_DELETE_TIME = #{record.dTypeDeleteTime,jdbcType=TIMESTAMP}");
        sql.SET("I_TYPE_CREATER = #{record.iTypeCreater,jdbcType=INTEGER}");
        sql.SET("I_TYPE_MODIFIER = #{record.iTypeModifier,jdbcType=INTEGER}");
        sql.SET("I_TYPE_DELETE = #{record.iTypeDelete,jdbcType=INTEGER}");
        
        FmTradeOrderTypeEntityExample example = (FmTradeOrderTypeEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeOrderTypeEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_type");
        
        if (record.getiTypeLabel() != null) {
            sql.SET("I_TYPE_LABEL = #{iTypeLabel,jdbcType=VARCHAR}");
        }
        
        if (record.getcTypeValue() != null) {
            sql.SET("C_TYPE_VALUE = #{cTypeValue,jdbcType=VARCHAR}");
        }
        
        if (record.getdTypeCreateTime() != null) {
            sql.SET("D_TYPE_CREATE_TIME = #{dTypeCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTypeModifyTime() != null) {
            sql.SET("D_TYPE_MODIFY_TIME = #{dTypeModifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getdTypeDeleteTime() != null) {
            sql.SET("D_TYPE_DELETE_TIME = #{dTypeDeleteTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getiTypeCreater() != null) {
            sql.SET("I_TYPE_CREATER = #{iTypeCreater,jdbcType=INTEGER}");
        }
        
        if (record.getiTypeModifier() != null) {
            sql.SET("I_TYPE_MODIFIER = #{iTypeModifier,jdbcType=INTEGER}");
        }
        
        if (record.getiTypeDelete() != null) {
            sql.SET("I_TYPE_DELETE = #{iTypeDelete,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeOrderTypeEntityExample example, boolean includeExamplePhrase) {
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