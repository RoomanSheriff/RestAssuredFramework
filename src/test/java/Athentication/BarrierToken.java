package Athentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BarrierToken {
@Test
public void barrierToken() {
	JSONObject jobj = new JSONObject();
	jobj.put("name", "MRS123");
	
baseURI = "https://api.github.com";
given()
.body(jobj).contentType(ContentType.JSON)
.auth().oauth2("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")
.when().post("/user/repos")
.then().assertThat().statusCode(201).log().all();	
}
}
