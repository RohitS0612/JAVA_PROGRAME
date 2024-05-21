import java.util.Scanner;
public class EvenOrOddElement {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new  int [5];
		System.out.println("Enter the array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Even number :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				
			}
			
		}
		System.out.println("Odd number :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]);
			}
		}
		sc.close();
	}

}
