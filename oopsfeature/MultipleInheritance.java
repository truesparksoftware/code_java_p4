package oopsfeature;


interface A1{
	public void display();
	public default void display1() {
		System.out.println("default method in interface A1");
	}
}


interface A2{
	public void display();
	public void dis();
	public default void display1() {
		System.out.println("default method in interface A1");
	}
}

abstract class ABC{
	public abstract void m2();
}

class Child extends ABC implements A1,A2{

	@Override
	public void display() {

	System.out.println("display method from Child classs");
	}
	
	@Override
	public void display1() {
	System.out.println("overridden method");	
	}

	@Override
	public void dis() {
		System.out.println("dis method");
		
	}

	@Override
	public void m2() {
	System.out.println("abtsract class method");
		
	}
	}


public class MultipleInheritance {
public static void main(String[] args) {
	A2 child=new Child();
	child.display();
	child.display1();
	child.dis();
}
}
