package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] playerNumbers;
    private int size = 0;
    private int attempts = 10;



    public Player(String name) {
        this.name = name;
        playerNumbers = new int[10];
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
        Arrays.fill(playerNumbers, 0, 0, size);
    }
}