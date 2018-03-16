package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.TestDao;
import com.entity.TestEntity;

@Transactional
@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestDao testDao;
	
	@Transactional(rollbackFor=Exception.class)
	public int insert(TestEntity testEntity){		
		
		testDao.insert(testEntity);	
		throw new RuntimeException();
	}

}
