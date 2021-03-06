package com.crscd.riis.freightmarket.authority.shiro;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;

@Service("PasswordHelper")
public class PasswordHelper {
	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    private String algorithmName = "md5";
    private int hashIterations = 2;

    public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public void setHashIterations(int hashIterations) {
        this.hashIterations = hashIterations;
    }

    public void encryptPassword(FmAccountEntity account) {

    	account.setcLoginPwdSalt(randomNumberGenerator.nextBytes().toHex());;

        String newPassword = new SimpleHash(
                algorithmName,
                account.getcLoginPwd(),
                ByteSource.Util.bytes(account.getcLoginPwdSalt()),
                hashIterations).toHex();

        account.setcLoginPwd(newPassword);;
    }
}
