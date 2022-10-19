package serilization;

import java.io.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Employee implements Serializable{
	private static final long serialVersionUID = 3000L;
	private int id;
	private String name;
	private String addres;
	private transient long secureID;	
}

public class ClassSerilization {
	public static void main(String[] args) {

		Employee e1 = new Employee(500, "Santosh", "Shrigonda",238346734);

		String filename = "seri";
		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			// Method for serialization of object
			out.writeObject(e1);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
		
		
		
		
		// Deserialization
		Employee object1 = new Employee();
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object1 = (Employee) in.readObject();
   
			System.out.println("deserilized object..."+object1);
			
			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("employee id = " + object1.getId());
			System.out.println("employee name = " + object1.getName());
			System.out.println("employee address = " + object1.getAddres());
			System.out.println("employee secureID = " + object1.getSecureID());
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
}
