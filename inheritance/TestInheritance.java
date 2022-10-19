package inheritance;

// multi level 
class Parent {
	private int id;
	private String name;
	private String address;

	public Parent(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void displayParent() {
		System.out.println("class parent id " + id);
		System.out.println("class parent name " + name);
		System.out.println("class parent address " + address);
	}

}

class Child extends Parent {
	private String location;
	private String phone;

	Child(int id, String name, String address, String location, String phone) {
		super(id, name, address);
		this.location = location;
		this.phone = phone;
	}

	void displayChild() {
		super.displayParent();
		System.out.println("Child location " + location);
		System.out.println("Child phone " + phone);
	}

}

class Child1 extends Child{
 private String firstName;
	Child1(String firstName,int id, String name, String address, String location, String phone){
		super(id,name,address,location,phone);
		this.firstName=firstName;
	}
	
	void displayChild1() {
		super.displayChild();
		System.out.println("Child firstName " + firstName);
	}
}

public class TestInheritance {
	public static void main(String[] args) {
		Child1 child1 = new Child1("Jeevan",13, "Barguje", "Pune", "Vadgaon shri", "9090909090");
		// child1 class
		child1.displayChild1();
		//child class
		child1.displayParent();
		// parent class
		child1.displayChild();
		
	}
}
