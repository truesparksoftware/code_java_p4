package exception;

class CustException extends Exception {

	public CustException(String message) {
		super(message);
	}

}

class MarkCalculation {

	public int calculate(int x, int y) {
		int result =x/y;
       return result;
	}

}

public class CustomException {
	public static void main(String[] args) {
		MarkCalculation marck=new MarkCalculation();
		marck.calculate(12, 0);
	}
}
