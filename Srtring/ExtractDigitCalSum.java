
import java.util.Scanner;

/*Q2. WAP to create class name as ExtractDigitAndCalSum with two functions 
void setCharArray(char[]): this function accept array as parameter
int getSum(): this function extract digit from character array and calculate sum and return it.

Example: abc123mno456stv
Output: 1+2+3+4+5+6 = 21*/
public class ExtractDigitCalSum {
    char[] s;

    void setCharArray(char[] s) {
        this.s = s;
    }

    int getSum() {
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= '0' && s[i] <= '9') {
                sum += s[i] - '0'; // Convert character to its numeric value
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        char[] s = str.toCharArray();

        ExtractDigitCalSum sum = new ExtractDigitCalSum();
        sum.setCharArray(s);
        System.out.println("Sum is: " + sum.getSum());
    }
}
