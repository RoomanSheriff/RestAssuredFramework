package CRUDwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;


public class Post_TC01_CreatingNewProject {
@Test
public void addProject() {
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

//System.out.println(getContentType());
//System.out.println(getTime());
//System.out.println(getTimeIn(TimeUnit.SECONDS))
//System.out.println(getSessionId());
//System.out.println(getBody());
//System.out.println(getHeaders());
//System.out.println(getStatusLine());
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
