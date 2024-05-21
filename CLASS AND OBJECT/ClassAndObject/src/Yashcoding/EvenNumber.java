package Yashcoding;

import java.util.Arrays;

/*Q8.  Write program to create class name as FindEvenNo with three functions 
void setArray(int a[]): this function can accept array as parameter
 void  minArray(): this function can perform display min no from  array 
void  maxArray(): this function can perform display max no from  array 
*/
public class EvenNumber {
	int a[];

	void setArray(int a[]) {
		this.a = a;
	}

	int[] getEvenNum() {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		int even[] = new int[count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even[j++] = a[i];
			}

		}
		return even;
	}

	public static void main(String[] args) {
		int x[] = { 1, 3, 5, 7, 9 };
		EvenNumber even = new EvenNumber();
		even.setArray(x);
		int e[] = even.getEvenNum();
		
		if (e.length != 0) {
			System.out.println(Arrays.toString(e));
		} else {
			System.out.println("No even Numebrs found ");
		}

	}
}