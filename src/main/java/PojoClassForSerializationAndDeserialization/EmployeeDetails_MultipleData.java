package PojoClassForSerializationAndDeserialization;

public class EmployeeDetails_MultipleData {
	/*Declaration part*/
	String Ename;
	String Eid;
	String[] Email;
	int[] PhoneNo;
	String Address;
	double salary;
	Object EmployeeSpouseDetails;
	
	/*Default constructor*/
	public EmployeeDetails_MultipleData() {
		
	}
	
	/*Create Constructor for initialization*/
	public EmployeeDetails_MultipleData(String ename, String eid, String[] email, int[] phoneNo, double sal, String address) {
		this.Ename = ename;
		this.Eid = eid;
		this.Email = email;
		this.PhoneNo = phoneNo;
		this.salary=sal;
		this.Address = address;
	}
	
	/*Creating getter and setter method for accessing*/
	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public String getEid() {
		return Eid;
	}

	public void setEid(String eid) {
		Eid = eid;
	}

	public String[] getEmail() {
		return Email;
	}

	public void setEmail(String[] email) {
		Email = email;
	}

	public int[] getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(int[] phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Object getEmployeeSpouseDetails() {
		return EmployeeSpouseDetails;
	}

	public void setEmployeeSpouseDetails(Object employeeSpouseDetails) {
		EmployeeSpouseDetails = employeeSpouseDetails;
	}

}
