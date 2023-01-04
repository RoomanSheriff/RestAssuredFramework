package RestAssuerd_CRUDoperations;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import GenericLibraries.BaseClassWithReqSpec;
import GenericLibraries.EndPointsLibrary;

public class DeleteMethodUsingBaseClass extends  BaseClassWithReqSpec {
	@Test
	public void deleteProject() throws Throwable {

		String proID = elib.readDataFromExcel("Sheet1", 0, 1);
		System.out.println(proID);
		
		given()
		.spec(requestSpec)
		
		.pathParam("ID", proID)
		
		.when()
		.delete(EndPointsLibrary.deleteProject+"{ID}")
		
		.then().assertThat().statusCode(204).log().all();
		
	}
}
