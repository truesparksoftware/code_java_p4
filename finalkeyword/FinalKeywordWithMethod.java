package finalkeyword;

class Parent{
	final void m1(int id,String name) {
		System.out.println("m1 method from parent class");
	}
	
	void m2() {
		System.out.println("parent m2 method");
	}
}


class Child extends Parent{

	void m1(int id,String name) {
		System.out.println("m1 method from parent class");
	}
	
	@Override
	void m2() {
		System.out.println("parent m2 method");
	}
}



public class FinalKeywordWithMethod {

}
