import java.util.Scanner;

public class ManipulateGuard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if( x < y){
            System.out.println("No");
        }
        else if( x == y){
            System.out.println("Yes");
        }
        else{
            System.out.println("Yes");
        }
        sc.close();
    }
}