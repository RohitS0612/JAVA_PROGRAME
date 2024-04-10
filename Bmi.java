import java.util.Scanner;

public class Bmi{

   public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	float weigth = sc.nextFloat();
	float heigth = sc.nextFloat();
	double BMI = (100 * 100 *weigth) /( heigth * heigth);
	
	if(BMI < 18.5) {
		System.out.println(BMI + " = Under Weigth");
	}
	else if(BMI > 18.5 || BMI < 25) {
		System.out.println(BMI + " = Normal Weigth");
	}
	else if(BMI > 25 || BMI < 30) {
		System.out.println(BMI + " = Over Weigth");
	}
	else if(BMI > 30) {
		System.out.println(BMI + " = Obesity");
	}
}
}