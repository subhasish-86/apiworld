package com.framework.apiworld.mongo;

import com.framework.apiworld.entity.TestCase;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "reportDocument")
public class ReportDocument {

    private List<TestCase> testCases;
}
