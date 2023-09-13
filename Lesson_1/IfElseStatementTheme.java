public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n==Task 1: Translating pseudocode into Java==");
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

        char firstLetterName = "Maksim".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("First letter of name - M");
        } else if (firstLetterName == 'I') {
            System.out.println("First letter of name - I");
        } else {
            System.out.println("No suitable options");
        }

        System.out.println("\n==Task 2: Search for more number==");
        int a = 5; 
        int b = 10;
        if (a < b) {
            System.out.println("a less b");
        } else if (a > b) {
            System.out.println("a larger b");
        } else {
            System.out.println("a equals b");
        }

        System.out.println("\n==Task 3: Checking the number==");
        int num = 1;
        boolean lessZero = num < 0;
        boolean aboveZero = num > 0;
        boolean even = num % 2 ==0;
        boolean odd = num % 2 !=0;
        String number = "Number ";
        String negative = " is negative";
        String positive = " is positive";
        String andEven = " and even";
        String andOdd = " and odd";
        if (num == 0) {
            System.out.println("The number is zero");
        } else if (lessZero && even) {
            System.out.println(number + num + negative + andEven);
        } else if (lessZero && odd) {
            System.out.println(number + num + negative + andOdd);
        } else if (aboveZero&& even) {
            System.out.println(number + num + positive + andEven);
        } else {
            System.out.println(number + num + positive + andOdd);
        }

        System.out.println("\n==Task 4: Finding the same digits in numbers==");
        int c = 152; 
        int d = 443;
        int hundredsC = c / 100;
        int hundredsD = d / 100;
        int tensC = c / 10 % 10;
        int tensD = d / 10 % 10;
        int onesC = c % 10;
        int onesD = d % 10;
        if (hundredsC != hundredsD && tensC != tensD && onesC != onesD) {
            System.out.println("The numbers in the digits are different");
        } else if (hundredsC == hundredsD) {
            System.out.println("Numbers " + c + " " + d + " have the same digits " + hundredsC  + 
                " and " + hundredsD + ", place number " + hundredsC);
        } else if (tensC == tensD) {
            System.out.println("Numbers " + c + " " + d + " have the same digits " + tensC + 
                " and " + tensD + ", place number " + tensC);
        } else if (onesC == onesD) {
            System.out.println("Numbers " + c + " " + d + " have the same digits " + onesC + 
                " and " + onesD + ", place number " + onesC);
        } 

        System.out.println("\n==Task 5: Determining a symbol by its code==");
        char symbol = '1';
        if (symbol >= 97 && symbol <= 122) {
            System.out.println("Symbol " + symbol + " is a small letter");
        } else if (symbol >= 65 && symbol <= 90) {
            System.out.println("Symbol " + symbol + " is a capital letter");
        } else if (symbol >= 48 && symbol <= 57) {
            System.out.println("Symbol " + symbol + " is a number");
        } else {
            System.out.println("Symbol " + symbol + " is not a number or letter");
        }

        System.out.println("\n==Task 6: Calculation of the deposit amount and interest" +
            " accrued by the bank==");
        int depositAmount = 301_000;
        if (depositAmount < 100_000) {
            System.out.println("Deposit amount: " + depositAmount + 
                ", amount of accrued interest: " + (depositAmount / 100 * 5) + 
                ", total amount with interest: " + (depositAmount + (depositAmount / 100 * 5)));
        } else if (depositAmount >= 100_000 && depositAmount <= 300_000) {
            System.out.println("Deposit amount: " + depositAmount + 
                ", amount of accrued interest: " + (depositAmount / 100 * 7) + 
                ", total amount with interest: " + (depositAmount + (depositAmount / 100 * 7)));
        } else if (depositAmount > 300_000) {
            System.out.println("Deposit amount: " + depositAmount + 
                ", amount of accrued interest: " + (depositAmount / 100 * 10) + 
                ", total amount with interest: " + (depositAmount + (depositAmount / 100 * 10)));
        }

        System.out.println("\n==Task 7: Determining grades by subject==");
        int historyPercentage = 59;
        int programmingPercentage = 91;
        int historyGrade = 0;
        int programmingGrade = 0;
        if (historyPercentage <= 60) {
            historyGrade = 2;
        } else if (historyPercentage > 60 && historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage > 73 && historyPercentage <=91) {
            historyGrade = 4;
        } else if (historyPercentage > 91) {
            historyGrade = 5;
        }
        if (programmingPercentage <= 60) {
            programmingGrade = 2;
        } else if (programmingPercentage > 60 && programmingPercentage <= 73) {
            programmingGrade = 3;
        } else if (programmingPercentage > 73 && programmingPercentage <=91) {
            programmingGrade = 4;
        } else if (programmingPercentage > 91) {
            programmingGrade = 5;
        }
        int averageGrades = (historyGrade + programmingGrade) / 2;
        int averagePercentage = (historyPercentage + programmingPercentage) / 2;
        System.out.println("History grade: " + historyGrade);
        System.out.println("Programming grade: " + programmingGrade);
        System.out.println("Average grades in subjects: " + averageGrades);
        System.out.println("Average percentage by subject: " + averagePercentage);

        System.out.println("\n==Task 8: Calculation of annual profit==");
        int salesPerMonth = 14_000;
        int rent = 5_000;
        int productionCost = 9_000;
        int profit = (salesPerMonth * 12) - ((rent * 12) + (productionCost * 12));
        if (profit > 0) {
            System.out.println("Profit for the year: +" + profit);
        } else if (profit < 0) {
            System.out.println("Profit for the year: " + profit);
        } else {
            System.out.println("Profit for the year: " + profit);
        }
    }
}