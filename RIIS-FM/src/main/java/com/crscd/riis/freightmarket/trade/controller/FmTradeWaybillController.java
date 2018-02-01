package com.crscd.riis.freightmarket.trade.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.trade.dto.findWaybillDtoIn;
import com.crscd.riis.freightmarket.trade.dto.findWaybillDtoOut;
import com.crscd.riis.freightmarket.trade.dto.waybillInfoDto;
import com.crscd.riis.freightmarket.trade.entity.FmTradeOrderInfoBaseEntity;
import com.crscd.riis.freightmarket.trade.entity.FmTradeWaybillEntity;
import com.crscd.riis.freightmarket.trade.service.IFmTradeWaybillService;
import com.crscd.riis.freightmarket.trade.util.page.PageModel;



/* *
 * 运单控制器
 * */
@Controller
@RequestMapping("/fmTradeWaybillController")
public class FmTradeWaybillController {
	@Resource
	private IFmTradeWaybillService fmTradeWaybillService;

	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeWaybillController/saveWaybill
	 * 保存运单
	 * @param 订单id
	 * @return 插入成功标志位
	 * */
	@RequestMapping("/saveWaybill")
	@ResponseBody
	public int saveWaybill(@RequestBody FmTradeOrderInfoBaseEntity record) {
		
		/*插入成功标志位*/
		int ret = 0;
		
		List<FmTradeWaybillEntity> waybillList = new ArrayList<FmTradeWaybillEntity>();
		waybillList =fmTradeWaybillService.getWaybillByOrder(record.getId());
		
		if (waybillList != null) {
			for (int i = 0; i < waybillList.size(); i++) {
				ret = ret + fmTradeWaybillService.saveWaybill(waybillList.get(i));
			}
			
			/*生成运单成功返回影响行数*/
			return ret;
		}
		else 
			
			/*生成运单失败返回-1*/
		    return ret = -1;
	}
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeWaybillController/modifyWaybill
	 * 修改运单
	 * @param 运单实体
	 * @return 修改成功标志位
	 * */
	@RequestMapping("/modifyWaybill")
	@ResponseBody
	public int modifyWaybill(@RequestBody FmTradeWaybillEntity record) {
		
		int ret = -1;
		
		ret = fmTradeWaybillService.modifyWaybill(record);
		
		return ret;
	}
	
	/**
	 * URL：http://localhost:8080/RIIS-FM/fmTradeWaybillController/findWaybill
	 * 通过iSenderId查询全部运单信息，分页显示
	 * @param 运单实体
	 * @return 修改成功标志位
	 * */
	@RequestMapping("/findWaybill")
	@ResponseBody
	public findWaybillDtoOut findWaybill(@RequestBody findWaybillDtoIn dto) {
		
		PageModel pageModel = dto.getPageModel();
		FmAccountEntity user = dto.getUser();
		
		Map<String, Object> orderRequirement = dto.getOrderRequirement();
		Map<String, Object> waybillRequirement = dto.getWaybillRequirement();
		
		findWaybillDtoOut retWaybillDto = new findWaybillDtoOut();
		
		List<waybillInfoDto> waybillInfoList = fmTradeWaybillService.findWaybill(user, orderRequirement, waybillRequirement, pageModel);
		retWaybillDto.setWaybillInfoList(waybillInfoList);
		retWaybillDto.setPageModel(pageModel);
		
		return retWaybillDto;
	}



}
