package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoFastFreightEntityExample;
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

public interface FmTradeOrderInfoFastFreightEntityMapper {
    @SelectProvider(type=FmTradeOrderInfoFastFreightEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeOrderInfoFastFreightEntityExample example);

    @DeleteProvider(type=FmTradeOrderInfoFastFreightEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeOrderInfoFastFreightEntityExample example);

    @Delete({
        "delete from fm_trade_order_info_fast_freight",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_order_info_fast_freight (id, I_ORDER_ID, ",
        "C_GOODS_NAME, C_GOODS_CODE, ",
        "F_GOODS_WEIGHT, F_GOODS_VOLUME, ",
        "F_EACH_GOODS_MAX_WEIGHT, C_GOODS_WRAPPER, ",
        "C_GOODS_FEATURE, C_TRAIN_NUM, ",
        "I_GOODS_NUMBER)",
        "values (#{id,jdbcType=INTEGER}, #{iOrderId,jdbcType=INTEGER}, ",
        "#{cGoodsName,jdbcType=VARCHAR}, #{cGoodsCode,jdbcType=VARCHAR}, ",
        "#{fGoodsWeight,jdbcType=REAL}, #{fGoodsVolume,jdbcType=REAL}, ",
        "#{fEachGoodsMaxWeight,jdbcType=REAL}, #{cGoodsWrapper,jdbcType=VARCHAR}, ",
        "#{cGoodsFeature,jdbcType=VARCHAR}, #{cTrainNum,jdbcType=VARCHAR}, ",
        "#{iGoodsNumber,jdbcType=INTEGER})"
    })
    int insert(FmTradeOrderInfoFastFreightEntity record);

    @InsertProvider(type=FmTradeOrderInfoFastFreightEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeOrderInfoFastFreightEntity record);

    @SelectProvider(type=FmTradeOrderInfoFastFreightEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_CODE", property="cGoodsCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_GOODS_WEIGHT", property="fGoodsWeight", jdbcType=JdbcType.REAL),
        @Result(column="F_GOODS_VOLUME", property="fGoodsVolume", jdbcType=JdbcType.REAL),
        @Result(column="F_EACH_GOODS_MAX_WEIGHT", property="fEachGoodsMaxWeight", jdbcType=JdbcType.REAL),
        @Result(column="C_GOODS_WRAPPER", property="cGoodsWrapper", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_FEATURE", property="cGoodsFeature", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRAIN_NUM", property="cTrainNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_GOODS_NUMBER", property="iGoodsNumber", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeOrderInfoFastFreightEntity> selectByExample(FmTradeOrderInfoFastFreightEntityExample example);

    @Select({
        "select",
        "id, I_ORDER_ID, C_GOODS_NAME, C_GOODS_CODE, F_GOODS_WEIGHT, F_GOODS_VOLUME, ",
        "F_EACH_GOODS_MAX_WEIGHT, C_GOODS_WRAPPER, C_GOODS_FEATURE, C_TRAIN_NUM, I_GOODS_NUMBER",
        "from fm_trade_order_info_fast_freight",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_CODE", property="cGoodsCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_GOODS_WEIGHT", property="fGoodsWeight", jdbcType=JdbcType.REAL),
        @Result(column="F_GOODS_VOLUME", property="fGoodsVolume", jdbcType=JdbcType.REAL),
        @Result(column="F_EACH_GOODS_MAX_WEIGHT", property="fEachGoodsMaxWeight", jdbcType=JdbcType.REAL),
        @Result(column="C_GOODS_WRAPPER", property="cGoodsWrapper", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_FEATURE", property="cGoodsFeature", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRAIN_NUM", property="cTrainNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_GOODS_NUMBER", property="iGoodsNumber", jdbcType=JdbcType.INTEGER)
    })
    FmTradeOrderInfoFastFreightEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmTradeOrderInfoFastFreightEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeOrderInfoFastFreightEntity record, @Param("example") FmTradeOrderInfoFastFreightEntityExample example);

    @UpdateProvider(type=FmTradeOrderInfoFastFreightEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeOrderInfoFastFreightEntity record, @Param("example") FmTradeOrderInfoFastFreightEntityExample example);

    @UpdateProvider(type=FmTradeOrderInfoFastFreightEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeOrderInfoFastFreightEntity record);

    @Update({
        "update fm_trade_order_info_fast_freight",
        "set I_ORDER_ID = #{iOrderId,jdbcType=INTEGER},",
          "C_GOODS_NAME = #{cGoodsName,jdbcType=VARCHAR},",
          "C_GOODS_CODE = #{cGoodsCode,jdbcType=VARCHAR},",
          "F_GOODS_WEIGHT = #{fGoodsWeight,jdbcType=REAL},",
          "F_GOODS_VOLUME = #{fGoodsVolume,jdbcType=REAL},",
          "F_EACH_GOODS_MAX_WEIGHT = #{fEachGoodsMaxWeight,jdbcType=REAL},",
          "C_GOODS_WRAPPER = #{cGoodsWrapper,jdbcType=VARCHAR},",
          "C_GOODS_FEATURE = #{cGoodsFeature,jdbcType=VARCHAR},",
          "C_TRAIN_NUM = #{cTrainNum,jdbcType=VARCHAR},",
          "I_GOODS_NUMBER = #{iGoodsNumber,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeOrderInfoFastFreightEntity record);
}