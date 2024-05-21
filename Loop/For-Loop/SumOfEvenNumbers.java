import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        int i = 2;
        while (i <= n) {
            sum += i;
            i += 2;
        }
        
        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
    }
}
