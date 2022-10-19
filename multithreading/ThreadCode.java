package multithreading;



class Thread123 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(" i ==>" + i + "  " + Thread.currentThread().getName());
		}
	}
}




class Thread2 extends Thread{
	int num;

	public Thread2(int num) {
		super();
		this.num = num;
	}

	public void run(){
		int sum=0;
		for(int i=0;i<num;i++) {
			sum=sum+i;
		}
	}
}

public class ThreadCode {
	public static void main(String[] args) {
		Thread123 Thread123 = new Thread123();
		Thread123.start();
		Thread123 thread2 = new Thread123();
		thread2.start();
		Thread123 thread3 = new Thread123();
		thread3.start();
	}
}
