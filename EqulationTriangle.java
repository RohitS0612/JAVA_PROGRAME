// Write a C program to input sides of a triangle and check whether a triangle is
// equilateral, scalene or isosceles triangle using if else. How to check whether a
// triangle is equilateral, scalene or isosceles triangle in C programming. Logic to
// classify triangles as equilateral, scalene or isosceles triangle if sides are given
// in C program.



import java.util.Scanner;

public class EqulationTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && a == c ){
            System.out.println(" Equilateral triangle");
        }
        else if(a == b || a == c){
            System.out.println(" scalene");
        }
        else{
            System.out.println("isosceles");
        }


        sc.close();
    }
}
