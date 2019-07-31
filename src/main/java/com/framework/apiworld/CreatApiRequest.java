package com.framework.apiworld;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;

public class CreatApiRequest {

    @NotEmpty(message = "schema URL cannot be empty")
    @JsonProperty("schema_location")
    private String schemaUri;


    public String getSchemaUri() {
        return schemaUri;
    }

    public void setSchemaUri(String schemaUri) {
        this.schemaUri = schemaUri;
    }
}
