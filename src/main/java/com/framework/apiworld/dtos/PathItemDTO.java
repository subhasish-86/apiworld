package com.framework.apiworld.dtos;

import com.framework.apiworld.entity.PathItem;
import com.framework.apiworld.entity.parameters.Parameter;
import com.framework.apiworld.enums.HttpMethodEnum;

import java.util.ArrayList;
import java.util.List;


public class PathItemDTO {

    private List<OperationDTO> operations = new ArrayList<>();
    private List<ParameterDTO> parameters= new ArrayList<>();

    private PathItemDTO()
    {

    }

    public static PathItemDTO convert(String pathUri, PathItem pathItem) {

        if (pathItem == null) return null;

        PathItemDTO pathItemDTO = new PathItemDTO();
        if (pathItem.getParameters() != null) {
            for (Parameter parameter :
                    pathItem.getParameters()) {
                pathItemDTO.parameters.add(ParameterDTO.convert(parameter));
            }
        }

        if (pathItem.getGet() != null)
            pathItemDTO.operations.add(OperationDTO.convert(pathItem.getGet(),pathUri, HttpMethodEnum.GET));
        if (pathItem.getPost() != null)
            pathItemDTO.operations.add(OperationDTO.convert(pathItem.getPost(),pathUri, HttpMethodEnum.POST));
        if (pathItem.getDelete() != null)
            pathItemDTO.operations.add(OperationDTO.convert(pathItem.getDelete(),pathUri, HttpMethodEnum.DELETE));
        if (pathItem.getPut() != null)
            pathItemDTO.operations.add(OperationDTO.convert(pathItem.getPut(),pathUri, HttpMethodEnum.PUT));
        if (pathItem.getPatch() != null)
            pathItemDTO.operations.add(OperationDTO.convert(pathItem.getPatch(),pathUri, HttpMethodEnum.PATCH));
        if (pathItem.getTrace() != null)
            pathItemDTO.operations.add(OperationDTO.convert(pathItem.getTrace(),pathUri, HttpMethodEnum.TRACE));
        if (pathItem.getHead() != null)
            pathItemDTO.operations.add(OperationDTO.convert(pathItem.getHead(),pathUri, HttpMethodEnum.HEAD));
        if (pathItem.getOptions() != null)
            pathItemDTO.operations.add(OperationDTO.convert(pathItem.getOptions(),pathUri, HttpMethodEnum.OPTIONS));

        return pathItemDTO;
    }

    public List<OperationDTO> getOperations()
    {
        return operations;
    }

    public void setOperations(List<OperationDTO> operations) {
        this.operations = operations;
    }

    public List<ParameterDTO> getParameters()
    {
        return parameters;
    }

    public void setParameters(List<ParameterDTO> parameters) {
        this.parameters = parameters;
    }

//    public OperationDTO getGet() {
//        return get;
//    }
//
//    public void setGet(OperationDTO get) {
//        this.get = get;
//    }
//
//    public OperationDTO getPut() {
//        return put;
//    }
//
////    public void setPut(OperationDTO put) {
////        this.put = put;
////    }
//
//    public OperationDTO getPost() {
//        return post;
//    }
//
////    public void setPost(OperationDTO post) {
////        this.post = post;
////    }
//
//    public OperationDTO getDelete() {
//        return delete;
//    }
//
////    public void setDelete(OperationDTO delete) {
////        this.delete = delete;
////    }
//
//    public OperationDTO getOptions() {
//        return options;
//    }
//
////    public void setOptions(OperationDTO options) {
////        this.options = options;
////    }
//
//    public OperationDTO getHead() {
//        return head;
//    }
//
////    public void setHead(OperationDTO head) {
////        this.head = head;
////    }
//
//    public OperationDTO getPatch() {
//        return patch;
//    }
//
////    public void setPatch(OperationDTO patch) {
////        this.patch = patch;
////    }
//
//    public OperationDTO getTrace() {
//        return trace;
//    }
//
////    public void setTrace(OperationDTO trace) {
////        this.trace = trace;
////    }


}

