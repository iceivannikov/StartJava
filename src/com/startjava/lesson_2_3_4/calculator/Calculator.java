package com.startjava.lesson_2_3_4.calculator;

import static com.startjava.lesson_2_3_4.calculator.MathSign.*;

public class Calculator {

    public static double calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int a = parseNumber(partsExpression[0]);
        int b = parseNumber(partsExpression[2]);
        MathSign mathSign = getTitleBySign(partsExpression[1]);
        return switch (mathSign) {
            case PLUS -> a + b;
            case MINUS -> a - b;
            case MULTIPLY -> a * b;
            case POWER -> Math.pow(a, b);
            case DIVIDE -> div(a, b);
            case MOD -> a % b;
        };
    }

    private static int parseNumber(String element) {
        int number = Integer.parseInt(element);
        if (number < 0) {
            throw new NumberFormatException();
        }
        return number;
    }

    private static double div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return (double) a / b;
    }
}