package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntityExample.Criterion;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeGoodsEntitySqlProvider {

    public String countByExample(FmTradeGoodsEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_goods");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmTradeGoodsEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_goods");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeGoodsEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_goods");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getcGoodsNameSpellAll() != null) {
            sql.VALUES("C_GOODS_NAME_SPELL_ALL", "#{cGoodsNameSpellAll,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsNameSpellShorth() != null) {
            sql.VALUES("C_GOODS_NAME_SPELL_SHORTH", "#{cGoodsNameSpellShorth,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsName() != null) {
            sql.VALUES("C_GOODS_NAME", "#{cGoodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsCategoryCode() != null) {
            sql.VALUES("C_GOODS_CATEGORY_CODE", "#{cGoodsCategoryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsTypeId() != null) {
            sql.VALUES("C_GOODS_TYPE_ID", "#{cGoodsTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getiGoodsDanger() != null) {
            sql.VALUES("I_GOODS_DANGER", "#{iGoodsDanger,jdbcType=INTEGER}");
        }
        
        if (record.getfGoodsInsuredRate() != null) {
            sql.VALUES("F_GOODS_INSURED_RATE", "#{fGoodsInsuredRate,jdbcType=REAL}");
        }
        
        if (record.getfGoodsInsuranceValue() != null) {
            sql.VALUES("F_GOODS_INSURANCE_VALUE", "#{fGoodsInsuranceValue,jdbcType=REAL}");
        }
        
        if (record.getfGoodsLoadAndUnloadRate() != null) {
            sql.VALUES("F_GOODS_LOAD_AND_UNLOAD_RATE", "#{fGoodsLoadAndUnloadRate,jdbcType=REAL}");
        }
        
        if (record.getcGoodsWholeVegicleRate() != null) {
            sql.VALUES("C_GOODS_WHOLE_VEGICLE_RATE", "#{cGoodsWholeVegicleRate,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsFastFreightRate() != null) {
            sql.VALUES("C_GOODS_FAST_FREIGHT_RATE", "#{cGoodsFastFreightRate,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsBoxFreightRate() != null) {
            sql.VALUES("C_GOODS_BOX_FREIGHT_RATE", "#{cGoodsBoxFreightRate,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeGoodsEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("C_GOODS_NAME_SPELL_ALL");
        sql.SELECT("C_GOODS_NAME_SPELL_SHORTH");
        sql.SELECT("C_GOODS_NAME");
        sql.SELECT("C_GOODS_CATEGORY_CODE");
        sql.SELECT("C_GOODS_TYPE_ID");
        sql.SELECT("I_GOODS_DANGER");
        sql.SELECT("F_GOODS_INSURED_RATE");
        sql.SELECT("F_GOODS_INSURANCE_VALUE");
        sql.SELECT("F_GOODS_LOAD_AND_UNLOAD_RATE");
        sql.SELECT("C_GOODS_WHOLE_VEGICLE_RATE");
        sql.SELECT("C_GOODS_FAST_FREIGHT_RATE");
        sql.SELECT("C_GOODS_BOX_FREIGHT_RATE");
        sql.FROM("fm_trade_goods");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeGoodsEntity record = (FmTradeGoodsEntity) parameter.get("record");
        FmTradeGoodsEntityExample example = (FmTradeGoodsEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_goods");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getcGoodsNameSpellAll() != null) {
            sql.SET("C_GOODS_NAME_SPELL_ALL = #{record.cGoodsNameSpellAll,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsNameSpellShorth() != null) {
            sql.SET("C_GOODS_NAME_SPELL_SHORTH = #{record.cGoodsNameSpellShorth,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsName() != null) {
            sql.SET("C_GOODS_NAME = #{record.cGoodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsCategoryCode() != null) {
            sql.SET("C_GOODS_CATEGORY_CODE = #{record.cGoodsCategoryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsTypeId() != null) {
            sql.SET("C_GOODS_TYPE_ID = #{record.cGoodsTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getiGoodsDanger() != null) {
            sql.SET("I_GOODS_DANGER = #{record.iGoodsDanger,jdbcType=INTEGER}");
        }
        
        if (record.getfGoodsInsuredRate() != null) {
            sql.SET("F_GOODS_INSURED_RATE = #{record.fGoodsInsuredRate,jdbcType=REAL}");
        }
        
        if (record.getfGoodsInsuranceValue() != null) {
            sql.SET("F_GOODS_INSURANCE_VALUE = #{record.fGoodsInsuranceValue,jdbcType=REAL}");
        }
        
        if (record.getfGoodsLoadAndUnloadRate() != null) {
            sql.SET("F_GOODS_LOAD_AND_UNLOAD_RATE = #{record.fGoodsLoadAndUnloadRate,jdbcType=REAL}");
        }
        
        if (record.getcGoodsWholeVegicleRate() != null) {
            sql.SET("C_GOODS_WHOLE_VEGICLE_RATE = #{record.cGoodsWholeVegicleRate,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsFastFreightRate() != null) {
            sql.SET("C_GOODS_FAST_FREIGHT_RATE = #{record.cGoodsFastFreightRate,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsBoxFreightRate() != null) {
            sql.SET("C_GOODS_BOX_FREIGHT_RATE = #{record.cGoodsBoxFreightRate,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_goods");
        
        sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        sql.SET("C_GOODS_NAME_SPELL_ALL = #{record.cGoodsNameSpellAll,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_NAME_SPELL_SHORTH = #{record.cGoodsNameSpellShorth,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_NAME = #{record.cGoodsName,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_CATEGORY_CODE = #{record.cGoodsCategoryCode,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_TYPE_ID = #{record.cGoodsTypeId,jdbcType=INTEGER}");
        sql.SET("I_GOODS_DANGER = #{record.iGoodsDanger,jdbcType=INTEGER}");
        sql.SET("F_GOODS_INSURED_RATE = #{record.fGoodsInsuredRate,jdbcType=REAL}");
        sql.SET("F_GOODS_INSURANCE_VALUE = #{record.fGoodsInsuranceValue,jdbcType=REAL}");
        sql.SET("F_GOODS_LOAD_AND_UNLOAD_RATE = #{record.fGoodsLoadAndUnloadRate,jdbcType=REAL}");
        sql.SET("C_GOODS_WHOLE_VEGICLE_RATE = #{record.cGoodsWholeVegicleRate,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_FAST_FREIGHT_RATE = #{record.cGoodsFastFreightRate,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_BOX_FREIGHT_RATE = #{record.cGoodsBoxFreightRate,jdbcType=VARCHAR}");
        
        FmTradeGoodsEntityExample example = (FmTradeGoodsEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeGoodsEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_goods");
        
        if (record.getcGoodsNameSpellAll() != null) {
            sql.SET("C_GOODS_NAME_SPELL_ALL = #{cGoodsNameSpellAll,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsNameSpellShorth() != null) {
            sql.SET("C_GOODS_NAME_SPELL_SHORTH = #{cGoodsNameSpellShorth,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsName() != null) {
            sql.SET("C_GOODS_NAME = #{cGoodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsCategoryCode() != null) {
            sql.SET("C_GOODS_CATEGORY_CODE = #{cGoodsCategoryCode,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsTypeId() != null) {
            sql.SET("C_GOODS_TYPE_ID = #{cGoodsTypeId,jdbcType=INTEGER}");
        }
        
        if (record.getiGoodsDanger() != null) {
            sql.SET("I_GOODS_DANGER = #{iGoodsDanger,jdbcType=INTEGER}");
        }
        
        if (record.getfGoodsInsuredRate() != null) {
            sql.SET("F_GOODS_INSURED_RATE = #{fGoodsInsuredRate,jdbcType=REAL}");
        }
        
        if (record.getfGoodsInsuranceValue() != null) {
            sql.SET("F_GOODS_INSURANCE_VALUE = #{fGoodsInsuranceValue,jdbcType=REAL}");
        }
        
        if (record.getfGoodsLoadAndUnloadRate() != null) {
            sql.SET("F_GOODS_LOAD_AND_UNLOAD_RATE = #{fGoodsLoadAndUnloadRate,jdbcType=REAL}");
        }
        
        if (record.getcGoodsWholeVegicleRate() != null) {
            sql.SET("C_GOODS_WHOLE_VEGICLE_RATE = #{cGoodsWholeVegicleRate,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsFastFreightRate() != null) {
            sql.SET("C_GOODS_FAST_FREIGHT_RATE = #{cGoodsFastFreightRate,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsBoxFreightRate() != null) {
            sql.SET("C_GOODS_BOX_FREIGHT_RATE = #{cGoodsBoxFreightRate,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeGoodsEntityExample example, boolean includeExamplePhrase) {
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