/*
Q4. WAP to create class name as CheckPrime two functions 
void setNumber(int no): this function is used for accept number as parameter
boolean checkPrime(): this function is check number is prime or not if number is prime return true otherwise return false.
*/

import java.util.Scanner; 

class CheckPrime {
         int no;
         void setNumber(int no) {
	this.no = no;
         }

         boolean checkPrime() {
	if(no<=1){
	   return false;
	}
	for(int i=2; i<=no/2; i++) {
	     if(no%i == 0) { 
	          return false;
	     }
	}
	return true;
         }
}


class Prime {
       public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();

	CheckPrime p = new CheckPrime();
	p.setNumber(num);
	if(p.checkPrime()) {
	   System.out.println("Prime Number");
	}
                else{
	    System.out.println("Not prime Number");
	}
       }
}