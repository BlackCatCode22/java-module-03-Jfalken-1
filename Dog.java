public class Dog {
   // Create two fields for our dog objects.
    private String name;
    private int age;

    // Create getter and setter for the name.
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Create getter and setter for the age.
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    // Create a constructor for the Dog objects that will be created with the "new" keyword.
    // A constructor is a method that is called or invoked when the Dog class is used to create an object.
    public Dog() {
        System.out.println("\nA dog was made with no arguments");
    }

    // Create a constructor that accepts a String data type for the dogs name
    public Dog(String myName) {
        this.name = myName;

    }

    // Create a constructor that accepts an argument when an object is created, this arg will be an int.
    public Dog(int age) {
        this.age = age;
    }

    // Create a constructor that accepts two arguments - a String for the name, and an int for age.
    public Dog(String name, int age) {
        // Assign name and age to the new object.
        this.name = name;
        this.age = age;
    }

}
