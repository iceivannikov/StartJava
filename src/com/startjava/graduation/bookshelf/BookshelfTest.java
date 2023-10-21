package com.startjava.graduation.bookshelf;

import static com.startjava.graduation.bookshelf.BookShelfUtil.*;

public class BookshelfTest {
    public static void main(String[] args) {
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
        Book[] books = bookshelf.getBooks();
        bookshelf.printShelf(books);
    }
}
