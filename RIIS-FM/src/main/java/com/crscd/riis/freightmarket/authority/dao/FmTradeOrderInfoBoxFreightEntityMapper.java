package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBoxFreightEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBoxFreightEntityExample;
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

public interface FmTradeOrderInfoBoxFreightEntityMapper {
    @SelectProvider(type=FmTradeOrderInfoBoxFreightEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeOrderInfoBoxFreightEntityExample example);

    @DeleteProvider(type=FmTradeOrderInfoBoxFreightEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeOrderInfoBoxFreightEntityExample example);

    @Delete({
        "delete from fm_trade_order_info_box_freight",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_order_info_box_freight (id, I_ORDER_ID, ",
        "C_GOODS_NAME, C_GOODS_CODE, ",
        "C_GOODS_FEATURE, I_BOX_GET_TYPE, ",
        "I_BOX_NUMBER, I_BOX_TYPE, ",
        "I_BOX_NUM, I_BOX_SEAL_NUM, ",
        "D_BOX_RECVER_TIME, F_GOODS_WEIGHT, ",
        "C_SENDER_BOX_STATION, I_FULLBOX_IN_STATION, ",
        "I_SENDER_LINE_ID, I_RECVER_LINE_ID)",
        "values (#{id,jdbcType=INTEGER}, #{iOrderId,jdbcType=INTEGER}, ",
        "#{cGoodsName,jdbcType=VARCHAR}, #{cGoodsCode,jdbcType=VARCHAR}, ",
        "#{cGoodsFeature,jdbcType=VARCHAR}, #{iBoxGetType,jdbcType=INTEGER}, ",
        "#{iBoxNumber,jdbcType=INTEGER}, #{iBoxType,jdbcType=INTEGER}, ",
        "#{iBoxNum,jdbcType=INTEGER}, #{iBoxSealNum,jdbcType=INTEGER}, ",
        "#{dBoxRecverTime,jdbcType=TIMESTAMP}, #{fGoodsWeight,jdbcType=REAL}, ",
        "#{cSenderBoxStation,jdbcType=VARCHAR}, #{iFullboxInStation,jdbcType=INTEGER}, ",
        "#{iSenderLineId,jdbcType=INTEGER}, #{iRecverLineId,jdbcType=INTEGER})"
    })
    int insert(FmTradeOrderInfoBoxFreightEntity record);

    @InsertProvider(type=FmTradeOrderInfoBoxFreightEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeOrderInfoBoxFreightEntity record);

    @SelectProvider(type=FmTradeOrderInfoBoxFreightEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_CODE", property="cGoodsCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_FEATURE", property="cGoodsFeature", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_BOX_GET_TYPE", property="iBoxGetType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_NUMBER", property="iBoxNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_TYPE", property="iBoxType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_NUM", property="iBoxNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_SEAL_NUM", property="iBoxSealNum", jdbcType=JdbcType.INTEGER),
        @Result(column="D_BOX_RECVER_TIME", property="dBoxRecverTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="F_GOODS_WEIGHT", property="fGoodsWeight", jdbcType=JdbcType.REAL),
        @Result(column="C_SENDER_BOX_STATION", property="cSenderBoxStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_FULLBOX_IN_STATION", property="iFullboxInStation", jdbcType=JdbcType.INTEGER),
        @Result(column="I_SENDER_LINE_ID", property="iSenderLineId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_RECVER_LINE_ID", property="iRecverLineId", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeOrderInfoBoxFreightEntity> selectByExample(FmTradeOrderInfoBoxFreightEntityExample example);

    @Select({
        "select",
        "id, I_ORDER_ID, C_GOODS_NAME, C_GOODS_CODE, C_GOODS_FEATURE, I_BOX_GET_TYPE, ",
        "I_BOX_NUMBER, I_BOX_TYPE, I_BOX_NUM, I_BOX_SEAL_NUM, D_BOX_RECVER_TIME, F_GOODS_WEIGHT, ",
        "C_SENDER_BOX_STATION, I_FULLBOX_IN_STATION, I_SENDER_LINE_ID, I_RECVER_LINE_ID",
        "from fm_trade_order_info_box_freight",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_CODE", property="cGoodsCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_FEATURE", property="cGoodsFeature", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_BOX_GET_TYPE", property="iBoxGetType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_NUMBER", property="iBoxNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_TYPE", property="iBoxType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_NUM", property="iBoxNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_SEAL_NUM", property="iBoxSealNum", jdbcType=JdbcType.INTEGER),
        @Result(column="D_BOX_RECVER_TIME", property="dBoxRecverTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="F_GOODS_WEIGHT", property="fGoodsWeight", jdbcType=JdbcType.REAL),
        @Result(column="C_SENDER_BOX_STATION", property="cSenderBoxStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_FULLBOX_IN_STATION", property="iFullboxInStation", jdbcType=JdbcType.INTEGER),
        @Result(column="I_SENDER_LINE_ID", property="iSenderLineId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_RECVER_LINE_ID", property="iRecverLineId", jdbcType=JdbcType.INTEGER)
    })
    FmTradeOrderInfoBoxFreightEntity selectByPrimaryKey(Integer id);
    
    @Select({
        "select",
        "id, I_ORDER_ID, C_GOODS_NAME, C_GOODS_CODE, C_GOODS_FEATURE, I_BOX_GET_TYPE, ",
        "I_BOX_NUMBER, I_BOX_TYPE, I_BOX_NUM, I_BOX_SEAL_NUM, D_BOX_RECVER_TIME, F_GOODS_WEIGHT, ",
        "C_SENDER_BOX_STATION, I_FULLBOX_IN_STATION, I_SENDER_LINE_ID, I_RECVER_LINE_ID",
        "from fm_trade_order_info_box_freight",
        "where I_ORDER_ID = #{orderId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_CODE", property="cGoodsCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_FEATURE", property="cGoodsFeature", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_BOX_GET_TYPE", property="iBoxGetType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_NUMBER", property="iBoxNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_TYPE", property="iBoxType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_NUM", property="iBoxNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_SEAL_NUM", property="iBoxSealNum", jdbcType=JdbcType.INTEGER),
        @Result(column="D_BOX_RECVER_TIME", property="dBoxRecverTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="F_GOODS_WEIGHT", property="fGoodsWeight", jdbcType=JdbcType.REAL),
        @Result(column="C_SENDER_BOX_STATION", property="cSenderBoxStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_FULLBOX_IN_STATION", property="iFullboxInStation", jdbcType=JdbcType.INTEGER),
        @Result(column="I_SENDER_LINE_ID", property="iSenderLineId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_RECVER_LINE_ID", property="iRecverLineId", jdbcType=JdbcType.INTEGER)
    })
    FmTradeOrderInfoBoxFreightEntity selectByOrderId(Integer orderId);

    @UpdateProvider(type=FmTradeOrderInfoBoxFreightEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeOrderInfoBoxFreightEntity record, @Param("example") FmTradeOrderInfoBoxFreightEntityExample example);

    @UpdateProvider(type=FmTradeOrderInfoBoxFreightEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeOrderInfoBoxFreightEntity record, @Param("example") FmTradeOrderInfoBoxFreightEntityExample example);

    @UpdateProvider(type=FmTradeOrderInfoBoxFreightEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeOrderInfoBoxFreightEntity record);

    @Update({
        "update fm_trade_order_info_box_freight",
        "set I_ORDER_ID = #{iOrderId,jdbcType=INTEGER},",
          "C_GOODS_NAME = #{cGoodsName,jdbcType=VARCHAR},",
          "C_GOODS_CODE = #{cGoodsCode,jdbcType=VARCHAR},",
          "C_GOODS_FEATURE = #{cGoodsFeature,jdbcType=VARCHAR},",
          "I_BOX_GET_TYPE = #{iBoxGetType,jdbcType=INTEGER},",
          "I_BOX_NUMBER = #{iBoxNumber,jdbcType=INTEGER},",
          "I_BOX_TYPE = #{iBoxType,jdbcType=INTEGER},",
          "I_BOX_NUM = #{iBoxNum,jdbcType=INTEGER},",
          "I_BOX_SEAL_NUM = #{iBoxSealNum,jdbcType=INTEGER},",
          "D_BOX_RECVER_TIME = #{dBoxRecverTime,jdbcType=TIMESTAMP},",
          "F_GOODS_WEIGHT = #{fGoodsWeight,jdbcType=REAL},",
          "C_SENDER_BOX_STATION = #{cSenderBoxStation,jdbcType=VARCHAR},",
          "I_FULLBOX_IN_STATION = #{iFullboxInStation,jdbcType=INTEGER},",
          "I_SENDER_LINE_ID = #{iSenderLineId,jdbcType=INTEGER},",
          "I_RECVER_LINE_ID = #{iRecverLineId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeOrderInfoBoxFreightEntity record);
}