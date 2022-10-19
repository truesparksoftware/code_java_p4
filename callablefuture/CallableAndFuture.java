package callablefuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class StudentImpl implements Callable<Integer>{
	int number=0;
	
	public StudentImpl(int number) {
		super();
		this.number = number;
	}
	
	@Override
	public Integer call() throws Exception {
		int result=0;
		for(int i=1;i<=number;i++) {
			result=result+i;
		}
		return result;
	}

	
	
}


public class CallableAndFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// step 1 executor service framework with fixed thread count
		ExecutorService exe=Executors.newFixedThreadPool(5);
       
		// Callable create -> call logic 
		
		// callable object
		StudentImpl obj1=new StudentImpl(10);
		
		// executor  submit pass--> Future -->get
		Future<Integer> f1=exe.submit(obj1);
		Integer output=f1.get();
		
        StudentImpl obj2=new StudentImpl(20);
		
		// executor  submit pass--> Future -->get
		Future<Integer> f2=exe.submit(obj2);
		Integer output1=f2.get();
		
		
		System.out.println(output);   
		System.out.println(output1);
		 
		
		
	}
}
