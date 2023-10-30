package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.*;

public class GuessNumber {
    private static final int MIN_NUMBER = 1;
    private final Scanner sc = new Scanner(System.in);
    private final Player[] players = new Player[TOTAL_PLAYERS];
    private int round = 1;

    public GuessNumber(String[] names) {
        for (int i = 0; i < TOTAL_PLAYERS; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void start() {
        Random random = new Random();
        castLots();
        while (round < TOTAL_ROUND) {
            int guessNumber = random.nextInt(MIN_NUMBER, MAX_NUMBER);
            Message.printNumberRound(round);
            Message.printComputerGuessedNumberMsg();
            Message.printAnswerProcedureMsg();
            int answerNumber = 0;
            while (answerNumber != guessNumber && hasAttempts()) {
                for (Player player : players) {
                    answerNumber = inputAnswer(player);
                    if (isGuessed(guessNumber, player)) {
                        break;
                    }
                    isAttemptsEnded(player);
                }
            }
            printAllAnswer();
            clear();
            round++;
        }
    }

    private void castLots() {
        for (int i = players.length - 1; i > 1; i--) {
            int index = (int) (Math.random() * (i + 1));
            Player swap = players[index];
            players[index] = players[i];
            players[i] = swap;
        }
    }

    private boolean hasAttempts() {
        return players[players.length - 1].getAttempt() != MAX_ATTEMPTS;
    }

    private int inputAnswer(Player player) {
        Message.printInputNumberMsg(player.getName());
        int number = sc.nextInt();
        while (!player.addNumber(number)) {
            Message.printRangeNumbersMsg();
            Message.printTryAgainMsg();
            Message.printInputNumberMsg(player.getName());
            number = sc.nextInt();
        }
        return number;
    }

    private boolean isGuessed(int guessNumber, Player player) {
        int answerNumber = player.getLastNumber();
        if (answerNumber == guessNumber) {
            player.incrementScore();
            printWinnerInfo(guessNumber, player);
            return true;
        }
        Message.printNumberGreaterOrLessMsg(answerNumber, guessNumber);
        return false;
    }

    private void printWinnerInfo(int guessNumber, Player player) {
        Message.printPlayerNameWinMsg(round, player.getName());
        Message.printAttemptsMsg(guessNumber, player);
        Message.printRoundsRemaining(round);
        for (Player p : players) {
            Message.printTotalWinsMsg(p);
        }
    }

    private void isAttemptsEnded(Player player) {
        if (player.getAttempt() == MAX_ATTEMPTS) {
            Message.printEndedAttemptsMsg(player.getName());
        }
    }

    private void printAllAnswer() {
        for (Player player : players) {
            Message.printAllNumbersMsg(player.getName());
            int[] numbers = player.getNumbers();
            for (int number : numbers) {
                Message.printAnswerNumber(number);
            }
            Message.printLineBreak();
        }
    }

    private void clear() {
        for (Player player : players) {
            player.clear();
        }
    }
}