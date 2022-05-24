package com.example.myapplication.Book.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class BookCreateDto {
    private Long cost; // 책 가격
    private String title; // 책 제목
    private String author; // 저자
    private String publish_date; // 출판년도
    private String professor; // 교수
    private String course; // 수업명
    // 이미지는 어떻게 받는지 모르겠다
    private String bookstate; // 판매자메모

    public void setBookstate(String bookstate)
    {
        this.bookstate = bookstate;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public void setProfessor(String professor)
    {
        this.professor = professor;
    }

    public void setPublish_date(String publish_date)
    {
        this.publish_date = publish_date;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setCost(Long cost)
    {
        this.cost = cost;
    }
}
