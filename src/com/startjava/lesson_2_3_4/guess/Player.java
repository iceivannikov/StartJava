package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.COUNT_ATTEMPTS;

public class Player {

    private final String name;
    private final int[] numbers = new int[COUNT_ATTEMPTS];
    private int attempt;

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

    public void addNumber(int number) {
        numbers[attempt++] = number;
    }

    public int getLastNumber() {
        return numbers[attempt - 1];
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
    }
}