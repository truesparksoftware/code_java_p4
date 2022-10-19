package collectionmap;



import java.util.Set;
import java.util.TreeSet;

public class TreeSetCode {
	public static void main(String[] args) {
		Set<Integer> treeSetCode = new TreeSet<>();
		treeSetCode.add(10);
		treeSetCode.add(50);
		treeSetCode.add(90);
		treeSetCode.add(30);
		treeSetCode.add(50);
		treeSetCode.add(40);
		treeSetCode.add(20);
		System.out.println(treeSetCode);
		System.out.println(treeSetCode.size());
		treeSetCode.remove(50);
		treeSetCode.add(70);
		System.out.println(treeSetCode);
	}
}
