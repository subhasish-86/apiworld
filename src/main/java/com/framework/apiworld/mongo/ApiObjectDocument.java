package com.framework.apiworld.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "apiObjectDocument")
public class ApiObjectDocument {

    private String pathUri;
    private List<String> tags;


}
