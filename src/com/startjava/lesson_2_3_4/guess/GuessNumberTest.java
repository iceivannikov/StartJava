package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.*;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = YES;
        while (!option.equals(NO)) {
            if (option.equals(YES)) {
                System.out.println(GAME_START_MSG);
                System.out.print(NAME_FIRST_PLAYER_MSG);
                String name1 = sc.next();
                System.out.print(NAME_SECOND_PLAYER_MSG);
                String name2 = sc.next();
                GuessNumber game = new GuessNumber(name1, name2);
                game.start();
            }
            System.out.print(CONTINUATION_OR_END_MSG);
            option = sc.next();
            sc.nextLine();
        }
        sc.close();
    }
}