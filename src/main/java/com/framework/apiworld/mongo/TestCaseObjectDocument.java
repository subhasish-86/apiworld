package com.framework.apiworld.mongo;

import com.framework.apiworld.entity.OpenAPI;
import com.framework.apiworld.enums.StatusEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "apiObjectDocument")
public class TestCaseObjectDocument {

    private OpenAPI openAPI;
    private StatusEnum statusEnum;
    @Id
    private String id;

    public OpenAPI getOpenAPI() {
        return openAPI;
    }

    public void setOpenAPI(OpenAPI openAPI) {
        this.openAPI = openAPI;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
