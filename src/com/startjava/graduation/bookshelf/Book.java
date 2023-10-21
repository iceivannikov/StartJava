package com.startjava.graduation.bookshelf;

public class Book {

    private String author;
    private String name;
    private int yearOfPublishing;
    private int informationLength;

    public Book(String author, String name, int yearOfPublishing, int informationLength) {
        this.author = author;
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
        this.informationLength = informationLength;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getInformationLength() {
        return informationLength;
    }

    public void setInformationLength(int informationLength) {
        this.informationLength = informationLength;
    }

    @Override
    public String toString() {
        return author + ", " + name + ", " + yearOfPublishing;
    }
}
