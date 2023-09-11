public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n==Task 1: Translating pseudocode into Java==\n");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("female");
        } else {
            System.out.println("male");
        }

        int age = 20;
        if (age > 18) {
            System.out.println("age larger 18");
        } else {
            System.out.println("age less 18");
        }

        double height = 2.3;
        if (height < 1.8) {
            System.out.println("height larger 1.8");
        } else {
            System.out.println("height less 1.8");
        }

        String name = "Maksim";
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("First letter of name - M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("First letter of name - I");
        } else {
            System.out.println("No suitable options");
        }

        System.out.println("\n==Task 2: Search for more number==\n");
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
        }
        if (x < 0 && x % 2 ==0) {
            System.out.println("Number " + x + " is negative and even");
        } else if (x < 0 && x % 2 !=0) {
            System.out.println("Number " + x + " is negative and odd");
        } else if (x > 0 && x % 2 ==0) {
            System.out.println("Number " + x + " is positive and even");
        } else {
            System.out.println("Number " + x + " is positive and odd");
        }

        System.out.println("\n==Task 4: Finding the same digits in numbers==\n");
        int c = 153, d = 443;
        int hundredsC = c / 100;
        int hundredsD = d / 100;
        int tensC = c / 10 % 10;
        int tensD = d / 10 % 10;
        int onesC = c % 10;
        int onesD = d % 10;
        int hundreds = 3;
        int tens = 2;
        int ones = 1;
        if (hundredsC != hundredsD && tensC != tensD && onesC != onesD) {
            System.out.println("The numbers in the digits are different");
        }
        if (hundredsC == hundredsD && tensC == tensD && onesC == onesD) {
            System.out.println("Numbers " + c + " " + d + " have the same digits " + hundredsC  + 
                " and " + hundredsD + ", place number " + hundreds + ", " + tensC + " and " + tensD
                + ", place number " + tens + ", " + onesC + " and " + onesD + ", place number " +
                ones);
        } else if (hundredsC == hundredsD && tensC == tensD) {
            System.out.println("Numbers " + c + " " + d + " have the same digits " + hundredsC + 
                " and " + hundredsD + ", place number " + hundreds + ", " + tensC + " and " + tensD
                + ", place number " + tens);
        } else if (tensC == tensD && onesC == onesD) {
            System.out.println("Numbers " + c + " " + d + " have the same digits " + tensC + 
                " and " + tensD + ", place number " + tens + ", " + onesC + " and " + onesD + 
                ", place number " + ones);
        } else if (hundredsC == hundredsD && onesC == onesD) {
            System.out.println("Numbers " + c + " " + d + " have the same digits " + hundredsC  + 
                " and " + hundredsD + ", place number " + hundreds + ", " + onesC + " and " + 
                onesD + ", place number " + ones);
        } else if (hundredsC == hundredsD) {
            System.out.println("Numbers " + c + " " + d + " have the same digits " + hundredsC + 
                " and " + hundredsD + ", place number " + hundreds);
        } else if (tensC == tensD) {
            System.out.println("Numbers " + c + " " + d + " have the same digits " + tensC + 
                " and " + tensD + ", place number " + tens);
        } else if (onesC == onesD) {
            System.out.println("Numbers " + c + " " + d + " have the same digits " + onesC + 
                " and " + onesD + ", place number " + ones);
        }

        System.out.println("\n==Task 5: Determining a symbol by its code==\n");
        char ch = '\u0031';
        if (ch >= 97 && ch <= 122) {
            System.out.println("Symbol " + ch + " is a small letter");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("Symbol " + ch + " is a capital letter");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("Symbol " + ch + " is a number");
        } else {
            System.out.println("Symbol " + ch + " is not a number or letter");
        }
    }
}