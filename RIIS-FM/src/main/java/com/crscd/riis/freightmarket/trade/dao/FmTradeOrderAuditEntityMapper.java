package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntityExample;
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

public interface FmTradeOrderAuditEntityMapper {
    @SelectProvider(type=FmTradeOrderAuditEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeOrderAuditEntityExample example);

    @DeleteProvider(type=FmTradeOrderAuditEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeOrderAuditEntityExample example);

    @Delete({
        "delete from fm_trade_order_audit",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_order_audit (id, I_ORDER_ID, ",
        "I_ORDER_TYPE_ID, I_AUDIT_TYPE, ",
        "I_AUDIT_AUDITOR_ID, D_AUDIT_START_TIME, ",
        "D_AUDIT_END_TIME, C_AUDIT_SUGGESTION, ",
        "I_AUDIT_RESULT)",
        "values (#{id,jdbcType=INTEGER}, #{iOrderId,jdbcType=INTEGER}, ",
        "#{iOrderTypeId,jdbcType=INTEGER}, #{iAuditType,jdbcType=INTEGER}, ",
        "#{iAuditAuditorId,jdbcType=INTEGER}, #{dAuditStartTime,jdbcType=TIMESTAMP}, ",
        "#{dAuditEndTime,jdbcType=TIMESTAMP}, #{cAuditSuggestion,jdbcType=VARCHAR}, ",
        "#{iAuditResult,jdbcType=INTEGER})"
    })
    int insert(FmTradeOrderAuditEntity record);

    @InsertProvider(type=FmTradeOrderAuditEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeOrderAuditEntity record);

    @SelectProvider(type=FmTradeOrderAuditEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDIT_TYPE", property="iAuditType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDIT_AUDITOR_ID", property="iAuditAuditorId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_AUDIT_START_TIME", property="dAuditStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_AUDIT_END_TIME", property="dAuditEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_AUDIT_SUGGESTION", property="cAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_AUDIT_RESULT", property="iAuditResult", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeOrderAuditEntity> selectByExample(FmTradeOrderAuditEntityExample example);

    @Select({
        "select",
        "id, I_ORDER_ID, I_ORDER_TYPE_ID, I_AUDIT_TYPE, I_AUDIT_AUDITOR_ID, D_AUDIT_START_TIME, ",
        "D_AUDIT_END_TIME, C_AUDIT_SUGGESTION, I_AUDIT_RESULT",
        "from fm_trade_order_audit",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDIT_TYPE", property="iAuditType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDIT_AUDITOR_ID", property="iAuditAuditorId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_AUDIT_START_TIME", property="dAuditStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_AUDIT_END_TIME", property="dAuditEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_AUDIT_SUGGESTION", property="cAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_AUDIT_RESULT", property="iAuditResult", jdbcType=JdbcType.INTEGER)
    })
    FmTradeOrderAuditEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmTradeOrderAuditEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeOrderAuditEntity record, @Param("example") FmTradeOrderAuditEntityExample example);

    @UpdateProvider(type=FmTradeOrderAuditEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeOrderAuditEntity record, @Param("example") FmTradeOrderAuditEntityExample example);

    @UpdateProvider(type=FmTradeOrderAuditEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeOrderAuditEntity record);

    @Update({
        "update fm_trade_order_audit",
        "set I_ORDER_ID = #{iOrderId,jdbcType=INTEGER},",
          "I_ORDER_TYPE_ID = #{iOrderTypeId,jdbcType=INTEGER},",
          "I_AUDIT_TYPE = #{iAuditType,jdbcType=INTEGER},",
          "I_AUDIT_AUDITOR_ID = #{iAuditAuditorId,jdbcType=INTEGER},",
          "D_AUDIT_START_TIME = #{dAuditStartTime,jdbcType=TIMESTAMP},",
          "D_AUDIT_END_TIME = #{dAuditEndTime,jdbcType=TIMESTAMP},",
          "C_AUDIT_SUGGESTION = #{cAuditSuggestion,jdbcType=VARCHAR},",
          "I_AUDIT_RESULT = #{iAuditResult,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeOrderAuditEntity record);
}