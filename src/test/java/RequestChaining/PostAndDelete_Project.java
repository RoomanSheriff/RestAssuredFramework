package RequestChaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import PojoLibrary.AddProjectPojoClass;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostAndDelete_Project {
	@Test
	
	public void postAndDeleteTest() {
	/*pre-requesites*/
	baseURI = "http://localhost";
	port = 8084;
		AddProjectPojoClass adj = new AddProjectPojoClass("Rooman", "MRS"+new JavaUtility().getRandomNumber(), "created", 5);
		Response response = 
				given()
				.body(adj)
				.contentType(ContentType.JSON)
				.when()
				.post("/addProject");
				String proId = response.jsonPath().get("projectId");
				System.out.println(proId);
				
				/*sending in another request*/
				given()
				.pathParam("projectId", proId)
				.when()
				.delete("projects/{projectId}")
				.then()
				.log()
				.all();
			
	}
}
