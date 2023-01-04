package RestAssuerd_CRUDoperations;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.BaseClassWithReqSpec;
import GenericLibraries.EndPointsLibrary;

public class PutMethodUsingBaseClass extends BaseClassWithReqSpec {
	@Test
	public void addProject() throws Throwable {
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Roo");
		jobj.put("projectName", "MRS"+jlib.getRandomNumber());
		jobj.put("status", "created");
		jobj.put("teamSize", 8);
		
		String proID = elib.readDataFromExcel("Sheet1", 0, 1);
		System.out.println(proID);
		
		given()
		.spec(requestSpec)
		.body(jobj)
		
		.pathParam("ID", proID)
		
		.when()
		.put(EndPointsLibrary.updateProject+"{ID}")
		
		.then()
		.assertThat().statusCode(200).log().all();
		
	}
}
