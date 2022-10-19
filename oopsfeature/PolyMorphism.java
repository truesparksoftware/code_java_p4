package oopsfeature;



class C1 {
	public void m1() {
		System.out.println("message from m1");
	}

	public void m1(int id) {
		System.out.println("message from m1 but id " + id);
	}

	public void m1(int id, String name) {
		System.out.println("message from m1 id and name " + name + " id" + id);
	}

	public void m1(int id, int number) {
		System.out.println("message from m1 id and number" + number + " id " + id);
	}
	
	
	public void m1(String adhar, String voter) {
		System.out.println("adhar and voter");
	}
	
	public void m1(String adhar, String voter,String passport) {
		System.out.println("adhar, voter and passport");
	}
	
}

public class PolyMorphism {
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.m1();
		c1.m1(12);
		c1.m1(12, 12);
		c1.m1(12, "Jeevan");
		c1.m1("123345", "909090");
		c1.m1("12345", "909909", "M89766");
	}

}
