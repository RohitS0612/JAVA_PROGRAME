import java.util.Scanner;
public class MissingElementInArray {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int []a=new int[5];
	System.out.println("ENter the array Element ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	}
	System.out.println("The assecnding oreder ");
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
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
		
	}
	System.out.println("the missing values in array ");
//	diif
	for(int i=0;i<a.length;i++) {
		int diff=a[i+1]-a[i];
		if(diff>1)
		{
			for(int j=a[i];j<(a[i+1]-1);)
			{
				System.out.println(j+" " );
				++j;
			}
				
		}
	}
	sc.close();
}
}
