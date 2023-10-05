package com.startjava.lesson_1.final_;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("==Task Calculator==");
        int a = 2;
        int b = 0;
        int result = 0;
        char sign = '^';
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%' || sign == '/') {
            if (b == 0) {
                System.out.println("You can't divide by zero");
                return;
            } else if (sign == '%') {
                result = a % b;
            } else {
                result = a / b;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
