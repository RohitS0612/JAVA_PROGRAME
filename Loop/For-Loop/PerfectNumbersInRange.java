import java.util.Scanner;

public class PerfectNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Perfect numbers between 1 to " + n + ":");

        for (int i = 1; i <= n; ++i) {
            int sum = 0;

            for (int j = 1; j <= i / 2; ++j) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i)
                System.out.print(i + " ");
        }
    }
}
