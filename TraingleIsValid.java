
// Write a C program to check whether a triangle is valid or not if angles are
// given using if else. How to check whether a triangle can be formed or not, if its
// angles are given using if else in C programming. Logic to check triangle
// validity if angles are given in C program.

import java.util.Scanner;

public class TraingleIsValid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c  =in.nextInt();

        int temp = a + b + c;
        if(temp == 180){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("not valid Triangle");
        }
        in.close();
    }
}
