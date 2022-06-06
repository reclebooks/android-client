package com.example.myapplication.Book.Dto;

import java.time.LocalDateTime;
import java.util.Date;

public class Book {
    private UsedBookCreateDto usedBookCreateDto;

    private PublisherCreateDto publisherCreateDto;

    public UsedBookCreateDto getUsedBookCreateDto() {
        return usedBookCreateDto;
    }

    public PublisherCreateDto getPublisherCreateDto() {
        return publisherCreateDto;
    }
}
