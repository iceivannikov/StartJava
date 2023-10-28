package com.startjava.lesson_2_3_4.guess;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.TOTAL_ROUND;

class Message {

    private final String[] messagesGuessNumberTest = {
            "\nThe game has begun! Each player has 10 attempts",
            "Do you want to continue playing? [yes/no]: ",
            "Enter the name of the %d player: "
    };

    private final String[] messageGuessNumber = {
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
            "%s has run out of attempts\n",
            "\nNumbers called by the player by name %s: "
    };

    public void printGameStartMsg() {
        System.out.println(messagesGuessNumberTest[0]);
    }

    public void printContinuationOrEndMsg() {
        System.out.print(messagesGuessNumberTest[1]);
    }

    public void printNamePlayerMsg(int index) {
        System.out.printf(messagesGuessNumberTest[2], index);
    }

    public void printNumberRound(int round) {
        System.out.printf(messageGuessNumber[0], round);
    }

    public void printComputerGuessedNumberMsg() {
        System.out.println(messageGuessNumber[1]);
    }

    public void printAnswerProcedureMsg() {
        System.out.println(messageGuessNumber[2]);
    }

    public void printInputNumberMsg(Player player) {
        System.out.printf(messageGuessNumber[3], player);
    }

    public void printRangeNumbersMsg() {
        System.out.println(messageGuessNumber[4]);
    }

    public void printTryAgainMsg() {
        System.out.println(messageGuessNumber[5]);
    }

    public void printAttemptsMsg(int guessNumber, Player player) {
        System.out.printf(messageGuessNumber[6], player, guessNumber, player.getAttempt());
    }

    public void printNumberGreaterOrLessMsg(int answerNumber, int guessNumber) {
        String greater = "greater";
        String less = "less";
        System.out.printf(messageGuessNumber[7], answerNumber, (answerNumber > guessNumber) ? greater : less);
    }

    public void printPlayerNameWinMsg(int round, Player player) {
        System.out.printf(messageGuessNumber[8], round, player);
    }

    public void printTotalWinsMsg(Player player) {
        System.out.printf(messageGuessNumber[9], player, player.getScore());
    }

    public void printRoundsRemaining(int round) {
        System.out.printf(messageGuessNumber[10], (TOTAL_ROUND - 1), (TOTAL_ROUND - 1 - round));
    }

    public void printEndedAttemptsMsg(Player player) {
        System.out.printf(messageGuessNumber[11], player);
    }

    public void printAllNumbersMsg(Player player) {
        System.out.printf(messageGuessNumber[12], player);
    }

    public void printAnswerNumber(int number) {
        System.out.printf("%d ", number);
    }

    public void printLineBreak() {
        System.out.println(" ");
    }
}
