package innerclass;

import innerclass.Outer.Inner;

class Outer {

	static class Inner {
		void m2() {
			System.out.println("m2 method from Inner class");
		}
		
	  static void m1() {
		  System.out.println("m1 method from Inner class");
	  }
	}

	void m1() {

		System.out.println("m1 method from outer class");
	}
}

public class StaticInnerClass {
	public static void main(String[] args) {
	
		Inner in = new Inner();
		in.m1();
		in.m2();
	
		
	}
}
