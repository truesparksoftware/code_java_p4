package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Student {
	private Integer id;
	private String name;
	private String dept;
}

public class CustomObjectListSort {
	public static void main(String[] args) {
		List<Student> list = new ArrayList();
		list.add(new Student(12, "Priyanka", "IT"));
		list.add(new Student(12, "Priyanka", "IT"));
		list.add(new Student(14, "Priyanka", "IT"));
		list.add(new Student(12, "Priyanka", "UK"));
		list.add(new Student(12, "Jeevan", "IT"));
		list.add(new Student(12, "Snehal", "IT"));
		list.add(new Student(13, "Shubham", "Banking"));
		list.add(new Student(14, "Sachin", "IT"));
		list.add(new Student(16, "Suraj", "IT"));
		list.add(new Student(17, "Vikas", "IT"));

		List<Integer> li = Arrays.asList(1, 2, 4, 34, 5, 9, 6, 6, 7, 12);

		//
		Comparator<Student> cmp = Comparator.comparing(Student::getId).thenComparing(Student::getName)
				.thenComparing(Student::getDept);
		Collections.sort(list, cmp);
		System.out.println(list);
	}
}
