package multithreading;

class T2 implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"  i value"+i);
		}
	}

}


class T1 extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"  i value"+i);
		}
	}
}




public class ThreadExceution {
public static void main(String[] args) {
	T1 t1=new T1();
	t1.start();
	
	T1 t2=new T1();
	t2.start();
	
	T1 t3=new T1();
	t3.start();
	
	
	
	T2 tt2=new T2();
	
	Thread threa1=new Thread(tt2);
	threa1.start();
	
	Thread threa2=new Thread(tt2);
	threa2.start();
	
	Thread threa3=new Thread(tt2);
	threa3.start();
	
	
}
}
