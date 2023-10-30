package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    private static final String YES = "yes";
    private static final Scanner SC = new Scanner(System.in);
    private static final Bookshelf BOOKSHELF = new Bookshelf();

    public static void main(String[] args) {
        /*
        If you want to work with existing books, uncomment addBooks() method
         */
        addBooks();
        String quit = "";
        while (!quit.equals(YES)) {
            switch (start()) {
                case "save", "1" -> {
                    BOOKSHELF.print("Enter book name: ");
                    String name = SC.nextLine();
                    BOOKSHELF.print("Enter the author of the book: ");
                    String author = SC.nextLine();
                    BOOKSHELF.print("Enter year of publishing book: ");
                    int yearOfPublishing = SC.nextInt();
                    Book book = new Book(name, author, yearOfPublishing);
                    if (!BOOKSHELF.find(book.getName())) {
                        BOOKSHELF.add(book);
                    } else {
                        BOOKSHELF.print("A book with the same %s is already on the shelf", book);
                    }
                }
                case "delete", "2" -> {
                    BOOKSHELF.print("Enter book name: ");
                    String name = SC.nextLine();
                    if (BOOKSHELF.find(name)) {
                        BOOKSHELF.delete(name);
                    } else {
                        BOOKSHELF.print("There is no book with this %s on the shelf", name);
                    }
                }
                case "find", "3" -> {
                    BOOKSHELF.print("Enter book name: ");
                    String name = SC.nextLine();
                    if (BOOKSHELF.find(name)) {
//                    bookshelf.print("There is no book with this %s on the shelf", name);
                        BOOKSHELF.print("На полке есть книга с названием %s", name);
                    } else {
                        BOOKSHELF.print("На полке нет книги с названием %s", name);
                    }
                }
                case "free places", "4" ->
                        System.out.printf("На полке есть %d свободных мест", BOOKSHELF.getNumberFreePlacesOnShelf());
                case "count books", "5" ->
                        System.out.printf("На полке есть %d книг", BOOKSHELF.getNumberBooksOnShelf());
                case "clear", "6" -> {
                    while (true) {
                        System.out.print("Вы уверены, что хотите удалить все книги? [yes/no]: ");
                        String answer = SC.next();
                        if (answer.equals(YES)) {
                            BOOKSHELF.clear();
                            System.out.println("Все книги были удалены");
                            break;
                        } else if (answer.equals("no")) {
                            break;
                        }
                    }
                }
                case "quit", "7" -> {
                    while (!quit.equals(YES)) {
                        System.out.print("Вы уверены, что хотите выйти? [yes/no]: ");
                        quit = SC.nextLine();
                        if (quit.equals("no")) {
                            break;
                        }
                    }
                }
            }
            System.out.print("\nTo continue press Enter");
            SC.nextLine();
            Book[] books = BOOKSHELF.getBooks();
            BOOKSHELF.printShelf(books);
        }
        SC.close();
    }



    private static void addBooks() {
        Book book1 = new Book("Властелин колец", "Джон Р. Р. Толкин", 2000);
        Book book2 = new Book("Гордость и предубеждение", "Джейн Остин", 2000);
        Book book3 = new Book("Тёмные начала", "Филип Пулман", 2000);
        Book book4 = new Book("Автостопом по галактике", "Дуглас Адамс", 2000);
        BOOKSHELF.add(book1);
        BOOKSHELF.add(book2);
        BOOKSHELF.add(book3);
        BOOKSHELF.add(book4);
    }
    private static String start() {
        if (BOOKSHELF.getCountBooks() == 0) {
            Message.printShelfCondition();
        }
        Message.printStartMsg();
        return SC.nextLine();
    }

}
