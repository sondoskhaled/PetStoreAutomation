package api.endpoints;
// here we will store all urls only

/**
 * base uri -> https://petstore.swagger.io/
 * create user [post] -> base + v2/user
 * get user [get] -> base + v2/user/{username}
 * update user [put] -> base + v2/user/{username}
 * delete user [delete] -> base + v2/user/{username}
 * */
public class Routes {

    public static String base_url = "https://petstore.swagger.io/v2";

    //USER MODULE
    public static String post_url = base_url+"/user";
    public static String get_url = base_url+"/user/{username}";
    public static String put_url = base_url+"/user/{username}";
    public static String delete_url = base_url+"/user/{username}";

    //STORE MODULE

    //PET MODULE


}
