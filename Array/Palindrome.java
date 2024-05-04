import java.util.Arrays;
import java.util.Scanner;
public class Palindrome{
    public static void main(String[] arrgs){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Eneter the Array elements : ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        palindrome(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void palindrome(int[] arr){
        // int size = arr.length;
        // int b[] = new int[size];

        int b[] = new int[arr.length];

        for(int i=0; i<b.length; i++){
            b[i] = arr[i];
        }
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == b[i]){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrom");
        }
    }
}