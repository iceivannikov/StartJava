package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.*;

public class GuessNumber {

    private final Scanner sc = new Scanner(System.in);

    private final Player[] players = new Player[3];
    private final int round = 3;

    public GuessNumber(String name1, String name2, String name3) {
        players[0] = new Player(name1);
        players[1] = new Player(name2);
        players[2] = new Player(name3);
    }

    public void start() {
        Random random = new Random();
        int guessNumber = random.nextInt(MIN_NUMBER, MAX_NUMBER);
        print(COMPUTER_GUESSED_NUMBER_MSG);
        throwLots(players);
        print(ANSWER_PROCEDURE_MSG);
        while (checkAttempt(players[0]) && checkAttempt(players[1]) && checkAttempt(players[2])) {
            inputAnswer(players[0]);
            if (isGuessed(guessNumber, players[0])) {
                break;
            }
            attemptsOver(players[0]);
            inputAnswer(players[1]);
            if (isGuessed(guessNumber, players[1])) {
                break;
            }
            attemptsOver(players[1]);
            inputAnswer(players[2]);
            if (isGuessed(guessNumber, players[2])) {
                break;
            }
            attemptsOver(players[2]);
        }
        printAllAnswer(players[0]);
        printAllAnswer(players[1]);
        printAllAnswer(players[2]);
        players[0].clear();
        players[1].clear();
        players[2].clear();
    }

    private void throwLots(Player[] players) {
        for (int i = players.length; i > 1; i--) {
            int range = (int) (Math.random() * (i - 1));
            Player swap = players[range];
            players[range] = players[i - 1];
            players[i - 1] = swap;
        }
    }

    private boolean checkAttempt(Player player) {
        return player.getAttempt() != MAX_ATTEMPTS;
    }

    private void inputAnswer(Player player) {
        print(INPUT_NUMBER_MSG, player);
        int number = sc.nextInt();
        if (!player.addNumber(number)) {
            while (!player.addNumber(number)) {
                print(RANGE_NUMBERS_MSG);
                print(TRY_AGAIN_MSG);
                print(INPUT_NUMBER_MSG, player);
                number = sc.nextInt();
            }
        }
    }

    private boolean isGuessed(int guessNumber, Player player) {
        int answerNumber = player.getLastNumber();
        if (answerNumber == guessNumber) {
            System.out.printf(ATTEMPTS_MSG, player.getName(), answerNumber, player.getAttempt());
            return true;
        }
        System.out.printf(NUMBER_GREATER_OR_LESS_MSG, answerNumber, (answerNumber > guessNumber) ? GREATER : LESS);
        return false;
    }

    private void attemptsOver(Player player) {
        if (player.getAttempt() == MAX_ATTEMPTS) {
            print(ENDED_ATTEMPTS_MSG, player);
        }
    }

    private void printAllAnswer(Player player) {
        print(ALL_NUMBERS_MSG, player);
        int[] numbers = player.getNumbers();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void print(String str) {
        System.out.println(str);
    }

    private void print(String str, Player player) {
        System.out.printf(str, player.getName());
    }
}