//Q15 Program illustrating use of Final and Super keyword.
public class FinalAndSuper {
    public static void main(String[] args) {
        // Create a child class object
        Child child = new Child();
        
        // Call method to demonstrate super
        child.showValues();
        
        // Display final variable
        System.out.println("Final value: " + Parent.MAX);
    }
}

// Parent class
class Parent {
    // Final variable
    public static final int MAX = 100;
    
    // Parent field and method
    protected int parentValue = 10;
    
    public void show() {
        System.out.println("Parent value: " + parentValue);
    }
    
    // Final method
    public final void finalMethod() {
        System.out.println("This is a final method");
    }
}

// Child class
class Child extends Parent {
    private int childValue = 20;
    
    // Method using super keyword
    public void showValues() {
        super.show();  // Call parent's show method
        System.out.println("Child value: " + childValue);
    }
    
    // Cannot override final methods
    // public void finalMethod() { } // Would cause error
}