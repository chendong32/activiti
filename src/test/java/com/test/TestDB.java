package com.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.TestDao;
import com.entity.TestEntity;
import com.entity.TestUser;
import com.service.TestService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext-dao.xml","classpath*:applicationContext-trans.xml"})
public class TestDB {
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private TestDao testDao;
	
	@Test
	public void test(){
		TestEntity testEntity = new TestEntity();
		testEntity.setCreateBy(new TestUser());
		testEntity.setCreateDate(new Date());
		testEntity.setId("7");
		testEntity.setUpdateBy(new TestUser());
		testEntity.setUpdateDate(new Date());
		int insert = 0;
		try {
			insert = testService.insert(testEntity);
		} catch (Exception e) {
			System.out.println("简单的异常回滚");
		}
		System.out.println(insert);
		TestEntity entity = testDao.get(testEntity);
		System.out.println(entity);
	}
}
