import java.util.Scanner;
/**
 * PerfectNumber
 */
public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int temp = i;
            int sum = 0;
            for(int j=1; j<=temp; j++){
                if(temp%j==0){
                    sum = sum + j;
                }
            }
            if(sum  == i){
                System.out.print(" "+i);
            }
        }
        sc.close();
    }
}