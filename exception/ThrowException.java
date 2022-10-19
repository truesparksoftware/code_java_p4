package exception;

class EmployeeSalary{
	int id;
	String name;
	int salary;

	public EmployeeSalary(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void resultCal(int salary){
		 int result=0;
		if(salary>900000) {
			throw new ArithmeticException("Salary too high..");
		}
	}
	
 
}



public class ThrowException {
public static void main(String[] args) {
	EmployeeSalary emp=new EmployeeSalary(12,"Jeevan",1000000);
	emp.resultCal(1000000);
}
}
