package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String RAISE_TO_POWER = "^";
    private static final String DIVIDE = "/";
    private static final String REMAINDER_WITH_DIVISION = "%";

    public static double calculate(String expression) throws RuntimeException {
        int a;
        int b;
        String sign;
        double result;
        String[] partsExpression = expression.split(" ");
        a = parseNumber(partsExpression[0]);
        b = parseNumber(partsExpression[2]);
        sign = partsExpression[1];
        result = switch (sign) {
            case PLUS -> a + b;
            case MINUS -> a - b;
            case MULTIPLY -> a * b;
            case RAISE_TO_POWER -> Math.pow(a, b);
            case DIVIDE -> div(b, a);
            case REMAINDER_WITH_DIVISION -> a % b;
            default -> throw new IllegalArgumentException();
        };
        return result;
    }

    private static double div(int b, double a) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    private static int parseNumber(String partExpression) {
        int result;
            result = Integer.parseInt(partExpression);
        if (result < 0) {
            throw new NumberFormatException();
        }
        return result;
    }
}