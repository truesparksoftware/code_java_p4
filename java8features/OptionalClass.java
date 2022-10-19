package java8features;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Abc {
	private int id;
	private String name;
	private String loc;
}

public class OptionalClass {
	public static void main(String[] args) {
      Abc abc=null;
		
	}
}
