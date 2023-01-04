package GettingResponseInJSONFile;

import static io.restassured.RestAssured.*;

import java.io.File;

import com.google.common.io.Files;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UsingToStringMethod {
	public static void main(String[] args) throws Throwable {
		String jsonString = "{\"username\":\"admin\","
				+ "\"password\":\"password123\"}";
		Response response = given()
		.contentType(ContentType.JSON)
		.baseUri("https://restful-booker.herokuapp.com/auth")
		.body(jsonString)
		.post();
		
		byte[] respByteArray = response.asByteArray();
		File file = new File("./src/main/resources/ByteArray.json");
		Files.write(respByteArray, file);
}
}