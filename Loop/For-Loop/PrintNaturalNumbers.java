
import java.util.Scanner;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int i = 1;
        System.out.println("Natural numbers from 1 to " + n + ":");
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        scanner.close();
    }
}
