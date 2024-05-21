import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
    }
}
