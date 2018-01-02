package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmPermissionEntity;
import com.crscd.riis.freightmarket.authority.entity.FmPermissionEntityExample;
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

public interface FmPermissionEntityMapper {
    @SelectProvider(type=FmPermissionEntitySqlProvider.class, method="countByExample")
    long countByExample(FmPermissionEntityExample example);

    @DeleteProvider(type=FmPermissionEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmPermissionEntityExample example);

    @Delete({
        "delete from fm_authority_permission",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_authority_permission (id, C_PERMISSION_NAME, ",
        "I_PERMISSION_TYPE, I_CREATER_ID, ",
        "D_CREATED_TIME)",
        "values (#{id,jdbcType=INTEGER}, #{cPermissionName,jdbcType=VARCHAR}, ",
        "#{iPermissionType,jdbcType=INTEGER}, #{iCreaterId,jdbcType=INTEGER}, ",
        "#{dCreatedTime,jdbcType=TIMESTAMP})"
    })
    int insert(FmPermissionEntity record);

    @InsertProvider(type=FmPermissionEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmPermissionEntity record);

    @SelectProvider(type=FmPermissionEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_PERMISSION_NAME", property="cPermissionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_PERMISSION_TYPE", property="iPermissionType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FmPermissionEntity> selectByExample(FmPermissionEntityExample example);

    @Select({
        "select",
        "id, C_PERMISSION_NAME, I_PERMISSION_TYPE, I_CREATER_ID, D_CREATED_TIME",
        "from fm_authority_permission",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_PERMISSION_NAME", property="cPermissionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_PERMISSION_TYPE", property="iPermissionType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    FmPermissionEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmPermissionEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmPermissionEntity record, @Param("example") FmPermissionEntityExample example);

    @UpdateProvider(type=FmPermissionEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmPermissionEntity record, @Param("example") FmPermissionEntityExample example);

    @UpdateProvider(type=FmPermissionEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmPermissionEntity record);

    @Update({
        "update fm_authority_permission",
        "set C_PERMISSION_NAME = #{cPermissionName,jdbcType=VARCHAR},",
          "I_PERMISSION_TYPE = #{iPermissionType,jdbcType=INTEGER},",
          "I_CREATER_ID = #{iCreaterId,jdbcType=INTEGER},",
          "D_CREATED_TIME = #{dCreatedTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmPermissionEntity record);
}