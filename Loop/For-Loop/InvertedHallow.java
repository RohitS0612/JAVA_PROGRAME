	import java.util.*;
public class InvertedHallow {
	/* Java program print hollow half pyramid pattern using numbers */

	
	
	public static void main(String[] args)
	{
	int n, i, j;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the n");
	n = sc.nextInt();
	for(i = 1; i <= n; i++)
	{
	for(j = i; j <= n; j++)
	{
	if (i == 1 || j == n || j == i)
	System.out.print(j);
	else
	System.out.print(" ");
	}
	System.out.println();
	}
	}
	}

