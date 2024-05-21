import java.util.Scanner;
public class Occurenece {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int [5];
		System.out.println("Enter the array element ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc. nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}
			}
		}
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
				
			}
			 else
	            {
	                
	                System.out.println(a[i]+"--->"+count);
	                
	                count=1; 
	            }
		}
		
		
		sc.close();
		
	}

}


