package collectionlist;

import java.util.*;

public class ListOperation {
public static void main(String[] args) {
	
	List<Integer> list=new ArrayList<Integer>();
	list.add(80);
	list.add(70);
	list.add(20);
	list.add(10);
	list.add(30);
	list.add(130);
	list.add(120);
	list.add(60);
	System.out.println(list.size());
	System.out.println(list.equals(12));
	System.out.println(list.isEmpty());
	System.out.println(list.get(2));
	System.out.println(list.contains(400));
  
	List<Integer> list1=new ArrayList<Integer>();
	list.add(200);
	list.add(700);
	list.add(600);
	list.add(900);
	list1.addAll(list);
	Collections.sort(list1);
	System.out.println(list1);
	
	
	
	
	
}
}
