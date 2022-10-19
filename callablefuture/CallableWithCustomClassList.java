package callablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Car {
	private int id;
	private String company;
	private String model;
}

class CarCallable implements Callable<List<Car>> {

	List<Car> car = null;

	public CarCallable(List<Car> car) {
		this.car = car;
	}

	@Override
	public List<Car> call() throws Exception {		
		List<Car> carList=new ArrayList();
	     for(Car c:car) {
	    	 c.setCompany("I");
	    	 // c company change
	    	 carList.add(c);
	     }
		return carList;
	}

}

public class CallableWithCustomClassList {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ec = Executors.newFixedThreadPool(10);
		Car c1 = new Car(200, "Hundai", "Creta");
		Car c2 = new Car(200, "Hundai", "Creta");
		Car c3 = new Car(200, "Hundai", "Creta");
		Car c4 = new Car(200, "Hundai", "Creta");
		Car c5 = new Car(200, "Hundai", "Creta");
		List<Car> carList=new ArrayList();
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		carList.add(c4);
		carList.add(c5);
		CarCallable carCallble = new CarCallable(carList);
		Future<List<Car>> f = ec.submit(carCallble);
		List<Car> f1 = f.get();
		System.out.println(f1);
	}
}
