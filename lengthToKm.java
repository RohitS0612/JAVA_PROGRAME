import java.util.Scanner;

public class lengthToKm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a length in cm : ");
        int length = in.nextInt();
        convertKM(length);
        convertME(length);

        in.close();
    }

    static void convertKM(int length) {
        int km = length / 1000;
        System.out.println("In Kilo Meter Is : " + km);
    }

    static void convertME(int length) {
        int me = length / 100;
        System.out.println("In meter is : " + me);
    }
}
