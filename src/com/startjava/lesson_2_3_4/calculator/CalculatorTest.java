package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result;
        boolean isEnd;
        while (true) {
            System.out.print("\nEnter a mathematical expression: ");
            String expression = sc.nextLine();
            String[] operation = expression.split(" ");
            int a = Integer.parseInt(operation[0]);
            String sign = operation[1];
            int b = Integer.parseInt(operation[2]);
            Calculator calc = new Calculator(a, sign, b);
            result = calc.calculate();
            System.out.printf("%d %s %d = " + (result % 1 == 0 ? "%.0f\n" : "%.3f\n"), a, sign, b, result);
            isEnd = calc.continueOrEnd();
            if (!isEnd) {
                return;
            }
        }
    }
}