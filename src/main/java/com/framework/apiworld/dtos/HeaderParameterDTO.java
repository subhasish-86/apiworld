package com.framework.apiworld.dtos;

import java.util.Objects;

/**
 * HeaderParameter
 */

public class HeaderParameterDTO extends ParameterDTO {
    private String in = "header";
    public String getIn() {
        return in;
    }
}

