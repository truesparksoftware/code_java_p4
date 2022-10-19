package finalkeyword;

class Bank{
	// blank final
	private final int id;
	
	
	// blank static final variable
	private static final int empId;
	
	private String name;
	private String branch;
	
	static{
		empId=30;	
	}
	
	{
		id=20;
	}
	
	
	public Bank(String name, String branch) {
		super();
		this.name = name;
		this.branch = branch;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public int getId() {
		return id;
	}	
}




public class FinalKeyword {

}
