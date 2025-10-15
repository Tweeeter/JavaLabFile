// Q11 Program illustrating Classes and Objects.
public class ClassesAndObjects {
    // Main class to demonstrate the program
    public static void main(String[] args) {
        // Create objects of the Student class
        Student student1 = new Student("John Doe", 101, 85.5);
        Student student2 = new Student("Jane Smith", 102, 92.0);
        
        // Display student information
        System.out.println("Student Information:");
        System.out.println("--------------------");
        
        // Display first student
        System.out.println("Student 1:");
        student1.displayInfo();
        
        System.out.println();
        
        // Display second student
        System.out.println("Student 2:");
        student2.displayInfo();
        
        // Demonstrate changing object state
        System.out.println("\nUpdating Student 1's marks...");
        student1.updateMarks(88.5);
        
        System.out.println("\nAfter update:");
        System.out.println("Student 1:");
        student1.displayInfo();
        
        // Get total number of students
        System.out.println("\nTotal number of students: " + Student.getStudentCount());
    }
}

//Student class representing a student entity

class Student {
    // Instance variables (object attributes)
    private String name;
    private int rollNumber;
    private double marks;
    
    // Static variable (class attribute)
    private static int studentCount = 0;
    
    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        studentCount++;  // Increment student count when object is created
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        
        // Calculate and display grade
        String grade = calculateGrade();
        System.out.println("Grade: " + grade);
    }
    
    // Method to update marks
    public void updateMarks(double newMarks) {
        marks = newMarks;
    }
    
    // Method to calculate grade
    private String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    // Static method to get student count
    public static int getStudentCount() {
        return studentCount;
    }
}