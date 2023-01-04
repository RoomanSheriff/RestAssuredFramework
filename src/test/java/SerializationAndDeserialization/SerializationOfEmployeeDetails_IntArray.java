package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeeDetails;
import PojoClassForSerializationAndDeserialization.EmployeeDetails_IntArray;

public class SerializationOfEmployeeDetails_IntArray {

	@Test
	public void serializationOfEmployees() throws Throwable, Throwable, Throwable {
		int[] phoneNo = {1234,3456};
		/*Creates the object of Pojo Class*/
		EmployeeDetails_IntArray empdet = new EmployeeDetails_IntArray("RoomanSheriff", "TY030", "mrs@gmail.com", phoneNo, "Mysore");
		/*Creates the object of Object Mapper*/
		ObjectMapper objmap = new ObjectMapper();
		/*Writes the value to json file*/
		objmap.writeValue(new File("./empdata.json"), empdet);
		
	}
}
