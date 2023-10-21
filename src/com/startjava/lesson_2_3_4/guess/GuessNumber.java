package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.*;

public class GuessNumber {
    private final Scanner sc = new Scanner(System.in);

    private final Player player1;
    private final Player player2;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        Random random = new Random();
        int guessNumber = random.nextInt(MIN_NUMBER, MAX_NUMBER);
        System.out.println(COMPUTER_GUESSED_NUMBER_MSG);
        while (player1.getAttempt() != MAX_ATTEMPTS && player2.getAttempt() != MAX_ATTEMPTS) {
            inputAnswer(player1);
            if (isGuessed(guessNumber, player1)) {
                break;
            }
            attemptsOver(player1);
            inputAnswer(player2);
            if (isGuessed(guessNumber, player2)) {
                break;
            }
            attemptsOver(player2);
        }
        print(player1);
        print(player2);
        player1.clear();
        player2.clear();
    }

    private void inputAnswer(Player player) {
        System.out.printf(INPUT_NUMBER_MSG, player.getName());
        int number = sc.nextInt();
        player.addNumber(number);
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

    private static void attemptsOver(Player player) {
        if (player.getAttempt() == MAX_ATTEMPTS) {
            System.out.printf(ENDED_ATTEMPTS_MSG, player.getName());
        }
    }

    private void print(Player player) {
        System.out.printf(ALL_NUMBERS_MSG, player.getName());
        int[] numbers = player.getNumbers();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}