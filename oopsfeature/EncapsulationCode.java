package oopsfeature;



class Bank {
	private int bankId;
	private String bankName;
	private String address;
	
    public Bank(){
		
	}

	// parameterized constructor
	public Bank(int bankId, String bankName, String address) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.address = address;
	}

	

	// setter
	public void setBankId(int bankId) {
		this.bankId=bankId;
	}
    
	public int getBankId() {
		return this.bankId;
	}
	
	// setter
	public void setBankName(String bankName) {
		this.bankName=bankName;
	}
	

	public String getBankName() {
		return this.bankName;
	}
	
	// setter
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return this.address;
	}
}

public class EncapsulationCode {
	public static void main(String[] args) {
		Bank bank = new Bank();
		// set value
		bank.setBankId(12);
		// get value
		int bankId=bank.getBankId();
		System.out.println("bank id "+bankId);
		
		// set value
		bank.setBankName("ICICI");
		// get value
		String name=bank.getBankName();
		System.out.println("name of the bank  "+name);
		
		// set value
		bank.setAddress("Pune");
		
		// get value
		String addr=bank.getAddress();
		System.out.println("address of bank  "+addr);
		
		
		
	}
}
