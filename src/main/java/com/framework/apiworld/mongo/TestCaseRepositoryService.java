package com.framework.apiworld.mongo;


import java.util.List;
import java.util.UUID;

public interface TestCaseRepositoryService {
    TestCaseObjectDocument createTestCase(TestCaseObjectDocument testCase);
    List<TestCaseObjectDocument> getAllTestCases();
    TestCaseObjectDocument findById(String id);
    void update(TestCaseObjectDocument testCase);
    void deleteApiById(UUID id);
    void updatePartially(TestCaseObjectDocument testCase, UUID id);
}
