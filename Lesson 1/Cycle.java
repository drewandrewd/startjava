public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int num = 6;
        while (num > -7) {
            System.out.println(num);
            num--;
        }

        int numTwo = 10;
        int result = 0;
        do {
            if (numTwo % 2 != 0) {
                result += numTwo;
            }
            numTwo++;
        } while (numTwo <= 20);
        System.out.println(result);
    }
}
