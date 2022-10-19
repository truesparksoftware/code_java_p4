package multithreading;



import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableImpl implements Callable<Double> {
	int num;

	public CallableImpl(int num) {
		super();
		this.num = num;
	}

	@Override
	public Double call() throws Exception {
		double sum = 0;
		for (int i = 0; i < num; i++) {
			sum = sum + i;
		}
		return sum;
	}
}


class stud extends Thread{
	
	public void run(){
		
	}
}

public class CallabelFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		CallableImpl callableImpl = new CallableImpl(20);
		Future<Double> fut = service.submit(callableImpl);
		double variable1 = fut.get();
		System.out.println(variable1);
		
		CallableImpl callableImpl1 = new CallableImpl(10);
		Future<Double> fut1 = service.submit(callableImpl1);
		Double variable2 = fut1.get();
		System.out.println(variable2);
	}
}
