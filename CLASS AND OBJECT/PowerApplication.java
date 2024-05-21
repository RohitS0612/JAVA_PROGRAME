/*
Q1. WAP to create class name as Power with two functions 
void setValue(int base,int index): this function accept two values as parameter 
int getPower(): this function is used for calculate the power and return it.

*/
import java.util.Scanner;

class Power {
	int base, index;
	void setValue(int base, int index) {
		this.base  = base;
		this.index = index;	
	}
	int getPower() {
		int p = 1;
		for(int i=1; i<=index; i++) {
		    p  = p * base;
		}
		return p;
	}
}

class PowerApplication {
        public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int index = sc.nextInt();
	int base = sc.nextInt();
	Power p = new Power();
	p.setValue(base, index);
	System.out.println(p.getPower());
	sc.close();
        }

}