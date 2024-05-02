import java.util.Scanner;

import javax.sound.sampled.Line;

class Vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'){
            System.out.println(s + "its Vowel");
        } 
        else{
            System.out.println(s+"Not voewel");
        }



    }
}