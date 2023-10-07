package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args) {
        arrayReverse();
        productArrayElements();
        removingArrayElements();
    }



    private static void arrayReverse() {
        System.out.println("\n== 1 Reversing array values ==");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        System.out.println("Before reverse: " + Arrays.toString(numbers));
        int halfLength = (numbers.length % 2 == 0) ? numbers.length / 2 : numbers.length / 2 + 1;
        int length = numbers.length;
        for (int i = 0; i < halfLength; i++) {
            int tmp = numbers[length - 1];
            numbers[length - 1] = numbers[i];
            numbers[i] = tmp;
            length--;
        }
        System.out.println("After reverse: " + Arrays.toString(numbers));
    }

    private static void productArrayElements() {
        System.out.println("\n== 2 Product of array elements ==");
        int start = 0;
        int length = 9 + 1;
        int[] numbers = new int[length];
        for (int i = start; i < length; i++) {
            numbers[i] = i;
        }
        int result = start + 1;
        for (int i = result; i < length - 1; i++) {
            result *= numbers[i];
            System.out.print(i + (i < length - 2 ? " * " : " = "));
        }
        System.out.printf("%,d", result);
    }

    private static void removingArrayElements() {
        System.out.println("\n\n== 3 Removing array elements ==");
        int length = 15;
        double[] numbers = new double[length];
        System.out.println("Source array:");
        for (int i = 0; i < length; i++) {
            numbers[i] = Math.random();
            if (i == length / 2 + 1) {
                System.out.println();
            }
            System.out.printf("%.3f ", numbers[i]);
        }
        System.out.println();
        int halfLength = length / 2;
        double valueHalfLength = numbers[halfLength];
        int countZeros = 0;
        System.out.println("Modified array:");
        for (int i = 0; i < length; i++) {
            if (valueHalfLength < numbers[i]) {
                numbers[i] = 0;
                countZeros++;
            }
            if (i == length / 2 + 1) {
                System.out.println();
            }
            System.out.printf("%.3f ", numbers[i]);
        }
        System.out.printf("\nNumber of zeroed cells = %d", countZeros);
    }
}
