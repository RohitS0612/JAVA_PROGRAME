import java.util.Scanner;
public class InsertValueAtPostion {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int [6];
	
		System.out.println("Enter the array element ");
		for(int i=0;i<(a.length)-1;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		
		System.out.println("Enter the array index and value ");
		int index=sc.nextInt();
		int value =sc.nextInt();
		
		for(int i=(a.length)-2;i>=index;i--)
		{
			a[i+1]=a[i];
			
		}
		a[index]=value;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		sc.close();
	}

}
