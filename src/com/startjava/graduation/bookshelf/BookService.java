package com.startjava.graduation.bookshelf;

public class BookService {

    private final Bookshelf bookshelf;
    private final View view;

    public BookService(Bookshelf bookshelf, View view) {
        this.bookshelf = bookshelf;
        this.view = view;
    }

    public String printMenu(Bookshelf bookshelf) {
        if (bookshelf.getCountBooks() == 0) {
            view.printShelfCondition();
        }
        view.printStartMsg();
        return view.enterCommand();
    }

    public void save() {
        Book book = view.enterBookData();
        if (!bookshelf.find(book.getName())) {
            bookshelf.add(book);
        } else {
            view.printBookExistsMsg(book.getName());
        }
    }

    public void delete() {
        String name = view.enterBookName();
        if (bookshelf.find(name)) {
            bookshelf.delete(name);
            view.printBookDeletedMsg(name);
        } else {
            view.printNoBookMsg(name);
        }
    }

    public void find() {
        String name = view.enterBookName();
        if (bookshelf.find(name)) {
            view.printBookExistsMsg(name);
        } else {
            view.printNoBookMsg(name);
        }
    }

    public void printFreePlace() {
        view.printFreePlace(bookshelf.getNumberFreePlacesOnShelf());
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
