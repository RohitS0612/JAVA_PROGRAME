/*
Q2. WAP to create class name as Factorial with two functions 
void setNumber(int no): this function accept number as parameter 
int getFactorial(): this function can calculate factorial of number and return it.
*/
import java.util.Scanner;
class Factorial {
       int no;
       void setNumber(int no) {
	this.no = no;
        }
        
        int getFactorial() {
	int f = 1;
	for(int i=1; i<=no; i++) {
	      f = f * i;
	}
	return f;
        }
}

class FactorialApplication {
         public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	Factorial f = new Factorial();
	f.setNumber(no);
	System.out.println(f.getFactorial());	
	sc.close();
         }
}