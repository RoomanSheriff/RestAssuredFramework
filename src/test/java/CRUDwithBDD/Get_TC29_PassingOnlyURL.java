package CRUDwithBDD;


import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Get_TC29_PassingOnlyURL {
	@Test
	public void passURL() {

		baseURI="http://localhost";
		port=8084;
		get("")

		/* Validation */
		/* Prints all the response in the console */
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusLine("HTTP/1.1 200")
		.log().all();
	}
}
