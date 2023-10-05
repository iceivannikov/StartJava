package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n==Task 1 Counting the sum of even and odd numbers==");
        int start = -10;
        int finish = 21;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int counter = start;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= finish);
        System.out.println("In the segment [" + start + ", " + finish + "]" + 
                ", the sum of even numbers = " + sumEvenNumbers + 
                ", and the sum of odd numbers = " + sumOddNumbers);

        System.out.println("\n==Task 2 Display numbers in descending order==");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int min = number1;
        int max = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        System.out.print("(");
        for (int i = max - 1; i > min; i--) {
            if (i < max - 1 && i > min) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
        System.out.println(")");

        System.out.println("\n==Task 3 Printing the reverse number and the sum of its digits==");
        int sum = 0;
        int number = 1234;
        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            System.out.print(remainder);
            number /= 10;
        }
        System.out.println("\n" + sum);

        System.out.println("\n==Task 4 Printing numbers on multiple lines==");
        start = 1;
        finish = 24;
        int numbersInLine = 5;
        counter = 0;
        for (int i = start; i < finish; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d", i);
                counter++;
                if (counter % numbersInLine == 0) {
                    System.out.println();
                }
            }
        }
        if (counter % numbersInLine != 0) {
            int remainingZeros = numbersInLine - (counter % numbersInLine);
            for (int i = 0; i < remainingZeros; i++) {
                System.out.printf("%4d", 0);
                counter++;
            }
            System.out.println();
        }

        System.out.println("\n==Task 5 Checking the number of twos for even/odd numbers==");
        number = 3242592;
        int copyNumber = number;
        int countTwos = 0;
        while (number > 0) {
            if (number % 10 == 2) {
                countTwos++;
            }
            number /= 10;
        }
        String state = "";
        if (countTwos % 2 == 0) {
            state = "even";
        } else {
            state = "odd";
        }
        System.out.println("In " + copyNumber + " " + state + 
                " the number of twos is " + countTwos);

        System.out.println("\n==Task 6 Displaying geometric shapes==");
        int column = 1;
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
            if (column % 10 == 0) {
                System.out.println();
            }
            column++;
        }
        System.out.println();

        int row = 5;
        while (row >= 1) {
            int countSymbols = 1;
            while (countSymbols <= row) {
                System.out.print("#");
                countSymbols++;
            }
            System.out.println();
            row--;
        }
        System.out.println();

        row = 1;
        boolean isIncrement = true;
        int symbolsInLine = 0;
        do {
            counter = 0;
            if (symbolsInLine == 3) {
                counter = 2;
                isIncrement = false;
            }
            do {
                System.out.print("$");
                if (isIncrement) {
                    counter++;
                } else {
                    counter--;
                }
            } while (counter <= symbolsInLine && counter > 0);
            System.out.println();
            if (isIncrement) {
                symbolsInLine++;
            } else {
                symbolsInLine--;
            }
            row++;
        } while (row <= 5);

        System.out.println("\n==Task 7 Displaying ASCII characters==");
        System.out.printf(" %5s   %10s   %10s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 15; i <= 255; i++) {
            if (i >= 15 && i <= 48 && i % 2 != 0) {
                System.out.printf("%5s  %10s            %-20s%n", 
                        i, (char) i, Character.getName(i));
            } 
            if (i >= 97 && i <= 122 && i % 2 == 0) {
                System.out.printf("%5s  %10s            %-20s%n", 
                        i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n==Task 8 Checking if a number is a palindrome==");
        number = 1234321;
        copyNumber = number;
        int reverseNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }
        System.out.printf("Number %d ", copyNumber);
        if (copyNumber == reverseNumber) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("is not a palindrome");
        }

        System.out.println("\n==Task 9 Checking if a number is lucky==");
        number = 123124;
        int leftHalf = number / 1000;
        int rightHalf = number % 1000;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        while (rightHalf > 0) {
            sumLeftHalf += leftHalf % 10;
            sumRightHalf += rightHalf % 10;
            leftHalf /= 10;
            rightHalf /= 10;
        }
        System.out.printf("Number %d ", number);
        if (sumLeftHalf == sumRightHalf) {
            System.out.println("is happy)))");
        } else {
            System.out.println("is not happy(((");
        }

        System.out.println("\n==Task 10 Display of the Pythagorean multiplication table==");
        System.out.printf("   %10s\n","Pythagorean table");
        System.out.print("   |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.print("\n---+");
        for (int i = 2; i < 10; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d|", i);
            for(int j = 2; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}