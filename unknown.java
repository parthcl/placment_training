// File: Unknown.java

public class Unknown {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student();
        Student student2 = new Student("Alice");

        // Printing student names
        System.out.println(student1.getName());
        System.out.println(student2.getName());
    }
}

class Student {
    private String name;

    // Constructor with no parameters
    public Student() {
        this.name = "Unknown";
    }

    // Constructor with a name parameter
    public Student(String name) {
        this.name = name;
    }

    // Method to get the student's name
    public String getName() {
        return name;
    }
}
