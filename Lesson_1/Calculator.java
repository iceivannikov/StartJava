public class Calculator {

    public static void main(String[] args) {
        System.out.println("==Task Calculator==");
        int a = 3;
        int b = 3;
        int result = 0;
        char sign = '%';
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '^') {
            result = a;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%' || sign == '/') {
            if (b == 0) {
                System.out.println("You can't divide by zero");
                return;
            } else if (sign == '%') {
                result = a % b;
            } else {
                result = a / b;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}