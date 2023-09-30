public class Calculator {

    private final int CARET_CHAR_NUMBER = 94;
    private final int MORE_THAN_FORTY_SEVEN_SYMBOLS_IN_THE_ASCII_TABLE = 47;

    private int a;
    private char sign;
    private int b;

    public Calculator(int a, char sign, int b) {
        this.a = a;
        this.sign = sign;
        this.b = b;
    }

    private int sum() {
        return a + b;
    }

    private int subtract() {
        return a - b;
    }

    private int multiply() {
        return a * b;
    }

    private int pow() {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    private int divide() {
        return a / b;
    }

    private int getRemainderDivision() {
        return a % b;
    }

    public void calculate() {
        int result = 0;
        try {
            switch(sign) {
                case '+' -> result = sum();
                case '-' -> result = subtract();
                case '*' -> result = multiply();
                case '^' -> result = pow();
                case '/' -> result = divide();
                case '%' -> result = getRemainderDivision();
                default -> this.sign = sign;
            }
            printResultCalculations(result);
        } catch(ArithmeticException ex) {
            System.out.println("ArithmeticException, You can't " + ex.getMessage());
        }
    }

    private void printResultCalculations(int result) {
        if (sign != CARET_CHAR_NUMBER && sign > MORE_THAN_FORTY_SEVEN_SYMBOLS_IN_THE_ASCII_TABLE) {
            System.out.println(sign + " - there is no such sign");
        } else {
            System.out.printf("%d %c %d = %d\n", a, sign, b, result);
        }
    }
}