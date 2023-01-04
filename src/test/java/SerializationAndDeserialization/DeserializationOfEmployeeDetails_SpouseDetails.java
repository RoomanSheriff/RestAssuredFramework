package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeeDetails_StringArray;
import PojoClassForSerializationAndDeserialization.EmployeeSpouseDetails;

public class DeserializationOfEmployeeDetails_SpouseDetails {
	@Test
	public void employeedetails() throws Throwable, Throwable, Throwable {
		/*creates the object of pojo class*/
		ObjectMapper objmap = new ObjectMapper();
		/*Read the value from object mapper*/
		EmployeeSpouseDetails emp = objmap.readValue(new File("./empdata.json"), EmployeeSpouseDetails.class);
		/*fetches the required value from employee details*/
		System.out.println(emp.getSname());
		System.out.println(emp.getSemail());
		System.out.println(emp.getSphoneNo());
		System.out.println(emp.getSaddress());
	}
}
