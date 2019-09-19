package com.framework.apiworld.rest;

import com.framework.apiworld.entity.OpenAPI;
import com.framework.apiworld.service.ApiService;
import com.framework.apiworld.beans.CreateApiRequest;
import com.framework.apiworld.dtos.OpenApiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping(value="/api")
public class ApiController {

    @Autowired
    private ApiService apiService;


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public OpenAPI getApiById(@PathVariable("id") UUID uuid) {
        return apiService.findById(uuid);

    }

    @PostMapping
    public ResponseEntity<OpenApiDTO> createApi(@Valid @RequestBody CreateApiRequest createApiRequest, UriComponentsBuilder ucBuilder){
        return ResponseEntity.ok(apiService.createApi(createApiRequest));
    }

    @GetMapping(value="/", headers="Accept=application/json")
    public List<OpenAPI> getAllApis() {
        return apiService.getAllApis();

    }
}