package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.*;

public class GuessNumber {
    private static final Message MESSAGE = new Message();
    private static final int MIN_NUMBER = 1;
    private final Scanner sc = new Scanner(System.in);

    private final Player[] players = new Player[TOTAL_PLAYERS];
    private int round = 1;

    public GuessNumber(String[] names) {
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void start() {
        Random random = new Random();
        while (round < TOTAL_ROUND) {
            int guessNumber = random.nextInt(MIN_NUMBER, MAX_NUMBER);
            MESSAGE.printNumberRound(round);
            MESSAGE.printComputerGuessedNumberMsg();
            castLots(players);
            MESSAGE.printAnswerProcedureMsg();
            int answerNumber = 0;
            while (answerNumber != guessNumber && hasAttempts(players)) {
                for (Player player : players) {
                    answerNumber = inputAnswer(player);
                    if (isGuessed(answerNumber, guessNumber, player)) {
                        break;
                    }
                    printAttemptsEnded(player);
                }
            }
            round++;
        }
    }

    private void castLots(Player[] players) {
        for (int i = players.length; i > 1; i--) {
            int range = (int) (Math.random() * (i - 1));
            Player swap = players[range];
            players[range] = players[i - 1];
            players[i - 1] = swap;
        }
    }

    private boolean hasAttempts(Player[] players) {
        int countTrue = 0;
        for (Player player : players) {
            if (player.getAttempt() != MAX_ATTEMPTS) {
                countTrue++;
            }
        }
        return countTrue == TOTAL_PLAYERS;
    }

    private int inputAnswer(Player player) {
        MESSAGE.printInputNumberMsg(player);
        int number = sc.nextInt();
        while (player.addNumber(number)) {
            MESSAGE.printRangeNumbersMsg();
            MESSAGE.printTryAgainMsg();
            MESSAGE.printInputNumberMsg(player);
            number = sc.nextInt();
        }
        return number;
    }

    private boolean isGuessed(int answerNumber, int guessNumber, Player player) {
        answerNumber = player.getLastNumber();
        if (answerNumber == guessNumber) {
            player.incrementScore();
            printWinnerInfo(guessNumber, player);
            printAllAnswer(players);
            clear(players);
            return true;
        }
        MESSAGE.printNumberGreaterOrLessMsg(answerNumber, guessNumber);
        return false;
    }

    private void printWinnerInfo(int guessNumber, Player player) {
        MESSAGE.printPlayerNameWinMsg(round, player);
        MESSAGE.printAttemptsMsg(guessNumber, player);
        MESSAGE.printRoundsRemaining(round);
        printRating(players);
    }

    private void printRating(Player[] players) {
        for (Player player : players) {
            MESSAGE.printTotalWinsMsg(player);
        }
    }

    private void printAttemptsEnded(Player player) {
        if (player.getAttempt() == MAX_ATTEMPTS) {
            MESSAGE.printEndedAttemptsMsg(player);
        }
    }

    private void printAllAnswer(Player[] players) {
        for (Player player : players) {
            MESSAGE.printAllNumbersMsg(player);
            int[] numbers = player.getNumbers();
            for (int number : numbers) {
                MESSAGE.printAnswerNumber(number);
            }
            MESSAGE.printLineBreak();
        }
    }

    private void clear(Player[] players) {
        for (Player player : players) {
            player.clear();
        }
    }
}