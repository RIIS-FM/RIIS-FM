package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmGroupEntity;
import com.crscd.riis.freightmarket.authority.entity.FmGroupEntityExample;
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

public interface FmGroupEntityMapper {
    @SelectProvider(type=FmGroupEntitySqlProvider.class, method="countByExample")
    long countByExample(FmGroupEntityExample example);

    @DeleteProvider(type=FmGroupEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmGroupEntityExample example);

    @Delete({
        "delete from fm_authority_group",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_authority_group (id, C_GROUP_NAME, ",
        "I_FATHER_GROUP_ID, I_CREATER_ID, ",
        "D_CREATED_TIME, C_REMARK)",
        "values (#{id,jdbcType=INTEGER}, #{cGroupName,jdbcType=VARCHAR}, ",
        "#{iFatherGroupId,jdbcType=INTEGER}, #{iCreaterId,jdbcType=INTEGER}, ",
        "#{dCreatedTime,jdbcType=TIMESTAMP}, #{cRemark,jdbcType=VARCHAR})"
    })
    int insert(FmGroupEntity record);

    @InsertProvider(type=FmGroupEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmGroupEntity record);

    @SelectProvider(type=FmGroupEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_GROUP_NAME", property="cGroupName", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_FATHER_GROUP_ID", property="iFatherGroupId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_REMARK", property="cRemark", jdbcType=JdbcType.VARCHAR)
    })
    List<FmGroupEntity> selectByExample(FmGroupEntityExample example);

    @Select({
        "select",
        "id, C_GROUP_NAME, I_FATHER_GROUP_ID, I_CREATER_ID, D_CREATED_TIME, C_REMARK",
        "from fm_authority_group",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_GROUP_NAME", property="cGroupName", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_FATHER_GROUP_ID", property="iFatherGroupId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_REMARK", property="cRemark", jdbcType=JdbcType.VARCHAR)
    })
    FmGroupEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmGroupEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmGroupEntity record, @Param("example") FmGroupEntityExample example);

    @UpdateProvider(type=FmGroupEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmGroupEntity record, @Param("example") FmGroupEntityExample example);

    @UpdateProvider(type=FmGroupEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmGroupEntity record);

    @Update({
        "update fm_authority_group",
        "set C_GROUP_NAME = #{cGroupName,jdbcType=VARCHAR},",
          "I_FATHER_GROUP_ID = #{iFatherGroupId,jdbcType=INTEGER},",
          "I_CREATER_ID = #{iCreaterId,jdbcType=INTEGER},",
          "D_CREATED_TIME = #{dCreatedTime,jdbcType=TIMESTAMP},",
          "C_REMARK = #{cRemark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmGroupEntity record);
}