package generalalgo;

public class InversionCount {
public static void main(String[] args) {
	int arr[]= {1,20,50,3,4,7,6};
	int count=1;
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(arr[j]>arr[i]) {
				count++;
			}
		}
		
	}
	//7+1+0+3+2+0+0
	System.out.println(count);
 	
}
}
