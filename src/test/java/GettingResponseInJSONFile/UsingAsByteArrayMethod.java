package GettingResponseInJSONFile;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;

public class UsingAsByteArrayMethod {
@Test
public void getresponse() throws Throwable {
	String jsonString = "{\"username\":\"admin\","
			+ "\"password\":\"password123\"}";
	Response response = given()
	.contentType(ContentType.JSON)
	.baseUri("https://restful-booker.herokuapp.com/auth")
	.body(jsonString)
	.post();
	
	String respAsString = response.asString();
	byte[] respAsStringByte = respAsString.getBytes();
	
	File file = new File("./src/main/resources/targetFile.json");
	Files.write(respAsStringByte, file);
	

}
}
