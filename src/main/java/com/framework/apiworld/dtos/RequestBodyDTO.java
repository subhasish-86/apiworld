package com.framework.apiworld.dtos;

import com.framework.apiworld.entity.parameters.RequestBody;

public class RequestBodyDTO {
    private ComplexTypeDTO complexType = null;
    private Boolean required = null;

    public static RequestBodyDTO convert(RequestBody requestBody) {
        RequestBodyDTO requestBodyDTO = new RequestBodyDTO();
        requestBodyDTO.required=requestBody.getRequired();


        return requestBodyDTO;
    }


    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public ComplexTypeDTO getComplexType() {
        return complexType;
    }

    public void setComplexType(ComplexTypeDTO complexType) {
        this.complexType = complexType;
    }
}

