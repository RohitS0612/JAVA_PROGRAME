package Yashcoding;

import java.util.Arrays;

/*
 * Q7. Write program to create class name as RemoveDuplicate with two functions 
void setArray(int a[]): this function can accept array as parameter
 int [] getSortArray(): this function can perform Remove the duplicate element form array and displary in remening element and return array
*/

import java.util.Scanner;

public class RemoveDuplicate {
	int a[];

	void setArray(int a[]) {
		this.a = a;
	}
	

	int [] getSortArray() {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = Integer.MIN_VALUE;
				}
			}
			if(a[i] != Integer.MIN_VALUE)
				count++;

		}
		int[] c = new int[ count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != Integer.MIN_VALUE) {
				c[j++] = a[i];
			}
		}

		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int size = sc.nextInt();
		int x[] = new int[size];
		System.out.println("Enter the Array Elelment:");
		for (int i = 0; i < size; i++) {
			x[i] = sc.nextInt();
		}
		RemoveDuplicate remove = new RemoveDuplicate();
		remove.setArray(x);
		System.out.println(Arrays.toString(remove.getSortArray()));

		sc.close();
	}

}
