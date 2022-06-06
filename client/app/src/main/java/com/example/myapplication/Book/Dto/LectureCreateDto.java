package com.example.myapplication.Book.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LectureCreateDto {
    String name;
    MajorCreateDto majorCreateDto;

    public LectureCreateDto(){
        this.majorCreateDto = new MajorCreateDto();
    }

    public MajorCreateDto getMajorCreateDto() {
        return majorCreateDto;
    }

    public void setMajorCreateDto(MajorCreateDto majorCreateDto) {
        this.majorCreateDto = majorCreateDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
