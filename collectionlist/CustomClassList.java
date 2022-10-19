package collectionlist;
import java.util.ArrayList;
import java.util.List;

class Team{
	private int id;
	private String name;
	private int size;
	public Team(int id, String name, int size) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", size=" + size + "]";
	}


	void display() {
		System.out.println("id..."+id+" name.."+name+"  size...."+size);
	}
}



public class CustomClassList {
public static void main(String[] args) {
	
	Integer in=new Integer(20);
	
	List<Integer> list=new ArrayList<Integer>();
	  list.add(in);
	  list.add(30);
	
	    Team t1=new Team(12,"India",20);
		Team t2=new Team(30,"Bang",20);
		Team t3=new Team(40,"London",20);
		Team t4=new Team(19,"US",20);
		Team t5=new Team(14,"Aus",20);
	  
	  
	List<Team> team=new ArrayList<Team>();
	
	t1.display();
	System.out.println("t1 value..."+t1);
	 team.add(t1);
	 team.add(t2);
	 team.add(t3);
	 team.add(t4);
	 team.add(t5);
	 team.add(new Team(30,"xyz",11));
  
	 System.out.println(team);
	 
	 Integer i1=new Integer(30);
	 Integer i2=new Integer(30);
	 System.out.println(i1.hashCode());
	 System.out.println(i2.hashCode());
	 
	 if(i1.equals(i2)) {
		 System.out.println("both are equal ");
	 }else {
		 System.out.println("not equal ");
	 }
	 
	 System.out.println("comparision of integer value");
	 
	 
	 Team team1=new Team(10,"India",30);
	 Team team2=new Team(10,"India",30);
	 
	 
	 
	 
	 
}
}
