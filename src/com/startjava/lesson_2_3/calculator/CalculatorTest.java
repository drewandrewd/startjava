

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String yesNo = "yes";
        while (yesNo.equals("yes")) {
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();
            System.out.print("Введите первое число: ");
            calculator.setA(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scanner.next());
            System.out.print("Введите второе число: ");
            calculator.setB(scanner.nextInt());
            System.out.println(calculator.calc());

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                yesNo = scanner.next();
            } while (!yesNo.equals("no") && !yesNo.equals("yes"));
        }
    }
}
