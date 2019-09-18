package com.framework.apiworld.dtos;

import com.framework.apiworld.entity.parameters.Parameter;
import com.framework.apiworld.enums.StyleEnum;

public class ParameterDTO extends EntityDTOBase {
    private String name = null;
    private String in = null;
    private String description = null;
    private Boolean required = null;
    private Boolean allowEmptyValue = null;
    private StyleEnum style = null;

    protected ParameterDTO()
    {}

    public static ParameterDTO convert(Parameter parameter) {
        ParameterDTO parameterDTO = EntityDTOBase.convertValue(parameter, ParameterDTO.class);
        return parameterDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        if ("path".equals(in)) {
            this.required = true;
        }
        this.in = in;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean getAllowEmptyValue() {
        return allowEmptyValue;
    }

    public void setAllowEmptyValue(Boolean allowEmptyValue) {
        this.allowEmptyValue = allowEmptyValue;
    }

    public StyleEnum getStyle() {
        return style;
    }

    public void setStyle(StyleEnum style) {
        this.style = style;
    }

}

