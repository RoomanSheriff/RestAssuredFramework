package CRUDwithBDD;


import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

public class Post_TC22_PostMethodWithoutBody {
	@Test
	public void passinghttps() {

		baseURI="http://localhost:";
		port=8084;
		given()
		
		.contentType(ContentType.HTML)
		.post("addProject")

		/* Validation */
		/* Prints all the response in the console */
		.then()
		.assertThat().statusCode(403)
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusLine("HTTP/1.1 403")
		.log().all();
	}
}
