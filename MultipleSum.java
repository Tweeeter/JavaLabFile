//Q10 Create a java program that has three version of add method which can add two, three, and four
//integers.
public class MultipleSum {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to add four integers
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    public static void main(String[] args) {
        // Test the add methods
        int sum1 = add(10, 20);
        int sum2 = add(10, 20, 30);
        int sum3 = add(10, 20, 30, 40);
        
        // Display the results
        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
        System.out.println("Sum of four numbers: " + sum3);
    }
}
