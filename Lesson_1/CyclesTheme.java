public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n==Task 1 Counting the sum of even and odd numbers==");
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int start = -10;
        int finish = 21;
        int intervalCounter = start;
        do {
            if (intervalCounter % 2 == 0) {
                sumEvenNumbers += intervalCounter;
            } else {
                sumOddNumbers += intervalCounter;
            }
            intervalCounter++;
        } while (intervalCounter <= finish);
        System.out.println("In the segment [" + start + ", " + finish + "]" + 
                ", the sum of even numbers = " + sumEvenNumbers + 
                ", and the sum of odd numbers = " + sumOddNumbers);

        System.out.println("\n==Task 2 Display numbers in descending order==");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = 0;
        int min = 0;
        if (number3 > number1 && number1 < number2) {
            min = number1;
        } else if (number1 > number3 && number3 < number2) {
            min = number3;
        } else {
            min = number2;
        }
        if (number3 < number1 && number1 > number2) {
            max = number1;
        } else if (number1 < number3 && number3 > number2) {
            max = number3;
        } else {
            max = number2;
        }
        for (int i = min; i <= max; i++) {
            System.out.print(i);
        }

        System.out.println("\n\n==Task 3 Printing the reverse number and the sum of its digits==");
        int sum = 0;
        int number = 1234;
        while (number != 0) {
            int remainder = number % 10;
            sum += remainder;
            System.out.print(remainder);
            number /= 10;
        }
        System.out.println("\n" + sum);

        System.out.println("\n==Task 4 Printing numbers on multiple lines==");
        start = 1;
        finish = 30;
        int numbersInLine = 5;
        int counter = 0;
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
            int remainingZeros = 5 - (counter % numbersInLine);
            for (int i = 0; i < remainingZeros; i++) {
                System.out.printf("%4d", 0);
                counter++;
            }
            System.out.println();
        }

        System.out.println("\n\n==Task 5 Checking the number of twos for even/odd numbers==");
        number = 3242592;
        int reverseNumber = number;
        int countTwos = 0;
        int digit = 7;
        while (digit > 0) {
            int temp = number % 10;
            if (temp == 2) {
                countTwos++;
            }
            number /= 10;
            digit--;
        }
        String state = "";
        if (countTwos % 2 == 0) {
            state = "even";
        } else {
            state = "odd";
        }
        System.out.println("In " + reverseNumber + " " + state + 
                " the number of twos is " + countTwos);

        System.out.println("\n==Task 6 Displaying geometric shapes==");
        counter = 1;
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
            if (counter % 10 == 0) {
                System.out.println();
            }
            counter++;
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
            int symbols = 0;
            if (symbolsInLine == 3) {
                symbols = 2;
                isIncrement = false;
            }
            do {
                System.out.print("$");
                if (isIncrement) {
                    symbols++;
                } else {
                    symbols--;
                }
            } while (symbols <= symbolsInLine && symbols > 0);
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
            if (i >= 33 && i <= 48 && i % 2 != 0) {
                System.out.printf("%5s  %10s       %-20s%n", i, (char) i, Character.getName(i));
            } 
            if (i >= 97 && i <= 122 && i % 2 == 0) {
                System.out.printf("%5s  %10s       %-20s%n", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n==Task 8 Checking if a number is a palindrome==");
        number = 1234321;
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.printf("Число %d является палиндромом", originalNumber);
        } else {
            System.out.printf("Число %d не является палиндромом", originalNumber);
        }

        System.out.println("\n\n==Task 9 Checking if a number is lucky==");
        number = 123123;
        int numberFirstHalf = number / 1000;
        int numberSecondHalf = number % 1000;
        int resultFirstHalf = 0;
        int resultSecondHalf = 0;
        counter = 0;
        while (counter < 3) {
            resultFirstHalf += numberFirstHalf % 10;
            resultSecondHalf += resultSecondHalf % 10;
            numberFirstHalf /= 10;
            resultSecondHalf /= 10;
            counter++;
        }
        System.out.print("Number " + number);
        if (resultFirstHalf == resultSecondHalf) {
            System.out.println(" is happy)))");
        } else {
            System.out.println(" is not happy(((");
        }

        System.out.println("\n==Task 10 Display of the Pythagorean multiplication table==");
        System.out.printf("   %10s\n","Pythagorean table");
        System.out.print("   |");
        for (int i = 2; i < 10; i++) {
        System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.print("---+");
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