package com.example.myapplication.Book.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MajorCollegeCreateDto {
    String name;
    CollegeCreateDto collegeCreateDto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CollegeCreateDto getCollegeCreateDto() {
        return collegeCreateDto;
    }

    public void setCollegeCreateDto(CollegeCreateDto collegeCreateDto) {
        this.collegeCreateDto = collegeCreateDto;
    }
}
