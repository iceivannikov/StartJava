package com.startjava.lesson_1._final;

import java.util.Random;

public class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("==Task Game - Guess the number==");
        Random random = new Random();
        int minNumber = 1;
        int maxNumber = 101;
        int guessNumber = 33;
        int answer = 0;
        System.out.println("The computer has guessed a number, the game begins");
        while (guessNumber != answer) {
            answer = random.nextInt(minNumber, maxNumber);
            if (answer > guessNumber) {
                System.out.println("The number " + answer + 
                        " is greater than what the computer guessed");
                maxNumber = answer;
            } else if (answer < guessNumber) {
                System.out.println("The number " + answer + 
                        " is less than what the computer guessed");
                minNumber = answer;
            }
        }
        System.out.println("You win!!!");
    }
}