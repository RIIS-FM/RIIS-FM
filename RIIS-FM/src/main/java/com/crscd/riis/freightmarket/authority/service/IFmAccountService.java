package com.crscd.riis.freightmarket.authority.service;

import java.util.Set;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;

public interface IFmAccountService {
	//删除账户
	public int deleteByPrimaryKey(Integer id);
	//增加账户
	public int addAccount(FmAccountEntity account);
	//更改密码
	public int changePassword(int id,String password);
	//根据账户名查找账户
	public FmAccountEntity getAccountByName(String accountName);
	//根据账户名查找用户角色
	public Set<String> fingAccountRoles(String accountName);
	//根据账户名查找用户权限
	public Set<String> fingAccountPermissions(String accountName);

}
