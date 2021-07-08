public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 20;
        boolean Man = true;
        double height = 1.80;
        char firstLetter = 'I';

        if (age > 20) {
            System.out.println("сообщение");
        }

        if (Man) {
            System.out.println("сообщение");
        }

        if (!Man) {
            System.out.println("сообщение");
        }

        if (height < 1.80) {
            System.out.println("сообщение");
        } else {
            System.out.println("не сообщение");
        }

        if (firstLetter == 'M') {
            System.out.println("сообщение");
        } else if (firstLetter == 'I') {
            System.out.println("не сообщение");
        } else {
            System.out.println("общение");
        }
    }
}
