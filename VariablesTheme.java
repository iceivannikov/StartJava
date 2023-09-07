public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("==Task 1: Displaying computer characteristics==");
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
        boolean bluetooth = true;
        System.out.println("Model: " + model);
        System.out.println("Update frequency: " + updateFrequency);
        System.out.println("Storage: " + 1 + " Gb");
        System.out.println("Memory: " + memory + " Gb");
        System.out.println("Camera FaceTime HD " + camera + "p");
        System.out.println("Connecting to networks Wi‑Fi 6 " + wifi + " ax");
        System.out.println("Cable USB‑C/MagSafe 3 (2 " + meter + ")");
        System.out.println("Bluetooth 5.0 " + bluetooth);
        System.out.println();

        System.out.println("==Task 2: Calculation of the cost of goods with a discount==");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int totalPrice = 100 + 200;
        System.out.println("Total cost of pen and book: " + totalPrice);
        System.out.println("The amount of the discount when buying a pen and a book is " 
            + ((totalPrice * discount) / 100));
        System.out.println("The total cost of the pen and the discounted book: " 
            + (totalPrice - ((totalPrice * discount)/100)));
        System.out.println();

        System.out.println("==Task 3: Output of the word JAVA==");
        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a  ");
        System.out.println();

        System.out.println("==Task 4: Printing min and max values of integer numeric types==");
        byte num1 = 127;
        short num2 = 32_767;
        int num3 = 2_147_483_647;
        long num4 = 9_223_372_036_854_775_807L;
        System.out.println("Maximum value of type byte: " + num1);
        System.out.println("Value increased by one: " + ++num1);
        num1--;
        System.out.println("Value minus one: " + --num1);
        System.out.println();
        System.out.println("Maximum value of type short: " + num2);
        System.out.println("Value increased by one: " + ++num2);
        num2--;
        System.out.println("Value minus one: " + --num2);
        System.out.println();
        System.out.println("Maximum value of type int: " + num3);
        System.out.println("Value increased by one: " + ++num3);
        num3--;
        System.out.println("Value minus one: " + --num3);
        System.out.println();
        System.out.println("Maximum value of type long: " + num4);
        System.out.println("Value increased by one: " + ++num4);
        num4--;
        System.out.println("Value minus one: " + --num4);
        System.out.println();

    }
}