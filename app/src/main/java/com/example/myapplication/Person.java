package com.example.myapplication;
public class Person {
    String context;
    String userName;

    public Person(String context, String userName) {
        this.context = context;
        this.userName = userName;
    }

    public String getContext() {
        return context;
    }

    public String getUserName() {
        return userName;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}