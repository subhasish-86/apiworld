package com.framework.apiworld.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "testCase")
public interface TestCaseRepository extends MongoRepository<TestCaseObjectDocument, String> {
}
