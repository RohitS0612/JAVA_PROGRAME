package Yashcoding;

/*Q1.Write program to create class name as FindMax with two functions
 void setArray( a[]): this function is used for accept array as parameter 

 getMax(): this function can find the max value from array and return it.
*/


class Max{
	int x[];
	void setArray(int a[]) {
		x = a;
	}
	
	int getMAx() {
		int max = x[0];
		for(int i=0; i<x.length; i++) {
			if(x[i]>max)
			{
				max = x[i];
			}
		}
		return max;
	}
}

public class FindMax {

	public static void main(String[] args) {
		int[] arr = {1,3,6,3,5,6};
		
		Max max =new  Max();
		
		max.setArray(arr);
		int ans = max.getMAx();
		System.out.println("Max element in the array is : "+ans);
		
	}

}
