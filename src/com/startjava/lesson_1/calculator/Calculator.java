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
            int c = 1;
            if (b >= 2) {
                for (int i = 2; i <= b; i++) {
                    c *= a;
                }
            } else if (b == 1) {
                c = a;
            }
            System.out.println(c);
        } else if (sign.equals("%")) {
            System.out.println(a % b);
        }
    }
}
