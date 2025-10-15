//Q12 Program illustrating Method Overloading and Method Overriding.
public class MethodOverloadingAndOverriding {
    public static void main(String[] args) {
        // Method Overloading demonstration
        System.out.println("Method Overloading Demonstration:");
        System.out.println("--------------------------------");
        
        Calculator calc = new Calculator();
        
        // Using different versions of the add method
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + calc.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5: " + calc.add(5.5, 10.5));
        
        System.out.println("\nMethod Overriding Demonstration:");
        System.out.println("--------------------------------");
        
        // Creating parent class object
        Animal animal = new Animal();
        animal.sound();
        
        // Creating child class objects
        Dog dog = new Dog();
        dog.sound();  // Overridden method
        
        Cat cat = new Cat();
        cat.sound();  // Overridden method
    }
}

/**
 * Calculator class demonstrating Method Overloading
 */
class Calculator {
    // Method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method with three int parameters - Overloaded method
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method with two double parameters - Overloaded method
    public double add(double a, double b) {
        return a + b;
    }
}

/**
 * Animal class for Method Overriding demonstration
 */
class Animal {
    // Method that will be overridden by subclasses
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

/**
 * Dog class inheriting Animal class
 */
class Dog extends Animal {
    // Overriding the sound method of Animal class
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

/**
 * Cat class inheriting Animal class
 */
class Cat extends Animal {
    // Overriding the sound method of Animal class
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
}