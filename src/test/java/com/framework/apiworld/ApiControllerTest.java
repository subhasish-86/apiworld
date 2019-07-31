
package com.framework.apiworld;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ApiControllerTest {


    @Test
    public void ApiServiceImplTest() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        CreatApiRequest creatApiRequest = new CreatApiRequest();
        creatApiRequest.setSchemaUri("https://raw.githubusercontent.com/swagger-api/swagger-parser/master/modules/swagger-parser-v3/src/test/resources/allOf-example/allOf.yaml");
        apiService.createApi(creatApiRequest);
    }
}


