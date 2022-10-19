import java.util.Arrays;
import java.util.List;

public class StreamApi {
public static void main(String[] args) {
	Integer arr[]= {1,2,3,4,9,8,66,55,45,49};
	
	// 1,2,3,4,8,9,45,49,55,66
	List<Integer> list=Arrays.asList(arr);
	  list.stream().sorted().limit(3).forEach(x->{
		  System.out.println(x);
	  });
	  
	  int arr1[]= {1,2,3,4,9,8,66,55,45,49};
	  Arrays.sort(arr1);
	  int x=arr1.length;
	  System.out.println("first number "+arr1[x-1]);  
}
}
