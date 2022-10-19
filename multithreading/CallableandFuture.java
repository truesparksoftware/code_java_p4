package multithreading;



import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Calculate implements Callable<Integer> {
	int num;

	public Calculate(int num) {
		super();
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			sum = sum + i;
		}
		System.out.println(Thread.currentThread().getName());
		return sum;
	}
}

public class CallableandFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		Calculate caluclate1 = new Calculate(12);
		Calculate caluclate2 = new Calculate(5);
		Calculate caluclate3 = new Calculate(8);
		Calculate caluclate4 = new Calculate(10);

		Future<Integer> future1 = service.submit(caluclate1);
		Future<Integer> future2 = service.submit(caluclate2);
		Future<Integer> future3 = service.submit(caluclate3);
		Future<Integer> future4 = service.submit(caluclate4);
		int result1 = future1.get();
		int result2 = future2.get();
		int result3 = future3.get();
		int result4 = future4.get();
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
