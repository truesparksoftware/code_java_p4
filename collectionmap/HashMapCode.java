package collectionmap;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class HashMapRun{
	//<key, value>
	void addHashMap() {
		Map<String,String> map=new HashMap<String,String>();
		map.put("A", "ABC");//
		map.put("B", "ABC");
		map.put("C", "ABC");
		map.put("A", "PQR");//
		map.put("A", "XYZ"); //
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("C"));
	    System.out.println(map.containsValue("ABC"));
	    Set<Entry<String,String>> s = map.entrySet();
	    for (Entry<String, String> it: s)
        {
	    	System.out.println(it.getValue());
	    	System.out.println(it.getKey());
        }
	    
	}
}


public class HashMapCode {
public static void main(String[] args) {
	HashMapRun object=new HashMapRun();
	object.addHashMap();
	

}
}
