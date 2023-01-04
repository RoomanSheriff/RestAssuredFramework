package CRUDwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Post_TC06_AddingStatusArray {
@Test
public void addStatusArray() {
	
	String[] stat = {"created","ongoing"};
	JavaUtility jlib = new JavaUtility();
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Rooman");
	jobj.put("projectName", "MRS02"+jlib.getRandomNumber());
	jobj.put("status", stat);
	jobj.put("teamSize", 10);
	
	given()
	.body(jobj)
	.contentType(ContentType.JSON)
	.post("http://localhost:8084/addProject")

	/* Validation */
	/* Prints all the response in the console */
	.then()
	.assertThat().statusCode(200)
	.assertThat().contentType(ContentType.JSON)
	.assertThat().statusLine("HTTP/1.1 201")
	.log().all();

	
	
}
}
