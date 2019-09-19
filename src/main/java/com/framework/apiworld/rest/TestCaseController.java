package com.framework.apiworld.rest;

import com.framework.apiworld.beans.TestCaseRequest;
import com.framework.apiworld.entity.OpenAPI;
import com.framework.apiworld.entity.TestCase;
import com.framework.apiworld.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(value="/testcase")
public class TestCaseController {

    @Autowired
    private TestCaseService testCaseService;


    @PostMapping
    public ResponseEntity<String> createApi(@Valid @RequestBody TestCaseRequest testCaseRequest){
        return ResponseEntity.ok(testCaseService.createTestCase(testCaseRequest.getTestCase()));
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public TestCase getApiById(@PathVariable("id") String id) {
        return testCaseService.findById(id);

    }
}
