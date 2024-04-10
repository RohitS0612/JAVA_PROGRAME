import java.util.Scanner;


public class Phonebill {
  public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int call = sc.nextInt();
	double total = 0;
	
	if(call > 0 && call <= 100) {
		total += 200;
	}
	else if(call >100 && call <= 150) {
		total += (call -100)*0.60;
	}
	else if(call > 150 && call <= 200) {
		total += ( call -100 ) * 0.60 + ( call - 150 ) * 0.50;
	}
	else if(call > 200 && call <= 250) {
		total += ( call - 100 ) * 0.60 + ( call - 150 ) * 0.60 +  ( call - 200 ) *0.40 ;
	}
	else  {
		total +=( (call - 100) * 0.50)  + ((call - 150) * 0.60)  +  ((call - 200) *0.40)  + ((call - 250)*0.35); 
	}

	System.out.println("Total is : "+total+"rs");	

}
}