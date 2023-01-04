package CRUDwithBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

public class Put_TC37_AddingDetailsToPutMethod {
	@Test
	public void updateProject() {
		/*creates json object*/
		JavaUtility jlib = new JavaUtility();
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Rooman");
	jobj.put("projectName", "MRS"+jlib.getRandomNumber());
	jobj.put("status", "created");
	jobj.put("teamSize", 4);

	baseURI="http://localhost";
	port=8084;
	 given()
	.body(jobj)

	.contentType(ContentType.TEXT)
	
	.put("/projects/TY_PROJ_002")
	.then()
//	.assertThat().statusCode(200)
//	.assertThat().contentType(ContentType.JSON)
//	.assertThat().statusLine("HTTP/1.1 200")
	.log().all();
}
}