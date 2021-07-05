import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sign = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (sign.equals("+")) {
            System.out.println(a + b);
        }
        else if (sign.equals("-")) {
            System.out.println(a - b);
        }
        else if (sign.equals("*")) {
            System.out.println(a * b);
        }
        else if (sign.equals("/")) {
            System.out.println(a / b);
        }
        else if (sign.equals("^")) {
            System.out.println(Math.pow(a, b));
        }
        else if (sign.equals("%")) {
            System.out.println(a % b);
        }
    }
}