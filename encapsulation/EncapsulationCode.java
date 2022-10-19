package encapsulation;

class Student {
	private int id;
	private String name;
	private String address;

	// Student(int id, String name, String address) {
	// this.id = id;
	// this.name = name;
	// this.address = address;
	// }

//	void setValues(int id, String name, String address) {
//		this.id = id;
//		this.name = name;
//		this.address = address;
//	}

	void display() {
		System.out.println("id of student  " + id);
		System.out.println("name of student   " + name);
		System.out.println("address of student  " + address);
	}

	
	// getter method
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getId() {
		return id;
	}

	
	//setter method
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	
}

class StudentDecode {

	void displayStudent() {
		Student s1 = new Student();
		String name1 = s1.getName();
		String address1 = s1.getAddress();
		int id1 = s1.getId();
		System.out.println(name1);
		System.out.println(address1);
		System.out.println(id1);
	}
}

public class EncapsulationCode {
	public static void main(String[] args) {
		Student s1 = new Student();
	///	s1.setValues(12, "Sandip", "Pune");
		s1.setId(20);
		s1.setName("Jeevan");
		s1.setAddress("Pune");
		
		
//		s1.display();
		String name1 = s1.getName();
		String address1 = s1.getAddress();
		int id1 = s1.getId();
		System.out.println("name of stduent  "+name1);
		System.out.println("address of student  "+address1);
		System.out.println("id of student  "+id1);
	}
}
