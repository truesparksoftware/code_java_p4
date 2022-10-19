package oopsfeature;


class Studen{
	
	void display() {
		System.out.println("display method of Studen class");
	}
}

class Studen1{

	void display() {	
		this.display1();
		
		// tight coupling
		Studen Studen=new Studen();
		Studen.display();
		System.out.println("display method of Studen1 class");
	}
	
	void display1() {
		System.out.println("display1 method");
	}
	
}

public class TightCoupling {
public static void main(String[] args) {
	Studen1 Studen1=new Studen1();
	Studen1.display();
}
}
