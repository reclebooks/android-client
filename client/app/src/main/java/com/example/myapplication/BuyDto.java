package com.example.myapplication;

public class BuyDto
{
    private String name;
    private String book_made;
    private String money;
    private String day;
    // 이미지는 어떻게 받아오나요?
    public BuyDto(String name, String book_made, String money, String day) {
        this.name = name;
        this.book_made = book_made;
        this.money = money;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public String getBook() {
        return book_made;
    }

    public String getMoney() {
        return money;
    }

    public String getDay() {
        return day;
    }
}
