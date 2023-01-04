package PojoClassForSerializationAndDeserialization;

public class EmployeeSpouseDetails {
	
	/*Declaration part*/
	String Sname;
	String Semail;
	int SphoneNo;
	String Saddress;
	
	/*Default constructor*/
	public EmployeeSpouseDetails() {
		
	}
	
	
	/*Create Constructor for initialization*/
	public EmployeeSpouseDetails(String sename, String semail, int sphoneNo, String saddress) {
		this.Sname = sename;
		this.Semail = semail;
		this.SphoneNo = sphoneNo;
		this.Saddress = saddress;
	}	
	
	/*Creating getter and setter method for accessing*/
	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getSemail() {
		return Semail;
	}

	public void setSemail(String semail) {
		Semail = semail;
	}

	public int getSphoneNo() {
		return SphoneNo;
	}

	public void setSphoneNo(int sphoneNo) {
		SphoneNo = sphoneNo;
	}

	public String getSaddress() {
		return Saddress;
	}

	public void setSaddress(String saddress) {
		Saddress = saddress;
	}
	
}
