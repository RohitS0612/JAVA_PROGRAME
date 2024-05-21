import java.util.Scanner;
public class SrearchDigit {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter th number :");
		int number=sc.nextInt();
		System.out.println("Enter the Srarch digit ");
		int sdigit=sc.nextInt();
		int rem=0;
		for(int i=0;i<=number;i++)
		{
			 rem=number%10;
			number=number/10;
			
		}
		 if(rem==sdigit)
		 {
			 System.out.println("the digit is found");
		 }
		 else {
			 System.out.println("the  digit is not found ");
			 }
		
	}

}
