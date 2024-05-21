
public class MajorityElement {
	
	    public static void main(String[] args) {
	        int[] array = {3, 3, 4, 2, 4, 4, 2, 4, 4}; // Sample array

	        int majorityElement = findMajorityElement(array);

	        if (majorityElement != -1) {
	            System.out.println("The majority element is: " + majorityElement);
	        } else {
	            System.out.println("There is no majority element in the array.");
	        }
	    }

	    public static int findMajorityElement(int[] array) {
	        int candidate = -1;
	        int count = 0;

	        // Find a candidate for the majority element
	        for (int i = 0; i < array.length; i++) {
	            if (count == 0) {
	                candidate = array[i];
	                count = 1;
	            } else if (candidate == array[i]) {
	                count++;
	            } else {
	                count--;
	            }
	        }

	        // Verify if the candidate is the majority element
	        count = 0;
	        for (int value : array) {
	            if (value == candidate) {
	                count++;
	            }
	        }

	        if (count > array.length / 2) {
	            return candidate;
	        } else {
	            return -1; // No majority element found
	        }
	    }
	}


