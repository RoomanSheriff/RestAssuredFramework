package CRUDwithBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

public class Post_TC09_PassingOnlyURL {
@Test
public void passURL() {
	JavaUtility jlib = new JavaUtility();
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Rooman");
	jobj.put("projectName", "MRS02"+jlib.getRandomNumber());
	jobj.put("status", "created");
	jobj.put("teamSize", 10);
	
	given()
	.body(jobj)
	.contentType(ContentType.JSON)
	.post("http://localhost:8084/")

	/* Validation */
	/* Prints all the response in the console */
	.then()
	.assertThat().statusCode(200)
	.assertThat().contentType(ContentType.JSON)
	.assertThat().statusLine("HTTP/1.1 201")
	.log().all();
}
}
