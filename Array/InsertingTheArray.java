
import java.util.*;

public class InsertingTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Enetr the elements in the array :");
        for (int i = 0; i < (arr.length - 1); i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Array Inserting : ");
        for (int i = 0; i < (arr.length - 1); i++) {
            System.out.print(" " + arr[i]);
        }

        System.out.println("After Array Inserting : ");
        arrayInsert(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        sc.close();
    }

    static void arrayInsert(int arr[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Eneter the Index Value");
        int index = in.nextInt();
        System.out.println("Enter the Value : ");
        int value = in.nextInt();

        for (int i = (arr.length - 2); i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index]=value;
        in.close();
    }
}