package synehcronization;

class BikeClass implements Runnable {

	@Override
	public void run() {
		testloop1();
	}

	synchronized void testloop() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "  thread" + i);
		}
	}

	void testloop1() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "  thread" + i);
		}
	
		
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "  thread" + i +"synchronized for loop");
			}
		}
	}
}

public class SynechronizedCode {
	public static void main(String[] args) {
		BikeClass bike1 = new BikeClass();
		Thread t1 = new Thread(bike1);
		Thread t2 = new Thread(bike1);
		Thread t3 = new Thread(bike1);
		t1.start();
		t2.start();
		t3.start();

	}
}
