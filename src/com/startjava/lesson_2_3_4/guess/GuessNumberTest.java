package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.TOTAL_PLAYERS;

public class GuessNumberTest {
    private static final Scanner sc = new Scanner(System.in);
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        String option = YES;
        while (!option.equals(NO)) {
            if (option.equals(YES)) {
                Message.printGameStartMsg();
                String[] names = enterNames();
                GuessNumber game = new GuessNumber(names);
                game.start();
            }
            Message.printContinuationOrEndMsg();
            option = sc.next();
            sc.nextLine();
        }
        sc.close();
    }

    private static String[] enterNames() {
        String[] names = new String[TOTAL_PLAYERS];
        for (int i = 0; i < TOTAL_PLAYERS; i++) {
            Message.printNamePlayerMsg(i + 1);
            names[i] = sc.next();
        }
        return names;
    }
}