package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderTypeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderTypeEntityExample;
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

public interface FmTradeOrderTypeEntityMapper {
    @SelectProvider(type=FmTradeOrderTypeEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeOrderTypeEntityExample example);

    @DeleteProvider(type=FmTradeOrderTypeEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeOrderTypeEntityExample example);

    @Delete({
        "delete from fm_trade_order_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_order_type (id, I_TYPE_LABEL, ",
        "C_TYPE_VALUE, D_TYPE_CREATE_TIME, ",
        "D_TYPE_MODIFY_TIME, D_TYPE_DELETE_TIME, ",
        "I_TYPE_CREATER, I_TYPE_MODIFIER, ",
        "I_TYPE_DELETE)",
        "values (#{id,jdbcType=INTEGER}, #{iTypeLabel,jdbcType=INTEGER}, ",
        "#{cTypeValue,jdbcType=VARCHAR}, #{dTypeCreateTime,jdbcType=TIMESTAMP}, ",
        "#{dTypeModifyTime,jdbcType=TIMESTAMP}, #{dTypeDeleteTime,jdbcType=TIMESTAMP}, ",
        "#{iTypeCreater,jdbcType=INTEGER}, #{iTypeModifier,jdbcType=INTEGER}, ",
        "#{iTypeDelete,jdbcType=INTEGER})"
    })
    int insert(FmTradeOrderTypeEntity record);

    @InsertProvider(type=FmTradeOrderTypeEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeOrderTypeEntity record);

    @SelectProvider(type=FmTradeOrderTypeEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_TYPE_LABEL", property="iTypeLabel", jdbcType=JdbcType.INTEGER),
        @Result(column="C_TYPE_VALUE", property="cTypeValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_TYPE_CREATE_TIME", property="dTypeCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TYPE_MODIFY_TIME", property="dTypeModifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TYPE_DELETE_TIME", property="dTypeDeleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_TYPE_CREATER", property="iTypeCreater", jdbcType=JdbcType.INTEGER),
        @Result(column="I_TYPE_MODIFIER", property="iTypeModifier", jdbcType=JdbcType.INTEGER),
        @Result(column="I_TYPE_DELETE", property="iTypeDelete", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeOrderTypeEntity> selectByExample(FmTradeOrderTypeEntityExample example);

    @Select({
        "select",
        "id, I_TYPE_LABEL, C_TYPE_VALUE, D_TYPE_CREATE_TIME, D_TYPE_MODIFY_TIME, D_TYPE_DELETE_TIME, ",
        "I_TYPE_CREATER, I_TYPE_MODIFIER, I_TYPE_DELETE",
        "from fm_trade_order_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_TYPE_LABEL", property="iTypeLabel", jdbcType=JdbcType.INTEGER),
        @Result(column="C_TYPE_VALUE", property="cTypeValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_TYPE_CREATE_TIME", property="dTypeCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TYPE_MODIFY_TIME", property="dTypeModifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TYPE_DELETE_TIME", property="dTypeDeleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_TYPE_CREATER", property="iTypeCreater", jdbcType=JdbcType.INTEGER),
        @Result(column="I_TYPE_MODIFIER", property="iTypeModifier", jdbcType=JdbcType.INTEGER),
        @Result(column="I_TYPE_DELETE", property="iTypeDelete", jdbcType=JdbcType.INTEGER)
    })
    FmTradeOrderTypeEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmTradeOrderTypeEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeOrderTypeEntity record, @Param("example") FmTradeOrderTypeEntityExample example);

    @UpdateProvider(type=FmTradeOrderTypeEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeOrderTypeEntity record, @Param("example") FmTradeOrderTypeEntityExample example);

    @UpdateProvider(type=FmTradeOrderTypeEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeOrderTypeEntity record);

    @Update({
        "update fm_trade_order_type",
        "set I_TYPE_LABEL = #{iTypeLabel,jdbcType=INTEGER},",
          "C_TYPE_VALUE = #{cTypeValue,jdbcType=VARCHAR},",
          "D_TYPE_CREATE_TIME = #{dTypeCreateTime,jdbcType=TIMESTAMP},",
          "D_TYPE_MODIFY_TIME = #{dTypeModifyTime,jdbcType=TIMESTAMP},",
          "D_TYPE_DELETE_TIME = #{dTypeDeleteTime,jdbcType=TIMESTAMP},",
          "I_TYPE_CREATER = #{iTypeCreater,jdbcType=INTEGER},",
          "I_TYPE_MODIFIER = #{iTypeModifier,jdbcType=INTEGER},",
          "I_TYPE_DELETE = #{iTypeDelete,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeOrderTypeEntity record);
}