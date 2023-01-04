package Athentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Auth_2_o_GetMethod {
	@Test
	public void auth2o() {
		Response response = given()
		.formParam("client_id", "Aliya")
		.formParam("client_secret", "dccac25c3270c3ce7b317af7fb6b4966")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "https://aliya.com")
		.formParam("code", "authorization_code")
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
		
		System.out.println(response);
		String token = response.jsonPath().get("access_token");
		System.out.println(token);
		given()
		.auth().oauth2(token)
		.when()
		.get("http://coop.apps.symfonycasts.com/api/me")
		.then().log().all();
	}
}
