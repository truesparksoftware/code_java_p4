package callablefuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}



class EmployeeCallable implements Callable<Employee>{

    Employee emp=null;
    
	public EmployeeCallable(Employee emp) {
		super();
		this.emp = emp;
	}


	@Override
	public Employee call() throws Exception {
	   Employee e2=emp;
	   e2.setSalary(emp.getSalary()*2);
		return e2;
	}
}


public class CustomClassWithCallable {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	
	ExecutorService ex=Executors.newFixedThreadPool(10);
	ExecutorService ex1=Executors.newCachedThreadPool();
	
	Employee e1=new Employee(20,"Santosh",40000);
	EmployeeCallable empCal=new EmployeeCallable(e1);	
	Future<Employee> f1=ex.submit(empCal);
	Employee ee= f1.get();
    System.out.println(ee);	
    
    ex.shutdown();
    ex1.shutdown();
}
}
