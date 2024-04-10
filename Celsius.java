import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Farenhiet : ");
        float faren = in.nextFloat();
        System.out.println("In Farenhiet to celsius : "+cel(faren));

        System.out.println("Enter Celsius : ");
        float cel = in.nextFloat();
        System.out.println("In celsius to Fahrenheit : "+faren(cel));
        in.close();
    }

    static float faren(float cel) {
        return (cel*9)/5 + 32;
    }

    static float cel(float far) {
        return (far - 32) * 5 / 9;
    }
}