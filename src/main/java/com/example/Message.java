package com.example;

public class Message {

    public static final String MESSAGE = "Hello World";
    public static final String EXCLAMATION_MARK = "!!!";

    public static String getMessage() {
        return MESSAGE;
    }

    public static String getFormattedMessage() {
        return getMessage().concat(EXCLAMATION_MARK);
    }
}
