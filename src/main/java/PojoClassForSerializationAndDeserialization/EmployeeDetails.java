package PojoClassForSerializationAndDeserialization;

public class EmployeeDetails {
/*Declaration part*/
	String Ename;
	String Eid;
	String Email;
	int PhoneNo;
	String Address;
	
	
	/*Default constructor*/
	public EmployeeDetails() {
		
	}
	
	/*Create Constructor for initialization*/
	public EmployeeDetails(String ename, String eid, String email, int phoneNo, String address) {
		this.Ename = ename;
		this.Eid = eid;
		this.Email = email;
		this.PhoneNo = phoneNo;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
}
