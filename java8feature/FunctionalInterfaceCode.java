package java8feature;

@FunctionalInterface
interface Parent {
	void show();

	default void m1() {
		System.out.println("default m1 method");
	}

	static void m2() {
		System.out.println("static m2 method");
	}

}

class Stud {

	Parent parent = () -> {
		System.out.println("lambda execution");
	};
	
	

	void fixissuue() {
		parent.show();
		parent.m1();
	}

}

public class FunctionalInterfaceCode {
	public static void main(String[] args) {

	}
}
