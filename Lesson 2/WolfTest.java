public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("male");
        wolf.setName("Jack");
        wolf.setWeight(82);
        wolf.setAge(7);
        wolf.setColor("Black");

        System.out.println(wolf.getGender());
        System.out.println(wolf.getName());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
