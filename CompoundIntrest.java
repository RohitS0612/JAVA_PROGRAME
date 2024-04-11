
/*Logic
To calculate compound interest we have to use a very simple formula shown below:
Compound interest formula
Where, P = Principle T = Time and R = Rate
To calculate compound interest we have to multiply principle amount with the power of (1 + Rate / 100) with time as an exponent. 
To calculate power we have used pow() method of the class Math.*/

import java.util.*;
import java.lang.Math;
public class CompoundIntrest {
       public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter (priciple , rate, time) :"); 
	int p = in.nextInt();
	float r = in.nextFloat();
	int t = in.nextInt();
	System.out.println("Simple Intrest = "+simpleInt(p, r, t));
	System.out.println("Compound Intrest = "+compoundInt(p, r, t));	
}
static double compoundInt(int p, int r, int t) {
	return p * Math.pow((1+r/100),t);
}

static float simpleInt(int p, int r, int t) {
	return p*r*t/100;
}
}