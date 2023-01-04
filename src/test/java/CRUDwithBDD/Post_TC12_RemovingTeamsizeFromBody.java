package CRUDwithBDD;


import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

public class Post_TC12_RemovingTeamsizeFromBody {
@Test
public void removeTimesize() {
	JavaUtility jlib = new JavaUtility();
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Rooman");
	jobj.put("projectName", "MRS02"+jlib.getRandomNumber());
	jobj.put("status", "created");
	baseURI="http://localhost:";
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
