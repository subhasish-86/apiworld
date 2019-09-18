package com.framework.apiworld.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.framework.apiworld.mongo.ApiRepositoryService;
import com.framework.apiworld.beans.CreateApiRequest;
import com.framework.apiworld.dtos.OpenApiDTO;
import com.framework.apiworld.entity.OpenAPI;
import io.swagger.v3.parser.OpenAPIV3Parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
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

//    @Override
//    public List<com.framework.apiworld.entity.OpenAPI> getApi() {
//        return null;
//    }
//
//    @Override
//    public com.framework.apiworld.entity.OpenAPI findById(UUID id) {
//        return null;
//    }
//
//    @Override
//    public void update(com.framework.apiworld.entity.OpenAPI api) {
//
//    }
//
//    @Override
//    public void deleteApiById(int id) {
//
//    }
//
//    @Override
//    public void updatePartially(com.framework.apiworld.entity.OpenAPI api, UUID id) {
//
//    }
}

