/*Write a C program to input week number(1-7) and print day of week name using switch case. C program to find week day name using switch case. How to find day name of week using switch case in C programming.  */

import java.util.Scanner;

public class Wheels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter toatal Vehicales : ");
        int vehicle = sc.nextInt();
        System.out.print("Enter Wheels : ");
        int Wheels = sc.nextInt();

        if (Wheels > vehicle && Wheels % 2 == 0 && Wheels >= 2) {
            int two = vehicle * 2;
            int four = Wheels - two;

            four = four / 2;
            two = vehicle - four;

            System.out.println("Two Whelers = " + two);
            System.out.println("Four Wheels = " + four);
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}