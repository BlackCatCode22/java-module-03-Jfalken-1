public class Hyena extends Animal {

    // Create a static int to store the number of hyenas
    private static int numOfHyenas = 0;

    // Create a getter to get the private int numOfHyenas
    public static int getNumOfHyenas() {
        return numOfHyenas;
    }

    // Create a constructor to increment the numOfHyenas int whenever a hyena object is made
    public Hyena() {
        numOfHyenas++;
    }
}
