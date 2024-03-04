package clientjson;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import modelsjson.requestjson.JsonRequestModelPOST;
import util.Configuration;

public class JsonClient {
    public Response postJson(JsonRequestModelPOST request){
       return RestAssured.given()
               .contentType(ContentType.JSON)
               .when().log().all()
               .body(request)
               .post(Configuration.BASE_URL)
               .thenReturn();
    }

}
