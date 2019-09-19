package com.framework.apiworld.service;

import com.framework.apiworld.entity.TestCase;

public interface TestCaseService {

    String createTestCase(TestCase testCaseRequest);
    TestCase findById(String id);
}
