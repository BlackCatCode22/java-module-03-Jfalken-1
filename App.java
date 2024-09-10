import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.firstName = "Jacob";
        myStudent.lastName = "Falken";
        myStudent.major = "Computer Information Tech";
        myStudent.gpa = 3.0;
        myStudent.age = 25;
        myStudent.onProbation = false;

        // Output Student fields
//        System.out.println("\nStudent first name is: " + myStudent.firstName + "\n");

        // Create two more students

        Student myStudent2 = new Student();
        Student myStudent3 = new Student();

        myStudent2.firstName = "Ben";
        myStudent2.lastName = "Bennington";
        myStudent2.major = "History";
        myStudent2.gpa = 2.1;
        myStudent2.age = 30;
        myStudent2.onProbation = false;

        myStudent3.firstName = "Mark";
        myStudent3.lastName = "Markington";
        myStudent3.major = "Art";
        myStudent3.gpa = 3.9;
        myStudent3.age = 41;
        myStudent3.onProbation = false;

        // Create a phone object
        Phone myPhone = new Phone();
        myPhone.model = "Pixel 8";
        myPhone.numOfCameras = 3;

        Cat catJames = new Cat();
//        catJames.meow();
        catJames.name = "James";
        catJames.age = 2;


        // Create Fighto dog
        Dog Fighto = new Dog();
        Fighto.age = 5;
        Fighto.name = "Fighto";
        Fighto.breed = "Corgi";

        System.out.println(Fighto.name + " will now bark... ");
        Fighto.bark();

        System.out.println("\n\n" + Fighto.name + " will now wag tail...");
        Fighto.wagTail();

        ArrayList<Student> myStudentList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Student myNewStudent = new Student();
            myNewStudent.firstName = "Student #" + Integer.toString(i);
            myNewStudent.age = 99;
            myStudentList.add(myNewStudent);
        }


//        System.out.println("\n\n" + Student.getNumOfStudents() + " Student objects have been created.");

//        String myObjectName = "";
//        for (int i = 0; i < 100; i++) {
//            // Create 100 new Student objects
//            // Create names for my objects
//            myObjectName = "StudentNumber" + Integer.toString(i);
//            //Create Student objects
//            Student studentNum = new Student();
        }
    }
