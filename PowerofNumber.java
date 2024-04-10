import java.util.Scanner;
import java.lang.Math;
public class PowerofNumber {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int base = sc.nextInt();
    int index = sc.nextInt();
    //calling function
    System.out.println("whithout inbuilt function : "+power(base, index));

    //here we used Math.pow() function 
    System.out.println("with inbuitl function : "+Math.pow(base, index));
    sc.close();
    }


    //creating power function
    static int  power(int base, int index) {
        int result = 1;
        for(int i=0; i<index; i++) {
            result *= base;  
        }
        return result;
    }
}