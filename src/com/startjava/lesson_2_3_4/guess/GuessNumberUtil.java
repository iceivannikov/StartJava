package com.startjava.lesson_2_3_4.guess;

public class GuessNumberUtil {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 101;
    public static final String INPUT_NUMBER_MSG = "Player %s is your number: ";
    public static final String ATTEMPTS_MSG = "Player %s guessed %d with %d attempts\n";
    public static final String NUMBER_GREATER_OR_LESS_MSG = "The number %d is %s than what the computer guessed\n";
    public static final String GREATER = "greater";
    public static final String LESS = "less";
    public static final String ENDED_ATTEMPTS_MSG = "%s has run out of attempts\n";
    public static final String ALL_NUMBERS_MSG = "\nNumbers called by the player by name %s: ";
    public static final String COMPUTER_GUESSED_NUMBER_MSG = "The computer guessed a number";

    public static final String YES = "yes";
    public static final String NO = "no";
    public static final String GAME_START_MSG = "\nThe game has begun! Each player has 10 attempts";
    public static final String NAME_FIRST_PLAYER_MSG = "Enter the name of the first player: ";
    public static final String NAME_SECOND_PLAYER_MSG = "Enter the name of the second player: ";
    public static final String CONTINUATION_OR_END_MSG = "Do you want to continue playing? [yes/no]: ";

    public static final int COUNT_ATTEMPTS = 10;

    private GuessNumberUtil() {
    }
}
