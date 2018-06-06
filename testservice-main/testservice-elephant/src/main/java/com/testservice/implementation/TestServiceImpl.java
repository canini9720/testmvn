package com.testservice.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testservice.dto.TestDTO;
import com.testservice.model.TestEntity;
import com.testservice.service.TestService;


@Service("testService")
@Transactional
public class TestServiceImpl implements TestService {

	@Autowired
	TestDAO testDAO;
	
	@Override
	public Long saveTest(TestDTO dto) throws Exception {
		TestEntity testEntity=new TestEntity();
		testEntity.setId(1l);
		testEntity.setName("Tester");
		testDAO.saveTest(testEntity);
		System.out.println("cussesfuly inserted");
		return testEntity.getId();
	}

}
