package CRUDwithBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

public class Get_TC26_AddingPostBodyDataInGetMethod {
@Test
public void addBodyDataInGetMethod() {

	JavaUtility jlib = new JavaUtility();
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Rooman");
	jobj.put("projectName", "MRS"+jlib.getRandomNumber());
	jobj.put("status", "created");
	jobj.put("teamSize", 4);
	baseURI="http://localhost";
	port=8084;
	 given()
	.body(jobj);
	get("/projects")

		/* Validation */
		/* Prints all the response in the console */
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusLine("HTTP/1.1 200");
}
}
