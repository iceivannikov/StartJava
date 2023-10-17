package com.startjava.lesson_2_3_4.calculator;

import java.util.Objects;
import java.util.Scanner;

public class CalculatorTest {

    private static final Scanner sc = new Scanner(System.in);
    private static final String CONTINUATION_OR_END_MSG = "Do you want to continue calculating? [yes/no]: ";
    private static final String INPUT_EXPRESSION_MSG = "\nEnter a mathematical expression in the format [a sign b]: ";
    private static final String YES = "yes";
    private static final String NO = "no";
    private static final String INVALID_EXPRESSION_INPUT_MSG = "The number entered must be positive and integer";
    private static final String EXPRESSION_LENGTH_LIMIT_MSG = "The length of the expression cannot exceed "
            + CalculatorTest.MAX_EXPRESSION_LENGTH + " characters and be less than "
            + CalculatorTest.MAX_EXPRESSION_LENGTH;
    private static final int MAX_EXPRESSION_LENGTH = 3;
    private static final String DIVISION_BY_ZERO_EXCEPTION_MSG = "Exception!!! You can't divide by zero";
    private static final String NO_SIGN_MSG = "Error: sign [ %s ] is not supported\n";

    public static void main(String[] args) {
        String answer = YES;
        while (!Objects.equals(answer, NO)) {
            if (Objects.equals(answer, YES)) {
                try {
                    System.out.print(INPUT_EXPRESSION_MSG);
                    String expression = sc.nextLine();
                    double result = Calculator.calculate(expression);
                    printResult(result, expression);
                } catch (ArithmeticException exception) {
                    System.out.println(DIVISION_BY_ZERO_EXCEPTION_MSG);
                } catch (NumberFormatException exception) {
                    System.out.println(INVALID_EXPRESSION_INPUT_MSG);
                } catch (IndexOutOfBoundsException exception) {
                    System.out.println(EXPRESSION_LENGTH_LIMIT_MSG);
                } catch (IllegalArgumentException exception) {
                    System.out.println(NO_SIGN_MSG);
                }
            }
            System.out.print(CONTINUATION_OR_END_MSG);
            answer = sc.next();
            sc.nextLine();
        }
    }

    private static void printResult(double result, String expression) {
        System.out.printf("%s = " + (result % 1 == 0 ? "%.0f\n" : "%.3f\n"), expression, result);
    }
}