package com.startjava.lesson_2_3_4.guess;

public class GuessNumberUtil {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 101;
    public static final int MAX_ATTEMPTS = 10;
    public static final String INPUT_NUMBER_MSG = "Player %s is your number: ";
    public static final String ATTEMPTS_MSG = "Player %s guessed %d with %d attempts\n";
    public static final String NUMBER_GREATER_OR_LESS_MSG = "The number %d is %s than what the computer guessed\n";
    public static final String GREATER = "greater";
    public static final String LESS = "less";
    public static final String ENDED_ATTEMPTS_MSG = "%s has run out of attempts\n";
    public static final String ALL_NUMBERS_MSG = "\nNumbers called by the player by name %s: ";
    public static final String COMPUTER_GUESSED_NUMBER_MSG = "The computer guessed a number";
    public static final String TRY_AGAIN_MSG = "Try again";
    public static final String RANGE_NUMBERS_MSG = "The number must be in the range from 0 to 100";
    public static final String ANSWER_PROCEDURE_MSG = "The answer order is determined randomly, be careful";
    public static final String PLAYER_NAME_WIN_MSG = "winner is the player named %s\n";
    public static final int TOTAL_ROUND = 4;
    public static final String TOTAL_WINS_MSG = "Total wins player %s: %d\n";
    public static final String ROUND_NO_MSG = "In round no. %d ";

    public static final String YES = "yes";
    public static final String NO = "no";
    public static final String GAME_START_MSG = "\nThe game has begun! Each player has 10 attempts";
    public static final String NAME_FIRST_PLAYER_MSG = "Enter the name of the first player: ";
    public static final String NAME_SECOND_PLAYER_MSG = "Enter the name of the second player: ";
    public static final String NAME_THIRD_PLAYER_MSG = "Enter the name of the third player: ";
    public static final String CONTINUATION_OR_END_MSG = "Do you want to continue playing? [yes/no]: ";

    public static final int COUNT_ATTEMPTS = 10;

    private GuessNumberUtil() {
    }
}
