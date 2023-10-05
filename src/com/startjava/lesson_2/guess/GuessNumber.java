package com.startjava.lesson_2.guess;

import com.startjava.lesson_2.guess.Player;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 101;

    private final Scanner sc = new Scanner(System.in);

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        int guessNumber = random.nextInt(MIN_NUMBER, MAX_NUMBER);
        int answerNumber = 0;
        System.out.println("The computer has guessed a number, the game begins");
        while(true) {
            answerNumber = inputAnswer(player1);
            if (isGuessed(guessNumber, answerNumber, player1)) {
                break;
            }
            answerNumber = inputAnswer(player2);
            if (isGuessed(guessNumber, answerNumber, player2)) {
                break;
            }
        }
    }

    private int inputAnswer(Player player) {
        System.out.printf("Player %s is your number: ", player.getName());
        return sc.nextInt();
    }

    private boolean isGuessed(int guessNumber, int answerNumber, Player player) {
        boolean isEquals = answerNumber == guessNumber;
        if (isEquals) {
            System.out.printf("Player %s win!!!\n", player.getName());
            return isEquals;
        }
        System.out.printf("The number %d is %s than what the computer guessed\n", 
                answerNumber, (answerNumber > guessNumber) ? "greater" : "less");
        return isEquals;
    }
}