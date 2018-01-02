package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmPerRoleEntity;
import com.crscd.riis.freightmarket.authority.entity.FmPerRoleEntityExample;
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

public interface FmPerRoleEntityMapper {
    @SelectProvider(type=FmPerRoleEntitySqlProvider.class, method="countByExample")
    long countByExample(FmPerRoleEntityExample example);

    @DeleteProvider(type=FmPerRoleEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmPerRoleEntityExample example);

    @Delete({
        "delete from fm_authority_per_role",
        "where I_PERMISSION_ID = #{iPermissionId,jdbcType=INTEGER}",
          "and I_ROLE_ID = #{iRoleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("iPermissionId") Integer iPermissionId, @Param("iRoleId") Integer iRoleId);

    @Insert({
        "insert into fm_authority_per_role (I_PERMISSION_ID, I_ROLE_ID, ",
        "I_CREATER_ID, D_CREATED_TIME)",
        "values (#{iPermissionId,jdbcType=INTEGER}, #{iRoleId,jdbcType=INTEGER}, ",
        "#{iCreaterId,jdbcType=INTEGER}, #{dCreatedTime,jdbcType=TIMESTAMP})"
    })
    int insert(FmPerRoleEntity record);

    @InsertProvider(type=FmPerRoleEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmPerRoleEntity record);

    @SelectProvider(type=FmPerRoleEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="I_PERMISSION_ID", property="iPermissionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ROLE_ID", property="iRoleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FmPerRoleEntity> selectByExample(FmPerRoleEntityExample example);

    @Select({
        "select",
        "I_PERMISSION_ID, I_ROLE_ID, I_CREATER_ID, D_CREATED_TIME",
        "from fm_authority_per_role",
        "where I_PERMISSION_ID = #{iPermissionId,jdbcType=INTEGER}",
          "and I_ROLE_ID = #{iRoleId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="I_PERMISSION_ID", property="iPermissionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ROLE_ID", property="iRoleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    FmPerRoleEntity selectByPrimaryKey(@Param("iPermissionId") Integer iPermissionId, @Param("iRoleId") Integer iRoleId);

    @UpdateProvider(type=FmPerRoleEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmPerRoleEntity record, @Param("example") FmPerRoleEntityExample example);

    @UpdateProvider(type=FmPerRoleEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmPerRoleEntity record, @Param("example") FmPerRoleEntityExample example);

    @UpdateProvider(type=FmPerRoleEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmPerRoleEntity record);

    @Update({
        "update fm_authority_per_role",
        "set I_CREATER_ID = #{iCreaterId,jdbcType=INTEGER},",
          "D_CREATED_TIME = #{dCreatedTime,jdbcType=TIMESTAMP}",
        "where I_PERMISSION_ID = #{iPermissionId,jdbcType=INTEGER}",
          "and I_ROLE_ID = #{iRoleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmPerRoleEntity record);
}