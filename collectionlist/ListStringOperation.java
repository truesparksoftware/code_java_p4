package collectionlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListStringOperation {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Abc");
		list.add("Pqr");
		list.add("Str");
		list.add("Ops");
		list.add("Ups");
		list.add("Trp");
		list.add("Otp");

		Collections.sort(list);
		System.out.println(list);
		 
		List<Float> lp=new ArrayList<Float>();
		List<Integer> li = new LinkedList<Integer>();
		li.add(12);// 0
		li.add(40);// 1
		li.add(1);// 2
		li.add(12);// 3
		li.add(30);// 4
		li.add(12);// 3
		li.add(12);// 3
		li.add(12);// 3
		li.add(12);// 3
		li.add(12);// 3
		li.add(12);// 3
		
		System.out.println(li);
		li.remove(2);
		System.out.println(li);
	}
}
