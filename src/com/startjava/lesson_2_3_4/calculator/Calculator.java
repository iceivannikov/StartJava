package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String RAISE_TO_POWER = "^";
    private static final String DIVIDE = "/";
    private static final String REMAINDER_WITH_DIVISION = "%";

    private final int a;
    private final String sign;
    private final int b;

    public Calculator(int a, String sign, int b) {
        this.a = a;
        this.sign = sign;
        this.b = b;
    }

    public double calculate() {
        double result = 0;
        try {
            switch(sign) {
                case PLUS -> result = a + b;
                case MINUS -> result = a - b;
                case MULTIPLY -> result = a * b;
                case RAISE_TO_POWER -> result = Math.pow(a, b);
                case DIVIDE -> result =  (double) a / b;
                case REMAINDER_WITH_DIVISION -> result = a % b;
                default -> {
                    System.out.printf("Error: sign [ %s ] is not supported\n", sign);
                    result = Double.MIN_VALUE;
                }
            }
        } catch(ArithmeticException ex) {
            System.out.println("ArithmeticException, You can't " + ex.getMessage());
        }
        return result;
    }

    public boolean continueOrEnd() {
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Do you want to continue calculating? [yes/no]: ");
            answer = sc.next();
            sc.nextLine();
        } while(!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("yes");
    }
}