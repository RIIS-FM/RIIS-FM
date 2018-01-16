package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsTypeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsTypeEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsTypeEntityExample.Criterion;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsTypeEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeGoodsTypeEntitySqlProvider {

    public String countByExample(FmTradeGoodsTypeEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_goods_type");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmTradeGoodsTypeEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_goods_type");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeGoodsTypeEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_goods_type");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getcGoodsTypeName() != null) {
            sql.VALUES("C_GOODS_TYPE_NAME", "#{cGoodsTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getcCoodsCode() != null) {
            sql.VALUES("C_COODS_CODE", "#{cCoodsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsNameSpellAll() != null) {
            sql.VALUES("C_GOODS_NAME_SPELL_ALL", "#{cGoodsNameSpellAll,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsNameSpellShorth() != null) {
            sql.VALUES("C_GOODS_NAME_SPELL_SHORTH", "#{cGoodsNameSpellShorth,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeGoodsTypeEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("C_GOODS_TYPE_NAME");
        sql.SELECT("C_COODS_CODE");
        sql.SELECT("C_GOODS_NAME_SPELL_ALL");
        sql.SELECT("C_GOODS_NAME_SPELL_SHORTH");
        sql.FROM("fm_trade_goods_type");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeGoodsTypeEntity record = (FmTradeGoodsTypeEntity) parameter.get("record");
        FmTradeGoodsTypeEntityExample example = (FmTradeGoodsTypeEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_goods_type");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getcGoodsTypeName() != null) {
            sql.SET("C_GOODS_TYPE_NAME = #{record.cGoodsTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getcCoodsCode() != null) {
            sql.SET("C_COODS_CODE = #{record.cCoodsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsNameSpellAll() != null) {
            sql.SET("C_GOODS_NAME_SPELL_ALL = #{record.cGoodsNameSpellAll,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsNameSpellShorth() != null) {
            sql.SET("C_GOODS_NAME_SPELL_SHORTH = #{record.cGoodsNameSpellShorth,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_goods_type");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("C_GOODS_TYPE_NAME = #{record.cGoodsTypeName,jdbcType=VARCHAR}");
        sql.SET("C_COODS_CODE = #{record.cCoodsCode,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_NAME_SPELL_ALL = #{record.cGoodsNameSpellAll,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_NAME_SPELL_SHORTH = #{record.cGoodsNameSpellShorth,jdbcType=VARCHAR}");
        
        FmTradeGoodsTypeEntityExample example = (FmTradeGoodsTypeEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeGoodsTypeEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_goods_type");
        
        if (record.getcGoodsTypeName() != null) {
            sql.SET("C_GOODS_TYPE_NAME = #{cGoodsTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getcCoodsCode() != null) {
            sql.SET("C_COODS_CODE = #{cCoodsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsNameSpellAll() != null) {
            sql.SET("C_GOODS_NAME_SPELL_ALL = #{cGoodsNameSpellAll,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsNameSpellShorth() != null) {
            sql.SET("C_GOODS_NAME_SPELL_SHORTH = #{cGoodsNameSpellShorth,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeGoodsTypeEntityExample example, boolean includeExamplePhrase) {
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