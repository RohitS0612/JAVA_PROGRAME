import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        fibo(num);
        sc.close();
    }

    static void fibo(int n) {
        int n1 = 0;
        int n2 = 1;

        System.out.print(n1 + " " + n2);
        for (int i = 2; i < n; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
