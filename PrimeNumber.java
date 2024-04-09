import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if (prime(num)) {
            System.out.println(num + " is prime number.");
        } else {
            System.out.println(num + " is not prime number.");
        }

        sc.close();
    }

    static boolean prime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
