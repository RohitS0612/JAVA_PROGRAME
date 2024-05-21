import java.util.Scanner;
public class NaturalRev {
	public static void main(String[]args) {
		naturalrev();
		
	}
	
	static void naturalrev() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		int i=n;
		while(i>=n) {
			System.out.println(i);
			i--;
		}
		
		sc.close();
	}

}
