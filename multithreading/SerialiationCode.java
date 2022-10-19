package multithreading;




import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Student(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	}

public class SerialiationCode {
public static void main(String[] args) {
Student student=new Student(11,"Dilip","Pune");
Student stud=null;

//serialization the Student
try {
	FileOutputStream fo = new FileOutputStream("student_details.txt");
	ObjectOutputStream so = new ObjectOutputStream(fo);
	so.writeObject(student);
	so.flush();
} catch (Exception e) {
	System.out.println(e);
}

// Deserilization the Student
try {
	FileInputStream fi = new FileInputStream("student_details.txt");
	ObjectInputStream si = new ObjectInputStream(fi);
	stud = (Student) si.readObject();
} catch (Exception e) {
	System.out.println(e);
}

System.out.println("The original Student is:\n" + student);
System.out.println("The deserilized class is:\n" + stud);
}
}
