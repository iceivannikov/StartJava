package com.startjava.lesson_1.base;

public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("\n==Task 1: Displaying computer characteristics==");
        String model = "MacBook Pro";
        byte storage = 1;
        short updateFrequency = 120;
        int memory = 32;
        long camera = 1080;
        float wifi = 802.11f;
        double thickness = 1.68;
        double length = 35.57;
        double width = 24.81;
        double weight = 2.17;
        char meter = 'm';
        boolean isBluetooth = true;
        System.out.println("\nModel: " + model);
        System.out.println("Update frequency: " + updateFrequency);
        System.out.println("Storage: " + storage + " Gb");
        System.out.println("Memory: " + memory + " Gb");
        System.out.println("Camera FaceTime HD " + camera + "p");
        System.out.println("Connecting to networks Wi‑Fi 6 " + wifi + " ax");
        System.out.println("Cable USB‑C/MagSafe 3 (2 " + meter + ")");
        System.out.println("Bluetooth 5.0 " + isBluetooth);

        System.out.println("\n==Task 2: Calculation of the cost of goods with a discount==");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int totalPrice = penPrice + bookPrice;
        int discountPrice = totalPrice * discount / 100;
        System.out.println("\nTotal cost : " + totalPrice);
        System.out.println("Amount of the discount " + discountPrice);
        System.out.println("Total price with discount: " + (totalPrice - discountPrice));

        System.out.println("\n==Task 3: Output of the word JAVA==");
        System.out.println("\n   J    a  v     v  a     \n" + "   J   a a  v   v  a a    \n" +
                "J  J  aaaaa  V V  aaaaa   \n" + " JJ  a     a  V  a     a  ");

        System.out.println("\n==Task 4: Printing min and max values of integer numeric types==");
        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("\nMaximum value of type byte: " + byteMax);
        System.out.println("Value increased by one: " + ++byteMax);
        System.out.println("Value minus one: " + --byteMax);
        System.out.println("\nMaximum value of type short: " + shortMax);
        System.out.println("Value increased by one: " + ++shortMax);
        System.out.println("Value minus one: " + --shortMax);
        System.out.println("\nMaximum value of type int: " + intMax);
        System.out.println("Value increased by one: " + ++intMax);
        System.out.println("Value minus one: " + --intMax);
        System.out.println("\nMaximum value of type long: " + longMax);
        System.out.println("Value increased by one: " + ++longMax);
        System.out.println("Value minus one: " + --longMax);

        System.out.println("\n==Task 5: Rearranging Variable Values==");
        int a = 2;
        int b = 5;
        System.out.println("\nVariable a = " + a + ", variable b = " + b);
        System.out.println("\nChange the values of these variables using the third variable");
        System.out.println("Initial values of variables: variable a = " + 
                a + ", variable b = " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("New variable values: Variable a = " + a + ", variable b = " + b);
        System.out.println("\nRearranging variable values using arithmetic operations");
        System.out.println("Initial values of variables: variable a = " + 
                a + ", variable b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("New variable values: variable a = " + a + ", variable b = " + b);
        System.out.println("\nRearranging variable values using the bitwise operation ^");
        System.out.println("Initial values of variables: variable a = " + 
                a + ", variable b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("New variable values: variable a = " + a + ", variable b = " + b);

        System.out.println("\n==Task 6: Output of characters and their codes==");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("\nCharacter code: " + (int) dollar + 
                ", corresponding character: " + dollar);
        System.out.println("Character code: " + (int) asterisk + 
                ", corresponding character: " + asterisk);
        System.out.println("Character code: " + (int) atSign + 
                ", corresponding character: " + atSign);
        System.out.println("Character code: " + (int) verticalBar + 
                ", corresponding character: " + verticalBar);
        System.out.println("Character code: " + (int) tilde + 
                ", corresponding character: " + tilde);

        System.out.println("\n==Task 7: Duke's ASCII art console output==");
        char underscore = '_';
        char slash = '/';
        char backslash = '\\';
        char rightParenthesis = '(';
        char leftParenthesis = ')';
        System.out.println("\n    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + rightParenthesis 
                + " " + leftParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash
                + backslash + underscore + underscore + backslash);

        System.out.println("\n==Task 8: Outputting the number of hundreds" + 
                ", tens and units of a number==");
        int number = 123;
        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        int multiplication = hundreds * tens * ones;
        System.out.println("\nNumber " + number + " contains:");
        System.out.println("hundred: " + hundreds);
        System.out.println("tens: " + tens);
        System.out.println("ones: " + ones);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Multiplication: " + multiplication);

        System.out.println("\n==Task 9: Time output==\n");
        int timeInSeconds = 86399;
        int hh = timeInSeconds / 3600;
        int mm = timeInSeconds / 60 % 60;
        int ss = timeInSeconds % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}