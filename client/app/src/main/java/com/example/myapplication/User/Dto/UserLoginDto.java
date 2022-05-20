package com.example.myapplication.User.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDto {
    private String schoolname;
    private String starname;

    public void setSchoolname(String schoolname)
    {
        this.schoolname = schoolname;
    }

    public void setStarname(String starname)
    {
        this.starname =starname;
    }

}
