public class Student {
    private static int numOfStudents = 0;

    public Student() {
        numOfStudents++;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }

    String firstName;
    String lastName;
    String major;
    double gpa;
    int age;
    boolean onProbation;


}
