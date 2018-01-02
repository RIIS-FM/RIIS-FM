package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmGroupRoleEntity;
import com.crscd.riis.freightmarket.authority.entity.FmGroupRoleEntityExample;
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

public interface FmGroupRoleEntityMapper {
    @SelectProvider(type=FmGroupRoleEntitySqlProvider.class, method="countByExample")
    long countByExample(FmGroupRoleEntityExample example);

    @DeleteProvider(type=FmGroupRoleEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmGroupRoleEntityExample example);

    @Delete({
        "delete from fm_authority_group_role",
        "where I_ROLE_ID = #{iRoleId,jdbcType=INTEGER}",
          "and I_GROUP_ID = #{iGroupId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("iRoleId") Integer iRoleId, @Param("iGroupId") Integer iGroupId);

    @Insert({
        "insert into fm_authority_group_role (I_ROLE_ID, I_GROUP_ID, ",
        "I_CREATER_ID, D_CREATED_TIME)",
        "values (#{iRoleId,jdbcType=INTEGER}, #{iGroupId,jdbcType=INTEGER}, ",
        "#{iCreaterId,jdbcType=INTEGER}, #{dCreatedTime,jdbcType=TIMESTAMP})"
    })
    int insert(FmGroupRoleEntity record);

    @InsertProvider(type=FmGroupRoleEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmGroupRoleEntity record);

    @SelectProvider(type=FmGroupRoleEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="I_ROLE_ID", property="iRoleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_GROUP_ID", property="iGroupId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FmGroupRoleEntity> selectByExample(FmGroupRoleEntityExample example);

    @Select({
        "select",
        "I_ROLE_ID, I_GROUP_ID, I_CREATER_ID, D_CREATED_TIME",
        "from fm_authority_group_role",
        "where I_ROLE_ID = #{iRoleId,jdbcType=INTEGER}",
          "and I_GROUP_ID = #{iGroupId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="I_ROLE_ID", property="iRoleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_GROUP_ID", property="iGroupId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    FmGroupRoleEntity selectByPrimaryKey(@Param("iRoleId") Integer iRoleId, @Param("iGroupId") Integer iGroupId);

    @UpdateProvider(type=FmGroupRoleEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmGroupRoleEntity record, @Param("example") FmGroupRoleEntityExample example);

    @UpdateProvider(type=FmGroupRoleEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmGroupRoleEntity record, @Param("example") FmGroupRoleEntityExample example);

    @UpdateProvider(type=FmGroupRoleEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmGroupRoleEntity record);

    @Update({
        "update fm_authority_group_role",
        "set I_CREATER_ID = #{iCreaterId,jdbcType=INTEGER},",
          "D_CREATED_TIME = #{dCreatedTime,jdbcType=TIMESTAMP}",
        "where I_ROLE_ID = #{iRoleId,jdbcType=INTEGER}",
          "and I_GROUP_ID = #{iGroupId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmGroupRoleEntity record);
}