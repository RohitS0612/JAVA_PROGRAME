package Yashcoding;

/*Q10. Write program to create class name as occurrence with two functions 
void setArray(int a[]): this function can accept array as parameter
void getoccurrence (): this function show occurrence of every element form array
*/
import java.util.Scanner;

public class Occurence {
	int a[];

	void setArray(int a[]) {
		this.a = a;
	}

	void getoccurrence() {
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = Integer.MIN_VALUE;
				}
			}
			if (a[i] != Integer.MIN_VALUE) {
				System.out.println("[" + a[i] + "]" + "------->" + count);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size = sc.nextInt();
		int[] x = new int[size];
		System.out.println("Enter the Array Elelements : ");
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}

		Occurence obj = new Occurence();
		obj.setArray(x);
		obj.getoccurrence();

		sc.close();

	}

}
