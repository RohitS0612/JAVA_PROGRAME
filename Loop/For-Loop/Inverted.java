import java.util.*;
public class Inverted {
	/* Java program – Pyramid Pattern Printing using numbers */

	
	
	
	public static void main(String[] args)
	{
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the n");
	n = sc.nextInt();
	int i,j;
	for(i = 1; i<= n; i++)
	{
	for(j = i; j <= n; j++)
	{
	System.out.print(j + " ");
	}
	System.out.println();
	}
	}
	}

