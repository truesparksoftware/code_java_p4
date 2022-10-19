package multithreading;

class Bank {
	int id;
	String name;
	String Address;

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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Bank(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}

}

class BankOpe extends Thread {

	@Override
	public void run() {
		depositeMethod();
	}

	public void depositeMethod() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "  " + i);
		}
	}
}

public class SetPriorityDemo {

	public static void main(String[] args) {
		BankOpe bankope0 = new BankOpe();
		BankOpe bankope1 = new BankOpe();
		BankOpe bankope2 = new BankOpe();

		bankope0.setPriority(Thread.MIN_PRIORITY);
		bankope1.setPriority(Thread.MAX_PRIORITY);
		bankope2.setPriority(Thread.NORM_PRIORITY);

		bankope0.start();
		bankope1.start();
		bankope2.start();

	}

}
