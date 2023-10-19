package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int a = parseNumber(partsExpression[0]);
        int b = parseNumber(partsExpression[2]);
        MathSign mathSign = returnMathSign(partsExpression[1]);
        if (mathSign == null) throw new AssertionError();
        return switch (mathSign) {
            case PLUS -> a + b;
            case MINUS -> a - b;
            case MULTIPLY -> a * b;
            case POWER -> Math.pow(a, b);
            case DIVIDE -> div(b, a);
            case MOD -> a % b;
        };
    }

    private static int parseNumber(String partExpression) {
        int result = Integer.parseInt(partExpression);
        if (result < 0) {
            throw new NumberFormatException();
        }
        return result;
    }

    private static double div(int b, double a) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    private static MathSign returnMathSign(String sign) {
        MathSign[] values = MathSign.values();
        for (MathSign value : values) {
            if (value.getTitle().equals(sign)) {
                return value;
            }
        }
        return null;
    }
}