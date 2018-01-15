package com.crscd.riis.freightmarket.authority.dao;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeGoodsEntity;
import com.crscd.riis.freightmarket.authority.entity.FmTradeGoodsEntityExample;
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

public interface FmTradeGoodsEntityMapper {
    @SelectProvider(type=FmTradeGoodsEntitySqlProvider.class, method="countByExample")
    long countByExample(FmTradeGoodsEntityExample example);

    @DeleteProvider(type=FmTradeGoodsEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(FmTradeGoodsEntityExample example);

    @Delete({
        "delete from fm_trade_goods",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fm_trade_goods (ID, C_GOODS_NAME_SPELL_ALL, ",
        "C_GOODS_NAME_SPELL_SHORTH, C_GOODS_NAME, ",
        "C_GOODS_CATEGORY_CODE, C_GOODS_TYPE_ID, ",
        "I_GOODS_DANGER, F_GOODS_INSURED_RATE, ",
        "F_GOODS_INSURANCE_VALUE, F_GOODS_LOAD_AND_UNLOAD_RATE, ",
        "C_GOODS_WHOLE_VEGICLE_RATE, C_GOODS_FAST_FREIGHT_RATE, ",
        "C_GOODS_BOX_FREIGHT_RATE)",
        "values (#{id,jdbcType=INTEGER}, #{cGoodsNameSpellAll,jdbcType=VARCHAR}, ",
        "#{cGoodsNameSpellShorth,jdbcType=VARCHAR}, #{cGoodsName,jdbcType=VARCHAR}, ",
        "#{cGoodsCategoryCode,jdbcType=VARCHAR}, #{cGoodsTypeId,jdbcType=INTEGER}, ",
        "#{iGoodsDanger,jdbcType=INTEGER}, #{fGoodsInsuredRate,jdbcType=REAL}, ",
        "#{fGoodsInsuranceValue,jdbcType=REAL}, #{fGoodsLoadAndUnloadRate,jdbcType=REAL}, ",
        "#{cGoodsWholeVegicleRate,jdbcType=VARCHAR}, #{cGoodsFastFreightRate,jdbcType=VARCHAR}, ",
        "#{cGoodsBoxFreightRate,jdbcType=VARCHAR})"
    })
    int insert(FmTradeGoodsEntity record);

    @InsertProvider(type=FmTradeGoodsEntitySqlProvider.class, method="insertSelective")
    int insertSelective(FmTradeGoodsEntity record);

    @SelectProvider(type=FmTradeGoodsEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_GOODS_NAME_SPELL_ALL", property="cGoodsNameSpellAll", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME_SPELL_SHORTH", property="cGoodsNameSpellShorth", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_CATEGORY_CODE", property="cGoodsCategoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_TYPE_ID", property="cGoodsTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_DANGER", property="iGoodsDanger", jdbcType=JdbcType.INTEGER),
        @Result(column="F_GOODS_INSURED_RATE", property="fGoodsInsuredRate", jdbcType=JdbcType.REAL),
        @Result(column="F_GOODS_INSURANCE_VALUE", property="fGoodsInsuranceValue", jdbcType=JdbcType.REAL),
        @Result(column="F_GOODS_LOAD_AND_UNLOAD_RATE", property="fGoodsLoadAndUnloadRate", jdbcType=JdbcType.REAL),
        @Result(column="C_GOODS_WHOLE_VEGICLE_RATE", property="cGoodsWholeVegicleRate", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_FAST_FREIGHT_RATE", property="cGoodsFastFreightRate", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_BOX_FREIGHT_RATE", property="cGoodsBoxFreightRate", jdbcType=JdbcType.VARCHAR)
    })
    List<FmTradeGoodsEntity> selectByExample(FmTradeGoodsEntityExample example);

    @Select({
        "select",
        "ID, C_GOODS_NAME_SPELL_ALL, C_GOODS_NAME_SPELL_SHORTH, C_GOODS_NAME, C_GOODS_CATEGORY_CODE, ",
        "C_GOODS_TYPE_ID, I_GOODS_DANGER, F_GOODS_INSURED_RATE, F_GOODS_INSURANCE_VALUE, ",
        "F_GOODS_LOAD_AND_UNLOAD_RATE, C_GOODS_WHOLE_VEGICLE_RATE, C_GOODS_FAST_FREIGHT_RATE, ",
        "C_GOODS_BOX_FREIGHT_RATE",
        "from fm_trade_goods",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_GOODS_NAME_SPELL_ALL", property="cGoodsNameSpellAll", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME_SPELL_SHORTH", property="cGoodsNameSpellShorth", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_CATEGORY_CODE", property="cGoodsCategoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_TYPE_ID", property="cGoodsTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_DANGER", property="iGoodsDanger", jdbcType=JdbcType.INTEGER),
        @Result(column="F_GOODS_INSURED_RATE", property="fGoodsInsuredRate", jdbcType=JdbcType.REAL),
        @Result(column="F_GOODS_INSURANCE_VALUE", property="fGoodsInsuranceValue", jdbcType=JdbcType.REAL),
        @Result(column="F_GOODS_LOAD_AND_UNLOAD_RATE", property="fGoodsLoadAndUnloadRate", jdbcType=JdbcType.REAL),
        @Result(column="C_GOODS_WHOLE_VEGICLE_RATE", property="cGoodsWholeVegicleRate", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_FAST_FREIGHT_RATE", property="cGoodsFastFreightRate", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_BOX_FREIGHT_RATE", property="cGoodsBoxFreightRate", jdbcType=JdbcType.VARCHAR)
    })
    FmTradeGoodsEntity selectByPrimaryKey(Integer id);
    
    /* *
     * 根据货物名称查找货物的信息
     * @param 货物名称
     * @return 货物的有关信息
     * */
    @Select({
        "select",
        "ID, C_GOODS_NAME_SPELL_ALL, C_GOODS_NAME_SPELL_SHORTH, C_GOODS_NAME, C_GOODS_CATEGORY_CODE, ",
        "C_GOODS_TYPE_ID, I_GOODS_DANGER, F_GOODS_INSURED_RATE, F_GOODS_INSURANCE_VALUE, ",
        "F_GOODS_LOAD_AND_UNLOAD_RATE, C_GOODS_WHOLE_VEGICLE_RATE, C_GOODS_FAST_FREIGHT_RATE, ",
        "C_GOODS_BOX_FREIGHT_RATE",
        "from fm_trade_goods",
        "where C_GOODS_NAME = #{name,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="C_GOODS_NAME_SPELL_ALL", property="cGoodsNameSpellAll", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME_SPELL_SHORTH", property="cGoodsNameSpellShorth", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_NAME", property="cGoodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_CATEGORY_CODE", property="cGoodsCategoryCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_TYPE_ID", property="cGoodsTypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="I_GOODS_DANGER", property="iGoodsDanger", jdbcType=JdbcType.INTEGER),
        @Result(column="F_GOODS_INSURED_RATE", property="fGoodsInsuredRate", jdbcType=JdbcType.REAL),
        @Result(column="F_GOODS_INSURANCE_VALUE", property="fGoodsInsuranceValue", jdbcType=JdbcType.REAL),
        @Result(column="F_GOODS_LOAD_AND_UNLOAD_RATE", property="fGoodsLoadAndUnloadRate", jdbcType=JdbcType.REAL),
        @Result(column="C_GOODS_WHOLE_VEGICLE_RATE", property="cGoodsWholeVegicleRate", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_FAST_FREIGHT_RATE", property="cGoodsFastFreightRate", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_GOODS_BOX_FREIGHT_RATE", property="cGoodsBoxFreightRate", jdbcType=JdbcType.VARCHAR)
    })
    FmTradeGoodsEntity selectByGoodsName(String goodsName);

