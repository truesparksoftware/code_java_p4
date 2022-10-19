package oopsfeature;



// interface
interface Student{
	public void printStudent();
}


// implementation of interface in class
class StudentImplementation implements Student{

	@Override
	public void printStudent() {
		System.out.println("Student data");
	}
}

public class AbstractionCode {
public static void main(String[] args) {
	
	// loose coupling
	Student s=new StudentImplementation();
	s.printStudent();
	
	// tight coupling
	StudentImplementation stud=new StudentImplementation();
	stud.printStudent();
	
}
}
