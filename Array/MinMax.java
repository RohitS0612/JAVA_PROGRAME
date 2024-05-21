import java.util.Scanner;
public class MinMax {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		System.out.println("ENter the array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			 if(a[i]>max)
			 {
				 max=a[i];
			 }
		}
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				
			{
				min=a[i];
			}
		}
		
		System.out.println("the maximum number in array is "+max);
		System.out.println("the mainimum number in array is "+min);
		sc.close();
	}

}
