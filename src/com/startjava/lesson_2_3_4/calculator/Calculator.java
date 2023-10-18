package com.startjava.lesson_2_3_4.calculator;

import static com.startjava.lesson_2_3_4.calculator.CalculatorUtil.*;

public class Calculator {

    public static double calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int a = parseNumber(partsExpression[0]);
        int b = parseNumber(partsExpression[2]);
        String sign = partsExpression[1];
        return switch (sign) {
            case PLUS -> a + b;
            case MINUS -> a - b;
            case MULTIPLY -> a * b;
            case RAISE_TO_POWER -> Math.pow(a, b);
            case DIVIDE -> div(b, a);
            case REMAINDER_WITH_DIVISION -> a % b;
            default -> throw new IllegalArgumentException();
        };
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