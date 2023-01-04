package GettingResponseInJSONFile;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.testng.reporters.jq.Main;

import com.google.common.io.Files;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UsingInputStream {
public static void main(String[] args) throws Throwable {
	String jsonString = "{\"username\":\"admin\","
			+ "\"password\":\"password123\"}";
	Response response = given()
	.contentType(ContentType.JSON)
	.baseUri("https://restful-booker.herokuapp.com/auth")
	.body(jsonString)
	.post();
	
	InputStream respAsInputStream = response.asInputStream();
	
	byte[] respAsInputStreamByte = new byte[respAsInputStream.available()];
	
	respAsInputStream.read(respAsInputStreamByte);
	
	File file = new File("./src/main/resources/InputStream.json");
	
	Files.write(respAsInputStreamByte, file);
}
}
