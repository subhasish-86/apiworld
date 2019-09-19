package com.framework.apiworld.service;

import com.framework.apiworld.beans.CreateApiRequest;
import com.framework.apiworld.dtos.OpenApiDTO;
import com.framework.apiworld.entity.OpenAPI;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public interface ApiService {
    OpenApiDTO createApi(CreateApiRequest createApiRequest);
    List<OpenAPI> getAllApis();
    OpenAPI findById(UUID id);
    void update(OpenAPI api);
    void deleteApiById(UUID id);
    void updatePartially(OpenAPI api, UUID id);
}
