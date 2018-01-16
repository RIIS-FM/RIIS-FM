package com.crscd.riis.freightmarket.authority.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.authority.dao.FmAccountEntityMapper;
import com.crscd.riis.freightmarket.authority.dao.FmUserEntityMapper;
import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.authority.entity.FmPermissionEntity;
import com.crscd.riis.freightmarket.authority.entity.FmUserEntityExample;
import com.crscd.riis.freightmarket.authority.entity.FmUserEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.service.IFmAccountService;
import com.crscd.riis.freightmarket.authority.shiro.PasswordHelper;
@Service("accountService")
public class FmAccountServiceImpl implements IFmAccountService{
	@Resource
	private FmAccountEntityMapper fmAccountEntityMapper;
	@Resource
	private FmUserEntityMapper fmUserEntityMapper;
	@Autowired
	private PasswordHelper passwordHelper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		FmUserEntityExample example = new FmUserEntityExample();
    	Criteria criteria = example.createCriteria();
    	criteria.andIAccountIdEqualTo(id);
    	long count = fmUserEntityMapper.countByExample(example);
    	if(count>0) {
    		fmUserEntityMapper.deleteByExample(example);
    	}
		return fmAccountEntityMapper.deleteByPrimaryKey(id);
	}
	@Override
	public int addAccount(FmAccountEntity account) {
		passwordHelper.encryptPassword(account);
		fmAccountEntityMapper.insertSelective(account);
		return account.getId();
	}
	@Override
	public int changePassword(int id,String password) {
		FmAccountEntity account=fmAccountEntityMapper.selectByPrimaryKey(id);
		account.setcLoginPwd(password);
		passwordHelper.encryptPassword(account);
		return fmAccountEntityMapper.updateByPrimaryKeySelective(account);
	}
	@Override
	public FmAccountEntity getAccountByName(String accountName) {
		return fmAccountEntityMapper.selectByAccountName(accountName);
	}
	@Override
	public Set<String> fingAccountRoles(String accountName){
		Set<String> roles = new HashSet<String>();
		List<String> roleList=new ArrayList<String>();
		roleList=fmAccountEntityMapper.selectRolesByAccountName(accountName);
		if(roleList.size()==0) {
			roles=null;
		}else {
			for(int i=0;i<roleList.size();i++) {
				roles.add(roleList.get(i));
			}
		}
		return roles;
	}
	@Override
	public Set<String> fingAccountPermissions(String accountName){
		Set<String> permissions= new HashSet<String>();
		List<String> roleList=new ArrayList<String>();
		List<FmPermissionEntity> iPermission=new ArrayList<FmPermissionEntity>();
		roleList=fmAccountEntityMapper.selectRolesByAccountName(accountName);
		if(roleList.size()==0) {
			permissions=null;
		}else {
			for(int i=0;i<roleList.size();i++) {
				iPermission=fmAccountEntityMapper.selectPermissionsByRoleName(roleList.get(i));
				if(!iPermission.isEmpty()) {
					for(int j=0;j<iPermission.size();j++) {
						permissions.add(iPermission.get(j).getcPermissionName());
					}
				}
						
			}
		}
		return permissions;
		
	}

}
