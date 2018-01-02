package com.crscd.riis.freightmarket.authority.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crscd.riis.freightmarket.authority.entity.FmUserEntity;
import com.crscd.riis.freightmarket.authority.service.IFmUserService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/fmUser")
public class FmUserController {
	IFmUserService ifmuser;
	@RequestMapping("/insertUser")
	public void insertUser(String json) {
		Gson gson=new Gson();
		FmUserEntity fmuser=gson.fromJson(json, FmUserEntity.class);
		ifmuser.insertFmUser(fmuser);
		
	}
	

}
