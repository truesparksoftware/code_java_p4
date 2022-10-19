package multithreading;

class Thread1 extends Thread{
	
	@Override
	public void run() {
		m1();
	}	
	
	
	public void m1() {
		System.out.println("in run method...");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+"  i value "+i);
		}
	}
	
}




public class ThreadLifeCycle {
	public static void main(String[] args) {
	Thread1 t1=new Thread1();
	t1.start();
	
	Thread1 t2=new Thread1();
	t2.start();
	
	Thread1 t3=new Thread1();
	t3.start();
	
	}
}
