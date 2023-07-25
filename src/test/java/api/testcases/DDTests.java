package api.testcases;

import api.endpoints.UserEndPoints;
import api.payload.UserPojo;
import api.utilities.DataProviders;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DDTests {
    @Test (priority = 1, dataProvider = "UsersData", dataProviderClass = DataProviders.class)
    public void testCreateUser( String UserID , String UserName
                ,String FirstName , String LastName , String Email , String Password
                , String Phone){
        UserPojo payload = new UserPojo();
        payload.setId(Integer.parseInt(UserID));
        payload.setUsername(UserName);
        payload.setFirstName(FirstName);
        payload.setLastName(LastName);
        payload.setEmail(Email);
        payload.setPassword(Password);
        payload.setPhone(Phone);

        Response response = UserEndPoints.createUser(payload);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),
                200 , "Status code is wrong");
    }

    @Test (priority = 2, dataProvider = "UserNames", dataProviderClass = DataProviders.class)
    public void testDeleteUserByName( String UserName){
        UserPojo payload = new UserPojo();
        payload.setUsername(UserName);

        Response response = UserEndPoints.deleteUser(UserName);

        Assert.assertEquals(response.getStatusCode(),
                200 , "Status code is wrong");
    }
}
