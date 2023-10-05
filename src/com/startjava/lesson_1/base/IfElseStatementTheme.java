package com.startjava.lesson_1.base;

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
        int num = -10;
        if (num == 0) {
            System.out.println(num);
        } else {
            System.out.print("Number " + num + " is ");
            if (num > 0) {
                System.out.print("positive ");
            } else {
                System.out.print("negative ");
            }
            if (num % 2 == 0) {
                System.out.println("and even");
            } else {
                System.out.println("and odd");
            }
        }

        System.out.println("\n==Task 4: Finding the same digits in numbers==");
        int c = 342;
        int d = 252;
        int hundredsC = c / 100;
        int hundredsD = d / 100;
        int tensC = c / 10 % 10;
        int tensD = d / 10 % 10;
        int onesC = c % 10;
        int onesD = d % 10;
        if (hundredsC != hundredsD && tensC != tensD && onesC != onesD) {
            System.out.println("There are no equal numbers");
        } else {
            System.out.print("Numbers " + c + " and " + d + " have the same digits");
            if (hundredsC == hundredsD) {
                System.out.print(", " + hundredsC + " and " + hundredsD + " place number " + 3);
            }
            if (tensC == tensD) {
                System.out.print(", " + tensC + " and " + tensD + " place number " + 2);
            }
            if (onesC == onesD) {
                System.out.print(", " + onesC + " and " + onesD + " place number " + 1);
            }
        }

        System.out.println("\n\n==Task 5: Determining a symbol by its code==");
        char symbol = '1';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Symbol " + symbol + " is a small letter");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Symbol " + symbol + " is a capital letter");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Symbol " + symbol + " is a number");
        } else {
            System.out.println("Symbol " + symbol + " is not a number or letter");
        }

        System.out.println("\n==Task 6: Calculation of the deposit amount and interest" +
                " accrued by the bank==");
        int depositAmount = 301_000;
        int percent = 5;
        if (depositAmount >= 100_000 && depositAmount <= 300_000) {
            percent = 7;
        } else if (depositAmount > 300_000) {
            percent = 10;
        }
        int percentAmount = depositAmount / 100 * percent;
        System.out.println("Deposit amount: " + depositAmount + ", amount of accrued interest: " + 
                percentAmount + ", total amount with interest: " + (depositAmount + percentAmount));

        System.out.println("\n==Task 7: Determining grades by subject==");
        int historyPercent = 59;
        int historyGrade = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        int programmingPercent = 91;
        int programmingGrade = 2;
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        int averageGrades = (historyGrade + programmingGrade) / 2;
        int averagePercent = (historyPercent  + programmingPercent) / 2;
        System.out.println("History grade: " + historyGrade);
        System.out.println("Programming grade: " + programmingGrade);
        System.out.println("Average grades in subjects: " + averageGrades);
        System.out.println("Average percentage by subject: " + averagePercent);

        System.out.println("\n==Task 8: Calculation of annual profit==");
        int salesPerMonth = 14_000;
        int rent = 5_000;
        int productionCost = 9_000;
        int profit = (salesPerMonth - rent - productionCost) * 12;
        if (profit > 0) {
            System.out.println("Profit for the year: +" + profit);
        } else {
            System.out.println("Profit for the year: " + profit);
        }
    }
}