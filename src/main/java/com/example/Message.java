package com.example;

public class Message {

    public static final String MESSAGE = "Hello World";

    public static String getMessage() {
        return MESSAGE;
    }

    public static String getFormattedMessage() {
        return getMessage().concat("!!!");
    }
}
