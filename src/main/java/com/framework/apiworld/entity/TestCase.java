package com.framework.apiworld.entity;

import com.framework.apiworld.enums.StatusEnum;

public class TestCase {

    private OpenAPI openAPI;
    private StatusEnum statusEnum;
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
