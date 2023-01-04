package CRUDwithBDD;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;


public class Post_TC04_AddingSameProjectName {
@Test
public void sameProjectName() {
	/*creates json object*/
	JavaUtility jlib = new JavaUtility();
JSONObject jobj = new JSONObject();
jobj.put("createdBy", "Rooman");
jobj.put("projectName", "MRS"+jlib.getRandomNumber());
jobj.put("status", "created");
jobj.put("teamSize", 4);

 given()
.body(jobj)

.contentType(ContentType.JSON)
/* Action part */
.post("http://localhost:8084/addProject")

/* Validation */
/* Prints all the response in the console */
.then()

//System.out.println(response.getContentType());
//System.out.println(response.getTime());
//System.out.println(response.getTimeIn(TimeUnit.SECONDS));
//System.out.println(response.getSessionId());
//System.out.println(response.getBody());
//System.out.println(response.getHeaders());
//System.out.println(response.getStatusLine());
//
//System.out.println(response.jsonPath());
//System.out.println(response.xmlPath());
//System.out.println(response.htmlPath());
//System.out.println(response.asString());

.assertThat().contentType(ContentType.JSON)
.assertThat().statusCode(201)
.assertThat().statusLine("HTTP/1.1 201 ")
.log().all();
}
}
