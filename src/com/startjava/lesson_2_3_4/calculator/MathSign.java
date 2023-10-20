package com.startjava.lesson_2_3_4.calculator;

public enum MathSign {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    POWER("^"),
    DIVIDE("/"),
    MOD("%");

    private final String title;

    MathSign(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static MathSign getTitleBySign(String sign) {
        MathSign[] values = MathSign.values();
        for (MathSign value : values) {
            if (value.getTitle().equals(sign)) {
                return value;
            }
        }
        throw new IllegalArgumentException();
    }
}
