package Yashcoding;

import java.util.Arrays;

/*Q5. Write Program to perform method overriding you have to 
 * create class name as ArrParent with method
 *  void setValue( []): this method can accept array as 
 *  parameter void arrangeSeq(): this method can display array as
 *   per user input sequence You have to create two child class name
 *    as ArrangeAscendingOrder and you have to inherit ArrParent class 
 *    in it and override arrangeSeq() method in ArrangeAscendingOrder
 *     and sort array and display in ascending order and you have 
 *     to create one more class name ReverseArray and override arrangeSeq()
 *  method from ArrParent and reverse array and display it*/

import java.util.Scanner;

class ArrParent {
	public int x[];

	void setValue(int arr[]) {
		x = arr;
	}

	void arrangeSeq() {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
}

class ArrangeAscendingOrder extends ArrParent {

	// sort array and display in ascending
	void arrangeSeq() {
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
	}
}

class ReverseArray extends ArrParent {
	// override arrangeSeq()
	void arrangeSeq() {
		int mid = x.length / 2;
		int end = x.length - 1;

		for (int i = 0; i < mid; i++) {
			int temp = x[i];
			x[i] = x[end];
			x[end] = temp;
			end--;
		}
	}

}

public class Arrsubchild {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int size = sc.nextInt();
		int x[] = new int[size];
		for(int i=0; i<size; i++) {
			x[i] = sc.nextInt();
		}

		ArrParent parent = new ArrParent();
		System.out.print("Array Dispalying : ");
		parent.setValue(x);
		parent.arrangeSeq();

		ArrangeAscendingOrder sort = new ArrangeAscendingOrder();
		sort.setValue(x);
		sort.arrangeSeq();
		System.out.println("\nAscending oreder :" + Arrays.toString(x));

		ReverseArray rev = new ReverseArray();
		rev.setValue(x);
		rev.arrangeSeq();
		System.out.println("Reversed Array : " + Arrays.toString(x));

		sc.close();
	}

}
