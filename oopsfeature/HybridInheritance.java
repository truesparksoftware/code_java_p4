package oopsfeature;


interface B1{
	public void display();
	public default void display1() {
		System.out.println("default method in interface A1");
	}
}


interface B2{
	public void display();
	public void dis();
	public default void display1() {
		System.out.println("default method in interface A1");
	}
}

class Subclass implements A1,A2{

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
	}


class SubClass1 extends Subclass{
	
}

class SubClass2 extends SubClass1{
	
}

public class HybridInheritance {
public static void main(String[] args) {
	SubClass2 subclass1=new SubClass2();
	subclass1.dis();
}
}
