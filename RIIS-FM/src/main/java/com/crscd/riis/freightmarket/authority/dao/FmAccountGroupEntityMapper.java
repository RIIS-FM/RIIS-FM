package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmAccountGroupEntity;
import com.crscd.riis.freightmarket.authority.entity.FmAccountGroupEntityExample;
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

public interface FmAccountGroupEntityMapper {
    @SelectProvider(type=FmAccountGroupEntitySqlProvider.class, method="countByExample")
    long countByExample(FmAccountGroupEntityExample example);

    @DeleteProvider(type=FmAccountGroupEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmAccountGroupEntityExample example);

    @Delete({
        "delete from fm_authority_account_group",
        "where I_GROUP_ID = #{iGroupId,jdbcType=INTEGER}",
          "and I_ACCOUNT_ID = #{iAccountId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("iGroupId") Integer iGroupId, @Param("iAccountId") Integer iAccountId);

    @Insert({
        "insert into fm_authority_account_group (I_GROUP_ID, I_ACCOUNT_ID, ",
        "I_CREATOR, D_DATE)",
        "values (#{iGroupId,jdbcType=INTEGER}, #{iAccountId,jdbcType=INTEGER}, ",
        "#{iCreator,jdbcType=INTEGER}, #{dDate,jdbcType=TIMESTAMP})"
    })
    int insert(FmAccountGroupEntity record);

    @InsertProvider(type=FmAccountGroupEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmAccountGroupEntity record);

    @SelectProvider(type=FmAccountGroupEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="I_GROUP_ID", property="iGroupId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ACCOUNT_ID", property="iAccountId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_CREATOR", property="iCreator", jdbcType=JdbcType.INTEGER),
        @Result(column="D_DATE", property="dDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FmAccountGroupEntity> selectByExample(FmAccountGroupEntityExample example);

    @Select({
        "select",
        "I_GROUP_ID, I_ACCOUNT_ID, I_CREATOR, D_DATE",
        "from fm_authority_account_group",
        "where I_GROUP_ID = #{iGroupId,jdbcType=INTEGER}",
          "and I_ACCOUNT_ID = #{iAccountId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="I_GROUP_ID", property="iGroupId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ACCOUNT_ID", property="iAccountId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_CREATOR", property="iCreator", jdbcType=JdbcType.INTEGER),
        @Result(column="D_DATE", property="dDate", jdbcType=JdbcType.TIMESTAMP)
    })
    FmAccountGroupEntity selectByPrimaryKey(@Param("iGroupId") Integer iGroupId, @Param("iAccountId") Integer iAccountId);

    @UpdateProvider(type=FmAccountGroupEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmAccountGroupEntity record, @Param("example") FmAccountGroupEntityExample example);

    @UpdateProvider(type=FmAccountGroupEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmAccountGroupEntity record, @Param("example") FmAccountGroupEntityExample example);

    @UpdateProvider(type=FmAccountGroupEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmAccountGroupEntity record);

    @Update({
        "update fm_authority_account_group",
        "set I_CREATOR = #{iCreator,jdbcType=INTEGER},",
          "D_DATE = #{dDate,jdbcType=TIMESTAMP}",
        "where I_GROUP_ID = #{iGroupId,jdbcType=INTEGER}",
          "and I_ACCOUNT_ID = #{iAccountId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmAccountGroupEntity record);
}