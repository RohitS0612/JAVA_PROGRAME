import java.util.Scanner;
public class RevrseArray {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int []a=new int [5];
	System.out.println("Enter the array element ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	}
	int mid=a.length/2;
	int end=a.length-1;
	
	for(int i=0;i<mid;i++)
	{
	
		  int temp=a[i];
          a[i]=a[end];
          a[end]=temp;
          end--;
	}
	
	System.out.println("The After Rverse the array :");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
		sc.close();
}
}
