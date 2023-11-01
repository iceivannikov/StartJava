package com.startjava.graduation.bookshelf;

public class BookService {

    private final Bookshelf bookshelf;
    private final View view;

    public BookService(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
        view = new View();
    }

    public String printMenu(Bookshelf bookshelf) {
        if (bookshelf.getCountBooks() == 0) {
            view.printShelfCondition();
        }
        view.printStartMsg();
        return view.enterCommand();
    }

    public String startProcess(String command) {
        String option = "";
        switch (command) {
            case "save", "1" -> save();
            case "delete", "2" -> delete();
            case "find", "3" -> find();
            case "free places", "4" -> printFreePlace();
            case "count books", "5" -> printCountBook();
            case "clear", "6" -> clear();
            case "quit", "7" -> option = quit(option);
        }
        return option;
    }

    public void save() {
        Book book = view.enterBookData();
        if (bookshelf.find(book.getName()) == null) {
            bookshelf.add(book);
        } else {
            view.printBookExistsMsg(book.getName());
        }
    }

    public void delete() {
        String name = view.enterBookName();
        if (bookshelf.find(name) != null) {
            bookshelf.delete(name);
            view.printBookDeletedMsg(name);
        } else {
            view.printNoBookMsg(name);
        }
    }

    public void find() {
        String name = view.enterBookName();
        if (bookshelf.find(name) != null) {
            view.printBookExistsMsg(name);
        } else {
            view.printNoBookMsg(name);
        }
    }

    public void printFreePlace() {
        view.printFreePlace(bookshelf.getNumberFreeShelfs());
    }

    public void printCountBook() {
        view.printCountBook(bookshelf.getCountBooks());
    }

    public void clear() {
        view.clear(bookshelf);
    }

    public String quit(String quit) {
        return view.quit(quit);
    }

    public void printShelf(Bookshelf bookshelf) {
        view.printShelf(bookshelf);
    }
}
