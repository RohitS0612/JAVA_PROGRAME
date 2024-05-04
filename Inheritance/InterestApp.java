import java.util.Scanner;

class Interest {
    protected int p, r, d;

    void setPrd(int p, int r, int d) {
        this.p = p;
        this.r = r;
        this.d = d;
    }

}

class CalculateInterest extends Interest {
    int callInterest() {
        return (p * r * d) / 100;
    }
}

public class InterestApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();

        CalculateInterest ca = new CalculateInterest();
        ca.setPrd(p, r, d);
        System.out.println(ca.callInterest());
        sc.close();
    }
}
