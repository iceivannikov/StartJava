package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int countBooks;
    private final Book[] books;

    public Bookshelf() {
        books = new Book[10];
    }

    public int getCountBooks() {
        return countBooks;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public void add(Book book) {
        books[countBooks++] = book;
    }

    public void delete(String name) { //TODO Проверить правильность удаления
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) {
                System.arraycopy(books, i + 1, books, i, books.length - 1 - i);
                books[books.length - 1] = null;
                System.out.println(Arrays.toString(books));
                countBooks--;
            }
        }
    }

    public Book find(String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        throw new IllegalArgumentException("No book with this name found");
    }

    public int countFreeShelve() {
        return books.length - countBooks;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
    }

    public void print(String str) {
        System.out.println(str);
    }

    public void print(Book book) {
        System.out.println(book);
    }

    public void printShelf(Book[] books) { //TODO Подумать где разместить этот метод
        System.out.printf("  There are %d books in the closet, %d free shelves\n", getCountBooks(), countFreeShelve());
        for (Book book : books) {
            System.out.println("| " + "-".repeat(50) + "|");
            System.out.print("| ");
            System.out.println(book);
        }
        System.out.println("| " + "-".repeat(50) + "|");
    }
}
