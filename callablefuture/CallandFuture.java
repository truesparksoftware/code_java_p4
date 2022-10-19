package callablefuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallCode implements Callable<Integer> {

	int number = 0;

	public CallCode(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		int result = 0;
		for (int i = 1; i <= number; i++) {

			result = result + i;
		}
		return result;
	}
}

public class CallandFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exc = Executors.newFixedThreadPool(5);

		CallCode obj1 = new CallCode(30);
		Future<Integer> f1 = exc.submit(obj1);
		int res = f1.get();

		CallCode obj2 = new CallCode(50);
		Future<Integer> f2 = exc.submit(obj2);
		int res1 = f2.get();
		System.out.println(res);
		System.out.println(res1);
	}
}
