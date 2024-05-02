import java.util.Scanner;

public class IQLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        int Chef = level + 7;
        int Einstein = 170;
        if (Chef >= Einstein) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}