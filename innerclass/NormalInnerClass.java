package innerclass;

import innerclass.OuterClass.InnerClass;

class OuterClass {

	class InnerClass {

		void m1() {
			System.out.println("m1 method from Inner Class");
		}

		void m2() {
			System.out.println("m2 method from Inner Class");
		}
	}

	void m3() {
		System.out.println("m3 method from Outer class");
	}

}

public class NormalInnerClass {
	public static void main(String[] args) {

		OuterClass ou = new OuterClass();
		InnerClass inn = ou.new InnerClass();
		inn.m1();
		inn.m2();

	}
}
