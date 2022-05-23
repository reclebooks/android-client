package com.example.myapplication.User.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class UserSignupDto {
    private String phone_number;
    private String cert_number;

    public void setPhone(String phone_number)
    {
        this.phone_number = phone_number;
    }
    public void setCert(String cert_number)
    {
        this.cert_number = cert_number;
    }
}
