package synehcronization;

import java.util.HashMap;

class FundTransfer implements Runnable {

	@Override
	public void run() {
		forloop1();
	}
	
	public synchronized void forloop() {
	
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " index value " + i + "in synchronized block");
		}
	}
	
	
	public void forloop1() {
		
		// non synchronized block
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " index value " + i );
		}
		
		
		// synchronized block
		synchronized (this) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " index value " + i + "in synchronized block");
			}
		}
		}
}

public class SyncImpl {
	public static void main(String[] args) {
		FundTransfer ft1 = new FundTransfer();
	    Thread t1=new Thread(ft1);
	    Thread t2=new Thread(ft1);
	    Thread t3=new Thread(ft1);
//		t1.start();
//		t2.start();
//		t3.start();	
		
		HashMap<String, String> mapData = new HashMap<String,String>();
		mapData.put(null,null);
		mapData.put("1","test");
		mapData.put(null,"abc");
		mapData.put("2","xyz");
		
		mapData.entrySet().stream().forEach(System.out::println);
		/*
		 * null=abc 1=test 2=xyz
		 */
		

	}
}
