package com.example.myapplication.Book.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class UsedBookCreateDto {
    BookCreateDto book;
    String content;
    Long usedBookCost;
    Boolean underline;
    Boolean penUnderline;
    Boolean note;
    Boolean penNote;
    Boolean bookCoverStatus;
    Boolean pageStatus;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BookCreateDto getBook() {
        return book;
    }

    public void setBook(BookCreateDto book) {
        this.book = book;
    }

    public Long getUsedBookCost() {
        return usedBookCost;
    }

    public void setUsedBookCost(Long usedBookCost) {
        this.usedBookCost = usedBookCost;
    }

    public Boolean getUnderline() {
        return underline;
    }

    public void setUnderline(Boolean underline) {
        this.underline = underline;
    }

    public Boolean getPenUnderline() {
        return penUnderline;
    }

    public void setPenUnderline(Boolean penUnderline) {
        this.penUnderline = penUnderline;
    }

    public Boolean getNote() {
        return note;
    }

    public void setNote(Boolean note) {
        this.note = note;
    }

    public Boolean getPenNote() {
        return penNote;
    }

    public void setPenNote(Boolean penNote) {
        this.penNote = penNote;
    }

    public Boolean getBookCoverStatus() {
        return bookCoverStatus;
    }

    public void setBookCoverStatus(Boolean bookCoverStatus) {
        this.bookCoverStatus = bookCoverStatus;
    }

    public Boolean getPageStatus() {
        return pageStatus;
    }

    public void setPageStatus(Boolean pageStatus) {
        this.pageStatus = pageStatus;
    }
}
