package equalhashcode;

class Emp {
	private int id;
	private String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		return id;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
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

public class EqualHashCode {
	public static void main(String[] args) {
		Emp e1=new Emp(12,"G1");
		Emp e2=new Emp(12,"G1");
		
	   
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
   		
		
		String name1 = new String("abc");
		String name2 = new String("abc");
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());

		String name3 = "abc";
		String name4 = "abc";

		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());

		if (name1 == name2) {
			System.out.println("both equal");
		} else {
			System.out.println("not equal");
		}

		if (name3 == name4) {
			System.out.println("both equal");
		} else {
			System.out.println("not equal");
		}

	}
}
