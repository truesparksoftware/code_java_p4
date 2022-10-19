package collectionmap;



import java.util.LinkedList;
import java.util.List;

public class LinkedListCode {
	public static void main(String[] args) {
		List<Integer> linkList = new LinkedList<Integer>();
		linkList.add(15);
		linkList.add(16);
		linkList.add(17);
		linkList.add(18);
		linkList.add(19);
		linkList.add(12);
		linkList.add(90);

		System.out.println(linkList.size());
		System.out.println(linkList.isEmpty());
		System.out.println(linkList.get(6));
		System.out.println(linkList.indexOf(19));
		linkList.remove(2);
		linkList.add(20);
		linkList.add(50);
		for (Integer li : linkList) {
			System.out.println(li);
		}

	}
}
