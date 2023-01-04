package CRUDwithoutBDD;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.protobuf.Duration;

import GenericLibraries.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostMethod_AddProject {
	@Test
	public void addProjectUsingPost() {
		/* creates json object */
		JavaUtility jlib = new JavaUtility();
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Rooman12");
		jobj.put("projectName", "MRS" + jlib.getRandomNumber());
		jobj.put("status", "created");
		jobj.put("teamSize", 6);

		/* Pre-request for the script */
		RequestSpecification reqobj = RestAssured.given();
		reqobj.body(jobj);
		//reqobj.sessionId(null)
		reqobj.contentType(ContentType.JSON);
		/* Action part */
		Response response = reqobj.post("http://localhost:8084/addProject");

		/* Validation */
		/* Prints all the response in the console */
		response.then().log().all();

		System.out.println(response.getContentType());
		System.out.println(response.getTime());
		System.out.println(response.getTimeIn(TimeUnit.SECONDS));
		System.out.println(response.getSessionId());
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusLine());
		System.out.println(response.getCookies());
		System.out.println(response.jsonPath());
		System.out.println(response.xmlPath());
		System.out.println(response.htmlPath());
		System.out.println(response.asString());

		ValidatableResponse valid = response.then().assertThat().contentType(ContentType.JSON);
		response.then().assertThat().statusCode(201);
		response.then().assertThat().statusLine("HTTP/1.1 201 ");

	}
}
