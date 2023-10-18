package com.startjava.lesson_2_3_4.calculator;

public class CalculatorUtil {
    public static final String CONTINUATION_OR_END_MSG = "Do you want to continue calculating? [yes/no]: ";
    public static final String INPUT_EXPRESSION_MSG = "\nEnter a mathematical expression in the format [a sign b]: ";
    public static final String YES = "yes";
    public static final String NO = "no";
    public static final String INVALID_EXPRESSION_INPUT_MSG = "The number entered must be positive and integer";
    public static final String EXPRESSION_LENGTH_LIMIT_MSG = "The length of the expression cannot exceed "
            + CalculatorUtil.MAX_EXPRESSION_LENGTH + " characters and be less than "
            + CalculatorUtil.MAX_EXPRESSION_LENGTH;
    public static final int MAX_EXPRESSION_LENGTH = 3;
    public static final String DIVISION_BY_ZERO_EXCEPTION_MSG = "Exception!!! You can't divide by zero";
    public static final String NO_SIGN_MSG = "Error: sign [ %s ] is not supported";

    private CalculatorUtil() {
    }

    public static void printResult(double result, String expression) {
        System.out.printf("%s = " + (result % 1 == 0 ? "%.0f\n" : "%.3f\n"), expression, result);
    }
}
