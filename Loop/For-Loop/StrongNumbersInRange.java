import java.util.Scanner;

public class StrongNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Strong numbers between 1 to " + n + ":");

        for (int i = 1; i <= n; ++i) {
            int originalNumber = i;
            int sum = 0;

            while (originalNumber != 0) {
                int factorial = 1;
                int remainder = originalNumber % 10;

                for (int j = 1; j <= remainder; ++j) {
                    factorial *= j;
                }

                sum += factorial;
                originalNumber /= 10;
            }

            if (sum == i)
                System.out.print(i + " ");
        }
    }
}
