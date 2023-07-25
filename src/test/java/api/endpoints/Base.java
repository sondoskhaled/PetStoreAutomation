package api.endpoints;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

public class Base {

    static RequestSpecification requestSpecification =
            given()
                    .baseUri(Base.getBaseURL())
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .log().all();

    private static ResourceBundle getURL(){

        ResourceBundle routes = ResourceBundle.getBundle("routes");
        return routes;
    }
    public static String getBaseURL(){

        String base_url = getURL().getString("base_url");
        return base_url;
    }

    public static String getPostURL(){
        String post_url = getURL().getString("post_url");
        return post_url;
    }

    public static String getGetURL(){
        String get_url =  getURL().getString("get_url");
        return get_url;
    }

    public static String getPutURL(){
        String put_url =  getURL().getString("put_url");
        return put_url;
    }

    public static String getDeleteURL(){
        String delete_url =  getURL().getString("delete_url");
        return delete_url;
    }
}
