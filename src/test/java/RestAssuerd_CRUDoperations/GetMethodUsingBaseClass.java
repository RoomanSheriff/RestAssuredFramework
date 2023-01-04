package RestAssuerd_CRUDoperations;

import org.testng.annotations.Test;

import GenericLibraries.BaseClassWithReqSpec;
import GenericLibraries.EndPointsLibrary;
import static io.restassured.RestAssured.*;

public class GetMethodUsingBaseClass extends BaseClassWithReqSpec {
@Test
public void getProjects() {
	
	given()
	.spec(requestSpec)
	
	.when()
	.get(EndPointsLibrary.getAllProjects)
	
	.then().assertThat().statusCode(200).log().all();
	
}
}
