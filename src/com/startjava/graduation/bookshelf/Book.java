package com.startjava.graduation.bookshelf;

public class Book {

    private final String name;
    private final String author;
    private final int yearOfPublishing;
    private final int informationLength;

    public Book(String name, String author, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.informationLength = toString().length();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getInformationLength() {
        return informationLength;
    }

    @Override
    public String toString() {
        return name + ", " + author + ", " + yearOfPublishing;
    }
}
