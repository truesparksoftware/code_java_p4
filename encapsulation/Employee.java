package encapsulation;

public class Employee {
	private int id;
	private String name;
	private String address;
	private String designation;
	private String dept;

	
	public Employee(int id, String name, String address, String designation, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.designation = designation;
		this.dept = dept;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
