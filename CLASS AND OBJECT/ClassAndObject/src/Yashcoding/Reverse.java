package Yashcoding;

import java.util.Arrays;

/*
 * Q6.  Write program to create class name as Reverse with two functions 
void setArray(int a[]): this function can accept array as parameter
 int [] getSortArray(): this function can perform reverse on array and return sorted array
*/
public class Reverse {
	int a[];

	void setArray(int[] a) {
		this.a = a;
	}

	int[] getSortArray() {
		int mid = a.length / 2;
		int end = a.length - 1;

		for (int i = 0; i < mid; i++) {
			int temp = a[i];
			a[i] = a[end];
			a[end] = temp;
			end--;
		}

		return a;
	}

	public static void main(String[] args) {
		int[] x = { 3, 4, 5, 5, 7, 8 };
		Reverse rev = new Reverse();
		rev.setArray(x);
		System.out.println(Arrays.toString(rev.getSortArray()));
	}

}
