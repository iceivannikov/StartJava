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
    }
}