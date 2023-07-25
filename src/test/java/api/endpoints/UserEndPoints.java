package api.endpoints;
// here we will implement user CRUD

import api.payload.UserPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserEndPoints {

    public static Response createUser (UserPojo payload){
        Response response =given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
        .when()
                .post(Routes.post_url);

        return response;
    }

    public static Response getUser (String username){
        Response response =given()
                .pathParam("username",username)
                .when()
                .get(Routes.get_url);

        return response;
    }

    public static Response updateUser (UserPojo payload ,String username){
        Response response =given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .pathParam("username" , username)
                .when()
                .put(Routes.put_url);

        return response;
    }

    public static Response deleteUser (String username){
        Response response =given()
                .pathParam("username" , username)
                .when()
                .delete(Routes.delete_url);

        return response;
    }

}
