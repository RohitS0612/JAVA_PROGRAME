import java.util.Scanner;
public class MerggeTwoArray {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		int []b=new int[5];
		int []c=new int[10];
		int k=0;
		
		System.out.println("Enter the array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the array2 ");
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
		
			c[k]=a[i];

			k++;	
		}
		  for( int i=0;i<5;i++)
		    {
		        c[k]=b[i];
		        k++;
		    }
		  for( int i=0;i<c.length;i++)
		  {
			  
		System.out.println(c[i]);
		  }
		  
	  // Desending oreder 
		  
		  System.out.println("Descending order ");
		  for(int i=0;i<c.length;i++)
		  {
			  for(int j=i+1;j<c.length;j++)
		  {
				  if(c[i]<c[j])
				  {
					  int temp=c[i];
					  c[i]=c[j];
					  c[j]=temp;
				  }
			  }
		  }

		  
		  for(int i=0;i<c.length;i++)
{
			  System.out.println(c[i]);
}
		  sc.close();
	}
}
