package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.TOTAL_PLAYERS;
import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.TOTAL_ROUND;
import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.MAX_ATTEMPTS;
import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.MAX_NUMBER;
import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.MIN_NUMBER;

public class GuessNumber {

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
            System.out.printf("Round: %d\n", round);
            System.out.println(GuessNumberUtil.COMPUTER_GUESSED_NUMBER_MSG);
            castLots(players);
            System.out.println(GuessNumberUtil.ANSWER_PROCEDURE_MSG);
            int i = 0;
            while (checkAttempts(players)) {
                inputAnswer(players[i]);
                if (isGuessed(guessNumber, players[i])) {
                    break;
                }
                printAttemptsEnded(players[i]);
                i++;
                if (i == TOTAL_PLAYERS) {
                    i = 0;
                }
            }
            printAllAnswer(players);
            clear(players);
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

    private boolean checkAttempts(Player[] players) {
        int countTrue = 0;
        for (Player player : players) {
            if (player.getAttempt() != MAX_ATTEMPTS) {
                countTrue++;
            }
        }
        return countTrue == TOTAL_PLAYERS;
    }

    private void inputAnswer(Player player) {
        System.out.printf(GuessNumberUtil.INPUT_NUMBER_MSG, player);
        int number = sc.nextInt();
        if (player.addNumber(number)) {
            while (player.addNumber(number)) {
                System.out.println(GuessNumberUtil.RANGE_NUMBERS_MSG);
                System.out.println(GuessNumberUtil.TRY_AGAIN_MSG);
                System.out.printf(GuessNumberUtil.INPUT_NUMBER_MSG, player);
                number = sc.nextInt();
            }
        }
    }

    private boolean isGuessed(int guessNumber, Player player) {
        int answerNumber = player.getLastNumber();
        if (answerNumber == guessNumber) {
            player.incrementWin();
            printWinnerInfo(player);
            System.out.printf(GuessNumberUtil.ATTEMPTS_MSG, player.getName(), answerNumber, player.getAttempt());
            return true;
        }
        System.out.printf(GuessNumberUtil.NUMBER_GREATER_OR_LESS_MSG, answerNumber,
                (answerNumber > guessNumber) ? GuessNumberUtil.GREATER : GuessNumberUtil.LESS);
        return false;
    }

    private void printWinnerInfo(Player player) {
        System.out.printf(GuessNumberUtil.ROUND_NO_MSG, round);
        System.out.printf(GuessNumberUtil.PLAYER_NAME_WIN_MSG, player);
        System.out.println("Total rounds " + (TOTAL_ROUND - 1) + ", rounds left " + (TOTAL_ROUND - 1 - round));
        printRating(players);
    }

    private void printRating(Player[] players) {
        for (Player player : players) {
            System.out.printf(GuessNumberUtil.TOTAL_WINS_MSG, player.getName(), player.getWin());
        }
    }

    private void printAttemptsEnded(Player player) {
        if (player.getAttempt() == MAX_ATTEMPTS) {
            System.out.printf(GuessNumberUtil.ENDED_ATTEMPTS_MSG, player);
        }
    }

    private void printAllAnswer(Player[] players) {
        for (Player player : players) {
            System.out.printf(GuessNumberUtil.ALL_NUMBERS_MSG, player);
            int[] numbers = player.getNumbers();
            for (int number : numbers) {
                System.out.printf("%d ", number);
            }
            System.out.println(" ");
        }
    }

    private void clear(Player[] players) {
        for (Player player : players) {
            player.clear();
        }
    }
}