package exception;

import java.sql.SQLDataException;
import java.sql.SQLException;


// apply in case of compile time/check excpetion
class Parent{
	int result=0;
	void m1(int number1, int number2, int number3)throws Exception{
		result=number1-number2-number3;
	}
	
}


class Child extends Parent{

	int result=0;
	@Override
	void m1(int number1, int number2, int number3) throws SQLException {
		result=number1+number2+number3;
	}
}


class Child1 extends Child{
	int result=0;
   SQLDataException e1=new SQLDataException();
	@Override
	void m1(int number1, int number2, int number3) throws SQLDataException {
		result=number1+number2+number3;
		ArithmeticException e=new ArithmeticException("Number invalid");
		if(10>5) {
			throw e;
		}
	}
	
}




public class ExceptionInMethodOverrding {

}
