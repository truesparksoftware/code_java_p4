package multithreading;




class Second extends Thread{

	private String i;

	@Override
	public void run() {
		for(int i=0;i<5;i++);{
			
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}
	
}
class First implements Runnable{
	public void testCode() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.testCode();
	}
	
	
}

public class FirstMultiThread {

	public static void main(String[] args) {
		First first1=new First();
		First first2=new First();
		First first3=new First();
		First first4=new First();
		
		Thread thread1=new Thread(first1);
				thread1.start();
		Thread thread2=new Thread(first2);
				thread2.start();
		Thread thread3=new Thread(first3);
				thread3.start();
		Thread thread4=new Thread(first4);
				thread4.start();
				
				
				System.out.println("starting of second thread class");
				Second second1=new Second();
				second1.start();
				Second second2=new Second();
				second2.start();
				Second second3=new Second();
				second3.start();
				Second second4=new Second();
				second4.start();
				
				
		

	}

}
