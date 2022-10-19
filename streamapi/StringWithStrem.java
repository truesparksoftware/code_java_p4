package streamapi;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class StringWithStrem {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("AB");
		list.add("CD");
		list.add("TY");
		list.add("PT");
		list.add("ST");
		list.add("AB");
		list.add("PO");
		list.add("TY");
		list.add("PCVG");
		list.add("TYFFG");
		list.add("TYFFG");
		list.add("TYFFG");
		list.add("TYFFG");
		list.add("TYFFG");
		list.add("TYFFG");
		list.add("PTWWW");
		list.add("STEEEE");
		list.add("AB");
		list.add("PO");
		List<String> res = list.stream().filter(x -> x.contains("T")).filter(x -> x.length() > 4).distinct()
				.collect(Collectors.toList());
		System.out.println(res);

		Set<String> set = new HashSet();
		set.add("AB");
		set.add("CD");
		set.add("TY");
		set.add("PT");
		set.add("ST");
		set.add("AB");
		set.add("PO");
		set.add("TY");
		set.add("PCVG");
		set.add("TYFFG");
		set.add("TYFFG");
		set.add("TYFFG");
		set.add("TYFFG");
		set.add("TYFFG");
		set.add("TYFFG");
		set.add("PTWWW");
		set.add("STEEEE");
		set.add("AB");
		set.add("PO");

		Set<String> res1 = set.stream().map(x -> x.concat("_IT")).filter(x->x.length()>5).collect(Collectors.toSet());
		System.out.println(res1);
	}
}
