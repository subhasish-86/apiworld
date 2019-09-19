package com.framework.apiworld.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.framework.apiworld.beans.CreateApiRequest;
import com.framework.apiworld.dtos.OpenApiDTO;
import com.framework.apiworld.entity.OpenAPI;
import com.framework.apiworld.mongo.ApiRepositoryService;
import io.swagger.v3.parser.OpenAPIV3Parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private ApiRepositoryService apiRepositoryService ;

    public ApiServiceImpl() {}

    @Override
    public OpenApiDTO createApi(CreateApiRequest createApiRequest) {
        String schemaUri = createApiRequest.getSchemaUri();
        io.swagger.v3.oas.models.OpenAPI swaggerOpenAPI = new OpenAPIV3Parser().read(schemaUri);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        OpenAPI openAPI = objectMapper.convertValue(swaggerOpenAPI, OpenAPI.class);
        openAPI = apiRepositoryService.createApi(openAPI);

        return OpenApiDTO.convert(openAPI);


    }

    @Override
    public List<OpenAPI> getAllApis() {
        return null;
    }

    @Override
    public OpenAPI findById(UUID id) {
        return null;
    }

    @Override
    public void update(OpenAPI api) {

    }

    @Override
    public void deleteApiById(UUID id) {

    }

    @Override
    public void updatePartially(OpenAPI api, UUID id) {

    }
}

