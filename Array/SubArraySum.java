
import java.util.Scanner;
public class SubArraySum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	int f = sc.nextInt();
	int l = sc.nextInt();
	sum(arr, f, l);
	sc.close();
}

static void sum(int[] arr, int f, int l) {
	int add = 0;
//	int sum[] = new int[arr.length];
	for(int i=f-1; i<l; i++) {
		 
			   add +=arr[i];
			   System.out.print(arr[i]);
		 
	}
	
	
	System.out.println("\nAdditio of sub Array : "+ add);
}
}
