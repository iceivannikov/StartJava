package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class View {

    private final Scanner console = new Scanner(System.in);
    private final String[] messages = {
            "The closet is empty. You can add the first book to it\n",
            "Commands",
            "Enter command name: ",
    };

    private final String[] bookData = {
            "Enter book name: ",
            "Enter the author of the book: ",
            "Enter year of publishing book: "
    };

    public void printShelfCondition() {
        System.out.println(messages[0]);
    }

    public void printStartMsg() {
        System.out.println(messages[1]);
        String menu = """
                1. save
                2. delete
                3. find
                4. free places
                5. count books
                6. clear
                7. quit
                """;
        System.out.println(menu);
        System.out.print(messages[2]);
    }

    public String enterCommand() {
        return console.nextLine();
    }

    public Book enterBookData() {
        int yearOfPublishing;
        String[] data = new String[3];
        for (int i = 0; i < bookData.length - 1; i++) {
            System.out.print(bookData[i]);
            data[i] = console.nextLine();
        }
        while (true) {
            System.out.print(bookData[2]);
            data[2] = console.nextLine();
            if (data[2].length() == 4) {
                try {
                    yearOfPublishing = Integer.parseInt(data[2]);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("The date format must be XXXX, try again");
        }
        return new Book(data[0], data[1], yearOfPublishing);
    }

    public void printBookExistsMsg(String name) {
        String bookExists = "A book with the same %s is already on the shelf";
        System.out.printf(bookExists, name);
    }

    public String enterBookName() {
        System.out.print(bookData[0]);
        return console.nextLine();
    }

    public void printBookDeletedMsg(String name) {
        String bookDeleted = "The book with the title %s was successfully deleted";
        System.out.printf(bookDeleted, name);
    }

    public void printNoBookMsg(String name) {
        String bookNotExist = "There is no book with this %s on the shelf";
        System.out.printf(bookNotExist, name);
    }

    public void printFreePlace(int freePlace) {
        System.out.printf("There are %d free spaces on the shelf", freePlace);
    }

    public void printCountBook(int countBook) {
        System.out.printf("There are %d books on the shelf", countBook);
    }

    public void clear(Bookshelf bookshelf) {
        while (true) {
            System.out.print("Are you sure you want to delete all books? [yes/no]: ");
            String answer = console.next();
            if (answer.equals("yes")) {
                bookshelf.clear();
                System.out.println("All books have been removed");
                break;
            } else if (answer.equals("no")) {
                break;
            }
        }
    }

    public String quit(String quit) {
        while (!quit.equals("yes")) {
            System.out.print("Are you sure you want to go out? [yes/no]: ");
            quit = console.nextLine();
            if (quit.equals("no")) {
                break;
            }
        }
        return quit;
    }

    public void printShelf(Bookshelf bookshelf) {
        System.out.print("\nTo continue press Enter ");
        console.nextLine();
        Book[] books = bookshelf.getBooks();
        int length = longestInformation(books);
        System.out.printf("\n  There are %d books in the closet, %d free shelves\n",
                bookshelf.getCountBooks(), bookshelf.getNumberFreeShelfs());
        for (Book book : books) {
            System.out.println("|" + "-".repeat(length) + "|");
            System.out.print("|");
            System.out.println(book + " ".repeat(length - book.getInformationLength()) + "|");
        }
        System.out.println("|" + "-".repeat(length) + "|");
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
