package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeeDetails;

public class SerializationOfEmployeeDetails {

	
	@Test
	public void serializationOfEmployees() throws Throwable, Throwable, Throwable {
		/*Creates the object of Pojo Class*/
		EmployeeDetails empdet = new EmployeeDetails("RoomanSheriff", "TY030", "mrs@gmail.com", 98868, "Mysore");
		/*Creates the object of Object Mapper*/
		ObjectMapper objmap = new ObjectMapper();
		/*Writes the value to json file*/
		objmap.writeValue(new File("./empdata.json"), empdet);
		
	}
}
