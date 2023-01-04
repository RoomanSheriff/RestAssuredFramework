package RestAssuerd_CRUDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.BaseClassWithReqSpec;
import GenericLibraries.EndPointsLibrary;

import static io.restassured.RestAssured.*;

public class PostMethodUsingBaseClass extends BaseClassWithReqSpec {
@Test
public void addProject() {
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Rooman");
	jobj.put("projectName", "MRS"+jlib.getRandomNumber());
	jobj.put("status", "created");
	jobj.put("teamSize", 5);
	
	given()
	.spec(requestSpec)
	.body(jobj)
	
	.when()
	.post(EndPointsLibrary.createProject)
	
	.then()
	.assertThat().statusCode(201).log().all();
	
}
}
