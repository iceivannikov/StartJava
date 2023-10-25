package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = GuessNumberUtil.YES;
        while (!option.equals(GuessNumberUtil.NO)) {
            if (option.equals(GuessNumberUtil.YES)) {
                System.out.println(GuessNumberUtil.GAME_START_MSG);
                String[] names = new String[GuessNumberUtil.TOTAL_PLAYERS];
                for (int i = 0; i < GuessNumberUtil.TOTAL_PLAYERS; i++) {
                    System.out.printf(GuessNumberUtil.NAME_PLAYER_MSG, i + 1);
                    String name = sc.next();
                    names[i] = name;
                }
                GuessNumber game = new GuessNumber(names);
                game.start();
            }
            System.out.print(GuessNumberUtil.CONTINUATION_OR_END_MSG);
            option = sc.next();
            sc.nextLine();
        }
        sc.close();
    }
}