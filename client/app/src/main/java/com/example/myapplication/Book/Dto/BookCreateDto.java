package com.example.myapplication.Book.Dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class BookCreateDto {
    String name;
    Long cost;
    LectureCreateDto lecture;
    AuthorCreateDto author;
    PublisherCreateDto publisher;
    ProfessorCreateDto professor;
    Date publishedDate;
    String[] genres;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public LectureCreateDto getLecture() {
        return lecture;
    }

    public void setLecture(LectureCreateDto lecture) {
        this.lecture = lecture;
    }

    public ProfessorCreateDto getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorCreateDto professor) {
        this.professor = professor;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
}
