package collectionlist;



import java.util.ArrayList;
import java.util.List;

class Book {
	int id;
	String name;
	String loc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Book(int id, String name, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
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

class Compass {
	int id;
	String name;
	String loc;
	String type;

	public Compass(int id, String name, String loc,String type) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.type=type;
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


}

public class ListCode {
public static void main(String[] args) {
	List<Book> listBook=new ArrayList<Book>();
    listBook.add(new Book(12,"Book1","Pune"));
    listBook.add(new Book(11,"Book1","Pune"));
    listBook.add(new Book(10,"Book1","Pune"));
    listBook.add(new Book(1,"Book1","Pune"));
}
}
