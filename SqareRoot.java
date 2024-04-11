//square root

import java.util.Scanner;

public class SqareRoot {
     public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	int num = sc.nextInt(); 
	System.out.println("Square Root is : "+ squareRoot(num));
	
     }

     static int squareRoot(int x) {
	   return x * x;
     }
}