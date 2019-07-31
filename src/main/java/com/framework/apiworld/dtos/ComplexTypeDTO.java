package com.framework.apiworld.dtos;

import com.framework.apiworld.entity.media.Schema;

import java.util.List;

public class ComplexTypeDTO extends BaseType {

    private List<ComplexTypeDTO> complexTypes = null;
    private List<SimpleTypesDTO> simpleTypes = null;
    private Boolean required = null;

    public static ComplexTypeDTO convert(String typeName, Schema schema) {
        ComplexTypeDTO complexTypeDTO = new ComplexTypeDTO();
        return complexTypeDTO;

    }

    public List<ComplexTypeDTO> getComplexTypes() {
        return complexTypes;
    }

    public void setComplexTypes(List<ComplexTypeDTO> complexTypes) {
        this.complexTypes = complexTypes;
    }

    public List<SimpleTypesDTO> getSimpleTypes() {
        return simpleTypes;
    }

    public void setSimpleTypes(List<SimpleTypesDTO> simpleTypes) {
        this.simpleTypes = simpleTypes;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
}
