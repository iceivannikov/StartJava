package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int countBooks;
    private final Book[] books = new Book[10];

    public int getCountBooks() {
        return countBooks;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public void add(Book book) {
        books[countBooks++] = book;
    }

    public Book getBook(String name) {
        Book result = null;
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getName().equals(name)) {
                result = books[i];
            }
        }
        return result;
    }

    public void delete(String name) { //TODO Проверить правильность удаления
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getName().equals(name)) {
                System.arraycopy(books, i + 1, books, i, books.length - 1 - i);
                books[books.length - 1] = null;
                System.out.println(Arrays.toString(books));
                countBooks--;
            }
        }
    }

    public boolean find(String name) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int countFreeShelve() {
        return books.length - countBooks;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }

    public void printShelf(Book[] books) {
        int length = longestInformation(books);
        System.out.printf("\n  There are %d books in the closet, %d free shelves\n",
                getCountBooks(), countFreeShelve());
        for (Book book : books) {
            System.out.println("|" + "-".repeat(length) + "|");
            System.out.print("|");
            System.out.println(book + " ".repeat(length - book.getInformationLength()) + "|");
        }
        System.out.println("|" + "-".repeat(length) + "|");
    }

    public void print(String str) {
        System.out.print(str);
    }

    public void print(Book book) {
        System.out.println(book);
    }

    public void print(String str, Book book) {
        System.out.printf(str, book.getName());
    }
    public void print(String str, String name) {
        System.out.printf(str, name);
    }

    private int longestInformation(Book[] books) {
        int maxLength = 0;
        for (Book book : books) {
            if (book.getInformationLength() > maxLength) {
                maxLength = book.getInformationLength();
            }
        }
        return maxLength;
    }
}
