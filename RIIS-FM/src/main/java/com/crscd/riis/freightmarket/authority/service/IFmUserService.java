package com.crscd.riis.freightmarket.authority.service;

import com.crscd.riis.freightmarket.authority.entity.FmUserEntity;

public interface IFmUserService {
	public void insertFmUser(FmUserEntity user);
	public void insertSelectiveFmUser(FmUserEntity user);

}
