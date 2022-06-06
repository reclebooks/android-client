package com.example.myapplication.User.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class UserInfoCreateDto {
    UserCreateDto userCreateDto;
    String nickname;
    String name;
    String college;
    String majorCollege;
    String major;
    String region;

    public UserInfoCreateDto()
    {
        this.userCreateDto = new UserCreateDto();
    }


    public UserCreateDto getUserCreateDto() {
        return userCreateDto;
    }

    public void setUserCreateDto(UserCreateDto userCreateDto) {
        this.userCreateDto = userCreateDto;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajorCollege() {
        return majorCollege;
    }

    public void setMajorCollege(String majorCollege) {
        this.majorCollege = majorCollege;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
