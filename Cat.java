package myanimals;

public class Cat extends Animal {
    // The Cat class is a subclass of Animal.
    // So it should have all the methods from the Animal class
    // available to it.
    // This is polymorphism -  this word means "many shapes"
    // when use here, by a Cat object, this method that has the same name
    // as the method in the superclass, it takes another shape.

    public void animalSound() {
        System.out.println("\nMeow");
    }


}
