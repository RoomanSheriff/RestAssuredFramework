package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeeDetails;
import PojoClassForSerializationAndDeserialization.EmployeeDetails_MultipleData;

public class SerializationOfEmployee_MultipledData {
	@Test
	public void serializationOfEmployees() throws Throwable, Throwable, Throwable {
		String[] email = {"mrs@gamil.com","rs123@gmail.com"};
		int[] phone = {1234,4567};
		/*Creates the object of Pojo Class*/
		EmployeeDetails_MultipleData empdet = new EmployeeDetails_MultipleData("RoomanSheriff", "TY030", email, phone, 12000 , "Bangalore");
		/*Creates the object of Object Mapper*/
		ObjectMapper objmap = new ObjectMapper();
		/*Writes the value to json file*/
		objmap.writeValue(new File("./empdata.json"), empdet);
		
	}
}
