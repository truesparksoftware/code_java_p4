package java8features;

interface F1 {
	default void m1() {
		System.out.println("default method from F1");
	}

	static void m2() {
		int number=30;
		System.out.println("m2 method from F1");
	}
}

interface F2 {
	default void m1() {
		System.out.println("default method from F2");
	}

	static void m2() {
		System.out.println("m2 method from F2");
	}
}

class Xyz{
	
}
class Student implements F2{
	@Override
	public void m1() {
		F2.super.m1();
	}
}


public class DefaultAndStaticMethod {

	public static void main(String[] args) {
		Student s=new Student();
		s.m1();
		F1.m2();
		F2.m2();
	}
	
}
