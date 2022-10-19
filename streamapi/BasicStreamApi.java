package streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamApi {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(30);
		list.add(40);
		list.add(20);
		list.add(22);
		list.add(12);
		list.add(92);
		list.add(52);
		list.add(72);

		List<Integer> filterList = new ArrayList();

		for (Integer in : list) {
			if (in > 50) {
				filterList.add(in);
			}
		}
		System.out.println(filterList);

		List<Integer> output = list.stream().filter(x -> x > 50).collect(Collectors.toList());
		System.out.println(output);
	}
}
