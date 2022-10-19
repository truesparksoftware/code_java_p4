package finalkeyword;

class Student {
	private String id;
	private String name;
	private String loc;

	public Student(String id, String name, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
}

public class FinalKeyWordWithObject {
	public static void main(String[] args) {
		final String name="xyz";
		Integer i=30;
		final Student stud = new Student("30", "Jeevan", "Pune");
		stud.setId("20");
		stud.setName("Jeevan");
		stud.setLoc("Pune");
		final StringBuilder sb=new StringBuilder("Builders,mdhsa hcsbchbsh");
		sb.append("new");
		System.out.println(sb);
	}
}
