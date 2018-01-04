package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmTradeTransportEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeTransportEntityExample;
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

public interface FmTradeTransportEntityMapper {
    @SelectProvider(type=FmTradeTransportEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeTransportEntityExample example);

    @DeleteProvider(type=FmTradeTransportEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeTransportEntityExample example);

    @Delete({
        "delete from fm_trade_transport_estimate",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_transport_estimate (id, I_ORDER_ID, ",
        "I_ORDER_TYPE_ID, C_ORDER_CODE, ",
        "I_ESTIMATE_ID, I_ESTIMATE_TRANSPORT, ",
        "I_ESTIMATE_PARTITY, I_ESTIMATE_CONVININET, ",
        "I_ESTIMATE_OUTLINE, I_ESTIMATE_CONTENT)",
        "values (#{id,jdbcType=INTEGER}, #{iOrderId,jdbcType=INTEGER}, ",
        "#{iOrderTypeId,jdbcType=INTEGER}, #{cOrderCode,jdbcType=VARCHAR}, ",
        "#{iEstimateId,jdbcType=INTEGER}, #{iEstimateTransport,jdbcType=INTEGER}, ",
        "#{iEstimatePartity,jdbcType=INTEGER}, #{iEstimateConvininet,jdbcType=INTEGER}, ",
        "#{iEstimateOutline,jdbcType=INTEGER}, #{iEstimateContent,jdbcType=INTEGER})"
    })
    int insert(FmTradeTransportEntity record);

    @InsertProvider(type=FmTradeTransportEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeTransportEntity record);

    @SelectProvider(type=FmTradeTransportEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_ORDER_CODE", property="cOrderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_ESTIMATE_ID", property="iEstimateId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ESTIMATE_TRANSPORT", property="iEstimateTransport", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ESTIMATE_PARTITY", property="iEstimatePartity", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ESTIMATE_CONVININET", property="iEstimateConvininet", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ESTIMATE_OUTLINE", property="iEstimateOutline", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ESTIMATE_CONTENT", property="iEstimateContent", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeTransportEntity> selectByExample(FmTradeTransportEntityExample example);

    @Select({
        "select",
        "id, I_ORDER_ID, I_ORDER_TYPE_ID, C_ORDER_CODE, I_ESTIMATE_ID, I_ESTIMATE_TRANSPORT, ",
        "I_ESTIMATE_PARTITY, I_ESTIMATE_CONVININET, I_ESTIMATE_OUTLINE, I_ESTIMATE_CONTENT",
        "from fm_trade_transport_estimate",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_ORDER_CODE", property="cOrderCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_ESTIMATE_ID", property="iEstimateId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ESTIMATE_TRANSPORT", property="iEstimateTransport", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ESTIMATE_PARTITY", property="iEstimatePartity", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ESTIMATE_CONVININET", property="iEstimateConvininet", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ESTIMATE_OUTLINE", property="iEstimateOutline", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ESTIMATE_CONTENT", property="iEstimateContent", jdbcType=JdbcType.INTEGER)
    })
    FmTradeTransportEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmTradeTransportEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeTransportEntity record, @Param("example") FmTradeTransportEntityExample example);

    @UpdateProvider(type=FmTradeTransportEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeTransportEntity record, @Param("example") FmTradeTransportEntityExample example);

    @UpdateProvider(type=FmTradeTransportEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeTransportEntity record);

    @Update({
        "update fm_trade_transport_estimate",
        "set I_ORDER_ID = #{iOrderId,jdbcType=INTEGER},",
          "I_ORDER_TYPE_ID = #{iOrderTypeId,jdbcType=INTEGER},",
          "C_ORDER_CODE = #{cOrderCode,jdbcType=VARCHAR},",
          "I_ESTIMATE_ID = #{iEstimateId,jdbcType=INTEGER},",
          "I_ESTIMATE_TRANSPORT = #{iEstimateTransport,jdbcType=INTEGER},",
          "I_ESTIMATE_PARTITY = #{iEstimatePartity,jdbcType=INTEGER},",
          "I_ESTIMATE_CONVININET = #{iEstimateConvininet,jdbcType=INTEGER},",
          "I_ESTIMATE_OUTLINE = #{iEstimateOutline,jdbcType=INTEGER},",
          "I_ESTIMATE_CONTENT = #{iEstimateContent,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeTransportEntity record);
}