package finalkeyword;

class CodeRun{
	
	
	CodeRun(){
		System.out.println("Code run constructor ...");
	}
	
	
	static {
		
		System.out.println("static block");
	}
	
	{
		System.out.println("dynamic block");
		
	}
	
	
	 static void testCode(){
		System.out.println("static method....");
	}
	
	
	void testCode1() {
		System.out.println("Instance method...");
		
	}
	
}





public class ExecutionFlow {
public static void main(String[] args) {
	
	// static method 
	CodeRun.testCode();
	
	
	// instance method call with the help object
	CodeRun rn=new CodeRun();
	rn.testCode1();
	
	
}
}
