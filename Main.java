// JF 9/12/24
// Main.java


import myanimals.Cat;
import myanimals.Dog;
import mystudent.Student;
import mystudent.App;
import myanimals.Animal;


public class Main {
    public static void main(String[] args) {

        // Output num of animals
        System.out.println("\n\nthe number of animals is: " + Animal.numOfAnimals);

//        System.out.println("Hello from main class");

        // Create a student object
        Student student = new Student();
        // Call a method that belongs to the student object.
        student.sayHi();
        // Create an object from a runnable class.
        App app = new App();

        // Use a method from the student class.
        // I know that I have a static method in the Student class.
        // And I know how to class a static class method.
        Student.sayHello();

        Cat cat = new Cat();
        // Use a method that is available to the cat class object named cat
        cat.animalSound();
        System.out.println(" this sound is coming from the Cat object named cat");


        // Create a dog object
        Dog dog = new Dog();
        dog.animalSound();

        System.out.println(" this sound is coming from the Dog object named dog");

        // Output num of animals
        System.out.println("\n\nthe number of animals is: " + Animal.numOfAnimals);




    }
}