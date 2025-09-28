package Test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TokenChainTest {

    @Test
    
    public void getTokenAndUseInAnotherApi() {
        // Base URI optional
        RestAssured.baseURI = "https://sso-stg.qyrus.com";

        // 1) Request token from auth endpoint
        Response authResp =
            given()
                .contentType("application/json")
                .body("grant_type=password&username=qyrusautomationuser31@outlook.com&password=Password@123&client_id=ui&scope=openid profile email") // adapt payload
            .when()
                .post("/realms/staging/protocol/openid-connect/token")
            .then()
                .statusCode(200)
                .extract().response();
        
        	
        // Extract token (adjust path if token JSON key differs)
        //String token = authResp.jsonPath().getString("access_token");
        // defensive check
       // if (token == null || token.isEmpty()) {
       //    throw new IllegalStateException("Token not found in auth response: " + authResp.asString());
       // }

        // 2) Use token in another API call
        //given()
         //   .header("Authorization", "Bearer " + token)
         //   .accept("application/json")
       // .when()
        //    .get("/protected/resource")
       // .then()
         //   .statusCode(200)
           // .body("data.id", notNullValue()); // example assertion
    //}
}