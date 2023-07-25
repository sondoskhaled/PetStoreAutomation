package api.endpoints;
// here we will implement user CRUD

import api.payload.UserPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

public class UserEndPoints2 {

//     static ResourceBundle getURL(){
//
//            ResourceBundle routes = ResourceBundle.getBundle("routes");
//            return routes;
//    }
//    static String getBaseURL(){
//
//        String base_URL = getURL().getString("base_url");
//        return base_URL;
//    }



    public static Response createUser (UserPojo payload){
//        String post_url = getURL().getString("post_url");
        Response response =given()
                .spec(Base.requestSpecification)
                .body(payload)
        .when()
                .post(Base.getPostURL());

        return response;
    }

    public static Response getUser (String username){
//        String get_url = getURL().getString("get_url");
        Response response =given()
                .spec(Base.requestSpecification)
                .pathParam("username",username)
                .when()
                .get(Base.getGetURL());

        return response;
    }

    public static Response updateUser (UserPojo payload ,String username){
//        String put_url = getURL().getString("put_url");
        Response response =given()
                .spec(Base.requestSpecification)
                .body(payload)
                .pathParam("username" , username)
                .when()
                .put(Base.getPutURL());

        return response;
    }

    public static Response deleteUser (String username){
//        String delete_url = getURL().getString("delete_url");
        Response response =given()
                .spec(Base.requestSpecification)
                .pathParam("username" , username)
                .when()
                .delete(Base.getDeleteURL());

        return response;
    }

}
