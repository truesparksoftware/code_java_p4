package multithreading;


class B implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<3;i++){
		System.out.println("My child thread");}
		
	}
	
}

public class RunnableCode {

	public static void main(String[] args) {
	B r=new B();
	Thread t=new Thread(r);
	t.start();
	try {
		t.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(int i=0;i<3;i++){
		System.out.println("MAIN thread");}
		
	}

}
