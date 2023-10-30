package com.startjava.lesson_2_3_4.guess;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.TOTAL_ROUND;

class Message {

    private static final String[] messagesGuessNumberTest = {
            "\nThe game has begun! Each player has 10 attempts",
            "Do you want to continue playing? [yes/no]: ",
            "Enter the name of the %d player: "
    };

    private static final String[] messageGuessNumber = {
            "Round: %d\n",
            "The computer guessed a number",
            "The answer order is determined randomly, be careful",
            "Player %s is your number: ",
            "The number must be in the range from 0 to 100",
            "Try again",
            "Player %s guessed %d with %d attempts\n",
            "The number %d is %s than what the computer guessed\n",
            "In round no. %d winner is the player named %s\n",
            "Total wins player %s: %d\n",
            "Total rounds %d, rounds left %d\n",
            "The player named %s has run out of attempts\n",
            "\nNumbers called by the player by name %s: "
    };

    private Message() {
    }

    public static void printGameStartMsg() {
        System.out.println(messagesGuessNumberTest[0]);
    }

    public static void printContinuationOrEndMsg() {
        System.out.print(messagesGuessNumberTest[1]);
    }

    public static void printNamePlayerMsg(int index) {
        System.out.printf(messagesGuessNumberTest[2], index);
    }

    public static void printStartRoundMsg(int round) {
        System.out.printf(messageGuessNumber[0], round);
        System.out.println(messageGuessNumber[1]);
        System.out.println(messageGuessNumber[2]);
    }

    public static void printInputNumberMsg(String name) {
        System.out.printf(messageGuessNumber[3], name);
    }

    public static void printInvalidInputMsg() {
        System.out.println(messageGuessNumber[4]);
        System.out.println(messageGuessNumber[5]);
    }

    public static void printNumberGreaterOrLessMsg(int answerNumber, int guessNumber) {
        String greater = "greater";
        String less = "less";
        System.out.printf(messageGuessNumber[7], answerNumber, (answerNumber > guessNumber) ? greater : less);
    }

    public static void printWinnerInfoMsg(int guessNumber, int round, Player player) {
        System.out.printf(messageGuessNumber[8], round, player.getName());
        System.out.printf(messageGuessNumber[6], player.getName(), guessNumber, player.getAttempt());
        System.out.printf(messageGuessNumber[10], (TOTAL_ROUND - 1), (TOTAL_ROUND - 1 - round));
    }

    public static void printTotalWinsMsg(Player player) {
        System.out.printf(messageGuessNumber[9], player.getName(), player.getScore());
    }

    public static void printEndedAttemptsMsg(String name) {
        System.out.printf(messageGuessNumber[11], name);
    }

    public static void printAllNumbersMsg(String name) {
        System.out.printf(messageGuessNumber[12], name);
    }

    public static void printAnswerNumber(int number) {
        System.out.printf("%d ", number);
    }

    public static void printLineBreak() {
        System.out.println(" ");
    }
}
