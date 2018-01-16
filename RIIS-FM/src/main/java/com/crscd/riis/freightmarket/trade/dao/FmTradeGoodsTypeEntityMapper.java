package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsTypeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeGoodsTypeEntityExample;
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

public interface FmTradeGoodsTypeEntityMapper {
    @SelectProvider(type=FmTradeGoodsTypeEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeGoodsTypeEntityExample example);

    @DeleteProvider(type=FmTradeGoodsTypeEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeGoodsTypeEntityExample example);

    @Delete({
        "delete from fm_trade_goods_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_goods_type (id, C_GOODS_TYPE_NAME, ",
        "C_COODS_CODE, C_GOODS_NAME_SPELL_ALL, ",
        "C_GOODS_NAME_SPELL_SHORTH)",
        "values (#{id,jdbcType=INTEGER}, #{cGoodsTypeName,jdbcType=VARCHAR}, ",
        "#{cCoodsCode,jdbcType=VARCHAR}, #{cGoodsNameSpellAll,jdbcType=VARCHAR}, ",
        "#{cGoodsNameSpellShorth,jdbcType=VARCHAR})"
    })
    int insert(FmTradeGoodsTypeEntity record);

    @InsertProvider(type=FmTradeGoodsTypeEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeGoodsTypeEntity record);

    @SelectProvider(type=FmTradeGoodsTypeEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_GOODS_TYPE_NAME", property="cGoodsTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_COODS_CODE", property="cCoodsCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME_SPELL_ALL", property="cGoodsNameSpellAll", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME_SPELL_SHORTH", property="cGoodsNameSpellShorth", jdbcType=JdbcType.VARCHAR)
    })
    List<FmTradeGoodsTypeEntity> selectByExample(FmTradeGoodsTypeEntityExample example);

    @Select({
        "select",
        "id, C_GOODS_TYPE_NAME, C_COODS_CODE, C_GOODS_NAME_SPELL_ALL, C_GOODS_NAME_SPELL_SHORTH",
        "from fm_trade_goods_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_GOODS_TYPE_NAME", property="cGoodsTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_COODS_CODE", property="cCoodsCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME_SPELL_ALL", property="cGoodsNameSpellAll", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME_SPELL_SHORTH", property="cGoodsNameSpellShorth", jdbcType=JdbcType.VARCHAR)
    })
    FmTradeGoodsTypeEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmTradeGoodsTypeEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeGoodsTypeEntity record, @Param("example") FmTradeGoodsTypeEntityExample example);

    @UpdateProvider(type=FmTradeGoodsTypeEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeGoodsTypeEntity record, @Param("example") FmTradeGoodsTypeEntityExample example);

    @UpdateProvider(type=FmTradeGoodsTypeEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeGoodsTypeEntity record);

    @Update({
        "update fm_trade_goods_type",
        "set C_GOODS_TYPE_NAME = #{cGoodsTypeName,jdbcType=VARCHAR},",
          "C_COODS_CODE = #{cCoodsCode,jdbcType=VARCHAR},",
          "C_GOODS_NAME_SPELL_ALL = #{cGoodsNameSpellAll,jdbcType=VARCHAR},",
          "C_GOODS_NAME_SPELL_SHORTH = #{cGoodsNameSpellShorth,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeGoodsTypeEntity record);
}