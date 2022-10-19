package collectionmap;

import java.util.*;


class Bike{
	private String id;
	private String name;
	private String model;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Bike(String id, String name, String model) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", model=" + model + "]";
	}
	
	
}


public class CustomObjectWithMap {
public static void main(String[] args) {
	
	Map<String, Bike> mp=new HashMap<String,Bike>();
	Bike bike1=new Bike("A1","Honda","Shhine");
	mp.put("A1", bike1);
	mp.put("B1", new Bike("B1","TVS","Pulsar"));
	mp.put("C1", new Bike("C1","Bajaj","Pulsar"));
	
}
}
