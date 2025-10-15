//Q13 Program illustrating concept of Interface.
public class InterfaceDemo {
    public static void main(String[] args) {
        // Create objects that implement the Drawable interface
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        
        // Call the draw method on different objects
        System.out.println("Interface Demonstration:");
        circle.draw();
        rectangle.draw();
        
        // Demonstrate Animal interface
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        System.out.println("\nAnimals making sounds:");
        dog.makeSound();
        cat.makeSound();
    }
}

// Interface definition
interface Drawable {
    void draw();  // Abstract method - no implementation
}

// First implementation of the interface
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Second implementation of the interface
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Another interface example
interface Animal {
    void makeSound();
}

// Implementation of Animal interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof");
    }
}

// Another implementation of Animal interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow");
    }
}