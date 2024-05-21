import java.util.Scanner;
public class ArraySum {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int [5];
		int add=0;
		System.out.println("Enter the array element ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			add=add+ a[i];
			
		}
	
			System.out.println(add);
		
		sc.close();
	}

}
