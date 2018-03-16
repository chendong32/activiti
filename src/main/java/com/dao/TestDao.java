package com.dao;

import com.entity.TestEntity;

public interface TestDao {
	
	public TestEntity get(TestEntity testEntity);
	
	public int insert(TestEntity testEntity);
}
