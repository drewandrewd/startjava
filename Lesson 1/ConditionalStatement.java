public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 20;
        if (age > 20) {
            System.out.println("сообщение");
        }

        boolean man = true;
        if (man) {
            System.out.println("сообщение");
        }

        if (!man) {
            System.out.println("сообщение");
        }

        double height = 1.80;
        if (height < 1.80) {
            System.out.println("сообщение");
        } else {
            System.out.println("не сообщение");
        }

        char firstLetter = 'I';
        if (firstLetter == 'M') {
            System.out.println("сообщение");
        } else if (firstLetter == 'I') {
            System.out.println("не сообщение");
        } else {
            System.out.println("общение");
        }
    }
}
