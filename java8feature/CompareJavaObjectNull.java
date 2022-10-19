package java8feature;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Student {
	private Integer id;
	private String name;
	private Double loc;
}



public class CompareJavaObjectNull {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(16, "Jeevan", 3000.00));
		list.add(new Student(15, "Jeevan", 3000.00));
		list.add(new Student(14, "Jeevan", 3000.00));
		list.add(new Student(12, "Jeevan", 3000.00));
		Student s1 = null;
		Student s2 = null;
		Student s3 = null;
		list.add(s3);
		list.add(s2);
		list.add(s1);
		List<Student> cmp= list.stream().filter(x->x!=null).sorted(Comparator.comparing(Student::getLoc)).collect(Collectors.toList());
		System.out.println(cmp);
		
		
	}
}
