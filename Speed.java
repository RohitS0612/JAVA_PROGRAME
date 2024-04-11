/*calculate speed  and distance time .
   Formula =  {   speed = Distance /Time }
*/

import java.util.Scanner;

public class Speed {
        public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Distance = ");
	float distance = in.nextFloat();
	System.out.print("Time = ");
	float time = in.nextFloat();
	System.out.println("Speed = "+speed(distance, time));	
  }

static double speed(float distance, float time) {
	return (distance / time);
}
}
