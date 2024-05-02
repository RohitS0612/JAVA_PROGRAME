import java.util.Scanner;

public class ThirdValueTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 180 - (a+b);
        System.out.println(c);
        sc.close();
    }
}
