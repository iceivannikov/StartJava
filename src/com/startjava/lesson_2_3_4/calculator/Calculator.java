package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLY = '*';
    private static final char RAISE_TO_POWER = '^';
    private static final char DIVIDE = '/';
    private static final char REMAINDER_WITH_DIVISION = '%';

    private int a;
    private char sign;
    private int b;

    public Calculator(int a, char sign, int b) {
        this.a = a;
        this.sign = sign;
        this.b = b;
    }

    public void calculate() {
        int result = 0;
        try {
            switch(sign) {
                case PLUS -> result = a + b;
                case MINUS -> result = a - b;
                case MULTIPLY -> result = a * b;
                case RAISE_TO_POWER -> {
                    result = 1;
                    for (int i = 0; i < b; i++) {
                        result *= a;
                    }
                }
                case DIVIDE -> result = a / b;
                case REMAINDER_WITH_DIVISION -> result = a % b;
                default -> {
                    System.out.printf("%c - there is no such sign\n", sign);
                    return;
                }
            }
            System.out.printf("%d %c %d = %d\n", a, sign, b, result);
        } catch(ArithmeticException ex) {
            System.out.println("ArithmeticException, You can't " + ex.getMessage());
        }
    }
}