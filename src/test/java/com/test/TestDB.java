package com.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.TestDao;
import com.entity.TestEntity;
import com.entity.TestUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-dao.xml"})
public class TestDB {
	
	@Autowired
	ApplicationContext applicationContext;
	
	@Test
	public void test(){
		TestDao testDao = (TestDao) applicationContext.getBean("testDao");
		TestEntity testEntity = new TestEntity();
		testEntity.setCreateBy(new TestUser());
		testEntity.setCreateDate(new Date());
		testEntity.setId("1");
		testEntity.setUpdateBy(new TestUser());
		testEntity.setUpdateDate(new Date());
		int insert = testDao.insert(testEntity);
		System.out.println(insert);
		
		TestEntity entity = testDao.get(testEntity);
		System.out.println(entity);
	}
}
