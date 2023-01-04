package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeeDetails_MultipleData;
import PojoClassForSerializationAndDeserialization.EmployeeDetails_StringArray;

public class DeserializationOfEmployeeDetails_MultipleData {
	@Test
	public void employeedetails() throws Throwable, Throwable, Throwable {
		/*creates the object of pojo class*/
		ObjectMapper objmap = new ObjectMapper();
		/*Read the value from object mapper*/
		EmployeeDetails_MultipleData emp = objmap.readValue(new File("./empdata.json"), EmployeeDetails_MultipleData.class);
		/*fetches the required value from employee details*/
		System.out.println(emp.getEname());
		System.out.println(emp.getEid());
		System.out.println(emp.getEmail());
		System.out.println(emp.getPhoneNo());
		System.out.println(emp.getAddress());
	}
}
