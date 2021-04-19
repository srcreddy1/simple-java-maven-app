package com.mycompany.app;

/**
 * Hello world!
 This is a git practice
This is modified by Ravi
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
