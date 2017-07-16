package com.liyin.test;

import java.io.Serializable;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liyin.liger.sys.model.SysUser;
import com.liyin.liger.sys.service.SysUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/ApplicationContext.xml"})
public class DaoTest {

//	@Autowired
//	DataSource dataSource;
	
//	@Autowired
//	SysUserDao sysUserDao; 
	
	@Autowired
	SysUserService sysUserService;
	
    @Test
    public void testMy() throws Exception
    {
    	SysUser o = new SysUser();
    	o.setCreateTime(new Date());
    	o.setUserId(new Long(161611));
    	o.setUsername("f1111");
    	Serializable insert = sysUserService.insert(o);
		System.out.println(insert);
//    	
//    	o = new SysUser();
//    	o.setCreateTime(new Date());
//    	o.setUserId(new Long(1));
//    	o.setUsername("fffvvt");
//		List<SysUser> selectList = sysUserService.selectList(o);
//		System.out.println(selectList);

//    	System.out.println(sysUserDao);
//    	SysUserDto c = new SysUserDto();
//		List<SysUserDto> selectList = sysUserDao.selectList(c );
//		System.out.println(selectList.size());
    	
//    	SysUser o = new SysUser();
//    	o.setUserId(new Long(5));
//    	o.setUsername("xxxx");
//    	sysUserService.delete(o);
    	
//    	SysUser o = new SysUser();
//    	o.setCreateTime(new Date());
//    	o.setUserId(new Long(1));
//    	o.setUsername("fffvv");
//		sysUserService.update(o );
    	

    	

    	
    	
    }



    @Ignore
    public void testOtherSpringObject()
    {
    }

}
