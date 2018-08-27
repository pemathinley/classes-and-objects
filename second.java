import java.util.*;
public class second{
 
	public static void main(String[] args) {
 
		int arr[] = new int[5];
		int l= arr[0];
		int sl= arr[0];
		Scanner sc= new Scanner(System.in); 
		
		for (int i = 0; i < 5; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i <5; i++) {
 
			if (arr[i] > l) {
				sl = l;
				l = arr[i];
 
			} else if (arr[i] > sl) {
				sl = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + sl);
 
	}
}