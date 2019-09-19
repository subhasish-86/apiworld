package com.framework.apiworld.mongo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class TestCaseRepositoryServiceImpl implements TestCaseRepositoryService {

    @Autowired
    private TestCaseRepository testCaseRepository;

    public TestCaseRepositoryServiceImpl() {
    }

    @Override
    public TestCaseObjectDocument createTestCase(TestCaseObjectDocument testCase) {
        testCaseRepository.save(testCase);
        return testCase;
    }

    @Override
    public List<TestCaseObjectDocument> getAllTestCases() {
        return testCaseRepository.findAll();
    }

    @Override
    public TestCaseObjectDocument findById(String id) {
        return testCaseRepository.findById(id).orElseThrow(() -> new RuntimeException("No test case found for given id"));
    }

    @Override
    public void update(TestCaseObjectDocument testCase) {

    }

    @Override
    public void deleteApiById(UUID id) {
        testCaseRepository.deleteById(id.toString());
    }

    @Override
    public void updatePartially(TestCaseObjectDocument api, UUID id) {

    }
}
