package inheritance;

class P1{
	
	 static void m1() {
		System.out.println("m1 method from P1 class");
	}
	 
	 void m2(){
		 System.out.println("m2 method from P1");
	 }
	
	
}

class C1 extends P1{
	
	static void m1() {
		System.out.println("m1 method from C1 class");
	}
	 
	 void m3() {
		 System.out.println("m3 method from C1 class");
	 }
}




public class MethodHiding {
public static void main(String[] args) {
	
	P1 p2 =null;
	p2.m1();
	p2.m2();
	
	P1 p1=new C1();
	p1.m1();
	p1.m2();
	
}
}
