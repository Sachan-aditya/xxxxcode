// Base class
class Person {
    String name;
    int age;

    // Base class constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method in the base class
    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

// Derived class
class Student extends Person {
    int grade;

    // Derived class constructor
    Student(String name, int age, int grade) {
        super(name, age); // Calls the constructor of the base class (Person)
        this.grade = grade; // Refers to the current object's grade attribute
    }

    // Method in the derived class
    void displayInfo() {
        super.displayInfo(); // Calls the displayInfo method of the base class
        System.out.println("Grade: " + this.grade);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Create an object of the derived class
        Student student = new Student("Alice", 20, 12);

        // Call the method of the derived class
        student.displayInfo();
    }
}
// THIS ()- CALLED WITHIN CLASS 
// SUPER()- CALLS FOR BASE CLASS // GO TO BASE CLASS FIRST 
//EACH CONSTRUCTOR HAS SUPER() KEYWORD BY DEFAULT