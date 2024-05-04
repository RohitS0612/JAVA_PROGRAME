/*Write a Java program to input week number(1-7) and print day of week name using switch case. C program to find week day name using switch case. How to find day name of week using switch case in C programming.  */

import java.util.Scanner;

public class NumberOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input week number (1-7):");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Numaber");
                break;
        }
        sc.close();
    }
}
