import java.util.Scanner;

public class OneToNUseMethod {
     public static void main(String[]args)
     {
    	 natural(); 
     }
     static void natural()
     {
    	Scanner sc=new Scanner(System.in);
    	int n;
    	System.out.println("Enter the number :");
    	n=sc.nextInt();
    	int i=1;
    	while(i<=n) {
    	System.out.println(i);
    	i++;
    		
    	}
    	sc.close();
    	
     }
     

}
