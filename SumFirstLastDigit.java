//Q5 . Write a program to compute the sum of the first and last digit of a given number.
public class SumFirstLastDigit {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        
        // Convert to positive number if negative
        number = Math.abs(number);
        
        // Extract the last digit
        int lastDigit = number % 10;
        
        // Find the first digit
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        
        // Calculate sum of first and last digit
        int sum = firstDigit + lastDigit;
        
        // Display the result
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
        System.out.println("Sum of first and last digit: " + sum);
    }
}