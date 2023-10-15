package com.startjava.lesson_2_3_4.calculator;

import java.util.Objects;
import java.util.Scanner;

public class CalculatorTest {

    private static final Scanner sc = new Scanner(System.in);
    public static final String CONTINUATION_OR_END_MSG = "Do you want to continue calculating? [yes/no]: ";
    public static final String INPUT_EXPRESSION_MSG = "\nEnter a mathematical expression: ";
    public static final String YES = "yes";
    public static final String NO = "no";

    public static void main(String[] args) {
        String answer = YES;
        while (!Objects.equals(answer, NO)) {
            if (Objects.equals(answer, YES)) {
                System.out.print(INPUT_EXPRESSION_MSG);
                String expression = sc.nextLine();
                Calculator calc = new Calculator();
                double result = calc.calculate(expression);
                printResult(result, expression);
            }
            System.out.print(CONTINUATION_OR_END_MSG);
            answer = sc.next();
            sc.nextLine();
        }
    }

    private static void printResult(double result, String expression) {
        if (result != Double.MIN_VALUE) {
            System.out.printf("%s = " + (result % 1 == 0 ? "%.0f\n" : "%.3f\n"), expression, result);
        }
    }
}