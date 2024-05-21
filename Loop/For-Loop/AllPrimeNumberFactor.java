import java.util.Scanner;

public class AllPrimeNumberFactor{
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        boolean flag;
        for(int i=2; i<=range; i++){
            if(range%2 == 0){
                flag = true;
                for(int j=2; j<=i/2; j++){
                    if(i%j == 0){
                        flag = false;
                        break;
                    }
                }

                if(flag == true){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}