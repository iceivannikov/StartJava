package com.startjava.graduation.bookshelf;

import java.util.Scanner;

import static com.startjava.graduation.bookshelf.BookShelfUtil.*;

public class BookshelfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        Book book1 = new Book("Властелин колец", "Джон Р. Р. Толкин", 2000);
        Book book2 = new Book("Гордость и предубеждение", "Джейн Остин", 2000);
        Book book3 = new Book("Тёмные начала", "Филип Пулман", 2000);
        Book book4 = new Book("Автостопом по галактике", "Дуглас Адамс", 2000);
        bookshelf.add(book1);
        bookshelf.add(book2);
        bookshelf.add(book3);
        bookshelf.add(book4);
        bookshelf.print(SHELF_EMPTY);
        bookshelf.print(MENU);
        bookshelf.print(ENTER_COMMAND);
        String command = sc.nextLine();
        switch (command) {
            case "save" -> {
                bookshelf.print("Enter book name: ");
                String name = sc.next();
                bookshelf.print("Enter the author of the book: ");
                String author = sc.next();
                bookshelf.print("Enter year of publishing book: ");
                int yearOfPublishing = sc.nextInt();
                Book book = new Book(name, author, yearOfPublishing);
                if (bookshelf.find(book.getName())) {
                    bookshelf.add(book);
                } else {
                    bookshelf.print("A book with the same %s is already on the shelf", book);
                }
            }
            case "delete" -> {
                bookshelf.print("Enter book name: ");
                String name = sc.next();
                if (bookshelf.find(name)) {
                    bookshelf.delete(name);
                } else {
                    bookshelf.print("There is no book with this %s on the shelf", name);
                }
            }
        }
        Book[] books = bookshelf.getBooks();
        bookshelf.printShelf(books);
    }
}
