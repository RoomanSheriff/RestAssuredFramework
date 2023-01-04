  package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeeDetails_IntArray;
import PojoClassForSerializationAndDeserialization.EmployeeSpouseDetails;

public class SerializationOfEmployeeDetails_Spousedetails {
	@Test
	public void serializationOfEmployees() throws Throwable, Throwable, Throwable {
		int[] phoneNo = {1234,3456};
		/*Creates the object of Pojo Class*/
		EmployeeSpouseDetails empdet = new EmployeeSpouseDetails("Aliya", "aliya@gmail.com", 1234, "Mysore");
		/*Creates the object of Object Mapper*/
		ObjectMapper objmap = new ObjectMapper();
		/*Writes the value to json file*/
		objmap.writeValue(new File("./empdata.json"), empdet);
		
	}
}
