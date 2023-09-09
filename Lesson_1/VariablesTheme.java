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
        int discountedPrice = totalPrice * discount / 100;
        System.out.println("\nTotal cost of pen and book: " + totalPrice);
        System.out.println("The amount of the discount when buying a pen and a book is " 
                + discountedPrice);
        System.out.println("The total cost of the pen and the discounted book: " 
                + (totalPrice - discountedPrice));

        System.out.println("\n==Task 3: Output of the word JAVA==");
        System.out.println("\n   J    a  v     v  a     \n" +
                           "   J   a a  v   v  a a    \n" +
                           "J  J  aaaaa  V V  aaaaa   \n" +
                           " JJ  a     a  V  a     a  ");

        System.out.println("\n==Task 4: Printing min and max values of integer numeric types==");
        byte byteMaxValue = 127;
        short shortNaxValue = 32_767;
        int intMaxValue = 2_147_483_647;
        long longMaxValue = 9_223_372_036_854_775_807L;
        System.out.println("\nMaximum value of type byte: " + byteMaxValue);
        System.out.println("Value increased by one: " + ++byteMaxValue);
        System.out.println("Value minus one: " + --byteMaxValue);
        System.out.println("\nMaximum value of type short: " + shortNaxValue);
        System.out.println("Value increased by one: " + ++shortNaxValue);
        System.out.println("Value minus one: " + --shortNaxValue);
        System.out.println("\nMaximum value of type int: " + intMaxValue);
        System.out.println("Value increased by one: " + ++intMaxValue);
        System.out.println("Value minus one: " + --intMaxValue);
        System.out.println("\nMaximum value of type long: " + longMaxValue);
        System.out.println("Value increased by one: " + ++longMaxValue);
        System.out.println("Value minus one: " + --longMaxValue);

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
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("New variable values: variable a = " + a + ", variable b = " + b);
        System.out.println("\nRearranging variable values using the bitwise operation ^");
        System.out.println("Initial values of variables: variable a = " + 
                a + ", variable b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("New variable values: variable a = " + a + ", variable b = " + b);

        System.out.println("\n==Task 6: Output of characters and their codes==");
        char dollar = 36;
        char asterisk = 42;
        char atSign = 64;
        char verticalBar = 124;
        char tilde = 126;
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
        System.out.println("\nNumber " + number + " contains:");
        int hundred = number / 100;
        System.out.println("hundred: " + hundred);
        int tens = number / 10 % 10;
        System.out.println("tens: " + tens);
        int ones = number % 10;
        System.out.println("ones: " + ones);
        int sum = hundred + tens + ones;
        int multiplication = hundred * tens * ones;
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