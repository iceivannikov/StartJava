package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.TOTAL_PLAYERS;

public class GuessNumberTest {
    private static final Message MESSAGE = new Message();
    private static final Scanner sc = new Scanner(System.in);
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        String option = YES;
        while (!option.equals(NO)) {
            if (option.equals(YES)) {
                MESSAGE.printGameStartMsg();
                String[] names = new String[TOTAL_PLAYERS];
                enteringNames(names);
                GuessNumber game = new GuessNumber(names);
                game.start();
            }
            MESSAGE.printContinuationOrEndMsg();
            option = sc.next();
            sc.nextLine();
        }
        sc.close();
    }

    private static void enteringNames(String[] names) {
        for (int i = 0; i < TOTAL_PLAYERS; i++) {
            MESSAGE.printNamePlayerMsg(i + 1);
            String name = sc.next();
            names[i] = name;
        }
    }
}