package com.framework.apiworld.dtos;

import com.framework.apiworld.entity.Operation;
import com.framework.apiworld.entity.responses.ApiResponses;

import java.util.ArrayList;
import java.util.List;

/**
 * Operation
 *
 * #operationObject"
 */

public class OperationDTO {
    private static String pathUri;
    private List<String> tags = null;
    private String operationId = null;
    private List<ParameterDTO> parameters = new ArrayList<>();
    private List<MediaTypeDTO> requestBody = new ArrayList<>();
    private List<MediaTypeDTO> responses = new ArrayList<>();
    private HttpMethodEnum httpMethodType = null;

    private OperationDTO()
    {

    }

    public static OperationDTO convert(Operation operation, String pathUri, HttpMethodEnum httpMethodType) {

        OperationDTO operationDTO = new OperationDTO();//EntityDTOBase.convertValue(operation, OperationDTO.class);

        operationDTO.pathUri = pathUri;
        operationDTO.httpMethodType = httpMethodType;

        if (operation.getRequestBody() != null) {
            for (String mediaType :
                    operation.getRequestBody().getContent().keySet()) {
                operationDTO.requestBody.add(MediaTypeDTO.covert(mediaType, operation.getRequestBody().getContent().get(mediaType)));
            }
        }

        if (operation.getResponses() != null) {
            for (String mediaType :
                    operation.getResponses().keySet()) {
                operationDTO.requestBody.add(MediaTypeDTO.covert(mediaType, operation.getResponses().get(mediaType).getContent().get("application/json")));
            }
        }

        return operationDTO;
    }

    public String getPathUri() {
        return pathUri;
    }

    public void setPathUri(String pathUri) {
        OperationDTO.pathUri = pathUri;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public List<ParameterDTO> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterDTO> parameters) {
        this.parameters = parameters;
    }

    public List<MediaTypeDTO> getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(List<MediaTypeDTO> requestBody) {
        this.requestBody = requestBody;
    }

    public List<MediaTypeDTO> getResponses() {
        return responses;
    }

    public void setResponses(List<MediaTypeDTO> responses) {
        this.responses = responses;
    }

    public HttpMethodEnum getHttpMethodType() {
        return httpMethodType;
    }

    public void setHttpMethodType(HttpMethodEnum httpMethodType) {
        this.httpMethodType = httpMethodType;
    }
}

