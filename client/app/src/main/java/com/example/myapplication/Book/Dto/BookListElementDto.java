package com.example.myapplication.Book.Dto;

public class BookListElementDto {
    private String name;
    private String book_made;
    private String money;
    private String day;
    private String thumb_url;

    public BookListElementDto(String name, String book_made, String money, String day) {
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

    public String getThumb_url() {
        return thumb_url;
    }
}
