package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoWholeVegicleFreightEntityExample;
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

public interface FmTradeOrderInfoWholeVegicleFreightEntityMapper {
    @SelectProvider(type=FmTradeOrderInfoWholeVegicleFreightEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeOrderInfoWholeVegicleFreightEntityExample example);

    @DeleteProvider(type=FmTradeOrderInfoWholeVegicleFreightEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeOrderInfoWholeVegicleFreightEntityExample example);

    @Delete({
        "delete from fm_trade_order_info_whole_vegicle_freight",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_order_info_whole_vegicle_freight (id, I_ORDER_ID, ",
        "C_GOODS_NAME, C_GOODS_CODE, ",
        "F_GOODS_WIGHT, F_GOODS_VOLUME, ",
        "C_GOODS_FEATURE, F_EACH_GOODS_MAX_WEIGHT, ",
        "I_GOODS_REQUEST_TRAIN_NUMBER, I_GOODS_SEAL_NUM, ",
        "I_GOODS_REINFORCE, I_GOODS_WRAPPER, ",
        "I_CANVAS_NUMBER, I_TRAIN_TYPE, ",
        "I_SENDER_LINE_ID, I_RECVER_LINE_ID)",
        "values (#{id,jdbcType=INTEGER}, #{iOrderId,jdbcType=INTEGER}, ",
        "#{cGoodsName,jdbcType=VARCHAR}, #{cGoodsCode,jdbcType=VARCHAR}, ",
        "#{fGoodsWight,jdbcType=REAL}, #{fGoodsVolume,jdbcType=REAL}, ",
        "#{cGoodsFeature,jdbcType=VARCHAR}, #{fEachGoodsMaxWeight,jdbcType=REAL}, ",
        "#{iGoodsRequestTrainNumber,jdbcType=INTEGER}, #{iGoodsSealNum,jdbcType=INTEGER}, ",
        "#{iGoodsReinforce,jdbcType=INTEGER}, #{iGoodsWrapper,jdbcType=INTEGER}, ",
        "#{iCanvasNumber,jdbcType=INTEGER}, #{iTrainType,jdbcType=INTEGER}, ",
        "#{iSenderLineId,jdbcType=INTEGER}, #{iRecverLineId,jdbcType=INTEGER})"
    })
    int insert(FmTradeOrderInfoWholeVegicleFreightEntity record);

    @InsertProvider(type=FmTradeOrderInfoWholeVegicleFreightEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeOrderInfoWholeVegicleFreightEntity record);

    @SelectProvider(type=FmTradeOrderInfoWholeVegicleFreightEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_CODE", property="cGoodsCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_GOODS_WIGHT", property="fGoodsWight", jdbcType=JdbcType.REAL),
        @Result(column="F_GOODS_VOLUME", property="fGoodsVolume", jdbcType=JdbcType.REAL),
        @Result(column="C_GOODS_FEATURE", property="cGoodsFeature", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_EACH_GOODS_MAX_WEIGHT", property="fEachGoodsMaxWeight", jdbcType=JdbcType.REAL),
        @Result(column="I_GOODS_REQUEST_TRAIN_NUMBER", property="iGoodsRequestTrainNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_SEAL_NUM", property="iGoodsSealNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_REINFORCE", property="iGoodsReinforce", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_WRAPPER", property="iGoodsWrapper", jdbcType=JdbcType.INTEGER),
        @Result(column="I_CANVAS_NUMBER", property="iCanvasNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="I_TRAIN_TYPE", property="iTrainType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_SENDER_LINE_ID", property="iSenderLineId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_RECVER_LINE_ID", property="iRecverLineId", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeOrderInfoWholeVegicleFreightEntity> selectByExample(FmTradeOrderInfoWholeVegicleFreightEntityExample example);

    @Select({
        "select",
        "id, I_ORDER_ID, C_GOODS_NAME, C_GOODS_CODE, F_GOODS_WIGHT, F_GOODS_VOLUME, C_GOODS_FEATURE, ",
        "F_EACH_GOODS_MAX_WEIGHT, I_GOODS_REQUEST_TRAIN_NUMBER, I_GOODS_SEAL_NUM, I_GOODS_REINFORCE, ",
        "I_GOODS_WRAPPER, I_CANVAS_NUMBER, I_TRAIN_TYPE, I_SENDER_LINE_ID, I_RECVER_LINE_ID",
        "from fm_trade_order_info_whole_vegicle_freight",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_CODE", property="cGoodsCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_GOODS_WIGHT", property="fGoodsWight", jdbcType=JdbcType.REAL),
        @Result(column="F_GOODS_VOLUME", property="fGoodsVolume", jdbcType=JdbcType.REAL),
        @Result(column="C_GOODS_FEATURE", property="cGoodsFeature", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_EACH_GOODS_MAX_WEIGHT", property="fEachGoodsMaxWeight", jdbcType=JdbcType.REAL),
        @Result(column="I_GOODS_REQUEST_TRAIN_NUMBER", property="iGoodsRequestTrainNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_SEAL_NUM", property="iGoodsSealNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_REINFORCE", property="iGoodsReinforce", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_WRAPPER", property="iGoodsWrapper", jdbcType=JdbcType.INTEGER),
        @Result(column="I_CANVAS_NUMBER", property="iCanvasNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="I_TRAIN_TYPE", property="iTrainType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_SENDER_LINE_ID", property="iSenderLineId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_RECVER_LINE_ID", property="iRecverLineId", jdbcType=JdbcType.INTEGER)
    })
    FmTradeOrderInfoWholeVegicleFreightEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmTradeOrderInfoWholeVegicleFreightEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeOrderInfoWholeVegicleFreightEntity record, @Param("example") FmTradeOrderInfoWholeVegicleFreightEntityExample example);

    @UpdateProvider(type=FmTradeOrderInfoWholeVegicleFreightEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeOrderInfoWholeVegicleFreightEntity record, @Param("example") FmTradeOrderInfoWholeVegicleFreightEntityExample example);

    @UpdateProvider(type=FmTradeOrderInfoWholeVegicleFreightEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeOrderInfoWholeVegicleFreightEntity record);

    @Update({
        "update fm_trade_order_info_whole_vegicle_freight",
        "set I_ORDER_ID = #{iOrderId,jdbcType=INTEGER},",
          "C_GOODS_NAME = #{cGoodsName,jdbcType=VARCHAR},",
          "C_GOODS_CODE = #{cGoodsCode,jdbcType=VARCHAR},",
          "F_GOODS_WIGHT = #{fGoodsWight,jdbcType=REAL},",
          "F_GOODS_VOLUME = #{fGoodsVolume,jdbcType=REAL},",
          "C_GOODS_FEATURE = #{cGoodsFeature,jdbcType=VARCHAR},",
          "F_EACH_GOODS_MAX_WEIGHT = #{fEachGoodsMaxWeight,jdbcType=REAL},",
          "I_GOODS_REQUEST_TRAIN_NUMBER = #{iGoodsRequestTrainNumber,jdbcType=INTEGER},",
          "I_GOODS_SEAL_NUM = #{iGoodsSealNum,jdbcType=INTEGER},",
          "I_GOODS_REINFORCE = #{iGoodsReinforce,jdbcType=INTEGER},",
          "I_GOODS_WRAPPER = #{iGoodsWrapper,jdbcType=INTEGER},",
          "I_CANVAS_NUMBER = #{iCanvasNumber,jdbcType=INTEGER},",
          "I_TRAIN_TYPE = #{iTrainType,jdbcType=INTEGER},",
          "I_SENDER_LINE_ID = #{iSenderLineId,jdbcType=INTEGER},",
          "I_RECVER_LINE_ID = #{iRecverLineId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeOrderInfoWholeVegicleFreightEntity record);
}