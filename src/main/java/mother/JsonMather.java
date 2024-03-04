package mother;

import modelsjson.requestjson.JsonRequestModelPOST;

public class JsonMather {

    public static JsonRequestModelPOST createBodyForPost(){
        return JsonRequestModelPOST.builder()
                .body("Default body")
                .title("Default title")
                .build();
    }
}
