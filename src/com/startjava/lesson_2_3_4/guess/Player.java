package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] numbers = new int[GuessNumberUtil.MAX_ATTEMPTS];
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

    public boolean addNumber(int number) {
        if (number > 0 && number < GuessNumberUtil.MAX_NUMBER) {
            numbers[attempt++] = number;
            return true;
        }
        return false;
    }

    public int getLastNumber() {
        return numbers[attempt - 1];
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

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}