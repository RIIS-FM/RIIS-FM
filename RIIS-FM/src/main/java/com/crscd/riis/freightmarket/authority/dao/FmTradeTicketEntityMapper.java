package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmTradeTicketEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeTicketEntityExample;
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

public interface FmTradeTicketEntityMapper {
    @SelectProvider(type=FmTradeTicketEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeTicketEntityExample example);

    @DeleteProvider(type=FmTradeTicketEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeTicketEntityExample example);

    @Delete({
        "delete from fm_trade_ticket",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_ticket (id, I_WAYBILL_ID, ",
        "I_WAYBILL_CODE, I_TICKET_CODE, ",
        "D_TICKET_CREATE_TIME, C_TICKET_CONTENT, ",
        "D_TICKET_RECVER_TIME, I_INCIDENTALS_TYPE, ",
        "F_INCIDENTALS_VALUE, F_DISTANCE, ",
        "I_INCIDENTALS_AYMENT_STATE, I_INCIDENTALS_AYMENT_TYPE, ",
        "D_TICKET_REALITY_ARRIVE_TIME, D_TICKET_REALITY_UNLOAD_START_TIME, ",
        "D_TICKET_REALITY_UNLOAD_END_TIME, D_TICKET_REALITY_SENDER_TIME, ",
        "D_TICKET_REALITY_LOAD_START_TIME, D_TICKET_REALITY_LOAD_END_TIME, ",
        "D_TICKET_PREDICT_ARRIVE_TIME, D_TICKET_PREDICT_UNLOAD_START_TIME, ",
        "D_TICKET_PREDICT_UNLOAD_END_TIME, D_TICKET_PREDICT_SENDER_TIME, ",
        "D_TICKET_PREDICT_LOAD_START_TIME, D_TICKET_PREDICT_LOAD_END_TIME)",
        "values (#{id,jdbcType=INTEGER}, #{iWaybillId,jdbcType=INTEGER}, ",
        "#{iWaybillCode,jdbcType=INTEGER}, #{iTicketCode,jdbcType=INTEGER}, ",
        "#{dTicketCreateTime,jdbcType=TIMESTAMP}, #{cTicketContent,jdbcType=VARCHAR}, ",
        "#{dTicketRecverTime,jdbcType=TIMESTAMP}, #{iIncidentalsType,jdbcType=INTEGER}, ",
        "#{fIncidentalsValue,jdbcType=REAL}, #{fDistance,jdbcType=REAL}, ",
        "#{iIncidentalsAymentState,jdbcType=INTEGER}, #{iIncidentalsAymentType,jdbcType=INTEGER}, ",
        "#{dTicketRealityArriveTime,jdbcType=TIMESTAMP}, #{dTicketRealityUnloadStartTime,jdbcType=TIMESTAMP}, ",
        "#{dTicketRealityUnloadEndTime,jdbcType=TIMESTAMP}, #{dTicketRealitySenderTime,jdbcType=TIMESTAMP}, ",
        "#{dTicketRealityLoadStartTime,jdbcType=TIMESTAMP}, #{dTicketRealityLoadEndTime,jdbcType=TIMESTAMP}, ",
        "#{dTicketPredictArriveTime,jdbcType=TIMESTAMP}, #{dTicketPredictUnloadStartTime,jdbcType=TIMESTAMP}, ",
        "#{dTicketPredictUnloadEndTime,jdbcType=TIMESTAMP}, #{dTicketPredictSenderTime,jdbcType=TIMESTAMP}, ",
        "#{dTicketPredictLoadStartTime,jdbcType=TIMESTAMP}, #{dTicketPredictLoadEndTime,jdbcType=TIMESTAMP})"
    })
    int insert(FmTradeTicketEntity record);

    @InsertProvider(type=FmTradeTicketEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeTicketEntity record);

    @SelectProvider(type=FmTradeTicketEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_WAYBILL_ID", property="iWaybillId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_CODE", property="iWaybillCode", jdbcType=JdbcType.INTEGER),
        @Result(column="I_TICKET_CODE", property="iTicketCode", jdbcType=JdbcType.INTEGER),
        @Result(column="D_TICKET_CREATE_TIME", property="dTicketCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_TICKET_CONTENT", property="cTicketContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_TICKET_RECVER_TIME", property="dTicketRecverTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_INCIDENTALS_TYPE", property="iIncidentalsType", jdbcType=JdbcType.INTEGER),
        @Result(column="F_INCIDENTALS_VALUE", property="fIncidentalsValue", jdbcType=JdbcType.REAL),
        @Result(column="F_DISTANCE", property="fDistance", jdbcType=JdbcType.REAL),
        @Result(column="I_INCIDENTALS_AYMENT_STATE", property="iIncidentalsAymentState", jdbcType=JdbcType.INTEGER),
        @Result(column="I_INCIDENTALS_AYMENT_TYPE", property="iIncidentalsAymentType", jdbcType=JdbcType.INTEGER),
        @Result(column="D_TICKET_REALITY_ARRIVE_TIME", property="dTicketRealityArriveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_REALITY_UNLOAD_START_TIME", property="dTicketRealityUnloadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_REALITY_UNLOAD_END_TIME", property="dTicketRealityUnloadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_REALITY_SENDER_TIME", property="dTicketRealitySenderTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_REALITY_LOAD_START_TIME", property="dTicketRealityLoadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_REALITY_LOAD_END_TIME", property="dTicketRealityLoadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_ARRIVE_TIME", property="dTicketPredictArriveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_UNLOAD_START_TIME", property="dTicketPredictUnloadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_UNLOAD_END_TIME", property="dTicketPredictUnloadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_SENDER_TIME", property="dTicketPredictSenderTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_LOAD_START_TIME", property="dTicketPredictLoadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_LOAD_END_TIME", property="dTicketPredictLoadEndTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FmTradeTicketEntity> selectByExample(FmTradeTicketEntityExample example);

    @Select({
        "select",
        "id, I_WAYBILL_ID, I_WAYBILL_CODE, I_TICKET_CODE, D_TICKET_CREATE_TIME, C_TICKET_CONTENT, ",
        "D_TICKET_RECVER_TIME, I_INCIDENTALS_TYPE, F_INCIDENTALS_VALUE, F_DISTANCE, I_INCIDENTALS_AYMENT_STATE, ",
        "I_INCIDENTALS_AYMENT_TYPE, D_TICKET_REALITY_ARRIVE_TIME, D_TICKET_REALITY_UNLOAD_START_TIME, ",
        "D_TICKET_REALITY_UNLOAD_END_TIME, D_TICKET_REALITY_SENDER_TIME, D_TICKET_REALITY_LOAD_START_TIME, ",
        "D_TICKET_REALITY_LOAD_END_TIME, D_TICKET_PREDICT_ARRIVE_TIME, D_TICKET_PREDICT_UNLOAD_START_TIME, ",
        "D_TICKET_PREDICT_UNLOAD_END_TIME, D_TICKET_PREDICT_SENDER_TIME, D_TICKET_PREDICT_LOAD_START_TIME, ",
        "D_TICKET_PREDICT_LOAD_END_TIME",
        "from fm_trade_ticket",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_WAYBILL_ID", property="iWaybillId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_WAYBILL_CODE", property="iWaybillCode", jdbcType=JdbcType.INTEGER),
        @Result(column="I_TICKET_CODE", property="iTicketCode", jdbcType=JdbcType.INTEGER),
        @Result(column="D_TICKET_CREATE_TIME", property="dTicketCreateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_TICKET_CONTENT", property="cTicketContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_TICKET_RECVER_TIME", property="dTicketRecverTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_INCIDENTALS_TYPE", property="iIncidentalsType", jdbcType=JdbcType.INTEGER),
        @Result(column="F_INCIDENTALS_VALUE", property="fIncidentalsValue", jdbcType=JdbcType.REAL),
        @Result(column="F_DISTANCE", property="fDistance", jdbcType=JdbcType.REAL),
        @Result(column="I_INCIDENTALS_AYMENT_STATE", property="iIncidentalsAymentState", jdbcType=JdbcType.INTEGER),
        @Result(column="I_INCIDENTALS_AYMENT_TYPE", property="iIncidentalsAymentType", jdbcType=JdbcType.INTEGER),
        @Result(column="D_TICKET_REALITY_ARRIVE_TIME", property="dTicketRealityArriveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_REALITY_UNLOAD_START_TIME", property="dTicketRealityUnloadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_REALITY_UNLOAD_END_TIME", property="dTicketRealityUnloadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_REALITY_SENDER_TIME", property="dTicketRealitySenderTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_REALITY_LOAD_START_TIME", property="dTicketRealityLoadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_REALITY_LOAD_END_TIME", property="dTicketRealityLoadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_ARRIVE_TIME", property="dTicketPredictArriveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_UNLOAD_START_TIME", property="dTicketPredictUnloadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_UNLOAD_END_TIME", property="dTicketPredictUnloadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_SENDER_TIME", property="dTicketPredictSenderTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_LOAD_START_TIME", property="dTicketPredictLoadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TICKET_PREDICT_LOAD_END_TIME", property="dTicketPredictLoadEndTime", jdbcType=JdbcType.TIMESTAMP)
    })
    FmTradeTicketEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmTradeTicketEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeTicketEntity record, @Param("example") FmTradeTicketEntityExample example);

    @UpdateProvider(type=FmTradeTicketEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeTicketEntity record, @Param("example") FmTradeTicketEntityExample example);

    @UpdateProvider(type=FmTradeTicketEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeTicketEntity record);

    @Update({
        "update fm_trade_ticket",
        "set I_WAYBILL_ID = #{iWaybillId,jdbcType=INTEGER},",
          "I_WAYBILL_CODE = #{iWaybillCode,jdbcType=INTEGER},",
          "I_TICKET_CODE = #{iTicketCode,jdbcType=INTEGER},",
          "D_TICKET_CREATE_TIME = #{dTicketCreateTime,jdbcType=TIMESTAMP},",
          "C_TICKET_CONTENT = #{cTicketContent,jdbcType=VARCHAR},",
          "D_TICKET_RECVER_TIME = #{dTicketRecverTime,jdbcType=TIMESTAMP},",
          "I_INCIDENTALS_TYPE = #{iIncidentalsType,jdbcType=INTEGER},",
          "F_INCIDENTALS_VALUE = #{fIncidentalsValue,jdbcType=REAL},",
          "F_DISTANCE = #{fDistance,jdbcType=REAL},",
          "I_INCIDENTALS_AYMENT_STATE = #{iIncidentalsAymentState,jdbcType=INTEGER},",
          "I_INCIDENTALS_AYMENT_TYPE = #{iIncidentalsAymentType,jdbcType=INTEGER},",
          "D_TICKET_REALITY_ARRIVE_TIME = #{dTicketRealityArriveTime,jdbcType=TIMESTAMP},",
          "D_TICKET_REALITY_UNLOAD_START_TIME = #{dTicketRealityUnloadStartTime,jdbcType=TIMESTAMP},",
          "D_TICKET_REALITY_UNLOAD_END_TIME = #{dTicketRealityUnloadEndTime,jdbcType=TIMESTAMP},",
          "D_TICKET_REALITY_SENDER_TIME = #{dTicketRealitySenderTime,jdbcType=TIMESTAMP},",
          "D_TICKET_REALITY_LOAD_START_TIME = #{dTicketRealityLoadStartTime,jdbcType=TIMESTAMP},",
          "D_TICKET_REALITY_LOAD_END_TIME = #{dTicketRealityLoadEndTime,jdbcType=TIMESTAMP},",
          "D_TICKET_PREDICT_ARRIVE_TIME = #{dTicketPredictArriveTime,jdbcType=TIMESTAMP},",
          "D_TICKET_PREDICT_UNLOAD_START_TIME = #{dTicketPredictUnloadStartTime,jdbcType=TIMESTAMP},",
          "D_TICKET_PREDICT_UNLOAD_END_TIME = #{dTicketPredictUnloadEndTime,jdbcType=TIMESTAMP},",
          "D_TICKET_PREDICT_SENDER_TIME = #{dTicketPredictSenderTime,jdbcType=TIMESTAMP},",
          "D_TICKET_PREDICT_LOAD_START_TIME = #{dTicketPredictLoadStartTime,jdbcType=TIMESTAMP},",
          "D_TICKET_PREDICT_LOAD_END_TIME = #{dTicketPredictLoadEndTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeTicketEntity record);
}