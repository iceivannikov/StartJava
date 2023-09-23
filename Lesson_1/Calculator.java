public class Calculator {

    public static void main(String[] args) {
        System.out.println("==Task Calculator==");
        int number1 = 5;
        int number2 = 5;
        int result = 0;
        char sign = '%';
        if (sign == '+') {
            result = number1 + number2;
        } else if (sign == '-') {
            result = number1 - number2;
        } else if (sign == '*') {
            result = number1 * number2;
        } else if (sign == '/') {
            if (number2 == 0) {
                System.out.println("You can't divide by zero");
            } else {
                result = number1 / number2;
            }
        } else if (sign == '^') {
            for (int i = 0; i < number2; i++) {
                result = number1 * number2;
            }
        } else if (sign == '%') {
            result = number1 % number2;
        }
        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
    }
}