import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int[] digitFrequency = new int[10];
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            digitFrequency[digit]++;
            temp /= 10;
        }
        
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i] != 0) {
                System.out.println("Frequency of digit " + i + " is: " + digitFrequency[i]);
            }
        }
    }
}
