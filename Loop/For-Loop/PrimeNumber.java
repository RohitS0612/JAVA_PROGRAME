import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i=2; i<=input; i++){
            boolean flag = true;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.print(" "+i);
        }
        sc.close();
    }
}
