package test;  
  
import javax.annotation.Resource;
import javax.validation.constraints.Null;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;  
import org.junit.Before;  
import org.junit.Test;  
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
import com.alibaba.fastjson.JSON;
import com.crscd.riis.freightmarket.authority.dao.FmAccountEntityMapper;
import com.crscd.riis.freightmarket.authority.dao.FmUserEntityMapper;
import com.crscd.riis.freightmarket.authority.entity.FmAccountEntity;
import com.crscd.riis.freightmarket.authority.entity.FmUserEntity;
import com.crscd.riis.freightmarket.authority.service.IFmAccountService;  

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestService {  
    private static Logger logger = Logger.getLogger(TestDao.class);  
    private ApplicationContext ac = null;  
    @Resource 
    private IFmAccountService iFmAccountService;
	@Test  
    public void test1() {   	
		FmAccountEntity account=new FmAccountEntity();
		System.out.println(iFmAccountService.fingAccountPermissions("fa").size());
    }
	
}  

