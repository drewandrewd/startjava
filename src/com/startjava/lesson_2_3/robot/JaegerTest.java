public class JaegerTest {
    public static void main(String[] args) {
        Jaeger ronin = new Jaeger();
        ronin.setModelName("Tacit Ronin");
        ronin.setMark("Mark-1");
        ronin.setOrigin("Japan");
        ronin.setHeight(75.5f);
        ronin.setWeight(7.450f);
        ronin.setStrength(7);
        ronin.setArmor(3);
        ronin.drift();
        ronin.move();
        ronin.scanKaiju();
        ronin.useVortexCannon();
        System.out.println(ronin.getOrigin());
        ronin.setArmor(5);

        Jaeger romeo = new Jaeger();
        romeo.setModelName("Romeo Blue");
        romeo.setMark("Mark-1");
        romeo.setOrigin("USA");
        romeo.setHeight(77.7f);
        romeo.setWeight(7.775f);
        romeo.setStrength(7);
        romeo.setArmor(6);
        romeo.drift();
        romeo.move();
        romeo.scanKaiju();
        romeo.useVortexCannon();
        System.out.println(romeo.getModelName());
        System.out.println(romeo.getMark());
        romeo.setHeight(90);
    }
}
