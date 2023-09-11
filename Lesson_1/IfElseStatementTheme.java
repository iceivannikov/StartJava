public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n==Task 1: Translating pseudocode into Java==\n");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("female\n");
        } else {
            System.out.println("male\n");
        }

        int age = 20;
        if (age > 18) {
            System.out.println("age larger 18\n");
        } else {
            System.out.println("age less 18\n");
        }

        double height = 2.3;
        if (height < 1.8) {
            System.out.println("height larger 1.8\n");
        } else {
            System.out.println("height less 1.8\n");
        }

        String name = "Maksim";
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("First letter of name - M\n");
        } else if (firstLetterOfName == 'I') {
            System.out.println("First letter of name - I\n");
        } else {
            System.out.println("No suitable options\n");
        }

        System.out.println("==Task 2: Search for more number==\n");
        int a = 5, b = 10;
        if (a < b) {
            System.out.println("a less b");
        } else if (a > b) {
            System.out.println("a larger b");
        } else {
            System.out.println("a equals b");
        }

        System.out.println("\n==Task 3: Checking the number==\n");
        int x = 0;
        if (x == 0) {
            System.out.println("The number is zero");
        } else if (x < 0 && x % 2 ==0) {
            System.out.println("Number " + x + " is negative and even");
        } else if (x < 0 && x % 2 !=0) {
            System.out.println("Number " + x + " is negative and odd");
        } else if (x > 0 && x % 2 ==0) {
            System.out.println("Number " + x + " is positive and even");
        } else {
            System.out.println("Number " + x + " is positive and odd");
        }
    }
}