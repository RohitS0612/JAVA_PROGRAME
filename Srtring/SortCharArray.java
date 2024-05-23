
/*Q3. WAP to create class name as SortCharArray with functions 
void setCharArray(char[]): this function can accept character array and perform sorting
void sort(): this function can sort character array.

Example: bac
Output: abc
*/

import java.util.Scanner;
public class SortCharArray {
	
	char s[];
	void setCharArray(char[] s) {
		this.s = s;
	}
	
	void sort() {
		for(int i=0; i<s.length; i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i] > s[j]) {
					char temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		char[] s = str.toCharArray();
		
		SortCharArray sort = new SortCharArray();
		sort.setCharArray(s);
		sort.sort();
		
		System.out.print(s);

	}

}
