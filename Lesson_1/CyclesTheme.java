public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n==Task 1 Counting the sum of even and odd numbers==");
        int x = 0;
        int y = 0;
        int start = -10;
        int finish = 21;
        int i = start;
        do {
            if (i % 2 == 0) {
                x += i;
            } else {
                y += i;
            }
            i++;
        } while (i <= finish);
        System.out.println("In the segment [" + start + ", " + finish + "]" + 
                ", the sum of even numbers = " + x + ", and the sum of odd numbers = " + y);

        System.out.println("\n==Task 2 Display numbers in descending order==");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num3 > num1 && num1 < num2) {
            min = num1;
        } else if (num1 > num3 && num3 < num2) {
            min = num3;
        } else if (num1 > num2 && num2 < num3) {
            min = num2;
        }
        if (num3 < num1 && num1 > num2) {
            max = num1;
        } else if (num1 < num3 && num3 > num2) {
            max = num3;
        } else if (num1 < num2 && num2 > num3) {
            max = num2;
        }
        for (int j = min; j <= max; j++) {
            System.out.print(j);
        }

        System.out.println("\n\n==Task 3 Printing the reverse number and the sum of its digits==");
        int num = 1234;
        int sum = 0;
        int k = 4;
        while (k > 0) {
            int tmp = num % 10;
            sum += tmp;
            System.out.print(tmp);
            num /= 10;
            k--;
        }
        System.out.println("\n" + sum);

        System.out.println("\n==Task 4 Printing numbers on multiple lines==");
        int lastNumber = 30;
        int length = 30;
        int counter = 1;
        for (int z = 1; z <= length; z++) {
            if (z % 2 != 0 && z > lastNumber) {
                System.out.printf("%4d", 0);
            }
            if (z % 2 != 0 && z < lastNumber) { 
                System.out.printf("%4d", z);
                if (counter % 5 == 0) {
                    System.out.println();
                }
            counter++;
            }
        }

        System.out.println("\n\n==Task 5 Checking the number of twos for even/odd numbers==");
        int number = 3242592;
        int numberRes = number;
        int count = 0;
        int q = 7;
        while (q > 0) {
            int temp = number % 10;
            if (temp == 2) {
                count++;
            }
            number /= 10;
            q--;
        }
        String parityNumber = "";
        if (count % 2 == 0) {
            parityNumber = "even";
        } else {
            parityNumber = "odd";
        }
        System.out.println("In " + numberRes + " " + parityNumber + " the number of twos is " + 
                count);

        System.out.println("\n==Task 6 Displaying geometric shapes==");
        int countForTask6 = 1;
        for (int e = 0; e < 50; e++) {
            System.out.print("*");
            if (countForTask6 % 10 == 0) {
                System.out.println();
            }
            countForTask6++;
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

        int line = 1;
        boolean isIncrement = true;
        int sizeMaxLine = 0;
        do {
            int symbols = 0;
            if (sizeMaxLine == 3) {
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
            } while (symbols <= sizeMaxLine && symbols > 0);
            System.out.println();
            if (isIncrement) {
                sizeMaxLine++;
            } else {
                sizeMaxLine--;
            }
            line++;
        } while (line <= 5);

        System.out.println("\n==Task 7 Displaying ASCII characters==");
        System.out.printf(" %5s   %10s   %10s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int a = 15; a <= 255; a++) {
            if (a >= 33 && a <= 48 && a % 2 != 0) {
                System.out.printf("%5s  %10s       %-20s%n", a, (char) a, Character.getName(a));
            } 
            if (a >= 97 && a <= 122 && a % 2 == 0) {
                System.out.printf("%5s  %10s       %-20s%n", a, (char) a, Character.getName(a));
            }
        }

        System.out.println("\n==Task 8 Checking if a number is a palindrome==");
        int numb = 1234321;
        int originalNumber = numb;
        int reversedNumber = 0;
        while (numb != 0) {
            int remainder = numb % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            numb /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.printf("Число %d является палиндромом", originalNumber);
        } else {
            System.out.printf("Число %d не является палиндромом", originalNumber);
        }

        System.out.println("\n\n==Task 9 Checking if a number is lucky==");
        int numTask9 = 123123;
        int numFirstPart = numTask9 / 1000;
        int numLastPart = numTask9 % 1000;
        int resultFirstPart = 0;
        int resultLastPart = 0;
        int g = 0;
        while (g < 3) {
            resultFirstPart += numFirstPart % 10;
            resultLastPart += numLastPart % 10;
            numFirstPart /= 10;
            numLastPart /= 10;
            g++;
        }
        System.out.print("Number " + numTask9);
        if (resultFirstPart == resultLastPart) {
            System.out.println(" is happy)))");
        } else {
            System.out.println(" is not happy(((");
        }

        System.out.println("\n==Task 10 Display of the Pythagorean multiplication table==");
        System.out.printf("   %10s\n","Pythagorean table");
        System.out.print("   |");
        for (int z = 2; z < 10; z++) {
        System.out.printf("%4d", z);
        }
        System.out.println();
        System.out.print("---+");
        for (int v = 2; v < 10; v++) {
        System.out.print("----");
        }
        System.out.println();
        for (int h = 2; h <= 9; h++) {
            System.out.printf("%3d|", h);
            for(int l = 2; l <= 9; l++) {
                System.out.printf("%4d", h * l);
            }
            System.out.println();
        }
    }
}