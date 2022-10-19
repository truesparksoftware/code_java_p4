package synehcronization;

class SyncStatic implements Runnable {

	@Override
	public void run() {
     runStaticSync();
	}

	public synchronized static void runStaticSync() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "   i value " + i);
		}
	}

}

public class StaticSynechronization {
public static void main(String[] args) {
	SyncStatic s1=new SyncStatic();
	SyncStatic s2=new SyncStatic();
	SyncStatic s3=new SyncStatic();
	Thread t1=new Thread(s1);
	Thread t2=new Thread(s2);
	Thread t3=new Thread(s3);
	t1.start();
	t2.start();
	t3.start();
}
}
