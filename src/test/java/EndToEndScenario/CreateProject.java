package EndToEndScenario;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibraries.BaseClassWithReqSpec;
import GenericLibraries.EndPointsLibrary;
import PojoLibrary.AddProjectPojoClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateProject extends BaseClassWithReqSpec {
@Test
public void addProject() throws Throwable {
	AddProjectPojoClass plib = new AddProjectPojoClass("rooman", "MRS"+jlib.getRandomNumber(), "created", 5);
	
	Response response = given().spec(requestSpec)
	.body(plib)
	
	.when()
	.post(EndPointsLibrary.createProject);
	
	//Capture the response and retrieve projectID
	String expData = restlib.getJsonData(response, "projectId");
	System.out.println(expData);
	
	//Connect to database and verify the project
	String query = "select * from project;";
	String actdata = dlib.readDataFromDatabaseAndValidate(query, 1, expData);
	System.out.println(actdata);
	
	//Validate
	Assert.assertEquals(actdata,expData);
	
	response.then().log().all();
}
}
