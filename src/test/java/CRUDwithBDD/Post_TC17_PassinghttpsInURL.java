package CRUDwithBDD;

import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

public class Post_TC17_PassinghttpsInURL {
@Test
public void passinghttps() {
	JavaUtility jlib = new JavaUtility();
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Rooman");
	jobj.put("projectName", "MRS02"+jlib.getRandomNumber());
	jobj.put("status", "created");
	jobj.put("teamSize", 10);
	baseURI="https://localhost:";
	port=8084;
	given()
	.body(jobj)
	.contentType(ContentType.HTML)
	.post("/addProject")

	/* Validation */
	/* Prints all the response in the console */
	.then()
	.assertThat().statusCode(200)
	.assertThat().contentType(ContentType.JSON)
	.assertThat().statusLine("HTTP/1.1 201")
	.log().all();
}
}
