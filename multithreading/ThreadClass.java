package multithreading;

class R1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "  i value" + i);
		}

	}
}

public class ThreadClass {
	public static void main(String[] args) throws InterruptedException {
		R1 r1 = new R1();
		r1.setPriority(1);
		r1.start();
		R1 r2 = new R1();
		r2.setPriority(2);
		r2.start();
		
		R1 r3 = new R1();
		r3.setPriority(10);
		r3.start();
	

	}
}
