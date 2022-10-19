package multithreading;



class A extends Thread{
	String name=Thread.currentThread().getName();

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	
}
public class JoinMethodThread {

	public static void main(String[] args) {
		A t1=new A();
		t1.setName("thread 1");
		t1.start();

		A t2=new A();
		t2.setName("thread 2");
		t2.start();
		try {
			t2.join();
		}
		catch(InterruptedException i) {
			
		}
		A t3=new A();
		t3.setName("thread 3");
		t3.start();
		String name=Thread.currentThread().getName();
	
			for(int i=0;i<5;i++) {
				System.out.println(name);
			}
	}

}
