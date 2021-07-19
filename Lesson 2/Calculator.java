public class Calculator {

    private int a;
    private String sign;
    private int b;
    private String yesNo;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getYesNo() {
        return yesNo;
    }

    public void setYesNo(String yesNo) {
        this.yesNo = yesNo;
    }

    public int calc(int a, String sign, int b) {
        int result = 0;
        switch (sign) {
            case "+":
                result = a + b;
                break;
            case "-":
                result =  a - b;
                break;
            case "*":
                result =  a * b;
                break;
            case "/":
                result =   a / b;
                break;
            case "^":
                result =   (int) Math.pow(a, b);
                break;
            case "%":
                result =   a % b;
                break;
        }
        return result;
    }
}
