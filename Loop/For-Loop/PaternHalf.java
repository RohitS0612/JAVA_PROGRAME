/* Java program – Half Pyramid Pattern Printing using numbers */

import java.util.*;
public class PaternHalf
{
public static void main(String[] args)
{
int n;
Scanner sc = new Scanner(System.in);
System.out.println("ente the n");
n = sc.nextInt();
int i,j;
for(i = 1; i<= n; i++)
{
for(j = 1; j <= i; j++)
{
System.out.print(j + " ");
}
System.out.println();
}
}
}