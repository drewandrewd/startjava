import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean answer = true;
        while (answer) {
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();
            System.out.print("Введите первое число: ");
            calculator.setA(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scanner.next());
            System.out.print("Введите второе число: ");
            calculator.setB(scanner.nextInt());
            System.out.println(calculator.calc(calculator.getA(), calculator.getSign(), calculator.getB()));
            boolean wrongAnswer = true;
            while (wrongAnswer) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                calculator.setYesNo(scanner.next());
                if (calculator.getYesNo().equals("yes")) {
                    answer = true;
                    wrongAnswer = false;
                } else if (calculator.getYesNo().equals("no")) {
                    answer = false;
                    wrongAnswer = false;
                } else {
                    wrongAnswer = true;
                }
            }
        }
    }
}
