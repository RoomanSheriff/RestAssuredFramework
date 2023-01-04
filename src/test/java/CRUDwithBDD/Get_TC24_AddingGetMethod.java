package CRUDwithBDD;


import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

public class Get_TC24_AddingGetMethod {
	@Test
	public void addGetMEthod() {

		baseURI="http://localhost";
		port=8084;
		get("/projects")

		/* Validation */
		/* Prints all the response in the console */
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusLine("HTTP/1.1 200")
		.log().all();
	}
}
