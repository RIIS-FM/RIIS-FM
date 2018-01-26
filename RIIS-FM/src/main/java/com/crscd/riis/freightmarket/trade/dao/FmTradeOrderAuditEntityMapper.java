package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderAuditEntityExample;
import java.util.List;
import java.util.Map;

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
        "I_AUDITOR_ID, D_AUDIT_START_TIME, ",
        "D_AUDIT_END_TIME, C_PEOPLE__AUDIT_SUGGESTION, ",
        "C_SYS_AUDIT_SUGGESTION, I_AUDIT_RESULT)",
        "values (#{id,jdbcType=INTEGER}, #{iOrderId,jdbcType=INTEGER}, ",
        "#{iOrderTypeId,jdbcType=INTEGER}, #{iAuditType,jdbcType=INTEGER}, ",
        "#{iAuditorId,jdbcType=INTEGER}, #{dAuditStartTime,jdbcType=TIMESTAMP}, ",
        "#{dAuditEndTime,jdbcType=TIMESTAMP}, #{cPeopleAuditSuggestion,jdbcType=VARCHAR}, ",
        "#{cSysAuditSuggestion,jdbcType=VARCHAR}, #{iAuditResult,jdbcType=INTEGER})"
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
        @Result(column="I_AUDITOR_ID", property="iAuditorId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_AUDIT_START_TIME", property="dAuditStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_AUDIT_END_TIME", property="dAuditEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_PEOPLE__AUDIT_SUGGESTION", property="cPeopleAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SYS_AUDIT_SUGGESTION", property="cSysAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_AUDIT_RESULT", property="iAuditResult", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeOrderAuditEntity> selectByExample(FmTradeOrderAuditEntityExample example);

    @Select({
        "select",
        "id, I_ORDER_ID, I_ORDER_TYPE_ID, I_AUDIT_TYPE, I_AUDITOR_ID, D_AUDIT_START_TIME, ",
        "D_AUDIT_END_TIME, C_PEOPLE__AUDIT_SUGGESTION, C_SYS_AUDIT_SUGGESTION, I_AUDIT_RESULT",
        "from fm_trade_order_audit",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDIT_TYPE", property="iAuditType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDITOR_ID", property="iAuditorId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_AUDIT_START_TIME", property="dAuditStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_AUDIT_END_TIME", property="dAuditEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_PEOPLE__AUDIT_SUGGESTION", property="cPeopleAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SYS_AUDIT_SUGGESTION", property="cSysAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_AUDIT_RESULT", property="iAuditResult", jdbcType=JdbcType.INTEGER)
    })
    FmTradeOrderAuditEntity selectByPrimaryKey(Integer id);
    
    /**
     * 根据订单id, 查询审核id
     * @param  Integer orderId 订单id
     * @return 审核实体
     * */
    @Select({
        "select",
        "id, I_ORDER_ID, I_ORDER_TYPE_ID, I_AUDIT_TYPE, I_AUDITOR_ID, D_AUDIT_START_TIME, ",
        "D_AUDIT_END_TIME, C_PEOPLE__AUDIT_SUGGESTION, C_SYS_AUDIT_SUGGESTION, I_AUDIT_RESULT",
        "from fm_trade_order_audit",
        "where I_ORDER_ID = #{orderId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDIT_TYPE", property="iAuditType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDITOR_ID", property="iAuditorId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_AUDIT_START_TIME", property="dAuditStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_AUDIT_END_TIME", property="dAuditEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_PEOPLE__AUDIT_SUGGESTION", property="cPeopleAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SYS_AUDIT_SUGGESTION", property="cSysAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_AUDIT_RESULT", property="iAuditResult", jdbcType=JdbcType.INTEGER)
    })
    FmTradeOrderAuditEntity selectByOrderId(Integer orderId);
    
    /**
     * 根据审核结果和审核类型查询实体
     * @param  Integer auditResult 审核结果
     *         Integer auditType 审核类型
     * @return 满足查询条件的审核实体列表
     **/
    @Select({
        "select",
        "id, I_ORDER_ID, I_ORDER_TYPE_ID, I_AUDIT_TYPE, I_AUDITOR_ID, D_AUDIT_START_TIME, ",
        "D_AUDIT_END_TIME, C_PEOPLE__AUDIT_SUGGESTION, C_SYS_AUDIT_SUGGESTION, I_AUDIT_RESULT",
        "from fm_trade_order_audit",
        "where I_AUDIT_RESULT = #{auditResult,jdbcType=INTEGER} and I_AUDIT_TYPE = #{auditType,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDIT_TYPE", property="iAuditType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDITOR_ID", property="iAuditorId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_AUDIT_START_TIME", property="dAuditStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_AUDIT_END_TIME", property="dAuditEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_PEOPLE__AUDIT_SUGGESTION", property="cPeopleAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SYS_AUDIT_SUGGESTION", property="cSysAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_AUDIT_RESULT", property="iAuditResult", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeOrderAuditEntity> selectByAuditResultAndAuditType(@Param("auditResult") Integer auditResult,
    		@Param("auditType") Integer auditType);
    
    /* *
     * 分页查询订单
     * @param Map<String, Object> params 
     * @return List<FmTradeOrderInfoBaseEntity>订单对象列表
     *   */
    @SelectProvider(type=FmTradeOrderAuditEntitySqlProvider.class,method="selectWhitParam")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ORDER_ID", property="iOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ORDER_TYPE_ID", property="iOrderTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDIT_TYPE", property="iAuditType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_AUDITOR_ID", property="iAuditorId", jdbcType=JdbcType.INTEGER),
        @Result(column="D_AUDIT_START_TIME", property="dAuditStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="D_AUDIT_END_TIME", property="dAuditEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="C_PEOPLE__AUDIT_SUGGESTION", property="cPeopleAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SYS_AUDIT_SUGGESTION", property="cSysAuditSuggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_AUDIT_RESULT", property="iAuditResult", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeOrderAuditEntity> selectByPage(Map<String, Object> params);
    

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
          "I_AUDITOR_ID = #{iAuditorId,jdbcType=INTEGER},",
          "D_AUDIT_START_TIME = #{dAuditStartTime,jdbcType=TIMESTAMP},",
          "D_AUDIT_END_TIME = #{dAuditEndTime,jdbcType=TIMESTAMP},",
          "C_PEOPLE__AUDIT_SUGGESTION = #{cPeopleAuditSuggestion,jdbcType=VARCHAR},",
          "C_SYS_AUDIT_SUGGESTION = #{cSysAuditSuggestion,jdbcType=VARCHAR},",
          "I_AUDIT_RESULT = #{iAuditResult,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeOrderAuditEntity record);
}