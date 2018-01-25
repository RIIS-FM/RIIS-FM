package com.crscd.riis.freightmarket.trade.dao;

import com.crscd.riis.freightmarket.trade.entity.FmTradeFeeEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeFeeEntityExample;
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

public interface FmTradeFeeEntityMapper {
    @SelectProvider(type=FmTradeFeeEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeFeeEntityExample example);

    @DeleteProvider(type=FmTradeFeeEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeFeeEntityExample example);

    @Delete({
        "delete from fm_trade_fee",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_fee (id, I_FEE_TYPE, ",
        "I_TRANSPORT_TYPE, C_PRICE_NO, ",
        "F_BASE_PRICE_ONE, F_BASE_PRICE_TWO)",
        "values (#{id,jdbcType=INTEGER}, #{iFeeType,jdbcType=INTEGER}, ",
        "#{iTransportType,jdbcType=INTEGER}, #{cPriceNo,jdbcType=VARCHAR}, ",
        "#{fBasePriceOne,jdbcType=REAL}, #{fBasePriceTwo,jdbcType=REAL})"
    })
    int insert(FmTradeFeeEntity record);

    @InsertProvider(type=FmTradeFeeEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeFeeEntity record);

    @SelectProvider(type=FmTradeFeeEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_FEE_TYPE", property="iFeeType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_TRANSPORT_TYPE", property="iTransportType", jdbcType=JdbcType.INTEGER),
        @Result(column="C_PRICE_NO", property="cPriceNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_BASE_PRICE_ONE", property="fBasePriceOne", jdbcType=JdbcType.REAL),
        @Result(column="F_BASE_PRICE_TWO", property="fBasePriceTwo", jdbcType=JdbcType.REAL)
    })
    List<FmTradeFeeEntity> selectByExample(FmTradeFeeEntityExample example);

    @Select({
        "select",
        "id, I_FEE_TYPE, I_TRANSPORT_TYPE, C_PRICE_NO, F_BASE_PRICE_ONE, F_BASE_PRICE_TWO",
        "from fm_trade_fee",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_FEE_TYPE", property="iFeeType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_TRANSPORT_TYPE", property="iTransportType", jdbcType=JdbcType.INTEGER),
        @Result(column="C_PRICE_NO", property="cPriceNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_BASE_PRICE_ONE", property="fBasePriceOne", jdbcType=JdbcType.REAL),
        @Result(column="F_BASE_PRICE_TWO", property="fBasePriceTwo", jdbcType=JdbcType.REAL)
    })
    FmTradeFeeEntity selectByPrimaryKey(Integer id);
    
    /**
     * 通过费用类型和运输类型， 查询费用实体
     * @param Integer feeType 费用类型
     *        Integer orderType 订单类型
     * @return 查找成功费用实体，查找失败返回null
     */
    @Select({
        "select",
        "id, I_FEE_TYPE, I_TRANSPORT_TYPE, C_PRICE_NO, F_BASE_PRICE_ONE, F_BASE_PRICE_TWO",
        "from fm_trade_fee",
        "where I_FEE_TYPE = #{feeType,jdbcType=INTEGER} and I_TRANSPORT_TYPE = #{orderType,jdbcType=INTEGER} and C_PRICE_NO = #{priceNum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="I_FEE_TYPE", property="iFeeType", jdbcType=JdbcType.INTEGER),
        @Result(column="I_TRANSPORT_TYPE", property="iTransportType", jdbcType=JdbcType.INTEGER),
        @Result(column="C_PRICE_NO", property="cPriceNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_BASE_PRICE_ONE", property="fBasePriceOne", jdbcType=JdbcType.REAL),
        @Result(column="F_BASE_PRICE_TWO", property="fBasePriceTwo", jdbcType=JdbcType.REAL)
    })
    FmTradeFeeEntity selectByFeeAndOrderType(@Param("feeType") Integer feeType, @Param("orderType") Integer orderType,
    		@Param("priceNum") String priceNum);

    @UpdateProvider(type=FmTradeFeeEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeFeeEntity record, @Param("example") FmTradeFeeEntityExample example);

    @UpdateProvider(type=FmTradeFeeEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeFeeEntity record, @Param("example") FmTradeFeeEntityExample example);

    @UpdateProvider(type=FmTradeFeeEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeFeeEntity record);

    @Update({
        "update fm_trade_fee",
        "set I_FEE_TYPE = #{iFeeType,jdbcType=INTEGER},",
          "I_TRANSPORT_TYPE = #{iTransportType,jdbcType=INTEGER},",
          "C_PRICE_NO = #{cPriceNo,jdbcType=VARCHAR},",
          "F_BASE_PRICE_ONE = #{fBasePriceOne,jdbcType=REAL},",
          "F_BASE_PRICE_TWO = #{fBasePriceTwo,jdbcType=REAL}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeFeeEntity record);
}