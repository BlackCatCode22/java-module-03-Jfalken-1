package mystudent;

public class Student {
    public static void sayHello() {
        System.out.println("\nHello from student class. I am a static method and I belong to the Student class\n");
    }

    public void sayHi() {
        System.out.println("\nHi. I must be from an object because I am not static\n");
    }

}
