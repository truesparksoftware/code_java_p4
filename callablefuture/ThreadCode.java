package callablefuture;

class Thread1 extends Thread{
  	int result=0;
	@Override
  	public void run() {
     int num1=30;
     int num2=30;	
  	 result=num1+num2;
  	}
	
}


// access_specifier return_type method_name(parameter list){




//}




public class ThreadCode {
public static void main(String[] args) {
	Thread1 t1=new Thread1();
	t1.start();
	Thread1 t2=new Thread1();
	t1.start();
	Thread1 t3=new Thread1();
	t1.start();
	Thread1 t4=new Thread1();
	t1.start();
	Thread1 t5=new Thread1();
	t1.start();
	
	
}
}
