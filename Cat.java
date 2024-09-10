public class Cat {

    private static int catCount = 0;

    public static final int MaxLives = 9;

    String name;
    int age;
    int livesRemaining;

    public void meow() {
        System.out.println("meow");
    }

    public Cat() {
        catCount++;
        livesRemaining = MaxLives;
    }

    public static int getCatCount() {
        return catCount;
    }

}
