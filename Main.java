import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my Zoo Program");

        // Create an Animal object.

//        Animal myAnimalObject = new Animal();
//        myAnimalObject.setAge(5);


        // ------------------------------------------//
        // Open the arriving animals file

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\BE218\\Downloads\\arrivingAnimals.txt"));
            String myLine;


            // read file one line at a time
            while ((myLine = bufferedReader.readLine()) != null) {
                System.out.println(myLine);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // ------------------------------------------//
        // Create a Hyena objet

        Hyena hyena1 = new Hyena();
        Hyena hyena2 = new Hyena();
        Hyena hyena3 = new Hyena();

        hyena1.setAge(7);


        // ------------------------------------------//
        // Output the age of the Hyena

        System.out.println("\nThe age of the Hyena is: " + hyena1.getAge() + " years old");


        // ------------------------------------------//
        // Create a Lion object

        Lion lion1 = new Lion();
        lion1.setAge(12);


        // ------------------------------------------//
        // Output the lion's age

        System.out.println("\nThe age of the lion is " + lion1.getAge() + " years old");


        // ------------------------------------------//
        // Get number of Hyenas

        System.out.println("\nThere are " + Hyena.getNumOfHyenas() + " hyenas");


        // ------------------------------------------//
        // Get number of Lions

        System.out.println("\nThere are: " + Lion.getNumOfLions() + " lions");



        // ------------------------------------------//
        // Get number of Animals

        System.out.println("\nThere are " + Animal.getNumOfAnimals() + " animals");





    }
}