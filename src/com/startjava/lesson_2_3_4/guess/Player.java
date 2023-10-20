package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import static com.startjava.lesson_2_3_4.guess.GuessNumberUtil.COUNT_ATTEMPTS;

public class Player {

    private final String name;
    private final int[] numbers = new int[COUNT_ATTEMPTS];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return attempt;
    }

    public int[] getPlayerNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public int getAttempts() {
        return attempt;
    }

    public void addNumber(int number) {
        numbers[attempt++] = number;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
    }
}