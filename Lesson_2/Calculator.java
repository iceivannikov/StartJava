public class Calculator {

    private final char PLUS = '+';
    private final char MINUS = '-';
    private final char ASTERISK = '*';
    private final char CARET = '^';
    private final char SLASH = '/';
    private final char PERCENT = '%';

    private int a;
    private char sign;
    private int b;

    public Calculator(int a, char sign, int b) {
        this.a = a;
        this.sign = sign;
        this.b = b;
    }

    public void calculate() {
        int result = 0;
        try {
            switch(sign) {
                case PLUS -> result = a + b;
                case MINUS -> result = a - b;
                case ASTERISK -> result = a * b;
                case CARET -> {
                    result = 1;
                    for (int i = 0; i < b; i++) {
                        result *= a;
                    }
                }
                case SLASH -> result = a / b;
                case PERCENT -> result = a % b;
                default -> {
                    System.out.printf("%c - there is no such sign\n", sign);
                    return;
                }
            }
            System.out.printf("%d %c %d = %d\n", a, sign, b, result);
        } catch(ArithmeticException ex) {
            System.out.println("ArithmeticException, You can't " + ex.getMessage());
        }
    }
}