package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeOrderInfoBaseEntityExample;
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

public interface FmTradeOrderInfoBaseEntityMapper {
    @SelectProvider(type=FmTradeOrderInfoBaseEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeOrderInfoBaseEntityExample example);

    @DeleteProvider(type=FmTradeOrderInfoBaseEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeOrderInfoBaseEntityExample example);

    @Delete({
        "delete from fm_trade_order_info_base",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_order_info_base (id, C_ORDER_CODE, ",
        "I_ORDER_TYPE_ID, D_ORDER_DATELINE, ",
        "I_USER_TYPE, I_SENDER_ID, ",
        "I_RECVER_ID, I_SENDER_OPERATOR_ID, ",
        "I_RECVER_OPERATOR_ID, C_SENDER_NAME, ",
        "C_SENDER_ADDRESS, C_SENDER_PHONE, ",
        "C_SENDER_EMAIL, C_SENDER_POSTCODE, ",
        "C_SENDER_NOTE, C_SENDER_CITY, ",
        "C_LOAD_STATION, C_LOAD_LOCATION, ",
        "D_PREDICT_SEND_TIME, D_PREDICT_LOAD_START_TIME, ",
        "D_PREDICT_LOAD_END_TIME, C_RECVER_ADDRESS, ",
        "C_RECVER_PHONE, C_RECVER_EMAIL, ",
        "C_RECVER_POSTCODE, C_RECVER_CITY, ",
        "C_UNLOAD_STATION, C_UNLOAD_LOCATION, ",
        "C_ORDER_TYPE, I_ORDER_STATE, ",
        "I_ORDER_SPLITE, D_ORDER_CREATE_TIME, ",
        "D_ORDER_END_TIME, I_ORDER_DELETE, ",
        "D_ORDER_DELETE_TIME, D_ORDER_ALTER_TIME, ",
        "C_ACCESS_CODE, I_LOGISTICS_TYPE, ",
        "F_PROTECT_PRICE, F_INSURANCE_VALUE, ",
        "C_GOODS_NAME, C_GOODS_TYPE_CODE, ",
        "F_GOODS_WEIGHT, I_GOODS_REQUEST_TRAIN_NUMBER, ",
        "I_GOODS_REQUEST_BOX_NUMBER, F_GOODS_VOLUME, ",
        "I_GOODS_NUMBER, C_GOODS_WRAPPER, ",
        "I_GOODS_SEAL_NUM, I_GOODS_REINFORCE, ",
        "C_GOODS_FEATURE, F_EACH_GOODS_MAX_WEIGHT, ",
        "C_TRAIN_NUMBER, I_CANVAS_NUMBER, ",
        "C_PREDICT_TRAIN_TYPE, I_EXTRACT_CANVAS_TYPE, ",
        "I_SENDER_LINE_ID, I_BOX_SEAL_NUM, ",
        "I_RECVER_LINE_ID)",
        "values (#{id,jdbcType=INTEGER}, #{cOrderCode,jdbcType=VARCHAR}, ",
        "#{iOrderTypeId,jdbcType=INTEGER}, #{dOrderDateline,jdbcType=TIMESTAMP}, ",
        "#{iUserType,jdbcType=INTEGER}, #{iSenderId,jdbcType=INTEGER}, ",
        "#{iRecverId,jdbcType=INTEGER}, #{iSenderOperatorId,jdbcType=INTEGER}, ",
        "#{iRecverOperatorId,jdbcType=INTEGER}, #{cSenderName,jdbcType=VARCHAR}, ",
        "#{cSenderAddress,jdbcType=VARCHAR}, #{cSenderPhone,jdbcType=VARCHAR}, ",
        "#{cSenderEmail,jdbcType=VARCHAR}, #{cSenderPostcode,jdbcType=VARCHAR}, ",
        "#{cSenderNote,jdbcType=VARCHAR}, #{cSenderCity,jdbcType=VARCHAR}, ",
        "#{cLoadStation,jdbcType=VARCHAR}, #{cLoadLocation,jdbcType=VARCHAR}, ",
        "#{dPredictSendTime,jdbcType=TIMESTAMP}, #{dPredictLoadStartTime,jdbcType=TIMESTAMP}, ",
        "#{dPredictLoadEndTime,jdbcType=TIMESTAMP}, #{cRecverAddress,jdbcType=VARCHAR}, ",
        "#{cRecverPhone,jdbcType=VARCHAR}, #{cRecverEmail,jdbcType=VARCHAR}, ",
        "#{cRecverPostcode,jdbcType=VARCHAR}, #{cRecverCity,jdbcType=VARCHAR}, ",
        "#{cUnloadStation,jdbcType=VARCHAR}, #{cUnloadLocation,jdbcType=VARCHAR}, ",
        "#{cOrderType,jdbcType=VARCHAR}, #{iOrderState,jdbcType=INTEGER}, ",
        "#{iOrderSplite,jdbcType=INTEGER}, #{dOrderCreateTime,jdbcType=TIMESTAMP}, ",
        "#{dOrderEndTime,jdbcType=TIMESTAMP}, #{iOrderDelete,jdbcType=INTEGER}, ",
        "#{dOrderDeleteTime,jdbcType=TIMESTAMP}, #{dOrderAlterTime,jdbcType=TIMESTAMP}, ",
        "#{cAccessCode,jdbcType=VARCHAR}, #{iLogisticsType,jdbcType=INTEGER}, ",
        "#{fProtectPrice,jdbcType=REAL}, #{fInsuranceValue,jdbcType=REAL}, ",
        "#{cGoodsName,jdbcType=VARCHAR}, #{cGoodsTypeCode,jdbcType=VARCHAR}, ",
        "#{fGoodsWeight,jdbcType=REAL}, #{iGoodsRequestTrainNumber,jdbcType=INTEGER}, ",
        "#{iGoodsRequestBoxNumber,jdbcType=INTEGER}, #{fGoodsVolume,jdbcType=REAL}, ",
        "#{iGoodsNumber,jdbcType=INTEGER}, #{cGoodsWrapper,jdbcType=VARCHAR}, ",
        "#{iGoodsSealNum,jdbcType=INTEGER}, #{iGoodsReinforce,jdbcType=INTEGER}, ",
        "#{cGoodsFeature,jdbcType=VARCHAR}, #{fEachGoodsMaxWeight,jdbcType=REAL}, ",
        "#{cTrainNumber,jdbcType=VARCHAR}, #{iCanvasNumber,jdbcType=INTEGER}, ",
        "#{cPredictTrainType,jdbcType=INTEGER}, #{iExtractCanvasType,jdbcType=INTEGER}, ",
        "#{iSenderLineId,jdbcType=INTEGER}, #{iBoxSealNum,jdbcType=INTEGER}, ",
        "#{iRecverLineId,jdbcType=INTEGER})"
    })
    int insert(FmTradeOrderInfoBaseEntity record);

    @InsertProvider(type=FmTradeOrderInfoBaseEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeOrderInfoBaseEntity record);

    @SelectProvider(type=FmTradeOrderInfoBaseEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_ORDER_CODE", property="cOrderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_ORDER_DATELINE", property="dOrderDateline", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_USER_TYPE", property="iUserType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_SENDER_ID", property="iSenderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_RECVER_ID", property="iRecverId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_SENDER_OPERATOR_ID", property="iSenderOperatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_RECVER_OPERATOR_ID", property="iRecverOperatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_SENDER_NAME", property="cSenderName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_ADDRESS", property="cSenderAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_PHONE", property="cSenderPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_EMAIL", property="cSenderEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_POSTCODE", property="cSenderPostcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_NOTE", property="cSenderNote", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_CITY", property="cSenderCity", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOAD_STATION", property="cLoadStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOAD_LOCATION", property="cLoadLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_PREDICT_SEND_TIME", property="dPredictSendTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_PREDICT_LOAD_START_TIME", property="dPredictLoadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_PREDICT_LOAD_END_TIME", property="dPredictLoadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_RECVER_ADDRESS", property="cRecverAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_RECVER_PHONE", property="cRecverPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_RECVER_EMAIL", property="cRecverEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_RECVER_POSTCODE", property="cRecverPostcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_RECVER_CITY", property="cRecverCity", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_UNLOAD_STATION", property="cUnloadStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_UNLOAD_LOCATION", property="cUnloadLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_ORDER_TYPE", property="cOrderType", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_ORDER_STATE", property="iOrderState", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_SPLITE", property="iOrderSplite", jdbcType=JdbcType.INTEGER),
        @Result(column="D_ORDER_CREATE_TIME", property="dOrderCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_ORDER_END_TIME", property="dOrderEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_ORDER_DELETE", property="iOrderDelete", jdbcType=JdbcType.INTEGER),
        @Result(column="D_ORDER_DELETE_TIME", property="dOrderDeleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_ORDER_ALTER_TIME", property="dOrderAlterTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_ACCESS_CODE", property="cAccessCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_LOGISTICS_TYPE", property="iLogisticsType", jdbcType=JdbcType.INTEGER),
        @Result(column="F_PROTECT_PRICE", property="fProtectPrice", jdbcType=JdbcType.REAL),
        @Result(column="F_INSURANCE_VALUE", property="fInsuranceValue", jdbcType=JdbcType.REAL),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_TYPE_CODE", property="cGoodsTypeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_GOODS_WEIGHT", property="fGoodsWeight", jdbcType=JdbcType.REAL),
        @Result(column="I_GOODS_REQUEST_TRAIN_NUMBER", property="iGoodsRequestTrainNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_REQUEST_BOX_NUMBER", property="iGoodsRequestBoxNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="F_GOODS_VOLUME", property="fGoodsVolume", jdbcType=JdbcType.REAL),
        @Result(column="I_GOODS_NUMBER", property="iGoodsNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="C_GOODS_WRAPPER", property="cGoodsWrapper", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_GOODS_SEAL_NUM", property="iGoodsSealNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_REINFORCE", property="iGoodsReinforce", jdbcType=JdbcType.INTEGER),
        @Result(column="C_GOODS_FEATURE", property="cGoodsFeature", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_EACH_GOODS_MAX_WEIGHT", property="fEachGoodsMaxWeight", jdbcType=JdbcType.REAL),
        @Result(column="C_TRAIN_NUMBER", property="cTrainNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CANVAS_NUMBER", property="iCanvasNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="C_PREDICT_TRAIN_TYPE", property="cPredictTrainType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_EXTRACT_CANVAS_TYPE", property="iExtractCanvasType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_SENDER_LINE_ID", property="iSenderLineId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_SEAL_NUM", property="iBoxSealNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_RECVER_LINE_ID", property="iRecverLineId", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeOrderInfoBaseEntity> selectByExample(FmTradeOrderInfoBaseEntityExample example);

    @Select({
        "select",
        "id, C_ORDER_CODE, I_ORDER_TYPE_ID, D_ORDER_DATELINE, I_USER_TYPE, I_SENDER_ID, ",
        "I_RECVER_ID, I_SENDER_OPERATOR_ID, I_RECVER_OPERATOR_ID, C_SENDER_NAME, C_SENDER_ADDRESS, ",
        "C_SENDER_PHONE, C_SENDER_EMAIL, C_SENDER_POSTCODE, C_SENDER_NOTE, C_SENDER_CITY, ",
        "C_LOAD_STATION, C_LOAD_LOCATION, D_PREDICT_SEND_TIME, D_PREDICT_LOAD_START_TIME, ",
        "D_PREDICT_LOAD_END_TIME, C_RECVER_ADDRESS, C_RECVER_PHONE, C_RECVER_EMAIL, C_RECVER_POSTCODE, ",
        "C_RECVER_CITY, C_UNLOAD_STATION, C_UNLOAD_LOCATION, C_ORDER_TYPE, I_ORDER_STATE, ",
        "I_ORDER_SPLITE, D_ORDER_CREATE_TIME, D_ORDER_END_TIME, I_ORDER_DELETE, D_ORDER_DELETE_TIME, ",
        "D_ORDER_ALTER_TIME, C_ACCESS_CODE, I_LOGISTICS_TYPE, F_PROTECT_PRICE, F_INSURANCE_VALUE, ",
        "C_GOODS_NAME, C_GOODS_TYPE_CODE, F_GOODS_WEIGHT, I_GOODS_REQUEST_TRAIN_NUMBER, ",
        "I_GOODS_REQUEST_BOX_NUMBER, F_GOODS_VOLUME, I_GOODS_NUMBER, C_GOODS_WRAPPER, ",
        "I_GOODS_SEAL_NUM, I_GOODS_REINFORCE, C_GOODS_FEATURE, F_EACH_GOODS_MAX_WEIGHT, ",
        "C_TRAIN_NUMBER, I_CANVAS_NUMBER, C_PREDICT_TRAIN_TYPE, I_EXTRACT_CANVAS_TYPE, ",
        "I_SENDER_LINE_ID, I_BOX_SEAL_NUM, I_RECVER_LINE_ID",
        "from fm_trade_order_info_base",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_ORDER_CODE", property="cOrderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_ORDER_DATELINE", property="dOrderDateline", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_USER_TYPE", property="iUserType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_SENDER_ID", property="iSenderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_RECVER_ID", property="iRecverId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_SENDER_OPERATOR_ID", property="iSenderOperatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_RECVER_OPERATOR_ID", property="iRecverOperatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_SENDER_NAME", property="cSenderName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_ADDRESS", property="cSenderAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_PHONE", property="cSenderPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_EMAIL", property="cSenderEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_POSTCODE", property="cSenderPostcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_NOTE", property="cSenderNote", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SENDER_CITY", property="cSenderCity", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOAD_STATION", property="cLoadStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOAD_LOCATION", property="cLoadLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_PREDICT_SEND_TIME", property="dPredictSendTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_PREDICT_LOAD_START_TIME", property="dPredictLoadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_PREDICT_LOAD_END_TIME", property="dPredictLoadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_RECVER_ADDRESS", property="cRecverAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_RECVER_PHONE", property="cRecverPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_RECVER_EMAIL", property="cRecverEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_RECVER_POSTCODE", property="cRecverPostcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_RECVER_CITY", property="cRecverCity", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_UNLOAD_STATION", property="cUnloadStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_UNLOAD_LOCATION", property="cUnloadLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_ORDER_TYPE", property="cOrderType", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_ORDER_STATE", property="iOrderState", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_SPLITE", property="iOrderSplite", jdbcType=JdbcType.INTEGER),
        @Result(column="D_ORDER_CREATE_TIME", property="dOrderCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_ORDER_END_TIME", property="dOrderEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_ORDER_DELETE", property="iOrderDelete", jdbcType=JdbcType.INTEGER),
        @Result(column="D_ORDER_DELETE_TIME", property="dOrderDeleteTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_ORDER_ALTER_TIME", property="dOrderAlterTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_ACCESS_CODE", property="cAccessCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_LOGISTICS_TYPE", property="iLogisticsType", jdbcType=JdbcType.INTEGER),
        @Result(column="F_PROTECT_PRICE", property="fProtectPrice", jdbcType=JdbcType.REAL),
        @Result(column="F_INSURANCE_VALUE", property="fInsuranceValue", jdbcType=JdbcType.REAL),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_TYPE_CODE", property="cGoodsTypeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_GOODS_WEIGHT", property="fGoodsWeight", jdbcType=JdbcType.REAL),
        @Result(column="I_GOODS_REQUEST_TRAIN_NUMBER", property="iGoodsRequestTrainNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_REQUEST_BOX_NUMBER", property="iGoodsRequestBoxNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="F_GOODS_VOLUME", property="fGoodsVolume", jdbcType=JdbcType.REAL),
        @Result(column="I_GOODS_NUMBER", property="iGoodsNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="C_GOODS_WRAPPER", property="cGoodsWrapper", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_GOODS_SEAL_NUM", property="iGoodsSealNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_REINFORCE", property="iGoodsReinforce", jdbcType=JdbcType.INTEGER),
        @Result(column="C_GOODS_FEATURE", property="cGoodsFeature", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_EACH_GOODS_MAX_WEIGHT", property="fEachGoodsMaxWeight", jdbcType=JdbcType.REAL),
        @Result(column="C_TRAIN_NUMBER", property="cTrainNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CANVAS_NUMBER", property="iCanvasNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="C_PREDICT_TRAIN_TYPE", property="cPredictTrainType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_EXTRACT_CANVAS_TYPE", property="iExtractCanvasType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_SENDER_LINE_ID", property="iSenderLineId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_BOX_SEAL_NUM", property="iBoxSealNum", jdbcType=JdbcType.INTEGER),
        @Result(column="I_RECVER_LINE_ID", property="iRecverLineId", jdbcType=JdbcType.INTEGER)
    })
    FmTradeOrderInfoBaseEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmTradeOrderInfoBaseEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeOrderInfoBaseEntity record, @Param("example") FmTradeOrderInfoBaseEntityExample example);

    @UpdateProvider(type=FmTradeOrderInfoBaseEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeOrderInfoBaseEntity record, @Param("example") FmTradeOrderInfoBaseEntityExample example);

    @UpdateProvider(type=FmTradeOrderInfoBaseEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeOrderInfoBaseEntity record);

    @Update({
        "update fm_trade_order_info_base",
        "set C_ORDER_CODE = #{cOrderCode,jdbcType=VARCHAR},",
          "I_ORDER_TYPE_ID = #{iOrderTypeId,jdbcType=INTEGER},",
          "D_ORDER_DATELINE = #{dOrderDateline,jdbcType=TIMESTAMP},",
          "I_USER_TYPE = #{iUserType,jdbcType=INTEGER},",
          "I_SENDER_ID = #{iSenderId,jdbcType=INTEGER},",
          "I_RECVER_ID = #{iRecverId,jdbcType=INTEGER},",
          "I_SENDER_OPERATOR_ID = #{iSenderOperatorId,jdbcType=INTEGER},",
          "I_RECVER_OPERATOR_ID = #{iRecverOperatorId,jdbcType=INTEGER},",
          "C_SENDER_NAME = #{cSenderName,jdbcType=VARCHAR},",
          "C_SENDER_ADDRESS = #{cSenderAddress,jdbcType=VARCHAR},",
          "C_SENDER_PHONE = #{cSenderPhone,jdbcType=VARCHAR},",
          "C_SENDER_EMAIL = #{cSenderEmail,jdbcType=VARCHAR},",
          "C_SENDER_POSTCODE = #{cSenderPostcode,jdbcType=VARCHAR},",
          "C_SENDER_NOTE = #{cSenderNote,jdbcType=VARCHAR},",
          "C_SENDER_CITY = #{cSenderCity,jdbcType=VARCHAR},",
          "C_LOAD_STATION = #{cLoadStation,jdbcType=VARCHAR},",
          "C_LOAD_LOCATION = #{cLoadLocation,jdbcType=VARCHAR},",
          "D_PREDICT_SEND_TIME = #{dPredictSendTime,jdbcType=TIMESTAMP},",
          "D_PREDICT_LOAD_START_TIME = #{dPredictLoadStartTime,jdbcType=TIMESTAMP},",
          "D_PREDICT_LOAD_END_TIME = #{dPredictLoadEndTime,jdbcType=TIMESTAMP},",
          "C_RECVER_ADDRESS = #{cRecverAddress,jdbcType=VARCHAR},",
          "C_RECVER_PHONE = #{cRecverPhone,jdbcType=VARCHAR},",
          "C_RECVER_EMAIL = #{cRecverEmail,jdbcType=VARCHAR},",
          "C_RECVER_POSTCODE = #{cRecverPostcode,jdbcType=VARCHAR},",
          "C_RECVER_CITY = #{cRecverCity,jdbcType=VARCHAR},",
          "C_UNLOAD_STATION = #{cUnloadStation,jdbcType=VARCHAR},",
          "C_UNLOAD_LOCATION = #{cUnloadLocation,jdbcType=VARCHAR},",
          "C_ORDER_TYPE = #{cOrderType,jdbcType=VARCHAR},",
          "I_ORDER_STATE = #{iOrderState,jdbcType=INTEGER},",
          "I_ORDER_SPLITE = #{iOrderSplite,jdbcType=INTEGER},",
          "D_ORDER_CREATE_TIME = #{dOrderCreateTime,jdbcType=TIMESTAMP},",
          "D_ORDER_END_TIME = #{dOrderEndTime,jdbcType=TIMESTAMP},",
          "I_ORDER_DELETE = #{iOrderDelete,jdbcType=INTEGER},",
          "D_ORDER_DELETE_TIME = #{dOrderDeleteTime,jdbcType=TIMESTAMP},",
          "D_ORDER_ALTER_TIME = #{dOrderAlterTime,jdbcType=TIMESTAMP},",
          "C_ACCESS_CODE = #{cAccessCode,jdbcType=VARCHAR},",
          "I_LOGISTICS_TYPE = #{iLogisticsType,jdbcType=INTEGER},",
          "F_PROTECT_PRICE = #{fProtectPrice,jdbcType=REAL},",
          "F_INSURANCE_VALUE = #{fInsuranceValue,jdbcType=REAL},",
          "C_GOODS_NAME = #{cGoodsName,jdbcType=VARCHAR},",
          "C_GOODS_TYPE_CODE = #{cGoodsTypeCode,jdbcType=VARCHAR},",
          "F_GOODS_WEIGHT = #{fGoodsWeight,jdbcType=REAL},",
          "I_GOODS_REQUEST_TRAIN_NUMBER = #{iGoodsRequestTrainNumber,jdbcType=INTEGER},",
          "I_GOODS_REQUEST_BOX_NUMBER = #{iGoodsRequestBoxNumber,jdbcType=INTEGER},",
          "F_GOODS_VOLUME = #{fGoodsVolume,jdbcType=REAL},",
          "I_GOODS_NUMBER = #{iGoodsNumber,jdbcType=INTEGER},",
          "C_GOODS_WRAPPER = #{cGoodsWrapper,jdbcType=VARCHAR},",
          "I_GOODS_SEAL_NUM = #{iGoodsSealNum,jdbcType=INTEGER},",
          "I_GOODS_REINFORCE = #{iGoodsReinforce,jdbcType=INTEGER},",
          "C_GOODS_FEATURE = #{cGoodsFeature,jdbcType=VARCHAR},",
          "F_EACH_GOODS_MAX_WEIGHT = #{fEachGoodsMaxWeight,jdbcType=REAL},",
          "C_TRAIN_NUMBER = #{cTrainNumber,jdbcType=VARCHAR},",
          "I_CANVAS_NUMBER = #{iCanvasNumber,jdbcType=INTEGER},",
          "C_PREDICT_TRAIN_TYPE = #{cPredictTrainType,jdbcType=INTEGER},",
          "I_EXTRACT_CANVAS_TYPE = #{iExtractCanvasType,jdbcType=INTEGER},",
          "I_SENDER_LINE_ID = #{iSenderLineId,jdbcType=INTEGER},",
          "I_BOX_SEAL_NUM = #{iBoxSealNum,jdbcType=INTEGER},",
          "I_RECVER_LINE_ID = #{iRecverLineId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeOrderInfoBaseEntity record);
}