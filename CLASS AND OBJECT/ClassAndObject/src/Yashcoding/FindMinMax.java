package Yashcoding;

/*Q8.  Write program to create class name as FindMinMax with three functions 
void setArray(int a[]): this function can accept array as parameter
 void  minArray(): this function can perform display min no from  array 
void  maxArray(): this function can perform display max no from  array 
*/
public class FindMinMax {
	int a[];

	void setArray(int a[]) {
		this.a = a;
	}

	void minArray() {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Min element is : " + min);
	}

	void maxArray() {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Max element is : " + max);
	}

	public static void main(String[] args) {
		int x[] = { 3, 4, 60, 7, 9, 7, 2 };

		FindMinMax find = new FindMinMax();
		find.setArray(x);
		find.minArray();
		find.maxArray();

	}

}
