package com.startjava.graduation.bookshelf;

public class BookshelfTest {

    private static final String YES = "yes";

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        BookService service = new BookService(bookshelf, new View());
        /*
        If you want to work with existing books, uncomment addBooks() method
         */
        BookshelfUtil.init(bookshelf);
        String quit = "";
        while (!quit.equals(YES)) {
            String command = service.printMenu(bookshelf);
            switch (command) {
                case "save", "1" -> service.save();
                case "delete", "2" -> service.delete();
                case "find", "3" -> service.find();
                case "free places", "4" -> service.printFreePlace();
                case "count books", "5" -> service.printCountBook();
                case "clear", "6" -> service.clear();
                case "quit", "7" -> quit = service.quit(quit);
            }
            service.printShelf(bookshelf);
        }
    }
}
