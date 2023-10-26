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
        String quit = "no";
        while (!quit.equals("yes")) {
            bookshelf.print(SHELF_EMPTY);
            bookshelf.print(MENU);
            bookshelf.print(ENTER_COMMAND);
            String command = sc.nextLine();
            switch (command) {
                case "save" -> {
                    bookshelf.print("Enter book name: ");
                    String name = sc.nextLine();
                    bookshelf.print("Enter the author of the book: ");
                    String author = sc.nextLine();
                    bookshelf.print("Enter year of publishing book: ");
                    int yearOfPublishing = sc.nextInt();
                    Book book = new Book(name, author, yearOfPublishing);
                    if (!bookshelf.find(book.getName())) {
                        bookshelf.add(book);
                    } else {
                        bookshelf.print("A book with the same %s is already on the shelf", book);
                    }
                }
                case "delete" -> {
                    bookshelf.print("Enter book name: ");
                    String name = sc.nextLine();
                    if (bookshelf.find(name)) {
                        bookshelf.delete(name);
                    } else {
                        bookshelf.print("There is no book with this %s on the shelf", name);
                    }
                }
                case "find" -> {
                    bookshelf.print("Enter book name: ");
                    String name = sc.nextLine();
                    if (bookshelf.find(name)) {
//                    bookshelf.print("There is no book with this %s on the shelf", name);
                        bookshelf.print("На полке нет книги с названием %s", name);
                    } else {
                        bookshelf.print("На полке есть книга с названием %s", name);
                    }
                }
                case "free shelve" -> System.out.printf("На полке есть %d свободных мест", bookshelf.countFreeShelve());
                case "clear" -> {
                    while (true) {
                        System.out.print("Вы уверены, что хотите удалить все книги? [yes/no]: ");
                        String answer = sc.next();
                        if (answer.equals("yes")) {
                            bookshelf.clear();
                            System.out.println("Все книги были удалены");
                            break;
                        } else if (answer.equals("no")) {
                            break;
                        }
                    }
                }
                case "quit" -> {
                    while (true) {
                        System.out.print("Вы уверены, что хотите выйти? [yes/no]: ");
                        quit = sc.next();
                        if (quit.equals("yes")) {
                            break;
                        } else if (quit.equals("no")) {
                            break;
                        }
                    }
                }
            }
            Book[] books = bookshelf.getBooks();
            bookshelf.printShelf(books);
        }
    }
}
