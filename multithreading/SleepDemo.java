package multithreading;


//sleep and interrupt demo
class Dog implements Runnable{

	@Override
	public void run() {try {for(int i=0;i<3;i++){
		System.out.println("My child thread");
		Thread.sleep(1000);}
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	
}

public class SleepDemo {

	public static void main(String[] args) {
	Dog r=new Dog();
	Thread t=new Thread(r);
	t.start();
	t.interrupt();
	}

}
