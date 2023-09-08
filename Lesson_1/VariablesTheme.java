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
        System.out.println("Storage: " + 1 + " Gb");
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
        System.out.println("\nTotal cost of pen and book: " + totalPrice);
        System.out.println("The amount of the discount when buying a pen and a book is " 
                + ((totalPrice * discount) / 100));
        System.out.println("The total cost of the pen and the discounted book: " 
                + (totalPrice - ((totalPrice * discount) / 100)));

        System.out.println("\n==Task 3: Output of the word JAVA==");
        System.out.println("\n   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a  ");

        System.out.println("\n==Task 4: Printing min and max values of integer numeric types==");
        byte num1 = 127;
        short num2 = 32_767;
        int num3 = 2_147_483_647;
        long num4 = 9_223_372_036_854_775_807L;
        System.out.println("\nMaximum value of type byte: " + num1);
        System.out.println("Value increased by one: " + ++num1);
        num1--;
        System.out.println("Value minus one: " + --num1);
        System.out.println("\nMaximum value of type short: " + num2);
        System.out.println("Value increased by one: " + ++num2);
        num2--;
        System.out.println("Value minus one: " + --num2);
        System.out.println("\nMaximum value of type int: " + num3);
        System.out.println("Value increased by one: " + ++num3);
        num3--;
        System.out.println("Value minus one: " + --num3);
        System.out.println("\nMaximum value of type long: " + num4);
        System.out.println("Value increased by one: " + ++num4);
        num4--;
        System.out.println("Value minus one: " + --num4);

        System.out.println("\n==Task 5: Rearranging Variable Values==");
        int number1 = 2;
        int number2 = 5;
        System.out.println("\nVariable number1 = " + number1 + ", variable number2 = " + number2);
        System.out.println("\nChange the values of these variables using the third variable");
        System.out.println("Initial values of variables: variable number1 = " + 
                number1 + ", variable number2 = " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("New variable values: Variable number1 = " + number1 
                + ", variable number2 = " + number2);
        System.out.println("\nRearranging variable values using arithmetic operations");
        System.out.println("Initial values of variables: variable number1 = " + 
                number1 + ", variable number2 = " + number2);
        int difference = number1 - number2;
        number1 -= difference;
        number2 += difference;
        System.out.println("New variable values: variable number1 = " + number1 
                + ", variable number2 = " + number2);
        System.out.println("\nRearranging variable values using the bitwise operation ^");
        System.out.println("Initial values of variables: variable number1 = " + 
                number1 + ", variable number2 = " + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("New variable values: variable number1 = " + number1 
                + ", variable number2 = " + number2);

        System.out.println("\n==Task 6: Output of characters and their codes==");
        char ch1 = 36;
        char ch2 = 42;
        char ch3 = 64;
        char ch4 = 124;
        char ch5 = 126;
        System.out.println("\nCharacter code: " + (int) ch1 + ", corresponding character: " + ch1);
        System.out.println("Character code: " + (int) ch2 + ", corresponding character: " + ch2);
        System.out.println("Character code: " + (int) ch3 + ", corresponding character: " + ch3);
        System.out.println("Character code: " + (int) ch4 + ", corresponding character: " + ch4);
        System.out.println("Character code: " + (int) ch5 + ", corresponding character: " + ch5);

        System.out.println("\n==Task 7: Duke's ASCII art console output==");
        char underscore = '_';
        char slash = '/';
        char backslash = '\\';
        char rightParenthesis = '(';
        char leftParenthesis = ')';
        System.out.println("\n    " + slash + backslash + "     ");
        System.out.println("   " + slash + "  " + backslash + "      ");
        System.out.println("  " + slash + underscore + rightParenthesis + " " + leftParenthesis
                + backslash + "   ");
        System.out.println(" " + slash + "      " + backslash + "  ");
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash
                + backslash + underscore + underscore + backslash + " ");

        System.out.println("\n==Task 8: Outputting the number of hundreds" + 
                ", tens and units of a number==");
        int number10 = 123;
        System.out.println("\nNumber " + number10 + " contains:");
        int hundred = number10 / 100;
        System.out.println("hundred:" + hundred);
        int tens = number10 / 10;
        System.out.println("tens: " + tens);
        int units = number10 / 1;
        System.out.println("units: " + units);
        int firstNum = number10 % 10;
        int secondNum = ((number10 / 10) % 10);
        int thirdNum = ((number10 / 100) % 10);
        System.out.println("Sum of digits: " + (firstNum + secondNum + thirdNum));
        System.out.println("Multiplication: " + (firstNum * secondNum * thirdNum));

        System.out.println("\n==Task 9: Time output==\n");
        int timeInSeconds = 86399;
        int hours = timeInSeconds / 3600;
        int minutes = timeInSeconds / 60 % 60;
        int seconds = timeInSeconds / 1 % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));

    }
}