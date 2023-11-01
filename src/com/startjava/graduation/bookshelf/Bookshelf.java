package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private static final int TOTAL_SHELF = 10;
    private int countBooks;
    private final Book[] books = new Book[TOTAL_SHELF];

    public int getCountBooks() {
        return countBooks;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public void add(Book book) {
        books[countBooks++] = book;
    }

    public void delete(String name) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getName().equals(name)) {
                System.arraycopy(books, i + 1, books, i, books.length - 1 - i);
                books[books.length - 1] = null;
                countBooks--;
            }
        }
    }

    public boolean find(String name) {
        boolean isPresent = false;
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getName().equals(name)) {
                    isPresent = true;
                    break;
            }
        }
        return isPresent;
    }

    public int getNumberFreePlacesOnShelf() {
        return books.length - countBooks;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }
}
