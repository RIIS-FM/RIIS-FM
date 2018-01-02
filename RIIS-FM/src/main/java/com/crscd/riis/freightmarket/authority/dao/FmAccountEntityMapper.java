package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.authority.entity.FmAccountEntityExample;
import com.crscd.riis.freightmarket.authority.entity.FmPermissionEntity;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface FmAccountEntityMapper {
    @SelectProvider(type=FmAccountEntitySqlProvider.class, method="countByExample")
    long countByExample(FmAccountEntityExample example);

    @DeleteProvider(type=FmAccountEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmAccountEntityExample example);

    @Delete({
        "delete from fm_authority_account",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_authority_account (id, C_LOGIN_NAME, ",
        "C_LOGIN_PWD, C_LOGIN_PWD_SALT, ",
        "I_LOGIN_FLAG, I_LOCK_FLAG)",
        "values (#{id,jdbcType=INTEGER}, #{cLoginName,jdbcType=VARCHAR}, ",
        "#{cLoginPwd,jdbcType=VARCHAR}, #{cLoginPwdSalt,jdbcType=VARCHAR}, ",
        "#{iLoginFlag,jdbcType=INTEGER}, #{iLockFlag,jdbcType=INTEGER})"
    })
    int insert(FmAccountEntity record);

    @InsertProvider(type=FmAccountEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmAccountEntity record);

    @SelectProvider(type=FmAccountEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_LOGIN_NAME", property="cLoginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOGIN_PWD", property="cLoginPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOGIN_PWD_SALT", property="cLoginPwdSalt", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_LOGIN_FLAG", property="iLoginFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="I_LOCK_FLAG", property="iLockFlag", jdbcType=JdbcType.INTEGER)
    })
    List<FmAccountEntity> selectByExample(FmAccountEntityExample example);

    @Select({
        "select",
        "id, C_LOGIN_NAME, C_LOGIN_PWD, C_LOGIN_PWD_SALT, I_LOGIN_FLAG, I_LOCK_FLAG",
        "from fm_authority_account",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_LOGIN_NAME", property="cLoginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOGIN_PWD", property="cLoginPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOGIN_PWD_SALT", property="cLoginPwdSalt", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_LOGIN_FLAG", property="iLoginFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="I_LOCK_FLAG", property="iLockFlag", jdbcType=JdbcType.INTEGER)
    })
    FmAccountEntity selectByPrimaryKey(Integer id);
    @Select({
        "select",
        "id, C_LOGIN_NAME, C_LOGIN_PWD, C_LOGIN_PWD_SALT, I_LOGIN_FLAG, I_LOCK_FLAG",
        "from fm_authority_account",
        "where C_LOGIN_NAME = #{name,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_LOGIN_NAME", property="cLoginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOGIN_PWD", property="cLoginPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOGIN_PWD_SALT", property="cLoginPwdSalt", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_LOGIN_FLAG", property="iLoginFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="I_LOCK_FLAG", property="iLockFlag", jdbcType=JdbcType.INTEGER)
    })
    FmAccountEntity selectByAccountName(String accountName);
    @Select({
        "select",
        "role.C_ROLE_NAME",
        "from fm_authority_account_role aR,fm_authority_account account,fm_authority_role role",
        "where account.C_LOGIN_NAME= #{name,jdbcType=VARCHAR}",
        "and account.id=aR.I_ACCOUNT_ID",
        "and aR.I_ROLE_ID=role.id"
    })   
    List<String> selectRolesByAccountName(String name);
    @Select({
        "select",
        "permission.*",
        "from fm_authority_role role,fm_authority_permission permission,fm_authority_per_role pR",
        "where role.C_ROLE_NAME= #{name,jdbcType=VARCHAR}",
        "and role.id=pR.I_ROLE_ID",
        "and pR.I_PERMISSION_ID=permission.id"
    })   
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_PERMISSION_NAME", property="cPermissionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_PERMISSION_TYPE", property="iPermissionType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FmPermissionEntity> selectPermissionsByRoleName(String name);
    
    @UpdateProvider(type=FmAccountEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmAccountEntity record, @Param("example") FmAccountEntityExample example);

    @UpdateProvider(type=FmAccountEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmAccountEntity record, @Param("example") FmAccountEntityExample example);

    @UpdateProvider(type=FmAccountEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmAccountEntity record);

    @Update({
        "update fm_authority_account",
        "set C_LOGIN_NAME = #{cLoginName,jdbcType=VARCHAR},",
          "C_LOGIN_PWD = #{cLoginPwd,jdbcType=VARCHAR},",
          "C_LOGIN_PWD_SALT = #{cLoginPwdSalt,jdbcType=VARCHAR},",
          "I_LOGIN_FLAG = #{iLoginFlag,jdbcType=INTEGER},",
          "I_LOCK_FLAG = #{iLockFlag,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmAccountEntity record);
}