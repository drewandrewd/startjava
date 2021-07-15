public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "male";
        wolf.name = "Jack";
        wolf.weight = 80;
        wolf.age = 10;
        wolf.color = "black";

        System.out.println(wolf.gender);
        System.out.println(wolf.name);
        System.out.println(wolf.weight);
        System.out.println(wolf.age);
        System.out.println(wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
