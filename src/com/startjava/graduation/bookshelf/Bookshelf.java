package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private static final int TOTAL_SHELF = 10;
    private final Book[] books = new Book[TOTAL_SHELF];
    private int countBooks;

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
                System.arraycopy(books, i + 1, books, i, countBooks - 1);
                books[countBooks - 1] = null;
                countBooks--;
                break;
            }
        }
    }

    public Book find(String name) {
        Book book = null;
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getName().equals(name)) {
                book = new Book(books[i].getName(), books[i].getAuthor(), books[i].getYearOfPublishing());
                break;
            }
        }
        return book;
    }

    public int getNumberFreeShelfs() {
        return books.length - countBooks;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }
}
