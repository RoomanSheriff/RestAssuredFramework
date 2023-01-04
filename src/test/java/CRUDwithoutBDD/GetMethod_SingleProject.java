package CRUDwithoutBDD;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethod_SingleProject {
	@Test
	public void getProject() {
		Response response = RestAssured.get("http://localhost:8084/projects/TY_PROJ_1008");
		/* Prints all the response in the console */
		response.then().log().all();

		System.out.println(response.getContentType());
		System.out.println(response.getTime());
		System.out.println(response.getTimeIn(TimeUnit.SECONDS));
		System.out.println(response.getSessionId());
		System.out.println(response.getStatusLine());

		System.out.println(response.jsonPath());
		System.out.println(response.xmlPath());
		System.out.println(response.htmlPath());
		System.out.println(response.asString());
	}
}
