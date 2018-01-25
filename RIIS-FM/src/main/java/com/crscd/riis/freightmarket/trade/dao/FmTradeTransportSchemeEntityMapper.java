package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeTransportSchemeEntityExample;
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

public interface FmTradeTransportSchemeEntityMapper {
    @SelectProvider(type=FmTradeTransportSchemeEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeTransportSchemeEntityExample example);

    @DeleteProvider(type=FmTradeTransportSchemeEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeTransportSchemeEntityExample example);

    @Delete({
        "delete from fm_trade_transport_scheme",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_transport_scheme (id, I_ORDER_ID, ",
        "F_TRADE_ORDER_TRANSPORT_SCHEME_FEE, C_TRADE_ORDER_TRANSPORT_SCHEME_CODE, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME, ",
        "I_IS_SELECT)",
        "values (#{id,jdbcType=INTEGER}, #{iOrderId,jdbcType=INTEGER}, ",
        "#{fTradeOrderTransportSchemeFee,jdbcType=REAL}, #{cTradeOrderTransportSchemeCode,jdbcType=VARCHAR}, ",
        "#{dTradeOrderTransportSchemeStartTime,jdbcType=TIMESTAMP}, ",
        "#{dTradeOrderTransportSchemeEndTime,jdbcType=TIMESTAMP}, ",
        "#{cTradeOrderTransportSchemeLoadStation,jdbcType=VARCHAR}, ",
        "#{cTradeOrderTransportSchemeUnloadStation,jdbcType=VARCHAR}, ",
        "#{cTradeOrderTransportSchemeLoadLocation,jdbcType=VARCHAR}, ",
        "#{cTradeOrderTransportSchemeUnloadLocation,jdbcType=VARCHAR}, ",
        "#{cTradeOrderTransportSchemeTrainNum,jdbcType=VARCHAR}, ",
        "#{cTradeOrderTransportSchemeTrainType,jdbcType=VARCHAR}, ",
        "#{dTradeOrderTransportSchemeUnloadStartTime,jdbcType=TIMESTAMP}, ",
        "#{dTradeOrderTransportSchemeUnloadEndTime,jdbcType=TIMESTAMP}, ",
        "#{dTradeOrderTransportSchemeLoadStartTime,jdbcType=TIMESTAMP}, ",
        "#{dTradeOrderTransportSchemeLoadEndTime,jdbcType=TIMESTAMP}, ",
        "#{iIsSelect,jdbcType=INTEGER})"
    })
    int insert(FmTradeTransportSchemeEntity record);

    @InsertProvider(type=FmTradeTransportSchemeEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeTransportSchemeEntity record);

    @SelectProvider(type=FmTradeTransportSchemeEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="F_TRADE_ORDER_TRANSPORT_SCHEME_FEE", property="fTradeOrderTransportSchemeFee", jdbcType=JdbcType.REAL),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_CODE", property="cTradeOrderTransportSchemeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME", property="dTradeOrderTransportSchemeStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME", property="dTradeOrderTransportSchemeEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION", property="cTradeOrderTransportSchemeLoadStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION", property="cTradeOrderTransportSchemeUnloadStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION", property="cTradeOrderTransportSchemeLoadLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION", property="cTradeOrderTransportSchemeUnloadLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM", property="cTradeOrderTransportSchemeTrainNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE", property="cTradeOrderTransportSchemeTrainType", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME", property="dTradeOrderTransportSchemeUnloadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME", property="dTradeOrderTransportSchemeUnloadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME", property="dTradeOrderTransportSchemeLoadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME", property="dTradeOrderTransportSchemeLoadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_IS_SELECT", property="iIsSelect", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeTransportSchemeEntity> selectByExample(FmTradeTransportSchemeEntityExample example);

    @Select({
        "select",
        "id, I_ORDER_ID, F_TRADE_ORDER_TRANSPORT_SCHEME_FEE, C_TRADE_ORDER_TRANSPORT_SCHEME_CODE, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME, D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION, C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION, C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM, C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME, D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME, D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME, ",
        "I_IS_SELECT",
        "from fm_trade_transport_scheme",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="F_TRADE_ORDER_TRANSPORT_SCHEME_FEE", property="fTradeOrderTransportSchemeFee", jdbcType=JdbcType.REAL),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_CODE", property="cTradeOrderTransportSchemeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME", property="dTradeOrderTransportSchemeStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME", property="dTradeOrderTransportSchemeEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION", property="cTradeOrderTransportSchemeLoadStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION", property="cTradeOrderTransportSchemeUnloadStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION", property="cTradeOrderTransportSchemeLoadLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION", property="cTradeOrderTransportSchemeUnloadLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM", property="cTradeOrderTransportSchemeTrainNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE", property="cTradeOrderTransportSchemeTrainType", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME", property="dTradeOrderTransportSchemeUnloadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME", property="dTradeOrderTransportSchemeUnloadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME", property="dTradeOrderTransportSchemeLoadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME", property="dTradeOrderTransportSchemeLoadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_IS_SELECT", property="iIsSelect", jdbcType=JdbcType.INTEGER)
    })
    FmTradeTransportSchemeEntity selectByPrimaryKey(Integer id);
    
    /**
     * 通过订单id查表
     * @param Integer orderId 订单id
     * @return FmTradeTransportSchemeEntity
     * */
    
    @Select({
        "select",
        "id, I_ORDER_ID, F_TRADE_ORDER_TRANSPORT_SCHEME_FEE, C_TRADE_ORDER_TRANSPORT_SCHEME_CODE, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME, D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION, C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION, C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION, ",
        "C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM, C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME, D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME, ",
        "D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME, D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME, ",
        "I_IS_SELECT",
        "from fm_trade_transport_scheme",
        "where I_ORDER_ID = #{I_ORDER_ID,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="F_TRADE_ORDER_TRANSPORT_SCHEME_FEE", property="fTradeOrderTransportSchemeFee", jdbcType=JdbcType.REAL),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_CODE", property="cTradeOrderTransportSchemeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME", property="dTradeOrderTransportSchemeStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME", property="dTradeOrderTransportSchemeEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION", property="cTradeOrderTransportSchemeLoadStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION", property="cTradeOrderTransportSchemeUnloadStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION", property="cTradeOrderTransportSchemeLoadLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION", property="cTradeOrderTransportSchemeUnloadLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM", property="cTradeOrderTransportSchemeTrainNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE", property="cTradeOrderTransportSchemeTrainType", jdbcType=JdbcType.VARCHAR),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME", property="dTradeOrderTransportSchemeUnloadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME", property="dTradeOrderTransportSchemeUnloadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME", property="dTradeOrderTransportSchemeLoadStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME", property="dTradeOrderTransportSchemeLoadEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="I_IS_SELECT", property="iIsSelect", jdbcType=JdbcType.INTEGER)
    })
    FmTradeTransportSchemeEntity selectByOrderId(Integer orderId);

    @UpdateProvider(type=FmTradeTransportSchemeEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeTransportSchemeEntity record, @Param("example") FmTradeTransportSchemeEntityExample example);

    @UpdateProvider(type=FmTradeTransportSchemeEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeTransportSchemeEntity record, @Param("example") FmTradeTransportSchemeEntityExample example);

    @UpdateProvider(type=FmTradeTransportSchemeEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeTransportSchemeEntity record);

    @Update({
        "update fm_trade_transport_scheme",
        "set I_ORDER_ID = #{iOrderId,jdbcType=INTEGER},",
          "F_TRADE_ORDER_TRANSPORT_SCHEME_FEE = #{fTradeOrderTransportSchemeFee,jdbcType=REAL},",
          "C_TRADE_ORDER_TRANSPORT_SCHEME_CODE = #{cTradeOrderTransportSchemeCode,jdbcType=VARCHAR},",
          "D_TRADE_ORDER_TRANSPORT_SCHEME_START_TIME = #{dTradeOrderTransportSchemeStartTime,jdbcType=TIMESTAMP},",
          "D_TRADE_ORDER_TRANSPORT_SCHEME_END_TIME = #{dTradeOrderTransportSchemeEndTime,jdbcType=TIMESTAMP},",
          "C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_STATION = #{cTradeOrderTransportSchemeLoadStation,jdbcType=VARCHAR},",
          "C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_STATION = #{cTradeOrderTransportSchemeUnloadStation,jdbcType=VARCHAR},",
          "C_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_LOCATION = #{cTradeOrderTransportSchemeLoadLocation,jdbcType=VARCHAR},",
          "C_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_LOCATION = #{cTradeOrderTransportSchemeUnloadLocation,jdbcType=VARCHAR},",
          "C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_NUM = #{cTradeOrderTransportSchemeTrainNum,jdbcType=VARCHAR},",
          "C_TRADE_ORDER_TRANSPORT_SCHEME_TRAIN_TYPE = #{cTradeOrderTransportSchemeTrainType,jdbcType=VARCHAR},",
          "D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_START_TIME = #{dTradeOrderTransportSchemeUnloadStartTime,jdbcType=TIMESTAMP},",
          "D_TRADE_ORDER_TRANSPORT_SCHEME_UNLOAD_END_TIME = #{dTradeOrderTransportSchemeUnloadEndTime,jdbcType=TIMESTAMP},",
          "D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_START_TIME = #{dTradeOrderTransportSchemeLoadStartTime,jdbcType=TIMESTAMP},",
          "D_TRADE_ORDER_TRANSPORT_SCHEME_LOAD_END_TIME = #{dTradeOrderTransportSchemeLoadEndTime,jdbcType=TIMESTAMP},",
          "I_IS_SELECT = #{iIsSelect,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeTransportSchemeEntity record);
}