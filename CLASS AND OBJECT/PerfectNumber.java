/*Q6. WAP to create class name as CheckPerfect
void setValue(int no): this function accept number as parameter 
boolean checkPerfect(): this number can check number is perfect or not if perfect return true otherwise false
 */

import java.util.Scanner;

class CheckPerfect {
    int no;

    void setValue(int no) {
        this.no = no;
    }

    boolean checkPerfect() {
        int sum = 0;
        for (int i = 1; i <= no / 2; i++) {
            if (no % i == 0) {
                sum += i;
            }
        }

        if (no == sum) {
            return true;
        } else {
            return false;
        }
    }
}

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CheckPerfect cp = new CheckPerfect();
        cp.setValue(num);
        if (cp.checkPerfect()) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("not an perfect Number");
        }
        sc.close();
    }
}
