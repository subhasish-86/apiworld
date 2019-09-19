package com.framework.apiworld.mongo;

import com.framework.apiworld.entity.OpenAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ApiRepositoryServiceImpl implements ApiRepositoryService {

    @Autowired
    private ApiRepository apiRepository;

    public ApiRepositoryServiceImpl() {
    }

    @Override
    public OpenAPI createApi(OpenAPI openAPI) {
        apiRepository.save(openAPI);
        return openAPI;
    }

    @Override
    public List<OpenAPI> getAllApis() {
        return apiRepository.findAll();
    }

    @Override
    public OpenAPI findById(UUID id) {
        return apiRepository.findById(id.toString()).orElseThrow(() -> new RuntimeException("No api found for given id"));
    }

    @Override
    public void update(OpenAPI api) {

    }

    @Override
    public void deleteApiById(UUID id) {
        apiRepository.deleteById(id.toString());
    }

    @Override
    public void updatePartially(OpenAPI api, UUID id) {

    }
}