    @UpdateProvider(type=FmTradeGoodsEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FmTradeGoodsEntity record, @Param("example") FmTradeGoodsEntityExample example);

    @UpdateProvider(type=FmTradeGoodsEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FmTradeGoodsEntity record, @Param("example") FmTradeGoodsEntityExample example);

    @UpdateProvider(type=FmTradeGoodsEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FmTradeGoodsEntity record);

    @Update({
        "update fm_trade_goods",
        "set C_GOODS_NAME_SPELL_ALL = #{cGoodsNameSpellAll,jdbcType=VARCHAR},",
          "C_GOODS_NAME_SPELL_SHORTH = #{cGoodsNameSpellShorth,jdbcType=VARCHAR},",
          "C_GOODS_NAME = #{cGoodsName,jdbcType=VARCHAR},",
          "C_GOODS_CATEGORY_CODE = #{cGoodsCategoryCode,jdbcType=VARCHAR},",
          "C_GOODS_TYPE_ID = #{cGoodsTypeId,jdbcType=INTEGER},",
          "I_GOODS_DANGER = #{iGoodsDanger,jdbcType=INTEGER},",
          "F_GOODS_INSURED_RATE = #{fGoodsInsuredRate,jdbcType=REAL},",
          "F_GOODS_INSURANCE_VALUE = #{fGoodsInsuranceValue,jdbcType=REAL},",
          "F_GOODS_LOAD_AND_UNLOAD_RATE = #{fGoodsLoadAndUnloadRate,jdbcType=REAL},",
          "C_GOODS_WHOLE_VEGICLE_RATE = #{cGoodsWholeVegicleRate,jdbcType=VARCHAR},",
          "C_GOODS_FAST_FREIGHT_RATE = #{cGoodsFastFreightRate,jdbcType=VARCHAR},",
          "C_GOODS_BOX_FREIGHT_RATE = #{cGoodsBoxFreightRate,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmTradeGoodsEntity record);
}