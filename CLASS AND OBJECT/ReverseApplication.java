/*
Q3. WAP to create class name as Reverse with functions 
void setNum(int no): this function is used for accept number as parameter
int getReverse(): this function is used for reverse the number and return it.
*/
import java.util.Scanner;
class Reverse {
        int n;
        void setNum(int n) {
	this.n = n;
        }

        int getReverse() {
	int temp = 0;
	while(n!=0) {
	       int rem = n % 10;
	       temp = temp * 10 + rem ;
	       n = n / 10;
	}
	return temp;
        }
}

class ReverseApplication {
        public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	Reverse rev = new Reverse();
	rev.setNum(num);
	System.out.println(rev.getReverse());
	sc.close();
        }
}