package oopsfeature;


interface FirstInterface{
	// abstract method
	 void display();
	 
	 //default method
	 default void display1() {
		 System.out.println("dafault method implemntation");
	 }
	 
	 // static method in interface
	 static void display2() {
		 System.out.println("static method from interface");
	 }
}


class Test implements FirstInterface{

	@Override
	public void display() {
	System.out.println("class Test");
		
	}
	
	 @Override
	  public void display1() {
	  System.out.println("class Test deafult body");
	  
	  }
}

class Test1 implements FirstInterface{

	@Override
	public void display() {
	System.out.println("class Test1");
		
	}
	
	 @Override
	  public void display1() {
	  System.out.println("class Test1 deafult body");
	  
	  }
}


public class InterfaceTest {
public static void main(String[] args) {
	// loose coupling
	FirstInterface firstInterface=new Test1();
	firstInterface.display();
	firstInterface.display1();
	FirstInterface.display2();
}
}
