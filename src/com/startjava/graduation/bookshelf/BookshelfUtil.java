package com.startjava.graduation.bookshelf;

public class BookshelfUtil {

    private BookshelfUtil() {}

    public static void init(Bookshelf bookshelf) {
        Book book1 = new Book("Paddington", "Thomas Michael Bond", 1958);
        Book book2 = new Book("Winnie-The-Pooh and All, All, All", "Alan Alexander Milne",
                1926);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David \"J. D.\" Salinger ",
                1951);
        Book book4 = new Book("Moby Dick", "Herman Melville", 1851);
        bookshelf.add(book1);
        bookshelf.add(book2);
        bookshelf.add(book3);
        bookshelf.add(book4);
    }
}
