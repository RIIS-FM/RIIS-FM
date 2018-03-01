package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeContactEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeContactEntityExample.Criteria;
import com.crscd.riis.freightmarket.trade.entity.FmTradeContactEntityExample.Criterion;
import com.crscd.riis.freightmarket.trade.entity.FmTradeContactEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmTradeContactEntitySqlProvider {

    public String countByExample(FmTradeContactEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_trade_contact");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmTradeContactEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_trade_contact");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmTradeContactEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_trade_contact");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getcContactName() != null) {
            sql.VALUES("C_CONTACT_NAME", "#{cContactName,jdbcType=VARCHAR}");
        }
        
        if (record.getcContactAddress() != null) {
            sql.VALUES("C_CONTACT_ADDRESS", "#{cContactAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getiContactPostcode() != null) {
            sql.VALUES("I_CONTACT_POSTCODE", "#{iContactPostcode,jdbcType=INTEGER}");
        }
        
        if (record.getcContactPhone() != null) {
            sql.VALUES("C_CONTACT_PHONE", "#{cContactPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcContactEmail() != null) {
            sql.VALUES("C_CONTACT_EMAIL", "#{cContactEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getiContactFlag() != null) {
            sql.VALUES("I_CONTACT_FLAG", "#{iContactFlag,jdbcType=INTEGER}");
        }
        
        if (record.getiAccountId() != null) {
            sql.VALUES("I_ACCOUNT_ID", "#{iAccountId,jdbcType=INTEGER}");
        }
        
        if (record.getiAccountFlag() != null) {
            sql.VALUES("I_ACCOUNT_FLAG", "#{iAccountFlag,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmTradeContactEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("C_CONTACT_NAME");
        sql.SELECT("C_CONTACT_ADDRESS");
        sql.SELECT("I_CONTACT_POSTCODE");
        sql.SELECT("C_CONTACT_PHONE");
        sql.SELECT("C_CONTACT_EMAIL");
        sql.SELECT("I_CONTACT_FLAG");
        sql.SELECT("I_ACCOUNT_ID");
        sql.SELECT("I_ACCOUNT_FLAG");
        sql.FROM("fm_trade_contact");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmTradeContactEntity record = (FmTradeContactEntity) parameter.get("record");
        FmTradeContactEntityExample example = (FmTradeContactEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_contact");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getcContactName() != null) {
            sql.SET("C_CONTACT_NAME = #{record.cContactName,jdbcType=VARCHAR}");
        }
        
        if (record.getcContactAddress() != null) {
            sql.SET("C_CONTACT_ADDRESS = #{record.cContactAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getiContactPostcode() != null) {
            sql.SET("I_CONTACT_POSTCODE = #{record.iContactPostcode,jdbcType=INTEGER}");
        }
        
        if (record.getcContactPhone() != null) {
            sql.SET("C_CONTACT_PHONE = #{record.cContactPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcContactEmail() != null) {
            sql.SET("C_CONTACT_EMAIL = #{record.cContactEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getiContactFlag() != null) {
            sql.SET("I_CONTACT_FLAG = #{record.iContactFlag,jdbcType=INTEGER}");
        }
        
        if (record.getiAccountId() != null) {
            sql.SET("I_ACCOUNT_ID = #{record.iAccountId,jdbcType=INTEGER}");
        }
        
        if (record.getiAccountFlag() != null) {
            sql.SET("I_ACCOUNT_FLAG = #{record.iAccountFlag,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_contact");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("C_CONTACT_NAME = #{record.cContactName,jdbcType=VARCHAR}");
        sql.SET("C_CONTACT_ADDRESS = #{record.cContactAddress,jdbcType=VARCHAR}");
        sql.SET("I_CONTACT_POSTCODE = #{record.iContactPostcode,jdbcType=INTEGER}");
        sql.SET("C_CONTACT_PHONE = #{record.cContactPhone,jdbcType=VARCHAR}");
        sql.SET("C_CONTACT_EMAIL = #{record.cContactEmail,jdbcType=VARCHAR}");
        sql.SET("I_CONTACT_FLAG = #{record.iContactFlag,jdbcType=INTEGER}");
        sql.SET("I_ACCOUNT_ID = #{record.iAccountId,jdbcType=INTEGER}");
        sql.SET("I_ACCOUNT_FLAG = #{record.iAccountFlag,jdbcType=INTEGER}");
        
        FmTradeContactEntityExample example = (FmTradeContactEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmTradeContactEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_trade_contact");
        
        if (record.getcContactName() != null) {
            sql.SET("C_CONTACT_NAME = #{cContactName,jdbcType=VARCHAR}");
        }
        
        if (record.getcContactAddress() != null) {
            sql.SET("C_CONTACT_ADDRESS = #{cContactAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getiContactPostcode() != null) {
            sql.SET("I_CONTACT_POSTCODE = #{iContactPostcode,jdbcType=INTEGER}");
        }
        
        if (record.getcContactPhone() != null) {
            sql.SET("C_CONTACT_PHONE = #{cContactPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcContactEmail() != null) {
            sql.SET("C_CONTACT_EMAIL = #{cContactEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getiContactFlag() != null) {
            sql.SET("I_CONTACT_FLAG = #{iContactFlag,jdbcType=INTEGER}");
        }
        
        if (record.getiAccountId() != null) {
            sql.SET("I_ACCOUNT_ID = #{iAccountId,jdbcType=INTEGER}");
        }
        
        if (record.getiAccountFlag() != null) {
            sql.SET("I_ACCOUNT_FLAG = #{iAccountFlag,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmTradeContactEntityExample example, boolean includeExamplePhrase) {
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