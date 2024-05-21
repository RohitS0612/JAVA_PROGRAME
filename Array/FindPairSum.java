import java.util.Scanner;
public class FindPairSum {
	

	
	    public static void main(String[] args) {
	        int[] a = new int[6];
	        int sum = 0, count =0;

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < 6; i++) {
	            a[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < 6; i++) {
	            for (int j = i + 1; j < 6; j++) {
	                sum = a[i] + a[j];
	                if (sum == 15) {
	                    count++;
	                }
	            }
	        }

	        System.out.println(count);
	       scanner.close();
	    }
	}


