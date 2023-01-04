 package RequestChaining;

import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import PojoLibrary.AddProjectPojoClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostAndGet_Project {
@Test
public void requestChaining() {
	baseURI ="http://localhost";
	port =8084;
	AddProjectPojoClass adj = new AddProjectPojoClass("Rooman", "MRS" + new JavaUtility().getRandomNumber(), "created", 5);
	Response response = given()
			.body(adj)
			.contentType(ContentType.JSON)
			.when()
			.post("/addProject");
	System.out.println(response);
			String proId = response.jsonPath().get("projectId");
			
			
			
			System.out.println(proId);
	given()
	.pathParam("projectId", proId)
	.when()
	.get("/projects/{projectId}")
	.then()
	.assertThat()
	.log().all();
				
}	
}

