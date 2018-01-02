package com.crscd.riis.freightmarket.authority.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.authority.service.IFmAccountService;

public class UserRealm extends AuthorizingRealm{
	@Autowired
	IFmAccountService iFmAccountService;
	 @Override
	    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
	        String accountName = (String)principals.getPrimaryPrincipal();

	        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
	        authorizationInfo.setRoles(iFmAccountService.fingAccountRoles(accountName));
	        authorizationInfo.setStringPermissions(iFmAccountService.fingAccountPermissions(accountName));
	        return authorizationInfo;
	    }

	    @Override
	    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

	        String accountName = (String)token.getPrincipal();

	        FmAccountEntity account =iFmAccountService.getAccountByName(accountName);

	        if(account == null) {
	            throw new UnknownAccountException();//没找到帐号
	        }

	        if(Boolean.TRUE.equals(account.getiLockFlag())) {
	            throw new LockedAccountException(); //帐号锁定
	        }

	        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
	        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
	        		account.getcLoginName(), //用户名
	        		account.getcLoginPwd(), //密码
	                ByteSource.Util.bytes(account.getcLoginPwdSalt()),//salt=username+salt
	                getName()  //realm name
	        );
	        return authenticationInfo;
	    }

	    @Override
	    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
	        super.clearCachedAuthorizationInfo(principals);
	    }

	    @Override
	    public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
	        super.clearCachedAuthenticationInfo(principals);
	    }

	    @Override
	    public void clearCache(PrincipalCollection principals) {
	        super.clearCache(principals);
	    }

	    public void clearAllCachedAuthorizationInfo() {
	        getAuthorizationCache().clear();
	    }

	    public void clearAllCachedAuthenticationInfo() {
	        getAuthenticationCache().clear();
	    }

	    public void clearAllCache() {
	        clearAllCachedAuthenticationInfo();
	        clearAllCachedAuthorizationInfo();
	    }

}
