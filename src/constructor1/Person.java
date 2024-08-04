package constructor1;
public class Person {
    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Main method to create and display a Person object
    public static void main(String[] args) {
        // Create a Person object using the constructor
        Person person = new Person("Alice", 30);

        // Display the person's details
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

