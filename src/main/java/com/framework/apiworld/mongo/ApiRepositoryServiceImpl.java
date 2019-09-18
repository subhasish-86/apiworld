package com.framework.apiworld.mongo;

import com.framework.apiworld.entity.OpenAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
