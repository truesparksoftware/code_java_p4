package multithreading;



class Parent {
	public void m1() {
		System.out.println("Parent class method");
	}

	public void m1(int num) {
		System.out.println("parent class with parameter " + num);
	}

}

class Child extends Parent {

	@Override
	public void m1() {
		System.out.println("child class method");
	}

	@Override
	public void m1(int num) {
		System.out.println("child class with parameter " + num);
	}

}

public class MethodOverloadWithOverride {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.m1();
		parent.m1(12);
	}
}
