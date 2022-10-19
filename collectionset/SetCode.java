package collectionset;

import java.util.*;


public class SetCode {
public static void main(String[] args) {
	
	
	List<Integer> list=new ArrayList();
	list.add(12);
	list.add(13);
	list.add(14);
	list.add(12);
	list.add(13);
	list.add(15);
	list.add(16);
	list.add(17);
	list.add(12);
	list.add(12);
	System.out.println("list...."+list);
	
	Collections.sort(list);
	
	// removed duplicate element
	Set<Integer> distinctset=new HashSet<>();
	distinctset.addAll(list);
	System.out.println("distinct list"+distinctset);
	
	Set<Integer> linked=new LinkedHashSet<>();
	linked.addAll(list);
	System.out.println("linkedhashset "+linked);
	
	
	Set<Integer> set=new HashSet<Integer>();
	set.add(12);
	set.add(13);
	set.add(14);
	set.add(15);
	set.add(16);
	set.add(17);
	set.add(12);
	set.add(12);
	System.out.println("set ..."+set);
	
	
	Set<Integer> treeSet=new TreeSet<>();
	treeSet.addAll(set);
	System.out.println("treeset code..."+treeSet);
	
	
	Set<String> strSet=new HashSet<>();
	strSet.add("N");
	strSet.add("P");
	strSet.add("X");
	strSet.add("A");
	strSet.add("N");
	strSet.add("N");
	strSet.add("I");
	strSet.add("L");
	strSet.add("M");
	strSet.add("N");
	strSet.add("N");
	System.out.println("set element....."+strSet);
	 strSet.remove("N");
	System.out.println("after removing element"+strSet);
	System.out.println(strSet.size());
	
}
}
