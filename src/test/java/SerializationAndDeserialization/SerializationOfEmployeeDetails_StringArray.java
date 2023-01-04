package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeeDetails;
import PojoClassForSerializationAndDeserialization.EmployeeDetails_StringArray;

public class SerializationOfEmployeeDetails_StringArray {
	@Test
	public void serializationOfEmployees() throws Throwable, Throwable, Throwable {
		
		String[] email = {"mrs123@gmail.com","rs123@gmail.com"};
		/*Creates the object of Pojo Class*/
		EmployeeDetails_StringArray empdet = new EmployeeDetails_StringArray("RoomanSheriff", "TY030", email, 98868, "Mysore");
		/*Creates the object of Object Mapper*/
		ObjectMapper objmap = new ObjectMapper();
		/*Writes the value to json file*/
		objmap.writeValue(new File("./empdata.json"), empdet);
		
	}
}
