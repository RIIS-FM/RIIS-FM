package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBoxFreightEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBoxFreightEntityExample.Criterion;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBoxFreightEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeOrderInfoBoxFreightEntitySqlProvider {

    public String countByExample(FmTradeOrderInfoBoxFreightEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_order_info_box_freight");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmTradeOrderInfoBoxFreightEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_order_info_box_freight");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeOrderInfoBoxFreightEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_order_info_box_freight");
        
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
        
        if (record.getcGoodsFeature() != null) {
            sql.VALUES("C_GOODS_FEATURE", "#{cGoodsFeature,jdbcType=VARCHAR}");
        }
        
        if (record.getiBoxGetType() != null) {
            sql.VALUES("I_BOX_GET_TYPE", "#{iBoxGetType,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxNumber() != null) {
            sql.VALUES("I_BOX_NUMBER", "#{iBoxNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxType() != null) {
            sql.VALUES("I_BOX_TYPE", "#{iBoxType,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxNum() != null) {
            sql.VALUES("I_BOX_NUM", "#{iBoxNum,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxSealNum() != null) {
            sql.VALUES("I_BOX_SEAL_NUM", "#{iBoxSealNum,jdbcType=INTEGER}");
        }
        
        if (record.getdBoxRecverTime() != null) {
            sql.VALUES("D_BOX_RECVER_TIME", "#{dBoxRecverTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getfGoodsWeight() != null) {
            sql.VALUES("F_GOODS_WEIGHT", "#{fGoodsWeight,jdbcType=REAL}");
        }
        
        if (record.getcSenderBoxStation() != null) {
            sql.VALUES("C_SENDER_BOX_STATION", "#{cSenderBoxStation,jdbcType=VARCHAR}");
        }
        
        if (record.getiFullboxInStation() != null) {
            sql.VALUES("I_FULLBOX_IN_STATION", "#{iFullboxInStation,jdbcType=INTEGER}");
        }
        
        if (record.getiSenderLineId() != null) {
            sql.VALUES("I_SENDER_LINE_ID", "#{iSenderLineId,jdbcType=INTEGER}");
        }
        
        if (record.getiRecverLineId() != null) {
            sql.VALUES("I_RECVER_LINE_ID", "#{iRecverLineId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeOrderInfoBoxFreightEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("I_ORDER_ID");
        sql.SELECT("C_GOODS_NAME");
        sql.SELECT("C_GOODS_CODE");
        sql.SELECT("C_GOODS_FEATURE");
        sql.SELECT("I_BOX_GET_TYPE");
        sql.SELECT("I_BOX_NUMBER");
        sql.SELECT("I_BOX_TYPE");
        sql.SELECT("I_BOX_NUM");
        sql.SELECT("I_BOX_SEAL_NUM");
        sql.SELECT("D_BOX_RECVER_TIME");
        sql.SELECT("F_GOODS_WEIGHT");
        sql.SELECT("C_SENDER_BOX_STATION");
        sql.SELECT("I_FULLBOX_IN_STATION");
        sql.SELECT("I_SENDER_LINE_ID");
        sql.SELECT("I_RECVER_LINE_ID");
        sql.FROM("fm_trade_order_info_box_freight");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeOrderInfoBoxFreightEntity record = (FmTradeOrderInfoBoxFreightEntity) parameter.get("record");
        FmTradeOrderInfoBoxFreightEntityExample example = (FmTradeOrderInfoBoxFreightEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_info_box_freight");
        
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
        
        if (record.getcGoodsFeature() != null) {
            sql.SET("C_GOODS_FEATURE = #{record.cGoodsFeature,jdbcType=VARCHAR}");
        }
        
        if (record.getiBoxGetType() != null) {
            sql.SET("I_BOX_GET_TYPE = #{record.iBoxGetType,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxNumber() != null) {
            sql.SET("I_BOX_NUMBER = #{record.iBoxNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxType() != null) {
            sql.SET("I_BOX_TYPE = #{record.iBoxType,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxNum() != null) {
            sql.SET("I_BOX_NUM = #{record.iBoxNum,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxSealNum() != null) {
            sql.SET("I_BOX_SEAL_NUM = #{record.iBoxSealNum,jdbcType=INTEGER}");
        }
        
        if (record.getdBoxRecverTime() != null) {
            sql.SET("D_BOX_RECVER_TIME = #{record.dBoxRecverTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getfGoodsWeight() != null) {
            sql.SET("F_GOODS_WEIGHT = #{record.fGoodsWeight,jdbcType=REAL}");
        }
        
        if (record.getcSenderBoxStation() != null) {
            sql.SET("C_SENDER_BOX_STATION = #{record.cSenderBoxStation,jdbcType=VARCHAR}");
        }
        
        if (record.getiFullboxInStation() != null) {
            sql.SET("I_FULLBOX_IN_STATION = #{record.iFullboxInStation,jdbcType=INTEGER}");
        }
        
        if (record.getiSenderLineId() != null) {
            sql.SET("I_SENDER_LINE_ID = #{record.iSenderLineId,jdbcType=INTEGER}");
        }
        
        if (record.getiRecverLineId() != null) {
            sql.SET("I_RECVER_LINE_ID = #{record.iRecverLineId,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_info_box_freight");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("I_ORDER_ID = #{record.iOrderId,jdbcType=INTEGER}");
        sql.SET("C_GOODS_NAME = #{record.cGoodsName,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_CODE = #{record.cGoodsCode,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_FEATURE = #{record.cGoodsFeature,jdbcType=VARCHAR}");
        sql.SET("I_BOX_GET_TYPE = #{record.iBoxGetType,jdbcType=INTEGER}");
        sql.SET("I_BOX_NUMBER = #{record.iBoxNumber,jdbcType=INTEGER}");
        sql.SET("I_BOX_TYPE = #{record.iBoxType,jdbcType=INTEGER}");
        sql.SET("I_BOX_NUM = #{record.iBoxNum,jdbcType=INTEGER}");
        sql.SET("I_BOX_SEAL_NUM = #{record.iBoxSealNum,jdbcType=INTEGER}");
        sql.SET("D_BOX_RECVER_TIME = #{record.dBoxRecverTime,jdbcType=TIMESTAMP}");
        sql.SET("F_GOODS_WEIGHT = #{record.fGoodsWeight,jdbcType=REAL}");
        sql.SET("C_SENDER_BOX_STATION = #{record.cSenderBoxStation,jdbcType=VARCHAR}");
        sql.SET("I_FULLBOX_IN_STATION = #{record.iFullboxInStation,jdbcType=INTEGER}");
        sql.SET("I_SENDER_LINE_ID = #{record.iSenderLineId,jdbcType=INTEGER}");
        sql.SET("I_RECVER_LINE_ID = #{record.iRecverLineId,jdbcType=INTEGER}");
        
        FmTradeOrderInfoBoxFreightEntityExample example = (FmTradeOrderInfoBoxFreightEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeOrderInfoBoxFreightEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_order_info_box_freight");
        
        if (record.getiOrderId() != null) {
            sql.SET("I_ORDER_ID = #{iOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getcGoodsName() != null) {
            sql.SET("C_GOODS_NAME = #{cGoodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsCode() != null) {
            sql.SET("C_GOODS_CODE = #{cGoodsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsFeature() != null) {
            sql.SET("C_GOODS_FEATURE = #{cGoodsFeature,jdbcType=VARCHAR}");
        }
        
        if (record.getiBoxGetType() != null) {
            sql.SET("I_BOX_GET_TYPE = #{iBoxGetType,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxNumber() != null) {
            sql.SET("I_BOX_NUMBER = #{iBoxNumber,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxType() != null) {
            sql.SET("I_BOX_TYPE = #{iBoxType,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxNum() != null) {
            sql.SET("I_BOX_NUM = #{iBoxNum,jdbcType=INTEGER}");
        }
        
        if (record.getiBoxSealNum() != null) {
            sql.SET("I_BOX_SEAL_NUM = #{iBoxSealNum,jdbcType=INTEGER}");
        }
        
        if (record.getdBoxRecverTime() != null) {
            sql.SET("D_BOX_RECVER_TIME = #{dBoxRecverTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getfGoodsWeight() != null) {
            sql.SET("F_GOODS_WEIGHT = #{fGoodsWeight,jdbcType=REAL}");
        }
        
        if (record.getcSenderBoxStation() != null) {
            sql.SET("C_SENDER_BOX_STATION = #{cSenderBoxStation,jdbcType=VARCHAR}");
        }
        
        if (record.getiFullboxInStation() != null) {
            sql.SET("I_FULLBOX_IN_STATION = #{iFullboxInStation,jdbcType=INTEGER}");
        }
        
        if (record.getiSenderLineId() != null) {
            sql.SET("I_SENDER_LINE_ID = #{iSenderLineId,jdbcType=INTEGER}");
        }
        
        if (record.getiRecverLineId() != null) {
            sql.SET("I_RECVER_LINE_ID = #{iRecverLineId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeOrderInfoBoxFreightEntityExample example, boolean includeExamplePhrase) {
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