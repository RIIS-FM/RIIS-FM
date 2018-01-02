package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmAccountRoleEntity;
import com.crscd.riis.freightmarket.authority.entity.FmAccountRoleEntityExample;
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

public interface FmAccountRoleEntityMapper {
    @SelectProvider(type=FmAccountRoleEntitySqlProvider.class, method="countByExample")
    long countByExample(FmAccountRoleEntityExample example);

    @DeleteProvider(type=FmAccountRoleEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmAccountRoleEntityExample example);

    @Delete({
        "delete from fm_authority_account_role",
        "where I_ROLE_ID = #{iRoleId,jdbcType=INTEGER}",
          "and I_ACCOUNT_ID = #{iAccountId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("iRoleId") Integer iRoleId, @Param("iAccountId") Integer iAccountId);

    @Insert({
        "insert into fm_authority_account_role (I_ROLE_ID, I_ACCOUNT_ID, ",
        "I_CREATER_ID, D_CREATED_TIME)",
        "values (#{iRoleId,jdbcType=INTEGER}, #{iAccountId,jdbcType=INTEGER}, ",
        "#{iCreaterId,jdbcType=INTEGER}, #{dCreatedTime,jdbcType=TIMESTAMP})"
    })
    int insert(FmAccountRoleEntity record);

    @InsertProvider(type=FmAccountRoleEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmAccountRoleEntity record);

    @SelectProvider(type=FmAccountRoleEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="I_ROLE_ID", property="iRoleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ACCOUNT_ID", property="iAccountId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FmAccountRoleEntity> selectByExample(FmAccountRoleEntityExample example);

    @Select({
        "select",
        "I_ROLE_ID, I_ACCOUNT_ID, I_CREATER_ID, D_CREATED_TIME",
        "from fm_authority_account_role",
        "where I_ROLE_ID = #{iRoleId,jdbcType=INTEGER}",
          "and I_ACCOUNT_ID = #{iAccountId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="I_ROLE_ID", property="iRoleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ACCOUNT_ID", property="iAccountId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    FmAccountRoleEntity selectByPrimaryKey(@Param("iRoleId") Integer iRoleId, @Param("iAccountId") Integer iAccountId);

    @UpdateProvider(type=FmAccountRoleEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmAccountRoleEntity record, @Param("example") FmAccountRoleEntityExample example);

    @UpdateProvider(type=FmAccountRoleEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmAccountRoleEntity record, @Param("example") FmAccountRoleEntityExample example);

    @UpdateProvider(type=FmAccountRoleEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmAccountRoleEntity record);

    @Update({
        "update fm_authority_account_role",
        "set I_CREATER_ID = #{iCreaterId,jdbcType=INTEGER},",
          "D_CREATED_TIME = #{dCreatedTime,jdbcType=TIMESTAMP}",
        "where I_ROLE_ID = #{iRoleId,jdbcType=INTEGER}",
          "and I_ACCOUNT_ID = #{iAccountId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmAccountRoleEntity record);
}