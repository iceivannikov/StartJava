public class Calculator {

    public static void main(String[] args) {
        System.out.println("==Task Calculator==");
        int a = 4;
        int b = 0;
        int result = 0;
        char sign = '/';
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '^') {
            for (int i = 1; i < b; i++) {
                result = a * a;
            }
        } else if (sign == '%' || sign == '/') {
            if (b == 0) {
                System.out.println("You can't divide by zero");
            } else if (sign == '%') {
                result = a % b;
            } else {
                result = a / b;
            }
        }
        if (sign == '%' || sign == '/') {
            if (b == 0) {
                System.out.println("Value b cannot be zero");
            }
        } else {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}