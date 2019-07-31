package com.framework.apiworld.dtos;

import java.util.Objects;

/**
 * PathParameter
 */

public class PathParameterDTO extends ParameterDTO {
    private String in = "path";
    private Boolean required = true;

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }


}

