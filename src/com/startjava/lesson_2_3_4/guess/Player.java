package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] playerNumbers = new int[10];
    private int size = 0;
    private int attempts = 10;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int[] getPlayerNumbers() {
        return Arrays.copyOf(playerNumbers, size);
    }

    public int getAttempts() {
        return attempts;
    }

    public void addNumber(int number) {
        playerNumbers[size++] = number;
        attempts--;
    }

    public void clear() {
        Arrays.fill(playerNumbers, 0, size, 0);
    }
}