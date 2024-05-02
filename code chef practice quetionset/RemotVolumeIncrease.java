import java.util.Scanner;

public class RemotVolumeIncrease {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Eneter the curent Volume Value :");
        int x = in.nextInt();
        System.out.print("Enter how many time button pressed in volume : ");
        int y = in.nextInt();

        if (x < y) {
            int res = y - x;
            System.out.println("Chef can press the volume of button " + res + " times to increase the volume from " + x + " to " + y);
        } else {
            int res = y - x;
            System.out.println("Chef can press the volume of button "+res+" time to decrease the volume from " + x + " to "+ y);
        }
        in.close();
    }
}
