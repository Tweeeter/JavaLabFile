//Q3 Write a program to swap the value of 2 variables without using 3rd variable
public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        
        a = a + b; 
        b = a - b; 
        a = a - b; 
        
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}