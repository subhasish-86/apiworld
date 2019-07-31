package com.framework.apiworld;

import com.framework.apiworld.entity.OpenAPI;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "api", path = "api")
public interface ApiRepository extends MongoRepository<OpenAPI, String> {

}