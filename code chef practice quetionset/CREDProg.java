/*Crredit card score  validation check*/

import java.util.Scanner;

public class CREDProg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 750) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}