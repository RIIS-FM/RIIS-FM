package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmRoleEntity;
import com.crscd.riis.freightmarket.authority.entity.FmRoleEntityExample;
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

public interface FmRoleEntityMapper {
    @SelectProvider(type=FmRoleEntitySqlProvider.class, method="countByExample")
    long countByExample(FmRoleEntityExample example);

    @DeleteProvider(type=FmRoleEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmRoleEntityExample example);

    @Delete({
        "delete from fm_authority_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_authority_role (id, C_ROLE_NAME, ",
        "C_ROLE_DESP, I_CREATER_ID, ",
        "D_CREATED_TIME)",
        "values (#{id,jdbcType=INTEGER}, #{cRoleName,jdbcType=VARCHAR}, ",
        "#{cRoleDesp,jdbcType=VARCHAR}, #{iCreaterId,jdbcType=INTEGER}, ",
        "#{dCreatedTime,jdbcType=TIMESTAMP})"
    })
    int insert(FmRoleEntity record);

    @InsertProvider(type=FmRoleEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmRoleEntity record);

    @SelectProvider(type=FmRoleEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_ROLE_NAME", property="cRoleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_ROLE_DESP", property="cRoleDesp", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FmRoleEntity> selectByExample(FmRoleEntityExample example);

    @Select({
        "select",
        "id, C_ROLE_NAME, C_ROLE_DESP, I_CREATER_ID, D_CREATED_TIME",
        "from fm_authority_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_ROLE_NAME", property="cRoleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_ROLE_DESP", property="cRoleDesp", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    FmRoleEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmRoleEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmRoleEntity record, @Param("example") FmRoleEntityExample example);

    @UpdateProvider(type=FmRoleEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmRoleEntity record, @Param("example") FmRoleEntityExample example);

    @UpdateProvider(type=FmRoleEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmRoleEntity record);

    @Update({
        "update fm_authority_role",
        "set C_ROLE_NAME = #{cRoleName,jdbcType=VARCHAR},",
          "C_ROLE_DESP = #{cRoleDesp,jdbcType=VARCHAR},",
          "I_CREATER_ID = #{iCreaterId,jdbcType=INTEGER},",
          "D_CREATED_TIME = #{dCreatedTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmRoleEntity record);
}