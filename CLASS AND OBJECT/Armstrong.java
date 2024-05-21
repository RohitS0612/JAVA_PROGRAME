// Q5. WAP to create class name as CheckArmstrong 
// void setValue(int no): this function accept number as parameter 
// boolean checkArmstrong(): this function check number is Armstrong or not if number is Armstrong return true otherwise return false

import java.util.Scanner;

class CheckArmstrong {
    int no;
    void setValue(int no) {
        this.no = no;
    }

    boolean checkArmstrong(){
        int temp = no;
        int count = 0;
        int rem = 0;
        while (temp!=0) {
            temp /=  10;
            ++count;
        }

        int result= 0;
        temp = no;
        while (temp != 0) {
            rem = temp % 10;
            result += Math.pow(rem, count);
            temp /= 10;
        }

        if(result == no)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int no = sc.nextInt();
        CheckArmstrong ca = new CheckArmstrong();
        ca.setValue(no);
        if(ca.checkArmstrong()){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }

        sc.close();
    }
}