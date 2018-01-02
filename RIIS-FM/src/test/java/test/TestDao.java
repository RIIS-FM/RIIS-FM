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
import com.crscd.riis.freightmarket.authority.entity.FmAccountEntityExample;
import com.crscd.riis.freightmarket.authority.entity.FmAccountEntityExample.Criteria;
import com.crscd.riis.freightmarket.authority.entity.FmUserEntity;

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestDao {  
    private static Logger logger = Logger.getLogger(TestDao.class);  
    private ApplicationContext ac = null;  
    @Autowired
    private FmUserEntityMapper fmUserMapper;  
    @Autowired
    private FmAccountEntityMapper fmAccountEntityMapper;
	@Test  
    public void test1() {   	
    	FmUserEntity user=new FmUserEntity();
    	user.setiAccountId(2);
    	user.setcUserName("---");
    	System.out.println(fmUserMapper.insert(user));   	
    }
	@Test 
	public void test2() {
//		Integer i=3;
//		FmAccountEntityExample example=new FmAccountEntityExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andCLoginNameEqualTo("adv");
//		System.out.println(fmAccountEntityMapper.selectRolesByAccountName("发的")); 
		System.out.println(fmAccountEntityMapper.selectPermissionsByRoleName("admin").get(0).getcPermissionName()); 

	}
    
}  

