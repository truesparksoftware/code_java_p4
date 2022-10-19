package streamapi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPi {
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

		// without stream
		List<Integer> list1 = new ArrayList();
		for (Integer num : list) {
			if (num >= 50) {
				num=num*10;
				list1.add(num);
			}
		}
		
		Set<Integer> set=new HashSet(list1);
		
		System.out.println(set);

		List<Integer> result = list.stream().filter(x -> x >= 50).map(x->x*10).distinct().collect(Collectors.toList());
		System.out.println(result);

	}
}
