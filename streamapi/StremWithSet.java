package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StremWithSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet();
		set.add(22);
		set.add(32);
		set.add(12);
		set.add(42);
		set.add(72);
		set.add(92);
		set.add(80);
		set.add(10);
	    List<Integer> setList=set.stream().filter(x -> x > 20).map(x -> x * 2).sorted().collect(Collectors.toList());
	    System.out.println(setList);	
		List<Integer> list = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
		List<Integer> sortList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortList);

	}
}
