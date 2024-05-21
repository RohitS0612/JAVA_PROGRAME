package Yashcoding;

import java.util.Arrays;

/*
 Q3.  Write program to create class name as MergeTwoArray with two function 
Void MergeTwoArray(int [],int []): this function accept two array as parameter
 int [] getMergeArray(): this function merge two array in third array and return new merged array
*/
class Merge{
	int a[];
	int b[];
	
	void MergeTwoArray(int[] a, int[] b) {
		this.a = a;
		this.b = b;
	}
	
	int[] getMergeArray() {
		int c[] = new int [a.length + b.length];
		
		for(int i=0; i<a.length; i++) {
			c[i]=a[i];
		}
		
		int j=0;
		for(int i=a.length; i<c.length; i++) {
			c[i] = b[j++];
		}
		
		return c;
	}
}

public class MergeTwoArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,1,22,9,10};
		
		Merge merge =new  Merge();
		
		merge.MergeTwoArray(a, b);
		int c[] = merge.getMergeArray();
		
		System.out.println(Arrays.toString(c));
		

	}

}
