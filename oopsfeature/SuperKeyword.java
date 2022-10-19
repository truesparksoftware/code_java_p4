package oopsfeature;



class BankB {
	private int BankBId;
	private String BankBName;
	private String BankBAddress;

	public BankB(int BankBId, String BankBName, String BankBAddress) {
		this.BankBId = BankBId;
		this.BankBName = BankBName;
		this.BankBAddress = BankBAddress;
	}

	public void displayBankB() {
		System.out.println("BankB id " + BankBId);
		System.out.println("BankB Name " + BankBName);
		System.out.println("BankB addres " + BankBAddress);
	}
}

class BankB1 extends BankB {
   private String BankBMMIN;
	public BankB1(int BankBId, String BankBName, String BankBAddress,String BankBMMIN) {
		super(BankBId, BankBName, BankBAddress);
		this.BankBMMIN=BankBMMIN;
	}
	public void displayBankB1() {
		System.out.println("BankBMMIN number  "+BankBMMIN);
	}

}

class BankB2 extends BankB1{
   private String BankBNo;
	public BankB2(int BankBId, String BankBName, String BankBAddress, String BankBMMIN,String BankBNo) {
		super(BankBId, BankBName, BankBAddress, BankBMMIN);
	 this.BankBNo=BankBNo;
	}

	public void showBankB() {
		System.out.println("BankB No  "+BankBNo);
	}
	
}

public class SuperKeyword {
	public static void main(String[] args) {

		// BankB BankB=new BankB(12,"HDFC","Pune");
		// BankB.displayBankB();

		BankB BankB=new BankB(12, "HDFC", "Pune");
		BankB.displayBankB();
		
		
		BankB1 BankB1 = new BankB1(12, "HDFC", "Pune","MMIN");
		BankB1.displayBankB();
		BankB1.displayBankB1();
		
		BankB2 BankB2=new BankB2(12, "HDFC", "Pune","MMIN","12345");
		BankB2.displayBankB();
		BankB2.displayBankB1();
		BankB2.showBankB();

	}
}
