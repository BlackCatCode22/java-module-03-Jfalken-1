
public class MainClassPractice {
    public static void main(String[] args) {

        // Create a dog with no args
        Dog dog = new Dog();

        // Create a Dog with an int age
        Dog dog1 = new Dog(5);

        // Create a Dog with a String name
        Dog dog2 = new Dog("Bill");

        // Create a dog with both a name and an age.
        Dog dog3 = new Dog("Bob", 10);


        // Output the dogs name.
        System.out.println("\nThe name of this dog is " + dog2.getName());

        // Output the dogs age.
        System.out.println("\nThe age of this dog is " + dog1.getAge());

        // Output the name and age of the dog.
        System.out.println("\nThis dog's name is " + dog3.getName() + ". He is " + dog3.getAge());

        // Give our dog a birthday (add a year to its age)
        dog3.setAge(dog3.getAge() + 1);

        System.out.println("\n" + dog3.getName() + " just had a birthday, he is now " + dog3.getAge());
    }
}