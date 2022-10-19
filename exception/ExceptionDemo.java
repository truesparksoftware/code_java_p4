package exception;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionDemo {
	public static void main(String[] args){
		int num1 = 10;
		int num2 = 0;
		int result = 0;
        int pt=1000; 
        Object obj=null;
		try {
			pt=100;
			obj.notify();
			result = num1 / num2;
			System.out.println("division completed");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		finally{
			pt=1000;
			System.out.println("finally block");
		}
	}
}
