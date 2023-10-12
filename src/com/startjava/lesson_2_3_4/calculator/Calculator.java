package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String RAISE_TO_POWER = "^";
    private static final String DIVIDE = "/";
    private static final String REMAINDER_WITH_DIVISION = "%";
    private static final String DELIMITER_REGEX = " ";
    private static final String EXCEPTION_MESSAGE = "Exception!!! You can't divide by zero";
    private static final String INCORRECT_OPERATION_SIGN = "Error: sign [ %s ] is not supported\n";

    private int b;

    public double calculate(String expression) {
        String[] partsExpression = expression.split(DELIMITER_REGEX);
        int a = Integer.parseInt(partsExpression[0]);
        String sign = partsExpression[1];
        b = Integer.parseInt(partsExpression[2]);
        return switch (sign) {
            case PLUS -> a + b;
            case MINUS -> a - b;
            case MULTIPLY -> a * b;
            case RAISE_TO_POWER -> Math.pow(a, b);
            case DIVIDE -> checkByZero() == Double.MIN_VALUE ? Double.MIN_VALUE : (double) a / b;
            case REMAINDER_WITH_DIVISION -> checkByZero() == Double.MIN_VALUE ? Double.MIN_VALUE : a % b;
            default -> {
                System.out.printf(INCORRECT_OPERATION_SIGN, sign);
                yield Double.MIN_VALUE;
            }
        };
    }

    private double checkByZero() {
        if (b == 0) {
            System.out.println(EXCEPTION_MESSAGE);
        }
        return Double.MIN_VALUE;
    }
}