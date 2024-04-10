import java.util.Scanner;
import java.lang.Math;

public class Quadraticroot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b, c values : ");

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double d = (b * b - 4.0 * a * c);

		if (d > 0.0) {
			double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		}

		else if (d == 0.0) {
			double r1 = -b / (2.0);
			System.out.println("the root is " + r1);
		} else {
			System.out.println("Roots are imaginary.");
		}

		sc.close();
	}
}
