import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Enter elemnets in array : ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        palin(arr);

        
    }

    static void palin(int[] arr){
        int temp[] = new int[arr.length];
        for(int i=0; i<temp.length; i++){
            temp[i]=arr[i];
        }

        int mid = arr.length/2;
        int end = arr.length-1;

        for(int i=0; i<mid; i++){
            int t = temp[i];
            temp[i] = temp[end];
            temp[end] = t;
            end--;
        }
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == temp[i]){
                flag = true;
            }
        }

        if(flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }

    }
}