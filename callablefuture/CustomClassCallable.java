package callablefuture;

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
class Mobile{
	private int id;
	private String model;
	private double price;
}



class MobileCallable implements Callable<Mobile>{

	Mobile mobile=null;
	
	public MobileCallable(Mobile mobile) {
		super();
		this.mobile = mobile;
	}

	
	@Override
	public Mobile call() throws Exception {
		Mobile mb=mobile;
		  mb.setId(mobile.getId()*10);
		  mb.setPrice(mobile.getPrice()-500);
		return mb;
	}
}







public class CustomClassCallable {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService ece=Executors.newFixedThreadPool(5);
	
	Mobile m=new Mobile(20,"Samsung",30000);
	MobileCallable cal=new MobileCallable(m);
     Future<Mobile> f=ece.submit(cal);
        Mobile mm= f.get();
        
        System.out.println(mm);
	
}
}
