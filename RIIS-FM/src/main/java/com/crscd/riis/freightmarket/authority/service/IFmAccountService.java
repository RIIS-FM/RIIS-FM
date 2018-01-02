package com.crscd.riis.freightmarket.authority.service;

import java.util.Set;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;

public interface IFmAccountService {
	//ɾ���˻�
	public int deleteByPrimaryKey(Integer id);
	//�����˻�
	public int addAccount(FmAccountEntity account);
	//��������
	public int changePassword(int id,String password);
	//�����˻��������˻�
	public FmAccountEntity getAccountByName(String accountName);
	//�����˻��������û���ɫ
	public Set<String> fingAccountRoles(String accountName);
	//�����˻��������û�Ȩ��
	public Set<String> fingAccountPermissions(String accountName);

}
