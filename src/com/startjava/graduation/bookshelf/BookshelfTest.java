package com.startjava.graduation.bookshelf;

public class BookshelfTest {

    private static final String YES = "yes";

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        BookService service = new BookService(bookshelf);
        /*
        If you want to work with existing books, uncomment init() method
         */
        BookshelfUtil.init(bookshelf);
        String option = "";
        while (!option.equals(YES)) {
            String command = service.printMenu(bookshelf);
            option = service.startProcess(command);
            service.printShelf(bookshelf);
        }
    }
}
