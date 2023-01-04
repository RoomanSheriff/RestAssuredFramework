package RestAssuerd_CRUDoperations;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import GenericLibraries.BaseClassWithReqSpec;
import GenericLibraries.EndPointsLibrary;
import io.restassured.http.ContentType;

public class GetSingleProjectUsingBaseClass extends BaseClassWithReqSpec {
	@Test
	public void getSingleProject() throws Throwable {
		
		String proID = elib.readDataFromExcel("Sheet1", 0, 1);
		System.out.println(proID);
		
		given()
		.spec(requestSpec)
		
		.pathParam("ID", proID)
		
		.when()
		.get(EndPointsLibrary.getSingleProject+"{ID}")
		
		.then().assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
		
	}
}
