public class Calculator {

    public static void main(String[] args) {
        System.out.println("==Task Calculator==");
        int value1 = 2;
        int value2 = 0;
        int result = 0;
        char sign = '%';
        if (sign == '+') {
            result = value1 + value2;
        } else if (sign == '-') {
            result = value1 - value2;
        } else if (sign == '*') {
            result = value1 * value2;
        } else if (sign == '^') {
            result = value1;
            for (int i = 1; i < value2; i++) {
                result *= value1;
            }
        } else if (sign == '%' || sign == '/') {
            if (value2 == 0) {
                System.out.println("You can't divide by zero");
            } else if (sign == '%') {
                result = value1 % value2;
            } else {
                result = value1 / value2;
            }
        }
        if (value2 == 0 && sign == '%' || value2 == 0 && sign == '/') {
            System.out.println("Value two cannot be zero");
        } else {
            System.out.println(value1 + " " + sign + " " + value2 + " = " + result);
        }
    }
}