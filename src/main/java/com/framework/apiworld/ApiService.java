package com.framework.apiworld;

import com.framework.apiworld.dtos.OpenApiDTO;
import org.springframework.stereotype.Component;

@Component
public interface ApiService {
    OpenApiDTO createApi(CreatApiRequest creatApiRequest);
}
