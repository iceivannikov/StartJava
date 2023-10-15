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
    public static final String INVALID_EXPRESSION_INPUT_MSG = "Invalid expression input, check the entered data";
    public static final String NUMBERS_NOT_POSITIVE_MSG = "Numbers can only be positive";
    public static final String EXPRESSION_LENGTH_LIMIT_MSG = "The length of the expression cannot exceed "
            + Calculator.MAX_EXPRESSION_LENGTH + " characters and be less than " + Calculator.MIN_EXPRESSION_LENGTH;
    public static final int MAX_EXPRESSION_LENGTH = 3;
    public static final int MIN_EXPRESSION_LENGTH = 3;

    public static double calculate(String expression) {
        int a;
        String sign;
        int b;
        try {
            if (expression.length() > MAX_EXPRESSION_LENGTH || expression.length() < MIN_EXPRESSION_LENGTH) {
                throw new RuntimeException();
            }
            String[] partsExpression = expression.split(DELIMITER_REGEX);
            a = Integer.parseInt(partsExpression[0]);
            b = Integer.parseInt(partsExpression[2]);
            if (a < 0 || b < 0) {
                System.out.println(NUMBERS_NOT_POSITIVE_MSG);
                return Double.MIN_VALUE;
            }
            sign = partsExpression[1];
            return switch (sign) {
                case PLUS -> a + b;
                case MINUS -> a - b;
                case MULTIPLY -> a * b;
                case RAISE_TO_POWER -> Math.pow(a, b);
                case DIVIDE -> b == 0 ? returnDoubleMinValue() : (double) a / b;
                case REMAINDER_WITH_DIVISION -> a % b;
                default -> {
                    System.out.printf(NO_SIGN_MSG, sign);
                    yield Double.MIN_VALUE;
                }
            };
        } catch (NumberFormatException exception) {
            System.out.println(INVALID_EXPRESSION_INPUT_MSG);
        } catch (ArithmeticException exception) {
            print();
        } catch (RuntimeException exception) {
            System.out.println(EXPRESSION_LENGTH_LIMIT_MSG);
        }
        return Double.MIN_VALUE;
    }

    private static double returnDoubleMinValue() {
        print();
        return Double.MIN_VALUE;
    }

    private static void print() {
        System.out.println(DIVISION_BY_ZERO_EXCEPTION_MSG);
    }
}