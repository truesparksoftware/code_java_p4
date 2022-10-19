package inheritance;

class A{
	
	void m1(){
		System.out.println("m1 method from A class");
	}
}


class B extends A{
	void m2(){
		System.out.println("m2 method from B class");
		super.m1();
	}
	
}


class C extends B{
	
	void m3() {
		System.out.println("m3 method from c class");
		super.m2();
	}
}

class D extends C{
	
	void m4() {
		System.out.println("m4 method from class D");
		super.m3();
	
	}
}


public class InheritanceCode {
   public static void main(String[] args) {
	D d=new D();
	d.m4();
}
}
