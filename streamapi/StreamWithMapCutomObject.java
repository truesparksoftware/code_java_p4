package streamapi;

import java.util.*;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Company {
	private Integer id;
	private String name;
	private String work;
}

public class StreamWithMapCutomObject {
	public static void main(String[] args) {
		Map<Integer, Company> cmp = new HashMap();
		cmp.put(11, new Company(18, "ITC", "SOFt"));
		cmp.put(12, new Company(15, "Infosys", "SOFt"));
		cmp.put(13, new Company(11, "Tata", "SOFt"));
		cmp.put(15, new Company(17, "Spark", "SOFt"));
		cmp.put(14, new Company(13, "IT", "SOFt"));
		cmp.put(17, new Company(10, "Ig", "SOFt"));
		cmp.put(19, new Company(12, "ITC", "SOFt"));
		Map<Integer, Company> result = cmp.entrySet().stream().filter(x -> x.getValue().getId() >= 15)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(result);
		
			}
}
