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
			System.out.printf("\nThe roots are %.2f", r1 , " and %.2f" , r2);
		}

		else if (d == 0.0) {
			double r1 = -b / (2.0);
			System.out.printf("\nthe root is %.2f" , r1);
		} else {
			System.out.println("Roots are imaginary.");
		}

		sc.close();
	}
}
