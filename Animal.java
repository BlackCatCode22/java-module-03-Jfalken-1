public class Animal {
    // Create a few attributes (fields)

    // sex will be 'male' or 'female'
    private String sex = "";

    // age will be in years
    private int age = 0;

    // weight will be int pounds
    private int weight = 0;

    // ------------------------------------------//
    // Create getters and setters

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }


    // ------------------------------------------//
    // Create a static int to store the number of Animals
    private static int numOfAnimals = 0;

    // Create a getter to get the private int numOfAnimals
    public static int getNumOfAnimals() {
        return numOfAnimals;
    }

    // Create a constructor to increment the numOfAnimals int whenever a Animal object is made
    public Animal() {
        numOfAnimals++;
    }


}
