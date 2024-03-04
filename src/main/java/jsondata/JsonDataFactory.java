package jsondata;

import modelsjson.requestjson.JsonRequestModelPOST;

public class JsonDataFactory {
    private JsonRequestModelPOST request;
   public JsonDataFactory(JsonRequestModelPOST requestJson){
        request = requestJson;
    }
    public JsonDataFactory setTitle( String value){
       request.setTitle(value);
       return this;
    }
    public JsonDataFactory setBody( String value){
       request.setBody(value);
       return this;
    }
    public JsonRequestModelPOST createRequest(){
        return request;
    }



}
