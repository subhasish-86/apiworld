package com.framework.apiworld.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.framework.apiworld.entity.TestCase;
import com.framework.apiworld.mongo.TestCaseObjectDocument;
import com.framework.apiworld.mongo.TestCaseRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TestCaseServiceImpl implements TestCaseService{

    @Autowired
    private TestCaseRepositoryService repositoryService;

    @Override
    public String createTestCase(TestCase testCase) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        String testcaseDocument = "";
        TestCaseObjectDocument testCaseObjectDocument = new TestCaseObjectDocument();
        String dbDocument="";
        TestCase testCase1 = new TestCase();
        try {
             testcaseDocument = objectMapper.writeValueAsString(testCase);
             testCaseObjectDocument = objectMapper.readValue(testcaseDocument, TestCaseObjectDocument.class);
             testCaseObjectDocument = repositoryService.createTestCase(testCaseObjectDocument);
             dbDocument = objectMapper.writeValueAsString(testCaseObjectDocument);
             testCase1 = objectMapper.readValue(dbDocument, TestCase.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return testCase1.getId();
    }

    @Override
    public TestCase findById(String id) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        TestCaseObjectDocument testCaseObjectDocument = new TestCaseObjectDocument();
        String dbDocument="";
        TestCase testCase1 = new TestCase();
        try {
            testCaseObjectDocument = repositoryService.findById(id);
            dbDocument = objectMapper.writeValueAsString(testCaseObjectDocument);
            testCase1 = objectMapper.readValue(dbDocument, TestCase.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return testCase1;
    }
}
