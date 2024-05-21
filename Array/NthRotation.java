import java.util.Arrays;
import java.util.Scanner;

/**
 * NthRotation
 */
public class NthRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the index");
        int index = sc.nextInt();

        rotation(arr,  index);
        sc.close();
    }

    static void rotation(int[] arr,  int index){
        int temp[] = new int[arr.length];
        int k=0;
        for(int i=index; i<arr.length; i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i=0; i<index; i++){
            temp[k]=arr[i];
            k++;
        }

        System.out.println(Arrays.toString(temp));
    }
}