package com.startjava.lesson_2_3_4.calculator;

import java.util.Objects;
import java.util.Scanner;

import static com.startjava.lesson_2_3_4.calculator.CalculatorUtil.*;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = YES;
        while (!Objects.equals(answer, NO)) {
            if (Objects.equals(answer, YES)) {
                try {
                    System.out.print(INPUT_EXPRESSION_MSG);
                    String expression = sc.nextLine();
                    double result = Calculator.calculate(expression);
                    printResult(result, expression);
                } catch (ArithmeticException e) {
                    System.out.println(DIVISION_BY_ZERO_EXCEPTION_MSG);
                } catch (NumberFormatException e) {
                    System.out.println(INVALID_EXPRESSION_INPUT_MSG);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println(EXPRESSION_LENGTH_LIMIT_MSG);
                } catch (IllegalArgumentException | NullPointerException e) {
                    System.out.println(NO_SIGN_MSG);
                }
                System.out.print(CONTINUATION_OR_END_MSG);
                answer = sc.next();
                sc.nextLine();
            }
        }
    }
}