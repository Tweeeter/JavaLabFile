import java.io.DataInputStream;
import java.io.IOException;

public class PalindromeChecker {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        
        System.out.print("Enter a string: ");
        String input = dis.readLine();
        
        String processed = input.toLowerCase();
        StringBuilder reversed = new StringBuilder(processed).reverse();
        
        if (processed.equals(reversed.toString())) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}