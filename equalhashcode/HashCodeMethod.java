package equalhashcode;

class Mobile{
	private int id;
	private String name;
	public Mobile(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + "]";
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
		Mobile other = (Mobile) obj;
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





public class HashCodeMethod {
public static void main(String[] args) {
	String s1=new String("xyz");
	String s2=new String("xyz");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());

	if(s1.equals(s2)) {
		System.out.println("equal");
	}
	
	
	Mobile m1=new Mobile(23,"Oppo");
	Mobile m2=new Mobile(23,"Oppo");
	System.out.println(m1.hashCode());
	System.out.println(m2.hashCode());
	
	if(m1.equals(m2)) {
		System.out.println("equal");
	}
	
	
}
}
