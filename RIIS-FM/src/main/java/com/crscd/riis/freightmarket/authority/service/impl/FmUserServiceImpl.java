package com.crscd.riis.freightmarket.authority.service.impl;

import com.crscd.riis.freightmarket.authority.dao.FmUserEntityMapper;
import com.crscd.riis.freightmarket.authority.entity.FmUserEntity;
import com.crscd.riis.freightmarket.authority.service.IFmUserService;

public class FmUserServiceImpl implements IFmUserService{
	FmUserEntityMapper fmUserMapper;

	public FmUserEntityMapper getFmUserMapper() {
		return fmUserMapper;
	}

	public void setFmUserMapper(FmUserEntityMapper fmUserMapper) {
		this.fmUserMapper = fmUserMapper;
	}
	
	@Override
	public void insertFmUser(FmUserEntity user) {
		fmUserMapper.insert(user);
		
			
	}
	
	@Override
	public void insertSelectiveFmUser(FmUserEntity user) {
		fmUserMapper.insertSelective(user);
	}
	

}
