package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeContactEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeContactEntityExample;
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

public interface FmTradeContactEntityMapper {
    @SelectProvider(type=FmTradeContactEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeContactEntityExample example);

    @DeleteProvider(type=FmTradeContactEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeContactEntityExample example);

    @Delete({
        "delete from fm_trade_contact",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_contact (id, C_CONTACT_NAME, ",
        "C_CONTACT_ADDRESS, I_CONTACT_POSTCODE, ",
        "C_CONTACT_PHONE, C_CONTACT_EMAIL, ",
        "I_CONTACT_FLAG, I_ACCOUNT_ID, ",
        "I_ACCOUNT_FLAG)",
        "values (#{id,jdbcType=INTEGER}, #{cContactName,jdbcType=VARCHAR}, ",
        "#{cContactAddress,jdbcType=VARCHAR}, #{iContactPostcode,jdbcType=INTEGER}, ",
        "#{cContactPhone,jdbcType=VARCHAR}, #{cContactEmail,jdbcType=VARCHAR}, ",
        "#{iContactFlag,jdbcType=INTEGER}, #{iAccountId,jdbcType=INTEGER}, ",
        "#{iAccountFlag,jdbcType=INTEGER})"
    })
    int insert(FmTradeContactEntity record);

    @InsertProvider(type=FmTradeContactEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeContactEntity record);

    @SelectProvider(type=FmTradeContactEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_CONTACT_NAME", property="cContactName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_CONTACT_ADDRESS", property="cContactAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CONTACT_POSTCODE", property="iContactPostcode", jdbcType=JdbcType.INTEGER),
        @Result(column="C_CONTACT_PHONE", property="cContactPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_CONTACT_EMAIL", property="cContactEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CONTACT_FLAG", property="iContactFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ACCOUNT_ID", property="iAccountId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ACCOUNT_FLAG", property="iAccountFlag", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeContactEntity> selectByExample(FmTradeContactEntityExample example);

    @Select({
        "select",
        "id, C_CONTACT_NAME, C_CONTACT_ADDRESS, I_CONTACT_POSTCODE, C_CONTACT_PHONE, ",
        "C_CONTACT_EMAIL, I_CONTACT_FLAG, I_ACCOUNT_ID, I_ACCOUNT_FLAG",
        "from fm_trade_contact",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_CONTACT_NAME", property="cContactName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_CONTACT_ADDRESS", property="cContactAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CONTACT_POSTCODE", property="iContactPostcode", jdbcType=JdbcType.INTEGER),
        @Result(column="C_CONTACT_PHONE", property="cContactPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_CONTACT_EMAIL", property="cContactEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CONTACT_FLAG", property="iContactFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ACCOUNT_ID", property="iAccountId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ACCOUNT_FLAG", property="iAccountFlag", jdbcType=JdbcType.INTEGER)
    })
    FmTradeContactEntity selectByPrimaryKey(Integer id);
    

    /**
     * 通过account id 查找该用户的所有联系人
     * @param 用户的account id
     * @return 该用户的所有联系人
     **/
    @Select({
        "select",
        "id, C_CONTACT_NAME, C_CONTACT_ADDRESS, I_CONTACT_POSTCODE, C_CONTACT_PHONE, ",
        "C_CONTACT_EMAIL, I_CONTACT_FLAG, I_ACCOUNT_ID, I_ACCOUNT_FLAG",
        "from fm_trade_contact",
        "where I_ACCOUNT_ID = #{accountId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_CONTACT_NAME", property="cContactName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_CONTACT_ADDRESS", property="cContactAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CONTACT_POSTCODE", property="iContactPostcode", jdbcType=JdbcType.INTEGER),
        @Result(column="C_CONTACT_PHONE", property="cContactPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_CONTACT_EMAIL", property="cContactEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_CONTACT_FLAG", property="iContactFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ACCOUNT_ID", property="iAccountId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_ACCOUNT_FLAG", property="iAccountFlag", jdbcType=JdbcType.INTEGER)
    })
    List<FmTradeContactEntity> selectByAccountId(Integer accountId);

    @UpdateProvider(type=FmTradeContactEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeContactEntity record, @Param("example") FmTradeContactEntityExample example);

    @UpdateProvider(type=FmTradeContactEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeContactEntity record, @Param("example") FmTradeContactEntityExample example);

    @UpdateProvider(type=FmTradeContactEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeContactEntity record);

    @Update({
        "update fm_trade_contact",
        "set C_CONTACT_NAME = #{cContactName,jdbcType=VARCHAR},",
          "C_CONTACT_ADDRESS = #{cContactAddress,jdbcType=VARCHAR},",
          "I_CONTACT_POSTCODE = #{iContactPostcode,jdbcType=INTEGER},",
          "C_CONTACT_PHONE = #{cContactPhone,jdbcType=VARCHAR},",
          "C_CONTACT_EMAIL = #{cContactEmail,jdbcType=VARCHAR},",
          "I_CONTACT_FLAG = #{iContactFlag,jdbcType=INTEGER},",
          "I_ACCOUNT_ID = #{iAccountId,jdbcType=INTEGER},",
          "I_ACCOUNT_FLAG = #{iAccountFlag,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeContactEntity record);
}