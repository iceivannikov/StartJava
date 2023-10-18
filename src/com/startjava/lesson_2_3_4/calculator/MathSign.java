package com.startjava.lesson_2_3_4.calculator;

public enum MathSign {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    RAISE_TO_POWER("^"),
    DIVIDE("/"),
    REMAINDER_WITH_DIVISION("%");
    private final String title;

    MathSign(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
