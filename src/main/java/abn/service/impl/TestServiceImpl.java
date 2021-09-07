package abn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abn.service.TestService;
import abn.domain.Test;
import abn.domain.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestRepository testRepository;

	public Test helloBitgrip(Test test) {
		return testRepository.save(test);

	}
}
