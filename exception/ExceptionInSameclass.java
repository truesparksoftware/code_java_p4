package exception;

class BankOperation{
	
	void m1() {
	  int num1=10;
	  int num2=0;
	  int result=0;
	  
	  try {
		  result=num1/num2;
	  }catch(ArithmeticException e) {
		  e.printStackTrace();
	  }catch(RuntimeException r) {
		  r.printStackTrace();
	  }catch(Exception e) {
		  e.printStackTrace();
	  }catch(Throwable t) {
		  t.printStackTrace();
	  }
	  
	  
	  try {
		  
	  } }catch(Throwable e) {
		  e.printStackTrace();
	  }catch(Exception r) {
		  r.printStackTrace();
	  }catch(RuntimeException e) {
		  e.printStackTrace();
	  }catch(ArithmeticException t) {
		  t.printStackTrace();
	  }
	}
}



public class ExceptionInSameclass {

}
