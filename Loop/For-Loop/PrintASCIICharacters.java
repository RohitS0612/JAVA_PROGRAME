public class PrintASCIICharacters {
    public static void main(String[] args) {
        for (int i = 0; i < 128; i++) {
            System.out.println("ASCII value of " + (char) i + " is: " + i);
        }
    }
}
