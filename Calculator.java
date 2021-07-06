import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String sign = scanner.next();
        int b = scanner.nextInt();
        if (sign.equals("+")) {
            System.out.println(a + b);
        } else if (sign.equals("-")) {
            System.out.println(a - b);
        } else if (sign.equals("*")) {
            System.out.println(a * b);
        } else if (sign.equals("/")) {
            System.out.println(a / b);
        } else if (sign.equals("^")) {
            if (b >= 2) {
                for (int i = 2; i <= b; i++) {
                    a *= a;
                }
            } else if (b == 0) {
                a = 1;
            }
            System.out.println(a);
        } else if (sign.equals("%")) {
            System.out.println(a % b);
        }
    }
}
