package collectionmap;

import java.util.*;

public class MapCode {
public static void main(String[] args) {
  List<Integer> list=new ArrayList<Integer>();
  
  Map<Integer,String> map=new HashMap<Integer,String>();
   map.put(11, "A");
   map.put(30, "X");
   map.put(40, "T");
   map.put(15, "A");
   map.put(31, "X");
   map.put(40, "T");
   map.put(11, "A");
   map.put(30, "X");
   map.put(40, "T");
   map.put(80, "IO");
   
   System.out.println("hashmap...."+map);
   
  // sort map based on key using treemap
  Map<Integer,String> treemap=new TreeMap<>();
  treemap.putAll(map);
  System.out.println("tree map..."+treemap);
   
   Map<Integer, String> linked=new LinkedHashMap<>();
   linked.put(11, "A");
   linked.put(30, "X");
   linked.put(40, "T");
   linked.put(15, "A");
   linked.put(31, "X");
   linked.put(40, "T");
   linked.put(11, "A");
   linked.put(30, "X");
   linked.put(40, "T");
   
   //linked.putAll(map);
   System.out.println(linked);
   System.out.println(map.size());
   System.out.println(map.get(40));
   
   
   
}
}
