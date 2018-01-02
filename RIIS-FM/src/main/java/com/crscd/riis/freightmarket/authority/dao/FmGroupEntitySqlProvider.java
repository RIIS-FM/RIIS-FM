package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmGroupEntity;
import com.crscd.riis.freightmarket.authority.entity.FmGroupEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.entity.FmGroupEntityExample.Criterion;
import com.crscd.riis.freightmarket.authority.entity.FmGroupEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmGroupEntitySqlProvider {

    public String countByExample(FmGroupEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_authority_group");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmGroupEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_authority_group");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmGroupEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_authority_group");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getcGroupName() != null) {
            sql.VALUES("C_GROUP_NAME", "#{cGroupName,jdbcType=VARCHAR}");
        }
        
        if (record.getiFatherGroupId() != null) {
            sql.VALUES("I_FATHER_GROUP_ID", "#{iFatherGroupId,jdbcType=INTEGER}");
        }
        
        if (record.getiCreaterId() != null) {
            sql.VALUES("I_CREATER_ID", "#{iCreaterId,jdbcType=INTEGER}");
        }
        
        if (record.getdCreatedTime() != null) {
            sql.VALUES("D_CREATED_TIME", "#{dCreatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcRemark() != null) {
            sql.VALUES("C_REMARK", "#{cRemark,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmGroupEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("C_GROUP_NAME");
        sql.SELECT("I_FATHER_GROUP_ID");
        sql.SELECT("I_CREATER_ID");
        sql.SELECT("D_CREATED_TIME");
        sql.SELECT("C_REMARK");
        sql.FROM("fm_authority_group");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmGroupEntity record = (FmGroupEntity) parameter.get("record");
        FmGroupEntityExample example = (FmGroupEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_authority_group");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getcGroupName() != null) {
            sql.SET("C_GROUP_NAME = #{record.cGroupName,jdbcType=VARCHAR}");
        }
        
        if (record.getiFatherGroupId() != null) {
            sql.SET("I_FATHER_GROUP_ID = #{record.iFatherGroupId,jdbcType=INTEGER}");
        }
        
        if (record.getiCreaterId() != null) {
            sql.SET("I_CREATER_ID = #{record.iCreaterId,jdbcType=INTEGER}");
        }
        
        if (record.getdCreatedTime() != null) {
            sql.SET("D_CREATED_TIME = #{record.dCreatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcRemark() != null) {
            sql.SET("C_REMARK = #{record.cRemark,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_authority_group");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("C_GROUP_NAME = #{record.cGroupName,jdbcType=VARCHAR}");
        sql.SET("I_FATHER_GROUP_ID = #{record.iFatherGroupId,jdbcType=INTEGER}");
        sql.SET("I_CREATER_ID = #{record.iCreaterId,jdbcType=INTEGER}");
        sql.SET("D_CREATED_TIME = #{record.dCreatedTime,jdbcType=TIMESTAMP}");
        sql.SET("C_REMARK = #{record.cRemark,jdbcType=VARCHAR}");
        
        FmGroupEntityExample example = (FmGroupEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmGroupEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_authority_group");
        
        if (record.getcGroupName() != null) {
            sql.SET("C_GROUP_NAME = #{cGroupName,jdbcType=VARCHAR}");
        }
        
        if (record.getiFatherGroupId() != null) {
            sql.SET("I_FATHER_GROUP_ID = #{iFatherGroupId,jdbcType=INTEGER}");
        }
        
        if (record.getiCreaterId() != null) {
            sql.SET("I_CREATER_ID = #{iCreaterId,jdbcType=INTEGER}");
        }
        
        if (record.getdCreatedTime() != null) {
            sql.SET("D_CREATED_TIME = #{dCreatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcRemark() != null) {
            sql.SET("C_REMARK = #{cRemark,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmGroupEntityExample example, boolean includeExamplePhrase) {
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