package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmOperationEntity;
import com.crscd.riis.freightmarket.authority.entity.FmOperationEntityExample;
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

public interface FmOperationEntityMapper {
    @SelectProvider(type=FmOperationEntitySqlProvider.class, method="countByExample")
    long countByExample(FmOperationEntityExample example);

    @DeleteProvider(type=FmOperationEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmOperationEntityExample example);

    @Delete({
        "delete from fm_authority_operation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_authority_operation (id, C_OPERATION_NAME, ",
        "C_OPERATION_URL, I_CREATER_ID, ",
        "D_CREATED_TIME)",
        "values (#{id,jdbcType=INTEGER}, #{cOperationName,jdbcType=VARCHAR}, ",
        "#{cOperationUrl,jdbcType=VARCHAR}, #{iCreaterId,jdbcType=INTEGER}, ",
        "#{dCreatedTime,jdbcType=TIMESTAMP})"
    })
    int insert(FmOperationEntity record);

    @InsertProvider(type=FmOperationEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmOperationEntity record);

    @SelectProvider(type=FmOperationEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_OPERATION_NAME", property="cOperationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_OPERATION_URL", property="cOperationUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FmOperationEntity> selectByExample(FmOperationEntityExample example);

    @Select({
        "select",
        "id, C_OPERATION_NAME, C_OPERATION_URL, I_CREATER_ID, D_CREATED_TIME",
        "from fm_authority_operation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_OPERATION_NAME", property="cOperationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_OPERATION_URL", property="cOperationUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CREATER_ID", property="iCreaterId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_CREATED_TIME", property="dCreatedTime", jdbcType=JdbcType.TIMESTAMP)
    })
    FmOperationEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmOperationEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmOperationEntity record, @Param("example") FmOperationEntityExample example);

    @UpdateProvider(type=FmOperationEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmOperationEntity record, @Param("example") FmOperationEntityExample example);

    @UpdateProvider(type=FmOperationEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmOperationEntity record);

    @Update({
        "update fm_authority_operation",
        "set C_OPERATION_NAME = #{cOperationName,jdbcType=VARCHAR},",
          "C_OPERATION_URL = #{cOperationUrl,jdbcType=VARCHAR},",
          "I_CREATER_ID = #{iCreaterId,jdbcType=INTEGER},",
          "D_CREATED_TIME = #{dCreatedTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmOperationEntity record);
}