package multithreading;




class Operation2 extends Thread {
	int acno;
	String name;
	long balance, amount, total,deposite_amount,withdraw_amount;

	public void update_profile(String name, int acno, long balance,long withdraw_amount, long deposite_amount) {
		this.acno = acno;
		this.name = name;
		this.balance = balance;
		this.deposite_amount=deposite_amount;
		this.withdraw_amount=withdraw_amount;

	}

	public void showprofile() {

		System.out.println("Name:: " + name);
		System.out.println("Ac no:: " + acno);
		System.out.println("Balance:: " + balance);
	}

	public void deposite(long amount) {
		this.amount = amount;
		total = amount + balance;
		System.out.println("Deposite amount:: " + amount);
		System.out.println(Thread.currentThread().getName()+ "   Total Balance after deposite:: " + total);
	}

	public void withdraw(long amount) {

		this.amount = amount;
		System.out.println("Withdraw amount: " + amount);
		if (total > amount) {
			total = total-amount;
			System.out.println(Thread.currentThread().getName()+ "   Total balance after withdraw: " + total);
		} else {
			System.out.println(Thread.currentThread().getName()+ "  Insufficient balance");
		}

	}
	
	@Override
	public void run() {
		deposite(withdraw_amount);
		withdraw(deposite_amount);
		
	}

}

public class Thread_Bank2 {
	public static void main(String[] args) {
		Operation2 operation = new Operation2();
		Operation2 operation2 = new Operation2();
		Operation2 operation3 = new Operation2();
		Operation2 operation4 = new Operation2();
		
		operation.update_profile("Rocky", 11111, 1000000,3000,5000);
		operation.showprofile();
		operation2.update_profile("Jerry", 22222, 200000,3000,5000);
		operation2.showprofile();		
		operation3.update_profile("John", 33333, 500000,3000,5000);
		operation3.showprofile();
		operation4.update_profile("Tom", 44444, 460000,3000,5000);
		operation4.showprofile();
		
	
		operation.start();
		operation2.start();
		operation3.start();
		operation4.start();
	}
}
