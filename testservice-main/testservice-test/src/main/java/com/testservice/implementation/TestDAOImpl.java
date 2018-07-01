package com.testservice.implementation;

import org.springframework.stereotype.Repository;

import com.testservice.common.implementation.JdbcCommonDao;
import com.testservice.model.TestEntity;

@Repository("testDAO")
public class TestDAOImpl extends JdbcCommonDao implements TestDAO{



	@Override
	public void saveTest(TestEntity entity) throws Exception {
		this.getEm().persist(entity);
		
	}


}
