package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Emp {
	private Integer id;
	private String name;
	private Float salary;
}

public class StreamWithCustomObject {
	public static void main(String[] args) {
		List<Emp> empList = new ArrayList();
		empList.add(new Emp(40, "Jeevan", 350000.00f));
		empList.add(new Emp(20, "Priyanka", 350000.00f));
		empList.add(new Emp(60, "Snehal", 350000.00f));
		empList.add(new Emp(40, "Jeevan", 350000.00f));
		empList.add(new Emp(20, "Priyanka", 350000.00f));
		empList.add(new Emp(60, "Snehal", 350000.00f));
		empList.add(new Emp(40, "Jeevan", 350000.00f));
		empList.add(new Emp(20, "Priyanka", 350000.00f));
		empList.add(new Emp(60, "Snehal", 350000.00f));
		empList.add(new Emp(80, "Shubam", 350000.00f));
		empList.add(new Emp(10, "Avinash", 350000.00f));
		empList.add(new Emp(30, "Vikas", 350000.00f));
		empList.add(new Emp(90, "Nikita", 350000.00f));
		
		//List<Emp> em=empList.stream().filter(x->x.getId()>=50).collect(Collectors.toList());
		List<Integer> em=empList.stream().map(x->x.getId()*2).collect(Collectors.toList());
		System.out.println(em);
		
		long emlist=empList.stream().filter(x->x.getId()>=50).count();
		System.out.println(emlist);
		
		
		//distinct
		List<Emp> eml=empList.stream().distinct().collect(Collectors.toList());
		System.out.println(eml);
		
		Set<Emp> st=  empList.stream().filter(x->Collections.frequency(empList, x)>1).collect(Collectors.toSet());
		 
		System.out.println(st);

	}
}
