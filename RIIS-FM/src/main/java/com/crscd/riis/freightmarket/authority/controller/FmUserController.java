package com.crscd.riis.freightmarket.authority.controller;

import javax.annotation.Resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crscd.riis.freightmarket.authority.entity.FmUserEntity;
import com.crscd.riis.freightmarket.authority.service.IFmUserService;


@Controller

@RequestMapping("/fmUser")

public class FmUserController {
	@Resource
	 private IFmUserService  userService;
	
	
	@RequestMapping(value="/insertUser")
	@ResponseBody
	public FmUserEntity insertUser(@RequestBody FmUserEntity fmuser) {
		System.out.println(fmuser);
		
		userService.insertFmUser(fmuser);
		return fmuser;
		
	}
	

}
