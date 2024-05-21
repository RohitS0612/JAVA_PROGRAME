package Yashcoding;

import java.util.Arrays;

/*
Q2. Write program to create class name as SortArr with two functions 
void setArray( a[]): this function can accept array as parameter
  [] getSortArray(): this function can perform sorting on array and return sorted array
*/

import java.util.Scanner;

class Sort {
	int arr[];

	void setArray(int arr[]) {
		this.arr = arr;
	}

	int[] getSortArray() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}
}

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		Sort sort = new Sort();
		sort.setArray(arr);
		int[] ans = sort.getSortArray();

		System.out.println(Arrays.toString(ans));
		sc.close();

	}

}
