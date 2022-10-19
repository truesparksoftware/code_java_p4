package streamapi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCode {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);
		list.add(50);
		list.add(50);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);

		List<Integer> ouput = new ArrayList();
		for (Integer i : list) {
			if (i >= 50) {
				ouput.add(i);
			}
		}

		System.out.println(ouput);

		List<Integer> result = list.stream().filter(x -> x >= 50).collect(Collectors.toList());
		System.out.println(result);

		Set<Integer> set = new HashSet<Integer>();
		set.add(50);
		set.add(40);
		set.add(20);
		set.add(90);
		set.add(60);
		set.add(10);

		List<Integer> resultSet = set.stream().map(x -> x / 2).collect(Collectors.toList());
		System.out.println(resultSet);

	}
}
