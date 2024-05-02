import java.util.Scanner;

public class PoojaATM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float y = sc.nextFloat();
        if(x%5==0 && x < y){
            System.out.println("Transaction Successfull");
            System.out.println("Total Balance :"+((y-x)-0.50));
        }
        else if(x>y){
            System.out.println("Insufficient Funds");
            System.out.println("Total Balance : "+y);
        }
        else{
            System.out.println("Incorrect Withdrwal Amount (not multiple by 5 ):");
            System.out.println("Total Balance : "+y);
        }

        sc.close();
    }
}