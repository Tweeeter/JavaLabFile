public class ArraySumAverage {
    public static void main(String[] args) {
        // Create an array of size 5
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Calculate sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Calculate average
        double average = (double) sum / numbers.length;
        
        // Display the array elements
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        // Display sum and average
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
    }
}