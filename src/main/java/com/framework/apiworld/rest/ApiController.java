package com.framework.apiworld.rest;

import com.framework.apiworld.service.ApiService;
import com.framework.apiworld.beans.CreateApiRequest;
import com.framework.apiworld.dtos.OpenApiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;


@RestController
@RequestMapping(value={"/api"})
public class ApiController {

    @Autowired
    private ApiService apiService;


    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getApiById() {
                return new ResponseEntity<>("Hello World", HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<OpenApiDTO> createApi(@Valid @RequestBody CreateApiRequest createApiRequest, UriComponentsBuilder ucBuilder){
        return ResponseEntity.ok(apiService.createApi(createApiRequest));
    }

//    @GetMapping(value="/", headers="Accept=application/json")
//    public List<OpenAPI> getAllApis() {
//        List<OpenAPI> tasks=apiService.getAllApis();
//        return tasks;
//
//    }
}