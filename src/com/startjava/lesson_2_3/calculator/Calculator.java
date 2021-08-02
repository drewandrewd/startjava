public class Calculator {

    private int a;
    private String sign;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int calc() {
        int result = 0;
        switch (sign) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "^":
                result = (int) Math.pow(a, b);
                break;
            case "%":
                result = a % b;
                break;
        }

        return result;
    }
}
