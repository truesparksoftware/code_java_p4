package java8features;

class Parent{
	int number=20;
	String name="";

	
	
	public static void m1() {
		System.out.println("parent method");
	}
	

	public void m2() {
		System.out.println("parent method");
	}
}


class Child extends Parent{
	
	
}

public class StaticMethod {
public static void main(String[] args) {
	Child p=new Child();
	p.m1();
}
}
