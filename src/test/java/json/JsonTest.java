package json;

import clientjson.JsonClient;
import io.restassured.response.Response;
import jsondata.JsonDataFactory;
import modelsjson.requestjson.JsonRequestModelPOST;
import modelsjson.responsejson.JsonResponseModelPOST;
import org.junit.Test;

import static mother.JsonMather.createBodyForPost;
import static org.junit.Assert.assertEquals;

public class JsonTest {
    @Test
    public void postJsonDefaultTest(){
        JsonRequestModelPOST requestBody = new JsonDataFactory(createBodyForPost()).createRequest();
        Response postResponse = new JsonClient().postJson(requestBody);
        JsonResponseModelPOST jsonResponse = postResponse.body().as(JsonResponseModelPOST.class);

        assertEquals(201, postResponse.statusCode());
        assertEquals("Default title", jsonResponse.getTitle());
        assertEquals("Default body", jsonResponse.getBody());
        assertEquals(101, jsonResponse.getId());

    }

    @Test
    public void postJsonTest() {
        JsonRequestModelPOST requestBody = new JsonDataFactory(createBodyForPost())
                .setBody("Noviot svetski prvak Makedonija go osvoi svetskoto prvenstvo vo fudbal odrzano vo Madrid")
                .setTitle("Makedonija osvoi svetsko prvenstvo vo fudbal")
                .createRequest();
        Response postResponse = new JsonClient().postJson(requestBody);
        JsonResponseModelPOST jsonResponse = postResponse.body().as(JsonResponseModelPOST.class);

        assertEquals(201, postResponse.statusCode());
        assertEquals("Makedonija osvoi svetsko prvenstvo vo fudbal", jsonResponse.getTitle());
        assertEquals("Noviot svetski prvak Makedonija go osvoi svetskoto prvenstvo vo fudbal odrzano vo Madrid", jsonResponse.getBody());
        assertEquals(101, jsonResponse.getId());
    }

}
