package streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
class Bike {
	private int id;
	private String name;
	private String model;
}

public class StreamWithCutomObject {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList();
		list1.add(20);
		list1.add(20);
		list1.add(20);
		list1.add(40);
		list1.add(20);
		list1.add(40);
		list1.add(50);
		list1.add(40);
		list1.add(50);
		list1.add(80);
		list1.add(90);
		list1.add(10);
		list1.add(20);

		int count = Collections.frequency(list1, 20);
		System.out.println(count);

		Set<Integer> dupList = list1.stream().filter(x -> Collections.frequency(list1, x) > 1)
				.collect(Collectors.toSet());
		System.out.println("duplicate element from list" + dupList);

		List<Bike> list = new ArrayList();
		list.add(new Bike(12, "Honda", "Bike"));
		list.add(new Bike(14, "TVS", "Bike"));
		list.add(new Bike(16, "Bajaj", "Bike"));
		list.add(new Bike(18, "Suzuki", "Bike"));
		list.add(new Bike(12, "Honda", "Bike"));
		list.add(new Bike(12, "Honda", "Bikers"));

		Set<Bike> set = list.stream().filter(x -> Collections.frequency(list, x) > 1).collect(Collectors.toSet());
		System.out.println(set);

		Integer in=Collections.frequency(list, new Bike(12, "Honda", "Bike"));
		System.out.println(in);
		
	}
}
