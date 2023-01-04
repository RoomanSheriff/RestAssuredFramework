package GenericLibraries;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClassWithReqSpec {
	
public JavaUtility jlib = new JavaUtility();
public DatabaseUtility dlib = new DatabaseUtility();
public ExcelUtility elib = new ExcelUtility();
public RestAssuredLibrary restlib = new RestAssuredLibrary();

public RequestSpecification requestSpec; 
public ResponseSpecification responseSpec;

@BeforeSuite
public void bsCongif() throws Throwable {
	dlib.connectToDB();
	RequestSpecBuilder builder = new RequestSpecBuilder();
	builder.setBaseUri("http://localhost");
	builder.setPort(8084);
	builder.setContentType(ContentType.JSON);
	requestSpec=builder.build();
}
@AfterSuite
public void asConfig() throws Throwable {
	dlib.closeDB();
	ResponseSpecBuilder builder = new ResponseSpecBuilder();
	responseSpec = builder.expectContentType(ContentType.JSON).build();
}
}
