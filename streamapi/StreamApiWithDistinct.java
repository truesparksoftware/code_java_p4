package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiWithDistinct {
	public static void main(String[] args) {

		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 7, 8, 9 };
		List<Integer> in = Arrays.asList(arr);
		int sum = 0;
		List<Integer> out = in.stream().distinct().collect(Collectors.toList());
		List<Integer> count = in.stream().filter(x -> x >= 5).distinct().map(x -> x * 10).collect(Collectors.toList());
		System.out.println(count);
		in.stream().filter(x -> x >= 5).distinct().map(x -> x * 10).forEach(System.out::println);
		System.out.println(out);



		
	}
}
