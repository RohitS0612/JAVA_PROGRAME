package Array;

import java.util.*;

public class KThSmallestElement {
	public static void main(String args[]) {
		int arr[] = {7, 10, 4, 3,  20, 15};
		System.out.print("enter index  number : ");
		Scanner sc=new Scanner(System.in); 
		int k = sc.nextInt();
		
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Thhird smallest Number IN array is "+Ksamallest(arr, k));
		
		sc.close();
	}
	
	static int Ksamallest(int[] arr, int k) {
		for(int i=0; i<arr.length; i++)
		{
			if(k == i)
			{
				return arr[i-1];
			}
		}
		
		return -1;
	}
	
	
	static void sort(int[] arr)
	{
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}

