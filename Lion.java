public class Lion extends Animal {
    // Create an int to store the number of lions
    private static int numOfLions = 0;

    // Create a getter to get the private int numOfLions
    public static int getNumOfLions() {
        return numOfLions;
    }

    // Create a constructor to increment the numOfLions int whenever a lion object is made
    public Lion() {
        numOfLions++;
    }
}
