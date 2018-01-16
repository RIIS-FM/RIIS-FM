package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntityExample.Criterion;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeOrderInfoFastFreightEntitySqlProvider {

    public String countByExample(FmTradeOrderInfoFastFreightEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_order_info_fast_freight");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmTradeOrderInfoFastFreightEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_order_info_fast_freight");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeOrderInfoFastFreightEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_order_info_fast_freight");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderId() != null) {
            sql.VALUES("I_ORDER_ID", "#{iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getcGoodsName() != null) {
            sql.VALUES("C_GOODS_NAME", "#{cGoodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsCode() != null) {
            sql.VALUES("C_GOODS_CODE", "#{cGoodsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getfGoodsWeight() != null) {
            sql.VALUES("F_GOODS_WEIGHT", "#{fGoodsWeight,jdbcType=REAL}");
        }
        
        if (record.getfGoodsVolume() != null) {
            sql.VALUES("F_GOODS_VOLUME", "#{fGoodsVolume,jdbcType=REAL}");
        }
        
        if (record.getfEachGoodsMaxWeight() != null) {
            sql.VALUES("F_EACH_GOODS_MAX_WEIGHT", "#{fEachGoodsMaxWeight,jdbcType=REAL}");
        }
        
        if (record.getcGoodsWrapper() != null) {
            sql.VALUES("C_GOODS_WRAPPER", "#{cGoodsWrapper,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsFeature() != null) {
            sql.VALUES("C_GOODS_FEATURE", "#{cGoodsFeature,jdbcType=VARCHAR}");
        }
        
        if (record.getcTrainNum() != null) {
            sql.VALUES("C_TRAIN_NUM", "#{cTrainNum,jdbcType=VARCHAR}");
        }
        
        if (record.getiGoodsNumber() != null) {
            sql.VALUES("I_GOODS_NUMBER", "#{iGoodsNumber,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeOrderInfoFastFreightEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("I_ORDER_ID");
        sql.SELECT("C_GOODS_NAME");
        sql.SELECT("C_GOODS_CODE");
        sql.SELECT("F_GOODS_WEIGHT");
        sql.SELECT("F_GOODS_VOLUME");
        sql.SELECT("F_EACH_GOODS_MAX_WEIGHT");
        sql.SELECT("C_GOODS_WRAPPER");
        sql.SELECT("C_GOODS_FEATURE");
        sql.SELECT("C_TRAIN_NUM");
        sql.SELECT("I_GOODS_NUMBER");
        sql.FROM("fm_trade_order_info_fast_freight");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeOrderInfoFastFreightEntity record = (FmTradeOrderInfoFastFreightEntity) parameter.get("record");
        FmTradeOrderInfoFastFreightEntityExample example = (FmTradeOrderInfoFastFreightEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_info_fast_freight");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getiOrderId() != null) {
            sql.SET("I_ORDER_ID = #{record.iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getcGoodsName() != null) {
            sql.SET("C_GOODS_NAME = #{record.cGoodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsCode() != null) {
            sql.SET("C_GOODS_CODE = #{record.cGoodsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getfGoodsWeight() != null) {
            sql.SET("F_GOODS_WEIGHT = #{record.fGoodsWeight,jdbcType=REAL}");
        }
        
        if (record.getfGoodsVolume() != null) {
            sql.SET("F_GOODS_VOLUME = #{record.fGoodsVolume,jdbcType=REAL}");
        }
        
        if (record.getfEachGoodsMaxWeight() != null) {
            sql.SET("F_EACH_GOODS_MAX_WEIGHT = #{record.fEachGoodsMaxWeight,jdbcType=REAL}");
        }
        
        if (record.getcGoodsWrapper() != null) {
            sql.SET("C_GOODS_WRAPPER = #{record.cGoodsWrapper,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsFeature() != null) {
            sql.SET("C_GOODS_FEATURE = #{record.cGoodsFeature,jdbcType=VARCHAR}");
        }
        
        if (record.getcTrainNum() != null) {
            sql.SET("C_TRAIN_NUM = #{record.cTrainNum,jdbcType=VARCHAR}");
        }
        
        if (record.getiGoodsNumber() != null) {
            sql.SET("I_GOODS_NUMBER = #{record.iGoodsNumber,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_info_fast_freight");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("I_ORDER_ID = #{record.iOrderId,jdbcType=INTEGER}");
        sql.SET("C_GOODS_NAME = #{record.cGoodsName,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_CODE = #{record.cGoodsCode,jdbcType=VARCHAR}");
        sql.SET("F_GOODS_WEIGHT = #{record.fGoodsWeight,jdbcType=REAL}");
        sql.SET("F_GOODS_VOLUME = #{record.fGoodsVolume,jdbcType=REAL}");
        sql.SET("F_EACH_GOODS_MAX_WEIGHT = #{record.fEachGoodsMaxWeight,jdbcType=REAL}");
        sql.SET("C_GOODS_WRAPPER = #{record.cGoodsWrapper,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_FEATURE = #{record.cGoodsFeature,jdbcType=VARCHAR}");
        sql.SET("C_TRAIN_NUM = #{record.cTrainNum,jdbcType=VARCHAR}");
        sql.SET("I_GOODS_NUMBER = #{record.iGoodsNumber,jdbcType=INTEGER}");
        
        FmTradeOrderInfoFastFreightEntityExample example = (FmTradeOrderInfoFastFreightEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeOrderInfoFastFreightEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_info_fast_freight");
        
        if (record.getiOrderId() != null) {
            sql.SET("I_ORDER_ID = #{iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getcGoodsName() != null) {
            sql.SET("C_GOODS_NAME = #{cGoodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsCode() != null) {
            sql.SET("C_GOODS_CODE = #{cGoodsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getfGoodsWeight() != null) {
            sql.SET("F_GOODS_WEIGHT = #{fGoodsWeight,jdbcType=REAL}");
        }
        
        if (record.getfGoodsVolume() != null) {
            sql.SET("F_GOODS_VOLUME = #{fGoodsVolume,jdbcType=REAL}");
        }
        
        if (record.getfEachGoodsMaxWeight() != null) {
            sql.SET("F_EACH_GOODS_MAX_WEIGHT = #{fEachGoodsMaxWeight,jdbcType=REAL}");
        }
        
        if (record.getcGoodsWrapper() != null) {
            sql.SET("C_GOODS_WRAPPER = #{cGoodsWrapper,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsFeature() != null) {
            sql.SET("C_GOODS_FEATURE = #{cGoodsFeature,jdbcType=VARCHAR}");
        }
        
        if (record.getcTrainNum() != null) {
            sql.SET("C_TRAIN_NUM = #{cTrainNum,jdbcType=VARCHAR}");
        }
        
        if (record.getiGoodsNumber() != null) {
            sql.SET("I_GOODS_NUMBER = #{iGoodsNumber,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeOrderInfoFastFreightEntityExample example, boolean includeExamplePhrase) {
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