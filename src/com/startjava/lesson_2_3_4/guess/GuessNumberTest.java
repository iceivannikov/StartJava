package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = "yes";
        while (!option.equals("no")) {
            if (option.equals("yes")) {
                System.out.println("\nThe game has begun! Each player has 10 attempts");
                System.out.print("Enter the name of the first player: ");
                String name1 = sc.next();
                System.out.print("Enter the name of the second player: ");
                String name2 = sc.next();
                GuessNumber game = new GuessNumber(name1, name2);
                game.start();
            }
            System.out.print("Do you want to continue playing? [yes/no]: ");
            option = sc.next();
            sc.nextLine();
        }
        sc.close();
    }
}