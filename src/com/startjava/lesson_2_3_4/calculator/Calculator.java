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

    private int a;
    private String sign;
    private int b;

    public Calculator() {
    }

    public int getA() {
        return a;
    }

    public String getSign() {
        return sign;
    }

    public int getB() {
        return b;
    }

    public double calculate(String mathOperation) {
        String[] partsExpression = mathOperation.split(DELIMITER_REGEX);
        a = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1];
        b = Integer.parseInt(partsExpression[2]);
        try {
            return switch (sign) {
                case PLUS -> a + b;
                case MINUS -> a - b;
                case MULTIPLY -> a * b;
                case RAISE_TO_POWER -> Math.pow(a, b);
                case DIVIDE -> {
                    if (b == 0) {
                        System.out.println(EXCEPTION_MESSAGE);
                        yield Double.MIN_VALUE;
                    } else {
                        yield (double) a / b;
                    }
                }
                case REMAINDER_WITH_DIVISION -> a % b;
                default -> {
                    System.out.printf(INCORRECT_OPERATION_SIGN, sign);
                    yield Double.MIN_VALUE;
                }
            };
        } catch (ArithmeticException ex) {
            System.out.println(EXCEPTION_MESSAGE);
        }
        return Double.MIN_VALUE;
    }
}