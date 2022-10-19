package collectionlist;



import java.util.ArrayList;
import java.util.List;

class Emp {
	int id;
	private String name;
	private String loc;
	public Emp(int id, String name, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}

}

public class ListCode2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(30);
		list.add(20);
		list.add(30);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(12);
		list2.add(30);
		list2.add(20);
		list2.add(30);
	

		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(list2);
		list3.addAll(list);
		System.out.println(list3);

		List<Emp> listEmp = new ArrayList<>();
		listEmp.add(new Emp(10, "Jeevan", "Pune"));
		listEmp.add(new Emp(20, "Santosh", "Pune"));
		listEmp.add(new Emp(40, "Sagar", "Pune"));
		listEmp.add(new Emp(50, "Sachin", "Pune"));
		System.out.println(listEmp);
        Emp e1;
		// iteration using for loop
		for (int i = 0; i < listEmp.size(); i++) {
			// Emp e1=new Emp();
			//Emp e1 = listEmp.get(i);
			e1=listEmp.get(i);
			if (e1.getName().equals("Sagar")) {
				System.out.println(e1);
			}
		}

		for(Emp e2 : listEmp) {
			if (e2.getName().equals("Sagar")) {
				System.out.println(e2);
			}
		}

	}
}
