package collectionmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class BikeCode {
	private int id;
	private String name;
	private String model;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		//
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BikeCode(int id, String name, String model) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
	}

	@Override
	public String toString() {
		return "BikeCode [id=" + id + ", name=" + name + ", model=" + model + "]";
	}

}

public class HashMapCustom {
	public static void main(String[] args) {
		Map<String, BikeCode> BikeCodeMap = new HashMap<String, BikeCode>();
		BikeCode b1 = new BikeCode(12, "Activa", "Honda");
		BikeCodeMap.put("A", b1);
		BikeCodeMap.put("B", new BikeCode(34, "R15", "Bajaj"));
		BikeCodeMap.put("C", new BikeCode(14, "Gixer", "Bajaj"));
		BikeCodeMap.put("X", new BikeCode(24, "Spelendar", "Bajaj"));
		BikeCodeMap.put("D", new BikeCode(54, "Jupitor", "Bajaj"));
		BikeCodeMap.put("Y", new BikeCode(34, "R15", "Bajaj"));
		
		BikeCodeMap.put("B", new BikeCode(50, "RX100", "Bajaj"));

		// print value id greater than 30
		Set<Map.Entry<String, BikeCode>> BikeCode = BikeCodeMap.entrySet();
		for (Entry<String, BikeCode> it : BikeCode) {
			if (it.getValue().getId() > 30) {
				System.out.println(it.getValue());
			}
		}
	}
}
