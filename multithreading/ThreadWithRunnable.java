package multithreading;

class ABC {
	synchronized void printMessage() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "  priority " + Thread.currentThread().getPriority());
			System.out.println("i value.." + i);
	}

}
}

class ThreadTwo extends ABC implements Runnable {

	int number;

	ThreadTwo(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		super.printMessage();
		
		}
	}

public class ThreadWithRunnable {
	public static void main(String[] args) {
		
		  ThreadTwo t1=new ThreadTwo(5); 
		  
		  Thread st1=new Thread(t1);
		  st1.start();
		  Thread st2=new Thread(t1);
		  st2.start();
		  Thread st3=new Thread(t1);
		  st3.start();

	}
}
