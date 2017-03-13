package com.MyJokes;

public class MyJokes {
    private String joke = "This is MyJoke's joke";

    private MyJokes() {
    }

    public static String getJoke() {
        MyJokes myJokes = new MyJokes();
        return myJokes.joke;
    }
}
