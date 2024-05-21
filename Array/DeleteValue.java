import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        boolean flag = false;

        System.out.println("Enter the values of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Display the array values:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i] + " ");
        }

        System.out.println("\nEnter the value you want to delete:");
        int del = scanner.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == del) {
                flag = true;
                // Shift elements to the left
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                break; // Exit the loop after deletion
            }
        }

        if (flag) {
            System.out.println("\nValue deleted successfully.");
        } else {
            System.out.println("\nValue not found.");
        }

        System.out.println("\nThe value after deletion:");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("a[" + i + "] ---> " + a[i]); // i for index
        }
        scanner.close();
    }
}

