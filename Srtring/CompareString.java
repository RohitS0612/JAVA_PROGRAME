package prgrams;

/*Q1 . WAP to create class name as CompareString with two functions 
void setCharArray(char[],char[]): this function can accept two parameter of type string 
boolean compare(): this function can compare both string and return true if string are equal otherwise return false 
Note: do not use any inbuilt function of string comparison logics */

import java.util.Scanner;

public class CompareString {

	char a[], b[];

	void setCharArray(char a[], char b[]) {
		this.a = a;
		this.b = b;
	}

	boolean compare() {
		
		if(a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.print("Enter the size of First String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] str = s.toCharArray();
	
		System.out.print("Enter the size of Second String : ");
		String s2 = sc.nextLine();
		char[] str2 = s2.toCharArray();
		
		CompareString compare = new CompareString();
		compare.setCharArray(str, str2);
		System.out.println(compare.compare());
		sc.close();
	}

}
