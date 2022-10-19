package collectionset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Bank {
	private int id;
	private String name;
	private String branch;

	public Bank(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class SetWithCustomObject {
	public static void main(String[] args) {
		Set<Bank> bank = new HashSet<Bank>();

		Bank b1 = new Bank(121, "ICICI", "Pune");
		bank.add(b1);

		bank.add(new Bank(131, "HDFC", "Pune"));
		bank.add(new Bank(141, "KOTAK", "Pune"));
		bank.add(new Bank(131, "HDFC", "Pune"));
		bank.add(new Bank(141, "KOTAK", "Pune"));
		bank.add(new Bank(151,"Axis","Pune"));
		bank.add(new Bank(161,"SBI","Pune"));	
		System.out.println("bank set...."+bank);
		
		
		
		Set<Bank> treeSet=new TreeSet<Bank>();
	//	treeSet.addAll(bank);
	//	System.out.println("After sorting tree set"+treeSet);
		
		
		
		Set<Bank> linked=new LinkedHashSet<>();
		linked.addAll(bank);
		System.out.println("linkedhashset ..."+linked);
		
		
		Bank bb=new Bank(131, "HDFC", "Pune");
		Bank dd=new Bank(131, "HDFC", "Pune");
		Bank cc=new Bank(141, "Axis", "Pune");
		System.out.println(bb.equals(dd));
		System.out.println(bb.hashCode());
		System.out.println(cc.hashCode());
		System.out.println(dd.hashCode());
	}
}
