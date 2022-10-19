package oopsfeature;


interface Emplye {
	public void display();

	// default implmentation
	public default void dis() {
		System.out.println("default method in interface");
	}
}

class Emplye1 implements Emplye {

	@Override
	public void display() {
		System.out.println("display method from Emplye1 class");

	}

	/*
	 * @Override public void dis() {
	 * System.out.println("default method in interface"); }
	 */

}

class Emplye2 implements Emplye {

	@Override
	public void display() {
		System.out.println("display method from Emplye2 class");

	}

	@Override
	public void dis() {
		System.out.println("default method in Emplye2");
	}

}

public class LooseCoupling {
	public static void main(String[] args) {

		// Emplye1 class
		Emplye Emplye1 = new Emplye1();
		Emplye1.display();
		Emplye1.dis();
		// Emplye2 class
		Emplye Emplye2 = new Emplye2();
		Emplye2.display();
		Emplye2.dis();

		//
		//
		//
		//
		//
		//

	}
}
