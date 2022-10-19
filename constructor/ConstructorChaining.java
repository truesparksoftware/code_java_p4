package constructor;
class Clg1{
	Clg1(String message){
		System.out.println(message);
	}
	
	
	Clg1(String msg1, String msg2){
		System.out.println(msg1);
		System.out.println(msg2);
	}
}


class Clg extends Clg1{
	
	
	//1
	Clg(){
		this("firstmsg");
	System.out.println("deafult constructor ");	
	}
	
	//2
	Clg(String message){
		this("a","b");
		System.out.println(message);
	}
	
	//3
	Clg(String msg1, String msg2){
		super(msg1);
		System.out.println(msg1);
		System.out.println(msg2);
	}

	
	
	void m1() {
		m2();
		System.out.println("m1 method");
	}
	
	void m2() {
		m3();
		System.out.println("m2 method");
	}
	void m3() {
        m4();
		System.out.println("m3 method");
	}

	void m4() {
		System.out.println("m4 method");
	}

}
public class ConstructorChaining {
public static void main(String[] args) {
	Clg clg=new Clg();
	clg.m1();
}
}
