package com.crscd.riis.freightmarket.authority.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.authority.dao.FmUserEntityMapper;
import com.crscd.riis.freightmarket.authority.entity.FmUserEntity;
import com.crscd.riis.freightmarket.authority.service.IFmUserService;

@Service("userService")
public class FmUserServiceImpl implements IFmUserService{
	@Resource
	private FmUserEntityMapper fmUserMapper;

	
	@Override
	public void insertFmUser(FmUserEntity user) {
		fmUserMapper.insert(user);
		
			
	}
	
	@Override
	public void insertSelectiveFmUser(FmUserEntity user) {
		fmUserMapper.insertSelective(user);
	}
	

}
