/*Dispaly Next Five Charecter */
import java.util.Scanner;
public class DispalyNextFiveChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet:");
        char ch = sc.next().charAt(0);
        displayNextFiveLetter(ch);
        sc.close();
        
    }

    static void displayNextFiveLetter(char ch){
        for(int i = 0; i < 5; i++){
            ch++;
            if(ch > 'z'){
                ch = 'A';
            }
            else if(ch > 'Z' && ch < 'a') {
                ch = 'a';
            }
            System.out.print(ch);
        }
    }
}