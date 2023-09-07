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


    }
}