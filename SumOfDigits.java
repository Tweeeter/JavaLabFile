public class SumOfDigits {
    public static void main(String[] args) {
        // Parse the input number from command line argument
        int number = Integer.parseInt(args[0]);

        int sum = 0;
        // Make a copy of the number and ensure it's positive
        int temp = Math.abs(number);
        
        // Extract each digit and add to sum
        while (temp > 0) {
            sum += temp % 10;  // Add the last digit to sum
            temp /= 10;        // Remove the last digit by integer division
        }

        System.out.println("Sum of digits: " + sum);
    }
}