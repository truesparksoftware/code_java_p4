package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamWithMap {
	public static void main(String[] args) {

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		mp.put(14, 60000);
		mp.put(12, 20000);
		mp.put(16, 80000);
		mp.put(17, 90000);
		mp.put(13, 50000);
		mp.put(11, 20000);
		mp.put(12, 20000);
		mp.put(10, 20000);
		System.out.println(mp);
		Map<Integer, Integer> res = mp.entrySet().stream().filter(x -> x.getKey() > 15)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(res);
		Map<Integer, Integer> res1 = mp.entrySet().stream().filter(x -> x.getKey() > 15)
				.collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
		System.out.println(res1);

		Map<Integer, Integer> res2 = mp.entrySet().stream().filter(x -> x.getValue() > 50000)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(res2);

			
	}
}
