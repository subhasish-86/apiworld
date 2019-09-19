package com.framework.apiworld.mongo;

import com.framework.apiworld.entity.OpenAPI;

import java.util.List;
import java.util.UUID;

public interface ApiRepositoryService {
    OpenAPI createApi(OpenAPI openAPI);
    List<OpenAPI> getAllApis();
    OpenAPI findById(UUID id);
    void update(OpenAPI api);
    void deleteApiById(UUID id);
    void updatePartially(OpenAPI api, UUID id);
}
