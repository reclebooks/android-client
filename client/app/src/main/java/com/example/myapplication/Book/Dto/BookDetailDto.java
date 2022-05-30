package com.example.myapplication.Book.Dto;


public class BookDetailDto
{
// 사용자에게 입력받는거 없음.. 변수 선언만 해주면 ok
    private String cost; // 책 가격
    private String title; // 책 제목
    private String book_made;
    private String author; // 저자
    private String publish_date; // 출판년도
    private String professor; // 교수
    private String course; // 수업명
    // 이미지는 어떻게 받는지 모르겠다
    private String bookstate; // 판매자 메모
    private String username; // 판매자

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBookstate() {
        return bookstate;
    }

    public void setBookstate(String bookstate) {
        this.bookstate = bookstate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BookDetailDto(String title, String book_made, String cost, String publish_date)
    {
        this.title = title;
        this.book_made = book_made;
        this.cost = cost;
        this.publish_date = publish_date;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return (this.title);
    }

    public void setBook_made(String book_made)
    {
        this.book_made = book_made;
    }

    public String getBook_made()
    {
        return (this.book_made);
    }

    public void setCost(String cost)
    {
        this.cost = cost;
    }

    public String getCost()
    {
        return (this.cost);
    }

    public void setPublish_date(String publish_date)
    {
        this.publish_date = publish_date;
    }

    public String getPublish_date()
    {
        return (this.publish_date);
    }

}
