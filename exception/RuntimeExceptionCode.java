package exception;

// apply in case of compile time/check excpetion
class Super{
	int result=0;
	void m1(int number1, int number2, int number3){
		result=number1-number2-number3;
	}
}


class SubClass extends Super{

	int result=0;
	@Override
	void m1(int number1, int number2, int number3) throws ArithmeticException{
		result=number1+number2+number3;
	}
}


class SubClass1 extends SubClass{
	int result=0;
	@Override
	void m1(int number1, int number2, int number3) throws RuntimeException{
		result=number1+number2+number3;
	}
	
}


public class RuntimeExceptionCode {

}
