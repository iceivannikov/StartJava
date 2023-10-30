package com.startjava.graduation.bookshelf;

class Message {

    private static final String[] messages = {
            "The closet is empty. You can add the first book to it\n",
            "Commands",
            "Enter command name: ",
    };

    private static final String menu = """
            1. save
            2. delete
            3. find
            4. free places
            5. count books
            6. clear
            7. quit
            """;

    private Message() {}

    public static void printShelfCondition() {
        System.out.println(messages[0]);
    }

    public static void printStartMsg() {
        System.out.println(messages[1]);
        System.out.println(menu);
        System.out.print(messages[2]);
    }
}
