
import java.util.Arrays;

public class ZeroIndex {
	public static void main(String[] args) {
		int arr[] = { 0, -2, 2, 0, 3, 5, 0, -1 };
		zero(arr);
		System.out.print(Arrays.toString(arr));
	}

	static void zero(int[] arr) {
		int last = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[last];
				arr[last] = temp;
				last++;
			}

		}

	}
}
