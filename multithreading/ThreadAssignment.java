package multithreading;

import java.util.Scanner;

class BankOp{
	private int id;
	private String name;
	private String location;
	
	/*
	 * BankOp(int id, String name, String location){ this.id=id; this.name = name;
	 * this.location = location; }
	 */
	
	public int getId() {
		System.out.println("id is : "+id);
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		System.out.println("name is : "+name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		System.out.println("location is : "+location);
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
}
class BankOperation implements Runnable{

	long amount = 4000;
	long camt;
	long damt;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void run() {
		
		creditMethod();
		depositMethod();
		updateProfile();
				
	}
	
	public void creditMethod() {
		
		System.out.println("Enter the amount ");
		camt = sc.nextLong();
		camt = camt + amount;
		System.out.println("Your amount is now : "+camt);
				
	}
	public void depositMethod() {
		System.out.println("Enter the amount to deposit");
		damt = sc.nextLong();
		damt = camt - damt;
		System.out.println(" Total Balance is : "+damt);
		
	}
	public void updateProfile() {
		BankOp bank = new BankOp();
		bank.setId(10);
		bank.getId();
		bank.setName("Sam");
		bank.getName();
		bank.setLocation("Pune");
		bank.getLocation();
		
	}
	
}

public class ThreadAssignment {
	public static void main(String args[]) {
		BankOperation bank2 = new BankOperation();
		Thread thread = new Thread(bank2); 
		thread.start();
	}

}
