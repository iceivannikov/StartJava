package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args) {
//        arrayReverse();
//        productArrayElements();
//        removingArrayElements();
//        displayingAlphabet();
        System.out.println("\n== 5 Filling an array with unique numbers ==");
        int[] numbers = new int[30];
        int count = 0;
        while (count < 30) {
            int randomNumber = (int) (Math.random() * 40) + 60;
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (numbers[i] == randomNumber) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                numbers[count] = randomNumber;
                count++;
            }
        }
        sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : "."));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static void arrayReverse() {
        System.out.println("\n== 1 Reversing array values ==");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        System.out.println("Before reverse: " + Arrays.toString(numbers));
        int halfLength = getHalfLength(numbers);
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
            printArrayTask3(i, length / 2 + 1, numbers[i]);
        }
        double valueHalfLength = numbers[length / 2];
        int countZeros = 0;
        System.out.println("\nModified array:");
        for (int i = 0; i < length; i++) {
            if (valueHalfLength < numbers[i]) {
                numbers[i] = 0;
                countZeros++;
            }
            printArrayTask3(i, length / 2 + 1, numbers[i]);
        }
        System.out.printf("\nNumber of zeroed cells = %d", countZeros);
    }

    private static void displayingAlphabet() {
        System.out.println("\n\n== 4 Displaying the alphabet using a ladder ==");
        char[] alphabet = new char[26];
        char letter = 'A';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = letter++;
        }
        String result = "";
        for (int j = alphabet.length - 1; j >= 0; j--) {
            result += alphabet[j];
            System.out.println(result);
        }
    }

    private static int getHalfLength(int[] numbers) {
        return (numbers.length % 2 == 0) ? numbers.length / 2 : numbers.length / 2 + 1;
    }

    private static void printArrayTask3(int i, int arrayLength, double number) {
        if (i == arrayLength) {
            System.out.println();
        }
        System.out.printf("%.3f ", number);
    }

    private static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
    }
}