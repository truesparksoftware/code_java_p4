package java8features;



@FunctionalInterface
interface Fun{	
	public int m3(String name, int num);
	default void m1() {
		System.out.println("m1 dafault method");
	}
	static void m2() {
		System.out.println("m2 method from Fun interface");
	}
}


class FunImpl implements Fun {

	public int m4() {
		Fun fun=(str,number)->{
			System.out.println(str);
			int sum=number*number;
			return sum;
		};
		
		int result=fun.m3("Santosh", 40);
		System.out.println("functional interface result "+result);
		return result;
	}

	@Override
	public int m3(String name, int num) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}



public class FunctionalInterfaceCode {
public static void main(String[] args) {
	FunImpl imp=new FunImpl();
}
}
