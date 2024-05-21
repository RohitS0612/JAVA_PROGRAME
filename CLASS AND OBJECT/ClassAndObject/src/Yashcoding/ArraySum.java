package Yashcoding;

/*
*Q4. 3. Write Program create class name as ArrSum with method 
*void setValue(int arr[]) you have to create child class name as GetSum with method int getArrSum() you have to accept array values from ArrSum and calculate its sum and return it
*/

class Sum{
	int[] arr;
	
	void setValue(int[] arr) {
		this.arr = arr;
	}
	
	int ArrSum() {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
}
public class ArraySum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Sum sum = new Sum();
		sum.setValue(arr);
		System.out.println("Sum of Array is : " +sum.ArrSum());
	}

}
