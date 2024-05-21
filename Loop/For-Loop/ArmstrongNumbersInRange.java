import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Armstrong numbers between 1 to " + n + ":");

        for (int i = 1; i <= n; ++i) {
            int temp = i;
            int sum = 0;

            int numberOfDigits = String.valueOf(i).length();

            while (temp != 0) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, numberOfDigits);
                temp /= 10;
            }

            if (sum == i)
                System.out.print(i + " ");
        }
    }
}
