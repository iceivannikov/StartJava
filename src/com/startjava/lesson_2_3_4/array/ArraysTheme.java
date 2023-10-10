package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArray();
        productArrayElements();
        removeArrayElements();
        displayingAlphabet();
        fillingArrayUniqueNumbers();
    }

    private static void reverseArray() {
        System.out.println("\n== 1 Reversing array values ==");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        System.out.println("Before reverse: " + Arrays.toString(numbers));
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            int tmp = numbers[--length];
            numbers[length] = numbers[i];
            numbers[i] = tmp;
        }
        System.out.println("After reverse: " + Arrays.toString(numbers));
    }

    private static void productArrayElements() {
        System.out.println("\n== 2 Product of array elements ==");
        int length = 10;
        int[] multipliers = new int[length];
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }
        int result = 1;
        for (int i = result; i < length - 1; i++) {
            result *= multipliers[i];
            System.out.print(i + (i < length - 2 ? " * " : " = "));
        }
        System.out.print(result);
    }

    private static void removeArrayElements() {
        System.out.println("\n\n== 3 Removing array elements ==");
        int length = 15;
        double[] randomNumbers = new double[length];
        System.out.println("Source array:");
        for (int i = 0; i < length; i++) {
            randomNumbers[i] = Math.random();
        }
        print(randomNumbers);
        double middleCellValue = randomNumbers[length / 2];
        int countZeros = 0;
        System.out.println("\nModified array:");
        for (int i = 0; i < length; i++) {
            if (randomNumbers[i] > middleCellValue) {
                randomNumbers[i] = 0;
                countZeros++;
            }
        }
        print(randomNumbers);
        System.out.printf("\nNumber of zeroed cells = %d", countZeros);
    }

    private static void displayingAlphabet() {
        System.out.println("\n\n== 4 Displaying the alphabet using a ladder ==");
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        String result = "";
        for (int i = alphabet.length - 1; i >= 0; i--) {
            result += alphabet[i];
            System.out.println(result);
        }
    }

    private static void fillingArrayUniqueNumbers() {
        System.out.println("\n== 5 Filling an array with unique numbers ==");
        int[] uniqueNumbers = new int[30];
        int count = 0;
        int length = uniqueNumbers.length;
        while (count < length) {
            int randomNumber = (int) (Math.random() * 40) + 60;
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (uniqueNumbers[i] == randomNumber) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueNumbers[count] = randomNumber;
                count++;
            }
        }
        sort(uniqueNumbers);
        print(length, uniqueNumbers);
    }

    private static void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length / 2 + 1) {
                System.out.println();
            }
            System.out.printf("%.3f ", array[i]);
        }
    }

    private static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    private static void print(int length, int[] array) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}