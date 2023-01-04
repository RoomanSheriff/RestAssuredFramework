package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeeDetails;

public class DeserializationOfEmployeeDetails {
@Test
public void deserializationOfEmployee() throws Throwable, Throwable, Throwable {
	/*Creates the object of Pojo Class*/
	ObjectMapper objmap = new ObjectMapper();
	/*Read the value from object mapper*/
	EmployeeDetails emp = objmap.readValue(new File("./empdata.json"), EmployeeDetails.class);
	/*fetches the required value from employee details*/
	System.out.println(emp.getEname());
	System.out.println(emp.getEid());
	System.out.println(emp.getEmail());
	System.out.println(emp.getPhoneNo());
	System.out.println(emp.getAddress());
	
}
}
