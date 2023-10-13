package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String RAISE_TO_POWER = "^";
    private static final String DIVIDE = "/";
    private static final String REMAINDER_WITH_DIVISION = "%";
    private static final String DELIMITER_REGEX = " ";
    private static final String DIVISION_BY_ZERO_EXCEPTION_MSG = "Exception!!! You can't divide by zero";
    private static final String NO_SIGN_MSG = "Error: sign [ %s ] is not supported\n";

    public double calculate(String expression) {
        String[] partsExpression = expression.split(DELIMITER_REGEX);
        int a = Integer.parseInt(partsExpression[0]);
        String sign = partsExpression[1];
        int b = Integer.parseInt(partsExpression[2]);
        return switch (sign) {
            case PLUS -> a + b;
            case MINUS -> a - b;
            case MULTIPLY -> a * b;
            case RAISE_TO_POWER -> Math.pow(a, b);
            case DIVIDE -> b == 0 ? returnDoubleMinValue() : (double) a / b;
            case REMAINDER_WITH_DIVISION -> b == 0 ? returnDoubleMinValue() : a % b;
            default -> {
                System.out.printf(NO_SIGN_MSG, sign);
                yield Double.MIN_VALUE;
            }
        };
    }

    private double returnDoubleMinValue() {
        print();
        return Double.MIN_VALUE;
    }

    private static void print() {
        System.out.println(DIVISION_BY_ZERO_EXCEPTION_MSG);
    }
}