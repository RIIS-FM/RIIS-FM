package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmTradeWaybillEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeWaybillEntityExample;
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

public interface FmTradeWaybillEntityMapper {
    @SelectProvider(type=FmTradeWaybillEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeWaybillEntityExample example);

    @DeleteProvider(type=FmTradeWaybillEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeWaybillEntityExample example);

    @Delete({
        "delete from fm_trade_waybill",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_waybill (id, I_ORDER_ID, ",
        "I_ORDER_TYPE_ID, I_ORDER_TYPE_NUM, ",
        "C_WAYBILL_CODE, D_WAYBILL_CREATE_TIME, ",
        "I_WAYBILL_STATE, D_WAYBILL_TIME, ",
        "I_WAYBILL_DATELINE, D_WAYBILL_PREDICT_ARRIVE_TIME, ",
        "D_WAYBILL_PREDICT_UNLOAD_START_TIME, D_WAYBILL_PREDICT_UNLOAD_END_TIME, ",
        "D_WAYBILL_PREDICT_SENDER_TIME, D_WAYBILL_PREDICT_LOAD_START_TIME, ",
        "D_WAYBILL_PREDICT_LOAD_END_TIME, I_WAYBILL_BOX_SEAL_NUM, ",
        "I_WAYBILL_BOX_TYPE, I_WAYBILL_BOX_NUM, ",
        "I_WAYBILL_GOODS_REINFORCE, I_WAYBILL_GOODS_WRAPPER, ",
        "F_WAYBILL_CANVAS_NUMBER, F_WAYBILL_TRAIN_TYPE, ",
        "C_WAYBILL_TRAIN_NUM, I_WAYBILL_TRAIN_NUMBER_CHARGE, ",
        "I_WAYBILL_BOX_NUMBER_CHARGE, I_WAYBILL_GOODS_NUMBER_CHARGE, ",
        "I_PRICE_NO, F_PRICE_RATE, ",
        "F_WAYBILL_INCIDENTALS_PAID, F_WAYBILL_ELECTRICT_FEE, ",
        "F_WAYBILL_CONSTRUCT_FEE, I_WAYBILL_PAYMENT_METHOD, ",
        "I_WAYBILL_PAYMENT_STATE)",
        "values (#{id,jdbcType=INTEGER}, #{iOrderId,jdbcType=INTEGER}, ",
        "#{iOrderTypeId,jdbcType=INTEGER}, #{iOrderTypeNum,jdbcType=INTEGER}, ",
        "#{cWaybillCode,jdbcType=VARCHAR}, #{dWaybillCreateTime,jdbcType=TIMESTAMP}, ",
        "#{iWaybillState,jdbcType=INTEGER}, #{dWaybillTime,jdbcType=TIMESTAMP}, ",
        "#{iWaybillDateline,jdbcType=INTEGER}, #{dWaybillPredictArriveTime,jdbcType=TIMESTAMP}, ",
        "#{dWaybillPredictUnloadStartTime,jdbcType=TIMESTAMP}, #{dWaybillPredictUnloadEndTime,jdbcType=TIMESTAMP}, ",
        "#{dWaybillPredictSenderTime,jdbcType=TIMESTAMP}, #{dWaybillPredictLoadStartTime,jdbcType=TIMESTAMP}, ",
        "#{dWaybillPredictLoadEndTime,jdbcType=TIMESTAMP}, #{iWaybillBoxSealNum,jdbcType=INTEGER}, ",
        "#{iWaybillBoxType,jdbcType=INTEGER}, #{iWaybillBoxNum,jdbcType=INTEGER}, ",
        "#{iWaybillGoodsReinforce,jdbcType=INTEGER}, #{iWaybillGoodsWrapper,jdbcType=INTEGER}, ",
        "#{fWaybillCanvasNumber,jdbcType=REAL}, #{fWaybillTrainType,jdbcType=REAL}, ",
        "#{cWaybillTrainNum,jdbcType=VARCHAR}, #{iWaybillTrainNumberCharge,jdbcType=INTEGER}, ",
        "#{iWaybillBoxNumberCharge,jdbcType=INTEGER}, #{iWaybillGoodsNumberCharge,jdbcType=INTEGER}, ",
        "#{iPriceNo,jdbcType=INTEGER}, #{fPriceRate,jdbcType=REAL}, ",
        "#{fWaybillIncidentalsPaid,jdbcType=REAL}, #{fWaybillElectrictFee,jdbcType=REAL}, ",
        "#{fWaybillConstructFee,jdbcType=REAL}, #{iWaybillPaymentMethod,jdbcType=INTEGER}, ",
        "#{iWaybillPaymentState,jdbcType=INTEGER})"
    })
    int insert(FmTradeWaybillEntity record);

    @InsertProvider(type=FmTradeWaybillEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeWaybillEntity record);

    @SelectProvider(type=FmTradeWaybillEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_NUM", property="iOrderTypeNum", jdbcType=JdbcType.INTEGER),
        @Result(column="C_WAYBILL_CODE", property="cWaybillCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_WAYBILL_CREATE_TIME", property="dWaybillCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_WAYBILL_STATE", property="iWaybillState", jdbcType=JdbcType.INTEGER),
        @Result(column="D_WAYBILL_TIME", property="dWaybillTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_WAYBILL_DATELINE", property="iWaybillDateline", jdbcType=JdbcType.INTEGER),
        @Result(column="D_WAYBILL_PREDICT_ARRIVE_TIME", property="dWaybillPredictArriveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_WAYBILL_PREDICT_UNLOAD_START_TIME", property="dWaybillPredictUnloadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_WAYBILL_PREDICT_UNLOAD_END_TIME", property="dWaybillPredictUnloadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_WAYBILL_PREDICT_SENDER_TIME", property="dWaybillPredictSenderTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_WAYBILL_PREDICT_LOAD_START_TIME", property="dWaybillPredictLoadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_WAYBILL_PREDICT_LOAD_END_TIME", property="dWaybillPredictLoadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_WAYBILL_BOX_SEAL_NUM", property="iWaybillBoxSealNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_BOX_TYPE", property="iWaybillBoxType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_BOX_NUM", property="iWaybillBoxNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_GOODS_REINFORCE", property="iWaybillGoodsReinforce", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_GOODS_WRAPPER", property="iWaybillGoodsWrapper", jdbcType=JdbcType.INTEGER),
        @Result(column="F_WAYBILL_CANVAS_NUMBER", property="fWaybillCanvasNumber", jdbcType=JdbcType.REAL),
        @Result(column="F_WAYBILL_TRAIN_TYPE", property="fWaybillTrainType", jdbcType=JdbcType.REAL),
        @Result(column="C_WAYBILL_TRAIN_NUM", property="cWaybillTrainNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_WAYBILL_TRAIN_NUMBER_CHARGE", property="iWaybillTrainNumberCharge", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_BOX_NUMBER_CHARGE", property="iWaybillBoxNumberCharge", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_GOODS_NUMBER_CHARGE", property="iWaybillGoodsNumberCharge", jdbcType=JdbcType.INTEGER),
        @Result(column="I_PRICE_NO", property="iPriceNo", jdbcType=JdbcType.INTEGER),
        @Result(column="F_PRICE_RATE", property="fPriceRate", jdbcType=JdbcType.REAL),
        @Result(column="F_WAYBILL_INCIDENTALS_PAID", property="fWaybillIncidentalsPaid", jdbcType=JdbcType.REAL),
        @Result(column="F_WAYBILL_ELECTRICT_FEE", property="fWaybillElectrictFee", jdbcType=JdbcType.REAL),
        @Result(column="F_WAYBILL_CONSTRUCT_FEE", property="fWaybillConstructFee", jdbcType=JdbcType.REAL),
        @Result(column="I_WAYBILL_PAYMENT_METHOD", property="iWaybillPaymentMethod", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_PAYMENT_STATE", property="iWaybillPaymentState", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeWaybillEntity> selectByExample(FmTradeWaybillEntityExample example);

    @Select({
        "select",
        "id, I_ORDER_ID, I_ORDER_TYPE_ID, I_ORDER_TYPE_NUM, C_WAYBILL_CODE, D_WAYBILL_CREATE_TIME, ",
        "I_WAYBILL_STATE, D_WAYBILL_TIME, I_WAYBILL_DATELINE, D_WAYBILL_PREDICT_ARRIVE_TIME, ",
        "D_WAYBILL_PREDICT_UNLOAD_START_TIME, D_WAYBILL_PREDICT_UNLOAD_END_TIME, D_WAYBILL_PREDICT_SENDER_TIME, ",
        "D_WAYBILL_PREDICT_LOAD_START_TIME, D_WAYBILL_PREDICT_LOAD_END_TIME, I_WAYBILL_BOX_SEAL_NUM, ",
        "I_WAYBILL_BOX_TYPE, I_WAYBILL_BOX_NUM, I_WAYBILL_GOODS_REINFORCE, I_WAYBILL_GOODS_WRAPPER, ",
        "F_WAYBILL_CANVAS_NUMBER, F_WAYBILL_TRAIN_TYPE, C_WAYBILL_TRAIN_NUM, I_WAYBILL_TRAIN_NUMBER_CHARGE, ",
        "I_WAYBILL_BOX_NUMBER_CHARGE, I_WAYBILL_GOODS_NUMBER_CHARGE, I_PRICE_NO, F_PRICE_RATE, ",
        "F_WAYBILL_INCIDENTALS_PAID, F_WAYBILL_ELECTRICT_FEE, F_WAYBILL_CONSTRUCT_FEE, ",
        "I_WAYBILL_PAYMENT_METHOD, I_WAYBILL_PAYMENT_STATE",
        "from fm_trade_waybill",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_NUM", property="iOrderTypeNum", jdbcType=JdbcType.INTEGER),
        @Result(column="C_WAYBILL_CODE", property="cWaybillCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_WAYBILL_CREATE_TIME", property="dWaybillCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_WAYBILL_STATE", property="iWaybillState", jdbcType=JdbcType.INTEGER),
        @Result(column="D_WAYBILL_TIME", property="dWaybillTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_WAYBILL_DATELINE", property="iWaybillDateline", jdbcType=JdbcType.INTEGER),
        @Result(column="D_WAYBILL_PREDICT_ARRIVE_TIME", property="dWaybillPredictArriveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_WAYBILL_PREDICT_UNLOAD_START_TIME", property="dWaybillPredictUnloadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_WAYBILL_PREDICT_UNLOAD_END_TIME", property="dWaybillPredictUnloadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_WAYBILL_PREDICT_SENDER_TIME", property="dWaybillPredictSenderTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_WAYBILL_PREDICT_LOAD_START_TIME", property="dWaybillPredictLoadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_WAYBILL_PREDICT_LOAD_END_TIME", property="dWaybillPredictLoadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_WAYBILL_BOX_SEAL_NUM", property="iWaybillBoxSealNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_BOX_TYPE", property="iWaybillBoxType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_BOX_NUM", property="iWaybillBoxNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_GOODS_REINFORCE", property="iWaybillGoodsReinforce", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_GOODS_WRAPPER", property="iWaybillGoodsWrapper", jdbcType=JdbcType.INTEGER),
        @Result(column="F_WAYBILL_CANVAS_NUMBER", property="fWaybillCanvasNumber", jdbcType=JdbcType.REAL),
        @Result(column="F_WAYBILL_TRAIN_TYPE", property="fWaybillTrainType", jdbcType=JdbcType.REAL),
        @Result(column="C_WAYBILL_TRAIN_NUM", property="cWaybillTrainNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_WAYBILL_TRAIN_NUMBER_CHARGE", property="iWaybillTrainNumberCharge", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_BOX_NUMBER_CHARGE", property="iWaybillBoxNumberCharge", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_GOODS_NUMBER_CHARGE", property="iWaybillGoodsNumberCharge", jdbcType=JdbcType.INTEGER),
        @Result(column="I_PRICE_NO", property="iPriceNo", jdbcType=JdbcType.INTEGER),
        @Result(column="F_PRICE_RATE", property="fPriceRate", jdbcType=JdbcType.REAL),
        @Result(column="F_WAYBILL_INCIDENTALS_PAID", property="fWaybillIncidentalsPaid", jdbcType=JdbcType.REAL),
        @Result(column="F_WAYBILL_ELECTRICT_FEE", property="fWaybillElectrictFee", jdbcType=JdbcType.REAL),
        @Result(column="F_WAYBILL_CONSTRUCT_FEE", property="fWaybillConstructFee", jdbcType=JdbcType.REAL),
        @Result(column="I_WAYBILL_PAYMENT_METHOD", property="iWaybillPaymentMethod", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_PAYMENT_STATE", property="iWaybillPaymentState", jdbcType=JdbcType.INTEGER)
    })
    FmTradeWaybillEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmTradeWaybillEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeWaybillEntity record, @Param("example") FmTradeWaybillEntityExample example);

    @UpdateProvider(type=FmTradeWaybillEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeWaybillEntity record, @Param("example") FmTradeWaybillEntityExample example);

    @UpdateProvider(type=FmTradeWaybillEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeWaybillEntity record);

    @Update({
        "update fm_trade_waybill",
        "set I_ORDER_ID = #{iOrderId,jdbcType=INTEGER},",
          "I_ORDER_TYPE_ID = #{iOrderTypeId,jdbcType=INTEGER},",
          "I_ORDER_TYPE_NUM = #{iOrderTypeNum,jdbcType=INTEGER},",
          "C_WAYBILL_CODE = #{cWaybillCode,jdbcType=VARCHAR},",
          "D_WAYBILL_CREATE_TIME = #{dWaybillCreateTime,jdbcType=TIMESTAMP},",
          "I_WAYBILL_STATE = #{iWaybillState,jdbcType=INTEGER},",
          "D_WAYBILL_TIME = #{dWaybillTime,jdbcType=TIMESTAMP},",
          "I_WAYBILL_DATELINE = #{iWaybillDateline,jdbcType=INTEGER},",
          "D_WAYBILL_PREDICT_ARRIVE_TIME = #{dWaybillPredictArriveTime,jdbcType=TIMESTAMP},",
          "D_WAYBILL_PREDICT_UNLOAD_START_TIME = #{dWaybillPredictUnloadStartTime,jdbcType=TIMESTAMP},",
          "D_WAYBILL_PREDICT_UNLOAD_END_TIME = #{dWaybillPredictUnloadEndTime,jdbcType=TIMESTAMP},",
          "D_WAYBILL_PREDICT_SENDER_TIME = #{dWaybillPredictSenderTime,jdbcType=TIMESTAMP},",
          "D_WAYBILL_PREDICT_LOAD_START_TIME = #{dWaybillPredictLoadStartTime,jdbcType=TIMESTAMP},",
          "D_WAYBILL_PREDICT_LOAD_END_TIME = #{dWaybillPredictLoadEndTime,jdbcType=TIMESTAMP},",
          "I_WAYBILL_BOX_SEAL_NUM = #{iWaybillBoxSealNum,jdbcType=INTEGER},",
          "I_WAYBILL_BOX_TYPE = #{iWaybillBoxType,jdbcType=INTEGER},",
          "I_WAYBILL_BOX_NUM = #{iWaybillBoxNum,jdbcType=INTEGER},",
          "I_WAYBILL_GOODS_REINFORCE = #{iWaybillGoodsReinforce,jdbcType=INTEGER},",
          "I_WAYBILL_GOODS_WRAPPER = #{iWaybillGoodsWrapper,jdbcType=INTEGER},",
          "F_WAYBILL_CANVAS_NUMBER = #{fWaybillCanvasNumber,jdbcType=REAL},",
          "F_WAYBILL_TRAIN_TYPE = #{fWaybillTrainType,jdbcType=REAL},",
          "C_WAYBILL_TRAIN_NUM = #{cWaybillTrainNum,jdbcType=VARCHAR},",
          "I_WAYBILL_TRAIN_NUMBER_CHARGE = #{iWaybillTrainNumberCharge,jdbcType=INTEGER},",
          "I_WAYBILL_BOX_NUMBER_CHARGE = #{iWaybillBoxNumberCharge,jdbcType=INTEGER},",
          "I_WAYBILL_GOODS_NUMBER_CHARGE = #{iWaybillGoodsNumberCharge,jdbcType=INTEGER},",
          "I_PRICE_NO = #{iPriceNo,jdbcType=INTEGER},",
          "F_PRICE_RATE = #{fPriceRate,jdbcType=REAL},",
          "F_WAYBILL_INCIDENTALS_PAID = #{fWaybillIncidentalsPaid,jdbcType=REAL},",
          "F_WAYBILL_ELECTRICT_FEE = #{fWaybillElectrictFee,jdbcType=REAL},",
          "F_WAYBILL_CONSTRUCT_FEE = #{fWaybillConstructFee,jdbcType=REAL},",
          "I_WAYBILL_PAYMENT_METHOD = #{iWaybillPaymentMethod,jdbcType=INTEGER},",
          "I_WAYBILL_PAYMENT_STATE = #{iWaybillPaymentState,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeWaybillEntity record);
}