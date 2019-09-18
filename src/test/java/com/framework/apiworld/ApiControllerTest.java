
package com.framework.apiworld;

import com.framework.apiworld.beans.CreateApiRequest;
import com.framework.apiworld.service.ApiServiceImpl;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ApiControllerTest {


    @Test
    public void ApiServiceImplTest() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        CreateApiRequest createApiRequest = new CreateApiRequest();
        createApiRequest.setSchemaUri("https://raw.githubusercontent.com/swagger-api/swagger-parser/master/modules/swagger-parser-v3/src/test/resources/allOf-example/allOf.yaml");
        //apiService.createApi(creatApiRequest);
    }
}


