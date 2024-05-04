/*
Checking if a given year is leap year or not 
Explanation: 
To check whether a year is leap or not Step 1: 
•	We first divide the year by 4. 
•	If it is not divisible by 4 then it is not a leap year. 
•	If it is divisible by 4 leaving remainder 0  
Step 2: 
•	We divide the year by 100 
•	If it is not divisible by 100 then it is a leap year. 
•	If it is divisible by 100 leaving remainder 0 
Step 3: 
•	We divide the year by 400 
•	If it is not divisible by 400 then it is a leap year. 
•	If it is divisible by 400 leaving remainder 
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year : ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
}
