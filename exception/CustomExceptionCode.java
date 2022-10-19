package exception;

class CuException extends Exception {

	public CuException(String message) {
		super(message);
	}
}

class Code {
	int cal(int num1, int num2) throws CuException {
		int result = 0;
		if (num1 == 0 || num2 == 0) {
			//CuException custexception=new CuException("please enter number greater than 0");
			//throw custexception;
			throw new CuException("please enter number greater than 0");
		} else {
			result = num1 / num2;
		}

		return result;
	}
}

public class CustomExceptionCode {
	public static void main(String[] args) throws CuException {
		Code code = new Code();
		code.cal(12, 0);
	}
}
