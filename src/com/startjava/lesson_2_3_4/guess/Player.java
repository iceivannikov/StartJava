package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.MAX_ATTEMPTS;
import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.MAX_NUMBER;

public class Player {

    private static final int ZERO = 0;
    private final String name;
    private final int[] numbers = new int[MAX_ATTEMPTS];
    private int attempt;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
       ++score;
    }

    public boolean addNumber(int number) {
        if (number > ZERO && number < MAX_NUMBER) {
            numbers[attempt++] = number;
            return false;
        }
        return true;
    }

    public int getLastNumber() {
        return numbers[attempt - 1];
    }

    public void clear() {
        Arrays.fill(numbers, ZERO, attempt, ZERO);
        attempt = ZERO;
    }

    @Override
    public String toString() {
        return name;
    }
}