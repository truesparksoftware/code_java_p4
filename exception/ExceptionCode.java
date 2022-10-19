package exception;

class ExceptionHandling {

	public void exceptionCode() {
		int x = 20;
		int y = 0;
		int result = 90;
		// outer try block
		try {

			// inner try block
			try {
				int div = 90 / 0;
				System.out.println(div);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			} finally {
				System.out.println("innner finally block");
			}

			result = x / y;

			System.out.println("line 1");
			System.out.println("line 2");
			System.out.println("line 3");
			System.out.println("line 4");
		} catch (Exception e) {
			displayError();
			 e.printStackTrace();
			// System.out.println("arithmetic exception");

		} finally {
			result = 30;
			System.out.println("Outer try block");
		}
	}

	void displayError() {
		System.out.println("error occured");
	}
}

public class ExceptionCode {
	public static void main(String[] args) {
		ExceptionHandling exceptionobject = new ExceptionHandling();
		exceptionobject.exceptionCode();
	}
}
