package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeeDetails_StringArray;

public class DeserializationOfEmployeeDetails_StringArray {
@Test
public void employeedetails() throws Throwable, Throwable, Throwable {
	/*creates the object of pojo class*/
	ObjectMapper objmap = new ObjectMapper();
	/*Read the value from object mapper*/
	EmployeeDetails_StringArray emp = objmap.readValue(new File("./empdata.json"), EmployeeDetails_StringArray.class);
	/*fetches the required value from employee details*/
	System.out.println(emp.getEname());
	System.out.println(emp.getEid());
	System.out.println(emp.getEmail());
	System.out.println(emp.getPhoneNo());
	System.out.println(emp.getAddress());
}
}
