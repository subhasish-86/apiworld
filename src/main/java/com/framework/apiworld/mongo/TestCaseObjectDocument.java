package com.framework.apiworld.mongo;

import com.framework.apiworld.entity.OpenAPI;
import com.framework.apiworld.enums.StatusEnum;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "apiObjectDocument")
public class TestCaseObjectDocument {

    private OpenAPI openAPI;
    private StatusEnum status;



}
