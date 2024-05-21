import java.util.Scanner;
/**
 * AmstrongNumber
 */
public class AmstrongNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int i=1; i<=range; i++){
            int temp = i;
            double count = 0;
            while(temp!=0){
                int rem = temp % 10;
                temp = temp / 10;
                count++;
                
            }

            temp = i;
            double sum = 0;

            while(temp!=0){
                double rem = temp % 10;
                sum = sum + Math.pow(rem, count);
                temp = temp / 10;
            }

            if(sum == i){
                System.out.print(" "+i);
            }
        }
        sc.close();
    }
}