package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmUserEntity;
import com.crscd.riis.freightmarket.authority.entity.FmUserEntityExample;
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

public interface FmUserEntityMapper {
    @SelectProvider(type=FmUserEntitySqlProvider.class, method="countByExample")
    long countByExample(FmUserEntityExample example);

    @DeleteProvider(type=FmUserEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmUserEntityExample example);

    @Delete({
        "delete from fm_authority_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_authority_user (id, I_ACCOUNT_ID, ",
        "C_RAILWAY_BUREAU, C_USER_NAME, ",
        "C_USER_ADDRESS, C_USER_ID_NUM, ",
        "C_USER_PHONE, C_USER_MAIL, ",
        "C_USER_TEL, C_PWD_Q, ",
        "C_PWD_A, I_FREIGHT_FLAG, ",
        "C_SHIPPER_NAME, C_LOADING_STATION, ",
        "C_LOADING_LOCATION, C_GOODS_NAME, ",
        "C_UNLOADING_STATION, C_UNLOADING_LOCATION)",
        "values (#{id,jdbcType=INTEGER}, #{iAccountId,jdbcType=INTEGER}, ",
        "#{cRailwayBureau,jdbcType=VARCHAR}, #{cUserName,jdbcType=VARCHAR}, ",
        "#{cUserAddress,jdbcType=VARCHAR}, #{cUserIdNum,jdbcType=VARCHAR}, ",
        "#{cUserPhone,jdbcType=VARCHAR}, #{cUserMail,jdbcType=VARCHAR}, ",
        "#{cUserTel,jdbcType=VARCHAR}, #{cPwdQ,jdbcType=VARCHAR}, ",
        "#{cPwdA,jdbcType=VARCHAR}, #{iFreightFlag,jdbcType=INTEGER}, ",
        "#{cShipperName,jdbcType=VARCHAR}, #{cLoadingStation,jdbcType=VARCHAR}, ",
        "#{cLoadingLocation,jdbcType=VARCHAR}, #{cGoodsName,jdbcType=VARCHAR}, ",
        "#{cUnloadingStation,jdbcType=VARCHAR}, #{cUnloadingLocation,jdbcType=VARCHAR})"
    })
    int insert(FmUserEntity record);

    @InsertProvider(type=FmUserEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmUserEntity record);

    @SelectProvider(type=FmUserEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ACCOUNT_ID", property="iAccountId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_RAILWAY_BUREAU", property="cRailwayBureau", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_NAME", property="cUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_ADDRESS", property="cUserAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_ID_NUM", property="cUserIdNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_PHONE", property="cUserPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_MAIL", property="cUserMail", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_TEL", property="cUserTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_PWD_Q", property="cPwdQ", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_PWD_A", property="cPwdA", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_FREIGHT_FLAG", property="iFreightFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="C_SHIPPER_NAME", property="cShipperName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOADING_STATION", property="cLoadingStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOADING_LOCATION", property="cLoadingLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_UNLOADING_STATION", property="cUnloadingStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_UNLOADING_LOCATION", property="cUnloadingLocation", jdbcType=JdbcType.VARCHAR)
    })
    List<FmUserEntity> selectByExample(FmUserEntityExample example);

    @Select({
        "select",
        "id, I_ACCOUNT_ID, C_RAILWAY_BUREAU, C_USER_NAME, C_USER_ADDRESS, C_USER_ID_NUM, ",
        "C_USER_PHONE, C_USER_MAIL, C_USER_TEL, C_PWD_Q, C_PWD_A, I_FREIGHT_FLAG, C_SHIPPER_NAME, ",
        "C_LOADING_STATION, C_LOADING_LOCATION, C_GOODS_NAME, C_UNLOADING_STATION, C_UNLOADING_LOCATION",
        "from fm_authority_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_ACCOUNT_ID", property="iAccountId", jdbcType=JdbcType.INTEGER),
        @Result(column="C_RAILWAY_BUREAU", property="cRailwayBureau", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_NAME", property="cUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_ADDRESS", property="cUserAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_ID_NUM", property="cUserIdNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_PHONE", property="cUserPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_MAIL", property="cUserMail", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_USER_TEL", property="cUserTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_PWD_Q", property="cPwdQ", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_PWD_A", property="cPwdA", jdbcType=JdbcType.VARCHAR),
        @Result(column="I_FREIGHT_FLAG", property="iFreightFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="C_SHIPPER_NAME", property="cShipperName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOADING_STATION", property="cLoadingStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_LOADING_LOCATION", property="cLoadingLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_UNLOADING_STATION", property="cUnloadingStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_UNLOADING_LOCATION", property="cUnloadingLocation", jdbcType=JdbcType.VARCHAR)
    })
    FmUserEntity selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FmUserEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmUserEntity record, @Param("example") FmUserEntityExample example);

    @UpdateProvider(type=FmUserEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmUserEntity record, @Param("example") FmUserEntityExample example);

    @UpdateProvider(type=FmUserEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmUserEntity record);

    @Update({
        "update fm_authority_user",
        "set I_ACCOUNT_ID = #{iAccountId,jdbcType=INTEGER},",
          "C_RAILWAY_BUREAU = #{cRailwayBureau,jdbcType=VARCHAR},",
          "C_USER_NAME = #{cUserName,jdbcType=VARCHAR},",
          "C_USER_ADDRESS = #{cUserAddress,jdbcType=VARCHAR},",
          "C_USER_ID_NUM = #{cUserIdNum,jdbcType=VARCHAR},",
          "C_USER_PHONE = #{cUserPhone,jdbcType=VARCHAR},",
          "C_USER_MAIL = #{cUserMail,jdbcType=VARCHAR},",
          "C_USER_TEL = #{cUserTel,jdbcType=VARCHAR},",
          "C_PWD_Q = #{cPwdQ,jdbcType=VARCHAR},",
          "C_PWD_A = #{cPwdA,jdbcType=VARCHAR},",
          "I_FREIGHT_FLAG = #{iFreightFlag,jdbcType=INTEGER},",
          "C_SHIPPER_NAME = #{cShipperName,jdbcType=VARCHAR},",
          "C_LOADING_STATION = #{cLoadingStation,jdbcType=VARCHAR},",
          "C_LOADING_LOCATION = #{cLoadingLocation,jdbcType=VARCHAR},",
          "C_GOODS_NAME = #{cGoodsName,jdbcType=VARCHAR},",
          "C_UNLOADING_STATION = #{cUnloadingStation,jdbcType=VARCHAR},",
          "C_UNLOADING_LOCATION = #{cUnloadingLocation,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmUserEntity record);
}