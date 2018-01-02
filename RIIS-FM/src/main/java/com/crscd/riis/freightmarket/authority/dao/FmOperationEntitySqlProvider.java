package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmOperationEntity;
import com.crscd.riis.freightmarket.authority.entity.FmOperationEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.entity.FmOperationEntityExample.Criterion;
import com.crscd.riis.freightmarket.authority.entity.FmOperationEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmOperationEntitySqlProvider {

    public String countByExample(FmOperationEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_authority_operation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmOperationEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_authority_operation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmOperationEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_authority_operation");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getcOperationName() != null) {
            sql.VALUES("C_OPERATION_NAME", "#{cOperationName,jdbcType=VARCHAR}");
        }
        
        if (record.getcOperationUrl() != null) {
            sql.VALUES("C_OPERATION_URL", "#{cOperationUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getiCreaterId() != null) {
            sql.VALUES("I_CREATER_ID", "#{iCreaterId,jdbcType=INTEGER}");
        }
        
        if (record.getdCreatedTime() != null) {
            sql.VALUES("D_CREATED_TIME", "#{dCreatedTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmOperationEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("C_OPERATION_NAME");
        sql.SELECT("C_OPERATION_URL");
        sql.SELECT("I_CREATER_ID");
        sql.SELECT("D_CREATED_TIME");
        sql.FROM("fm_authority_operation");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmOperationEntity record = (FmOperationEntity) parameter.get("record");
        FmOperationEntityExample example = (FmOperationEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_authority_operation");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getcOperationName() != null) {
            sql.SET("C_OPERATION_NAME = #{record.cOperationName,jdbcType=VARCHAR}");
        }
        
        if (record.getcOperationUrl() != null) {
            sql.SET("C_OPERATION_URL = #{record.cOperationUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getiCreaterId() != null) {
            sql.SET("I_CREATER_ID = #{record.iCreaterId,jdbcType=INTEGER}");
        }
        
        if (record.getdCreatedTime() != null) {
            sql.SET("D_CREATED_TIME = #{record.dCreatedTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_authority_operation");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("C_OPERATION_NAME = #{record.cOperationName,jdbcType=VARCHAR}");
        sql.SET("C_OPERATION_URL = #{record.cOperationUrl,jdbcType=VARCHAR}");
        sql.SET("I_CREATER_ID = #{record.iCreaterId,jdbcType=INTEGER}");
        sql.SET("D_CREATED_TIME = #{record.dCreatedTime,jdbcType=TIMESTAMP}");
        
        FmOperationEntityExample example = (FmOperationEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmOperationEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_authority_operation");
        
        if (record.getcOperationName() != null) {
            sql.SET("C_OPERATION_NAME = #{cOperationName,jdbcType=VARCHAR}");
        }
        
        if (record.getcOperationUrl() != null) {
            sql.SET("C_OPERATION_URL = #{cOperationUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getiCreaterId() != null) {
            sql.SET("I_CREATER_ID = #{iCreaterId,jdbcType=INTEGER}");
        }
        
        if (record.getdCreatedTime() != null) {
            sql.SET("D_CREATED_TIME = #{dCreatedTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmOperationEntityExample example, boolean includeExamplePhrase) {
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