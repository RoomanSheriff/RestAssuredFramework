package GenericLibraries;

import io.restassured.response.Response;

public class RestAssuredLibrary {
/**
 * 
 * @param response
 * @param path
 * @return
 */
	public String getJsonData(Response response, String path) {
		
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}
}
