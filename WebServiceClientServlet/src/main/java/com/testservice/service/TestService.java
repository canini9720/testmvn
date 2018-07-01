package com.testservice.service;

import com.testservice.dto.TestDTO;

public interface TestService {

	public Long saveTest(TestDTO dto) throws Exception;
}
