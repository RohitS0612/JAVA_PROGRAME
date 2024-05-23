
import java.util.Scanner;

class Convert {
	char[] s;

	void setValue(char[] x) {
		s = x;
	}

	void toConvert() {
		for (int i = 0; i <= s.length-1; i++) {
			if (s[i] >= 'a' && s[i] <= 'z') {
			  s[i] = (char) (s[i] - 32);
			  System.out.println(s[i]);
			  break;
			}
		}
	}
}

public class UpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = new char[1];
		a[0] = sc.nextLine().charAt(0);
		Convert upper = new Convert();
		upper.setValue(a);
		System.out.println("Converted into upper case : " );
		upper.toConvert();
		sc.close();
	}

}
