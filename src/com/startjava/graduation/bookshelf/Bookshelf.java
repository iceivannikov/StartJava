package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int countBooks;
    private final int[] books;
    private int size;

    public Bookshelf() {
        this.books = new int[10];
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int[] getBooks() {
        return Arrays.copyOf(books, size);
    }

    public int getSize() {
        return size;
    }


}
