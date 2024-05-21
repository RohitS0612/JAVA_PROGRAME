import java.util.Scanner;

public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int numDigits = (int) Math.log10(number) + 1;
        int firstDigit = number / (int) Math.pow(10, numDigits - 1);
        int lastDigit = number % 10;
        
        int swappedNumber = lastDigit * (int) Math.pow(10, numDigits - 1);
        swappedNumber += (number % (int) Math.pow(10, numDigits - 1)) / 10;
        swappedNumber += firstDigit;
        
        System.out.println("Number after swapping first and last digits: " + swappedNumber);
    }
}
