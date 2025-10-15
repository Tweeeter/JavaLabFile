//Q6 rite a program in java which enter the number using Data Input Stream and check whether the
//entered number is even or odd.
import java.io.DataInputStream;
import java.io.IOException;
public class EvenOddChecker {
    public static void main(String[] args) throws IOException {
        // Create DataInputStream object
        DataInputStream dis = new DataInputStream(System.in);

        System.out.print("Enter a number: ");
        
        // Read the input as a string and convert to integer
        String input = dis.readLine();
        int number = Integer.parseInt(input);
        
        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}