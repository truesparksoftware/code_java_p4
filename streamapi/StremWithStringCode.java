package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremWithStringCode {
	public static void main(String[] args) {
		List<String> slist = new ArrayList();
		slist.add("ABCD");
		slist.add("XYZA");
		slist.add("TTSS");
		slist.add("YYTT");
		slist.add("RRTT");
		slist.add("HHTT");
		List<String> sortedString = slist.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedString);
	}
}
