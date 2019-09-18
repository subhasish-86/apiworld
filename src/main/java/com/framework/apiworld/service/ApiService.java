package com.framework.apiworld.service;

import com.framework.apiworld.beans.CreateApiRequest;
import com.framework.apiworld.dtos.OpenApiDTO;
import org.springframework.stereotype.Component;

@Component
public interface ApiService {
    OpenApiDTO createApi(CreateApiRequest createApiRequest);
}
