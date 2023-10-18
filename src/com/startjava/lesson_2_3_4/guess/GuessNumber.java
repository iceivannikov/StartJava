package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 101;

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
        int answerNumber;
        System.out.println("The computer has guessed a number, the game begins");
        while (player1.getAttempts() != 0 && player2.getAttempts() != 0) {
            answerNumber = inputAnswer(player1);
            if (isGuessed(guessNumber, answerNumber, player1)) {
                break;
            }
            attemptsOver(player1);
            answerNumber = inputAnswer(player2);
            if (isGuessed(guessNumber, answerNumber, player2)) {
                break;
            }
            attemptsOver(player2);
        }
        print(player1);
        print(player2);
        player1.clear();
        player2.clear();
    }

    private static void attemptsOver(Player player) {
        if (player.getAttempts() == 0) {
            System.out.printf("%s has run out of attempts\n", player.getName());
        }
    }

    private int inputAnswer(Player player) {
        System.out.printf("Player %s is your number: ", player.getName());
        int number = sc.nextInt();
        player.addNumber(number);
        return number;
    }

    private boolean isGuessed(int guessNumber, int answerNumber, Player player) {
        boolean isEquals = answerNumber == guessNumber;
        if (isEquals) {
            System.out.printf("Player %s guessed %d with %d attempts\n",
                    player.getName(), answerNumber, player.getSize());
            return true;
        }
        System.out.printf("The number %d is %s than what the computer guessed\n",
                answerNumber, (answerNumber > guessNumber) ? "greater" : "less");
        return false;
    }

    private void print(Player player) {
        System.out.printf("\nNumbers called by the player by name %s: ", player.getName());
        int[] numbers = player.getPlayerNumbers();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}