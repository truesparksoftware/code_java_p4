package oopsfeature;

abstract class Employee{
	
	public abstract void displayEmployee();
	
	public void display1() {
		System.out.println("display1 method in Employee class");
	}
}


class EmployeeImpl extends Employee{

	@Override
	public void displayEmployee() {
	System.out.println("abstract method");
	}
	
}

public class AbstractClassCode {
public static void main(String[] args) {
	Employee employee=new EmployeeImpl();
	employee.display1();
	employee.displayEmployee();
}
}
