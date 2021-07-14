public class Person {

    String gender = "male";
    String name = "Andrey";
    int height = 176;
    int weight = 75;
    int age = 25;

    public void walk() {
        System.out.println("walking");
    }

    public void sit() {
        System.out.println("sitting");
    }

    public String run() {
        return "running";
    }

    public String speak() {
        return "speaking";
    }

    public boolean learningJava() {
        return true;
    }
}
