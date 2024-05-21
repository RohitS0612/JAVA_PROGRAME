import java.util.Scanner;

public class StrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            int factorial = 1;
            remainder = originalNumber % 10;

            for (int i = 1; i <= remainder; ++i) {
                factorial *= i;
            }

            result += factorial;
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is a strong number.");
        else
            System.out.println(number + " is not a strong number.");
    }
}
