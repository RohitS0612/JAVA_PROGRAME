import java.util.Scanner;

public class StudentCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number student enrolling
        int m = sc.nextInt(); // maxmimum cpacity
        int k = sc.nextInt(); // alredy enrolled

        int totalStudent = n + k; // addition of enrolling student and already enrolled student
        if (totalStudent > m) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        sc.close();
    }

}