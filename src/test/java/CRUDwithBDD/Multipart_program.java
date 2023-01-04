package CRUDwithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Multipart_program {
@Test
public void multipart() {
	File fil = new File("./src/main/resources/Untitled.png");
	given()
	
	.multiPart("file", fil, "mutlipart/form-data")
	.post("https://the-internet.herokuapp.com/upload")
	.thenReturn().then().log().all();
}
}
