import java.util.Scanner;

public class ChepCabService{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a<b){
            System.out.println("The first cab service is Cheaper than the Second cab Service.");
        }
        else if(a>b){
            System.out.println("The Second cab Service is cheaper than first cab.");
        }
        else if (a == b) {
            System.out.println("Both the cab Service have the same price.");
        }
        sc.close();
    }
}