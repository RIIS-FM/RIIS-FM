package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmUserEntity;
import com.crscd.riis.freightmarket.authority.entity.FmUserEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.entity.FmUserEntityExample.Criterion;
import com.crscd.riis.freightmarket.authority.entity.FmUserEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FmUserEntitySqlProvider {

    public String countByExample(FmUserEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("fm_authority_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FmUserEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("fm_authority_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(FmUserEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("fm_authority_user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getiAccountId() != null) {
            sql.VALUES("I_ACCOUNT_ID", "#{iAccountId,jdbcType=INTEGER}");
        }
        
        if (record.getcRailwayBureau() != null) {
            sql.VALUES("C_RAILWAY_BUREAU", "#{cRailwayBureau,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserName() != null) {
            sql.VALUES("C_USER_NAME", "#{cUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserAddress() != null) {
            sql.VALUES("C_USER_ADDRESS", "#{cUserAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserIdNum() != null) {
            sql.VALUES("C_USER_ID_NUM", "#{cUserIdNum,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserPhone() != null) {
            sql.VALUES("C_USER_PHONE", "#{cUserPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserMail() != null) {
            sql.VALUES("C_USER_MAIL", "#{cUserMail,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserTel() != null) {
            sql.VALUES("C_USER_TEL", "#{cUserTel,jdbcType=VARCHAR}");
        }
        
        if (record.getcPwdQ() != null) {
            sql.VALUES("C_PWD_Q", "#{cPwdQ,jdbcType=VARCHAR}");
        }
        
        if (record.getcPwdA() != null) {
            sql.VALUES("C_PWD_A", "#{cPwdA,jdbcType=VARCHAR}");
        }
        
        if (record.getiFreightFlag() != null) {
            sql.VALUES("I_FREIGHT_FLAG", "#{iFreightFlag,jdbcType=INTEGER}");
        }
        
        if (record.getcShipperName() != null) {
            sql.VALUES("C_SHIPPER_NAME", "#{cShipperName,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadingStation() != null) {
            sql.VALUES("C_LOADING_STATION", "#{cLoadingStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadingLocation() != null) {
            sql.VALUES("C_LOADING_LOCATION", "#{cLoadingLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsName() != null) {
            sql.VALUES("C_GOODS_NAME", "#{cGoodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadingStation() != null) {
            sql.VALUES("C_UNLOADING_STATION", "#{cUnloadingStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadingLocation() != null) {
            sql.VALUES("C_UNLOADING_LOCATION", "#{cUnloadingLocation,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FmUserEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("I_ACCOUNT_ID");
        sql.SELECT("C_RAILWAY_BUREAU");
        sql.SELECT("C_USER_NAME");
        sql.SELECT("C_USER_ADDRESS");
        sql.SELECT("C_USER_ID_NUM");
        sql.SELECT("C_USER_PHONE");
        sql.SELECT("C_USER_MAIL");
        sql.SELECT("C_USER_TEL");
        sql.SELECT("C_PWD_Q");
        sql.SELECT("C_PWD_A");
        sql.SELECT("I_FREIGHT_FLAG");
        sql.SELECT("C_SHIPPER_NAME");
        sql.SELECT("C_LOADING_STATION");
        sql.SELECT("C_LOADING_LOCATION");
        sql.SELECT("C_GOODS_NAME");
        sql.SELECT("C_UNLOADING_STATION");
        sql.SELECT("C_UNLOADING_LOCATION");
        sql.FROM("fm_authority_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FmUserEntity record = (FmUserEntity) parameter.get("record");
        FmUserEntityExample example = (FmUserEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("fm_authority_user");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getiAccountId() != null) {
            sql.SET("I_ACCOUNT_ID = #{record.iAccountId,jdbcType=INTEGER}");
        }
        
        if (record.getcRailwayBureau() != null) {
            sql.SET("C_RAILWAY_BUREAU = #{record.cRailwayBureau,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserName() != null) {
            sql.SET("C_USER_NAME = #{record.cUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserAddress() != null) {
            sql.SET("C_USER_ADDRESS = #{record.cUserAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserIdNum() != null) {
            sql.SET("C_USER_ID_NUM = #{record.cUserIdNum,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserPhone() != null) {
            sql.SET("C_USER_PHONE = #{record.cUserPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserMail() != null) {
            sql.SET("C_USER_MAIL = #{record.cUserMail,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserTel() != null) {
            sql.SET("C_USER_TEL = #{record.cUserTel,jdbcType=VARCHAR}");
        }
        
        if (record.getcPwdQ() != null) {
            sql.SET("C_PWD_Q = #{record.cPwdQ,jdbcType=VARCHAR}");
        }
        
        if (record.getcPwdA() != null) {
            sql.SET("C_PWD_A = #{record.cPwdA,jdbcType=VARCHAR}");
        }
        
        if (record.getiFreightFlag() != null) {
            sql.SET("I_FREIGHT_FLAG = #{record.iFreightFlag,jdbcType=INTEGER}");
        }
        
        if (record.getcShipperName() != null) {
            sql.SET("C_SHIPPER_NAME = #{record.cShipperName,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadingStation() != null) {
            sql.SET("C_LOADING_STATION = #{record.cLoadingStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadingLocation() != null) {
            sql.SET("C_LOADING_LOCATION = #{record.cLoadingLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsName() != null) {
            sql.SET("C_GOODS_NAME = #{record.cGoodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadingStation() != null) {
            sql.SET("C_UNLOADING_STATION = #{record.cUnloadingStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadingLocation() != null) {
            sql.SET("C_UNLOADING_LOCATION = #{record.cUnloadingLocation,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("fm_authority_user");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("I_ACCOUNT_ID = #{record.iAccountId,jdbcType=INTEGER}");
        sql.SET("C_RAILWAY_BUREAU = #{record.cRailwayBureau,jdbcType=VARCHAR}");
        sql.SET("C_USER_NAME = #{record.cUserName,jdbcType=VARCHAR}");
        sql.SET("C_USER_ADDRESS = #{record.cUserAddress,jdbcType=VARCHAR}");
        sql.SET("C_USER_ID_NUM = #{record.cUserIdNum,jdbcType=VARCHAR}");
        sql.SET("C_USER_PHONE = #{record.cUserPhone,jdbcType=VARCHAR}");
        sql.SET("C_USER_MAIL = #{record.cUserMail,jdbcType=VARCHAR}");
        sql.SET("C_USER_TEL = #{record.cUserTel,jdbcType=VARCHAR}");
        sql.SET("C_PWD_Q = #{record.cPwdQ,jdbcType=VARCHAR}");
        sql.SET("C_PWD_A = #{record.cPwdA,jdbcType=VARCHAR}");
        sql.SET("I_FREIGHT_FLAG = #{record.iFreightFlag,jdbcType=INTEGER}");
        sql.SET("C_SHIPPER_NAME = #{record.cShipperName,jdbcType=VARCHAR}");
        sql.SET("C_LOADING_STATION = #{record.cLoadingStation,jdbcType=VARCHAR}");
        sql.SET("C_LOADING_LOCATION = #{record.cLoadingLocation,jdbcType=VARCHAR}");
        sql.SET("C_GOODS_NAME = #{record.cGoodsName,jdbcType=VARCHAR}");
        sql.SET("C_UNLOADING_STATION = #{record.cUnloadingStation,jdbcType=VARCHAR}");
        sql.SET("C_UNLOADING_LOCATION = #{record.cUnloadingLocation,jdbcType=VARCHAR}");
        
        FmUserEntityExample example = (FmUserEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(FmUserEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("fm_authority_user");
        
        if (record.getiAccountId() != null) {
            sql.SET("I_ACCOUNT_ID = #{iAccountId,jdbcType=INTEGER}");
        }
        
        if (record.getcRailwayBureau() != null) {
            sql.SET("C_RAILWAY_BUREAU = #{cRailwayBureau,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserName() != null) {
            sql.SET("C_USER_NAME = #{cUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserAddress() != null) {
            sql.SET("C_USER_ADDRESS = #{cUserAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserIdNum() != null) {
            sql.SET("C_USER_ID_NUM = #{cUserIdNum,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserPhone() != null) {
            sql.SET("C_USER_PHONE = #{cUserPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserMail() != null) {
            sql.SET("C_USER_MAIL = #{cUserMail,jdbcType=VARCHAR}");
        }
        
        if (record.getcUserTel() != null) {
            sql.SET("C_USER_TEL = #{cUserTel,jdbcType=VARCHAR}");
        }
        
        if (record.getcPwdQ() != null) {
            sql.SET("C_PWD_Q = #{cPwdQ,jdbcType=VARCHAR}");
        }
        
        if (record.getcPwdA() != null) {
            sql.SET("C_PWD_A = #{cPwdA,jdbcType=VARCHAR}");
        }
        
        if (record.getiFreightFlag() != null) {
            sql.SET("I_FREIGHT_FLAG = #{iFreightFlag,jdbcType=INTEGER}");
        }
        
        if (record.getcShipperName() != null) {
            sql.SET("C_SHIPPER_NAME = #{cShipperName,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadingStation() != null) {
            sql.SET("C_LOADING_STATION = #{cLoadingStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcLoadingLocation() != null) {
            sql.SET("C_LOADING_LOCATION = #{cLoadingLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getcGoodsName() != null) {
            sql.SET("C_GOODS_NAME = #{cGoodsName,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadingStation() != null) {
            sql.SET("C_UNLOADING_STATION = #{cUnloadingStation,jdbcType=VARCHAR}");
        }
        
        if (record.getcUnloadingLocation() != null) {
            sql.SET("C_UNLOADING_LOCATION = #{cUnloadingLocation,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FmUserEntityExample example, boolean includeExamplePhrase) {
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